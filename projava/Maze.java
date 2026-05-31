package 自習用.projava;

import java.io.IOException;

public class Maze {
    public static void main(String[] args) throws IOException {
        record Position(int x, int y) {
        }
        int[][] map = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1},
                {1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };
        var current = new Position(1, 3);
        var prev = current;
        var goal = new Position(9, 1);//Positionクラスのコンストラクタ

        char curChar = 'O';
        char preChar = 'o';
        for (; ; ) {
            //迷路の表示
            for (int y = current.y() -2; y < current.y() +2; y++) {
                for (int x = current.x()-2; x < current.x() +2; x++) {
                    //マップ外なら空白
                    if (y < 0 || y >= map.length ||
                        x < 0 || x >= map[y].length){
                        System.out.print("");
                        continue;
                    }
                    if (x == current.x() && y == current.y()) {
                        System.out.print(curChar);
                    } else if (x == prev.x() && y == prev.y()) {
                        System.out.print(preChar);
                    } else if (x == goal.x() && y == goal.y()){
                        System.out.print("G");
                    } else if (map[y][x] == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();//改行する
            }
            if (current.equals(goal)) {
                System.out.println("GOAL!!!");
                break;
            }
            int ch = System.in.read();
            var next = switch (ch) {
                case 'a' -> new Position(current.x() - 1, current.y());
                case 'd' -> new Position(current.x() + 1, current.y());
                case 's' -> new Position(current.x(), current.y() + 1);
                case 'w' -> new Position(current.x(), current.y() - 1);
                default -> current;
            };
            if (map[next.y()][next.x()] == 0) {
                prev = current;
                current = next;
            }
            //Enterキーの入力を捨てる
            while(ch != '\n'){
                ch = System.in.read();
            }
        }
    }
}


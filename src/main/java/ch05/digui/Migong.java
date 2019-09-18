package ch05.digui;

public class Migong {
    public static void main(String[] args) {
        System.out.println("------------------");
        test();
        System.out.println("------------------");
        int[][] map = new int[8][7];
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        System.out.println("地图的情况");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        setWay(map,1,1);
        System.out.println("走过后地图的情况");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean setWay(int[][] map ,int i,int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                //按照策略下右上左
                map[i][j] = 2;//假设改点走得通
                if (setWay(map,i + 1,j)) {
                    return true;
                }else {
                    if (setWay(map, i, j + 1)) {
                        return true;
                    } else {
                        if (setWay(map, i - 1, j)) {
                            return true;
                        } else {
                            if (setWay(map, i, j - 1)) {
                                return true;
                            }else {
                                //此路不通
                                map[i][j] = 3;
                                return false;
                            }
                        }
                    }
                }
            } else {
                return false;
            }
        }
    }
    public static String test() {
        String str = null;
        int i = 0;

        try {
            System.out.println("try...");
            return str;
        } finally {
            System.out.println("finally...");
        }
    }

}

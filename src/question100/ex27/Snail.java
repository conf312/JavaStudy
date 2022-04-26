package question100.ex27;

public class Snail {

    public void getSnail(int n) {

        int[][] printArr = new int[n][n];

        int value = 1;
        int len = n;
        int x = 0;
        int y = 0;
        int total_length = n*2-1;

        for (int i=0; i<total_length; i++) {
            switch (i%4) {
                case 0 :
                    for (int r=0; r<len; r++) {
                        printArr[y][x] = value;
                        x++;
                        value++;
                    }
                    x--;
                    len--;
                    break;
                case 1 :
                    for (int r=0; r<len; r++) {
                        y++;
                        printArr[y][x] = value;
                        value++;
                    }
                    x--;
                    break;
                case 2 :
                    for (int r=0; r<len; r++) {
                        printArr[y][x] = value;
                        value++;
                        x--;
                    }
                    x++;
                    break;
                case 3 :
                    len--;
                    for (int r=0; r<len; r++) {
                        y--;
                        printArr[y][x] = value;
                        value++;
                    }
                    x++;
                    break;
            }
        }

        for (int[] p : printArr) {
            for (int i : p) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

}

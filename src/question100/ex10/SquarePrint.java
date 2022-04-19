package question100.ex10;

public class SquarePrint {
    public void printSquare(int n) {
        int index = 1;
        for (int i=0; i<n; i++) {
            for (int y=0; y<n; y++) {
                System.out.print(index + " ");
                index++;
            }
            System.out.println("");
        }
    }

    public void printSquareEx11(int n) {
        int index = 0;
        for (int i=0; i<n; i++) {
            for (int y=0; y<n; y++) {
                if (i%2 != 0) {
                    System.out.print(index + " ");
                    index--;
                } else {
                    index++;
                    System.out.print(index + " ");
                }
            }
            index = index + n;
            System.out.println("");
        }
    }

    public void printSquareEx12(int n) {
        int index = 1;
        for (int i=0; i<n; i++) {
            for (int y=0; y<n; y++) {
                System.out.print(index + " ");
                index += n;
            }
            index = i + 2;
            System.out.println("");
        }
    }

    public void printSquareEx13(int n) {
        int index = 1;
        for (int i=1; i<=n; i++) {
            for (int y=1; y<=n; y++) {
                System.out.print(index * y  + " ");
            }
            index++;
            System.out.println("");
        }
    }
}

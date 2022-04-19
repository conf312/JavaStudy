package question100.ex20;

public class Game369 {
    public void getGame369(int n) {
        for (int i=1; i<=n; i++) {
            int result = i % 10;
            if (result > 0 && result % 3 == 0) {
                System.out.print("짝 ");
            } else {
                double y = (float) i / 10;
                y = Math.floor(y);
                if (y > 1 && y % 3 == 0) {
                    System.out.print("짝 ");
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}

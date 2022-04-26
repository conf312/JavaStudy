package question100.ex28;

public class ConvertBinary {

    public int getConvert(int n, int target) {

        int result = 0;
        StringBuilder stringBuilder = new StringBuilder();

        if (target == 2) {

        } else if (target == 8) {

        } else if (target == 16) {

//            char[] ch = new char[100];
//
//            for (char c: ch) {
//                //System.out.println(c);
//            }
//
//            int s = 0;
//            float f = (float)n / target;
//
//            if (f > 1) {
//
//            } else {
//
//            }
//
//            stringBuilder.append((float)n / target);
            //stringBuilder.append(n % target);

            //System.out.println(stringBuilder.toString());
//
//            boolean flag = true;
//            while (flag) {
//                s = n % target;
//
//                stringBuilder.append(n / target);
//                stringBuilder.append(s);
//                if (s == 0) {
//                    stringBuilder.append(n / target);
//                    flag = false;
//                } else {
//                    stringBuilder.append(s);
//                }
//            }
//
        }

        char[] chArr = new char[n];
        int num = 19;
        int jinsu = 16;
        int i = 0;

        while (num > 0) {
            int tmp = num % jinsu;
            System.out.println("tmp : " + tmp);

            if (tmp >= 10 && tmp <= 15) {
                chArr[i] = (char) ('A' + (tmp-10));
            } else {
                chArr[i] = (char) ('0' + tmp);
            }

            num /= jinsu;
            i++;
        }

        i--;

        for (;i>=0;i--) {
            System.out.print(chArr[i]);
        }

        return result;
    }



}

package question100.ex21;

import java.util.HashSet;
import java.util.Iterator;

public class InputToPrint {

    public int getInpToPrint(int[] n) {
        int result = 0;

        HashSet<Integer> hashSet = new HashSet<>();

        for (int s : n) {
            hashSet.add(s);
        }

        Iterator<Integer> itr = hashSet.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        return result;
    }
}

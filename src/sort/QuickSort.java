package sort;

public class QuickSort {
    /**
     퀵 정렬 - 시간복잡도 O(n Log n)
     기준점을 잡아 작은 값 큰 값으로 나누어 정렬한다.
     */
    public void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }

    public void quickSort(int[] arr, int start, int end) {
        retrieve(arr);
        /**
         파티션을 나누고 오른쪽 파티션 첫번째 값을 반환한다.
         */
        int part2 = partition(arr, start, end);
        System.out.println("part2 : "  + part2);

        /**
         오른쪽 파티션이 시작점 바로 다음에서 시작한다면 왼쪽 파티션의 데이터가 하나 일 뿐이니깐 그 쪽은 정렬할
         필요가 없어지니깐, -1을 해준다. (1개 이상 차이가 날 경우에만 돌리기 위해서 *비용)
         왼쪽 파티션을 정렬한다.
         */
        if (start < part2 -1) {
            System.out.println("if start < part2-1");
            quickSort(arr, start, part2-1);
        }
        /**
         오른쪽 파티션을 정렬한다.
         오른쪽 파티션의 배열 방이 1개 이상일때만 호출해야하니깐 오른쪽 파티션의 시작점이 마지막 배열의 값보다
         작은 경우에만 정렬하도록 한다.
         */
        if (part2 < end) {
            System.out.println("if part2 < end");
            quickSort(arr, part2, end);
        }
    }

    public int partition(int arr[], int start, int end) {
        int pivot = arr[(start + end) / 2];
        System.out.println("pivot[start : " + start + ", end : " + end + "] : " + pivot);
        while(start < end) {
            while(arr[start] < pivot) start++;
            while(arr[end] > pivot) end--;
            if (start <= end) {
                System.out.println("start : " + start);
                System.out.println("end : " + end);
                swap(arr, start, end);
                start++;
                end--;
            }
        }

        return start;
    }

    public void swap(int arr[], int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }

    public void retrieve(int[] arr) {
        System.out.println("==> QuickSort retrieve");
        for (int data : arr) {
            System.out.print(" -> " + data);
        }
        System.out.println();
    }

    static class TestQuickSort {
        public static void main(String[] args) {
            int[] arr = {8,7,4,5,0,6,3,2,1};
            QuickSort quickSort = new QuickSort();
            //quickSort.retrieve(arr);
            quickSort.quickSort(arr);
            quickSort.retrieve(arr);
        }
    }

}

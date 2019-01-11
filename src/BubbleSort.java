public class BubbleSort
{
    public static void main(String args[])
    {
        //create random array
        int[] array = SortingUtil.randIntArr(99999);
        int[] copy = SortingUtil.copyIntArray(array);

        //print initial array
        System.out.println("Before: ");
        for (int num:array)
            System.out.println(num + " ");
        System.out.println();

        //sort with selection sort
        long time = System.nanoTime();
        SortingUtil.bubbleSort(copy);
        time = System.nanoTime() - time;

        //print final array
        System.out.println("After: ");
        for (int num:copy)
            System.out.println(num + " ");
        System.out.println();

        //check and print
        System.out.println("Bubble Sort");
        System.out.println("checkSum: " + SortingUtil.checkSum(array, copy));
        System.out.println("isSorted: " + SortingUtil.isSorted(copy));
        System.out.println("Time taken: " + time + " nanoseconds");
    }
}

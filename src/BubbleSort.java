public class BubbleSort
{
    public static void main(String args[])
    {
        //create random array
        int[] initialArray = SortingUtil.randIntArr(99999);
        int[] finalArray = initialArray;

        //print initial array
        System.out.println("Before: ");
        for (int num:initialArray)
            System.out.println(num + " ");
        System.out.println();

        //sort with bubble sort
        long time = System.nanoTime();
        SortingUtil.bubbleSort(finalArray);
        time = System.nanoTime() - time;

        //print final array
        System.out.println("After: ");
        for (int num:finalArray)
            System.out.println(num + " ");
        System.out.println();

        //check and print
        System.out.println("Bubble Sort");
        System.out.println("checkSum: " + SortingUtil.checkSum(initialArray, finalArray));
        System.out.println("isSorted: " + SortingUtil.isSorted(finalArray));
        System.out.println("Time taken: " + time + " nanoseconds");
    }
}

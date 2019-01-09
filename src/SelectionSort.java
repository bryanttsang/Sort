public class SelectionSort
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

        //sort with selection sort
        long time = System.nanoTime();
        SortingUtil.selectionSort(finalArray);
        time = System.nanoTime() - time;

        //print final array
        System.out.println("After: ");
        for (int num:finalArray)
            System.out.println(num + " ");
        System.out.println();

        //check and print
        System.out.println("Selection Sort");
        System.out.println("checkSum: " + SortingUtil.checkSum(initialArray, finalArray));
        System.out.println("isSorted: " + SortingUtil.isSorted(initialArray));
        System.out.println("Time taken: " + time + " nanoseconds");
    }
}

public class BubbleSortRunner
{
    public static void main(String args[])
    {
        //create random array
        int[] array = SortingUtil.randIntArr(10);

        //print initial array
        System.out.println("Before: ");
        for (int num:array)
            System.out.println(num + " ");
        System.out.println();

        //sort with bubble sort
        long time = System.nanoTime();
        SortingUtil.bubbleSort(array);
        time = System.nanoTime() - time;

        //print final array
        System.out.println("After: ");
        for (int num:array)
            System.out.println(num + " ");
        System.out.println();

        //print time
        System.out.println("Time taken: " + time + " nanoseconds");
    }
}

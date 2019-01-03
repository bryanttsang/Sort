public class BubbleSortRunner
{
    public static void main(String args[])
    {
        //create random array
        int[] array = BubbleSort.randIntArr(10);

        //print initial array
        System.out.println("Before: ");
        for (int num:array)
            System.out.println(num + " ");
        System.out.println();

        //sort with bubble sort
        BubbleSort.bubbleSort(array);

        //print final array
        System.out.println("After: ");
        for (int num:array)
            System.out.println(num + " ");
        System.out.println();
    }
}

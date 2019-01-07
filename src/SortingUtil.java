public class SortingUtil
{
    public static void bubbleSort(int[] array)
    {
        int swapNum = -1;
        while (swapNum != 0)
        {
            swapNum = 0;
            for (int i = 0; i < array.length - 1; i++)
            {
                int j = i + 1;
                if (array[i] > array[j])
                {
                    Swap(array, i , j);
                    swapNum++;
                }
            }
        }
    }

    public static void Swap(int[] array, int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static int[] randIntArr(int length)
    {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int)(Math.random() * 10001);
        }
        return array;
    }
}

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

    public static void selectionSort(int[] array)
    {
        int minPos;
        for (int curPos = 0; curPos < array.length - 1; curPos++)
        {
            int minVal = array[curPos];
            minPos = curPos;
            for (int i = curPos; i < array.length; i++)
            {
                if (array[i] < minVal)
                {
                    minVal = array[i];
                    minPos = i;
                }
            }
            Swap(array, curPos, minPos);
        }
    }

    public static void insertionSort(int[] list1)
    {
        for (int i = 1; i < list1.length; i++)
        {
            for (int ii = i; ii > 0; ii--)
            {
                if (list1[ii] < list1[ii - 1])
                {
                    Swap(list1, ii, ii - 1);
                }
                else
                {
                    break;
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

    public static int[] copyIntArray(int[] array)
    {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++)
        {
            copy[i] = array[i];
        }
        return copy;
    }

    public static boolean isSorted(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            if (array[i] > array[i + 1])
            {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSum(int[] array, int[] copy)
    {
        if (array.length != copy.length)
        {
            return false;
        }
        int initialSum = 0;
        int finalSum = 0;
        for (int i = 0; i < array.length; i++)
        {
            initialSum += array[i];
            finalSum += copy[i];
        }
        if (initialSum == finalSum)
        {
            return true;
        }
        return false;
    }
}

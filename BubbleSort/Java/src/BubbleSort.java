class BubbleSort
{
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    public static void main(String args[])
    {
        BubbleSort bubbleSort = new BubbleSort();
        int arr[] = {3, 8, 0, 1, 4, 90, 10};
        bubbleSort.bubbleSort(arr);
        System.out.println("Sorted arr");

        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();

    }
}


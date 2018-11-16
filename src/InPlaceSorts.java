import java.util.Arrays;

public class InPlaceSorts {
    public static void insertionSort(int[] arr)
    {
        int[] arrCopy = new int[arr.length];

        for(int i=0;i<arr.length;i++) {
            int check = 0;
            check++;
            arrCopy[i] = arr[i];
            if (i != 0) {
                int pos = i;
                while (check > 0) {
                    if(pos > 0) {
                        if (arr[pos - check] > arr[pos]) {
                            swap(arr, (pos - check), pos);
                            pos--;
                        } else {
                            check = 0;
                        }
                    }
                    if(pos == 0)
                    {
                        check =0;
                    }
                }
            }
        }

    }

    public static void selectionSort(double[] list1)
    {
        int posB =0;
        double min =0;
        for(int z=0;z<list1.length;z++)
        {
            posB = z;
            min = list1[z];
            for(int i=z;i<list1.length-1;i++)
            {
                if(min > list1[i+1])
                {
                   posB = i+1;
                   min = list1[i+1];
                }


            }

            swap(list1,posB,z);
        }
    }
    public static void bubbleSort(String[] list1)
    {

    }
    public static void swap(double[] x,int y, int z)
    {
        double temp = x[z];
        x[z] = x[y];
        x[y] = temp;
    }
    public static void swap(int[] x,int y, int z)
    {
        int temp = x[z];
        x[z] = x[y];
        x[y] = temp;
    }

}

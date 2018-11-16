
public class InPlaceSorts {
    public static void insertionSort(int[] list1)
    {
        int[] list1Copy = new int[list1.length];

        for(int i=0;i<list1.length;i++) {
            int check = 0;
            check++;
            list1Copy[i] = list1[i];
            if (i != 0) {
                int pos = i;
                while (check > 0) {
                    if(pos > 0) {
                        if (list1[pos - check] > list1[pos]) {
                            swap(list1, (pos - check), pos);
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
        boolean swapDone = false;
        int check = list1.length;
        while(!swapDone)
        {
            int j=1;
            swapDone = true;
            if(check == list1.length-1)
            {
                for(int i=0;i<list1.length-1;i++) {
                    if (list1[i].compareTo(list1[j])>0){
                        swap(list1,i,j);
                        swapDone =false;

                    }
                    if(list1[i].compareTo(list1[j])<=0)
                    {
                        check = j;
                    }
                    j++;
                }

            }
            else{
                for(int i=0;i<list1.length-1;i++) {
                    if (list1[i].compareTo(list1[j])>0){
                        swap(list1,i,j);
                        swapDone =false;

                    }
                    if(list1[i].compareTo(list1[j])<=0)
                    {
                        check = j;
                    }
                    j++;
                }
            }
        }
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
    public static void swap(String[] x,int y, int z)
    {
        String temp = x[z];
        x[z] = x[y];
        x[y] = temp;
    }
}

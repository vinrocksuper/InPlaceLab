public class InPlaceSorts {
    public static void selectionSort(double[] list1)
    {
        int posMin = 0;
        int posb = 0;
        double valMin = list1[0];
        double valb = 0;
        for(int z=0;z<list1.length;z++)
        {

            for(int i=0;i<list1.length-1;i++)
            {
                if(valMin > list1[i+1])
                {
                    valMin = list1[i+1];
                    posMin = i+1;
                }


            }

            swap(list1,posb,posMin);
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

}

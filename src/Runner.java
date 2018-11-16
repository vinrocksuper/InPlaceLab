public class Runner {
    public static void main(String[] args)
    {
        double[] y = new double[100000];
        for(int i=0;i<y.length;i++)
        {
            y[i] = Math.random()*10;
        }
        String str = "";
        for(int i=0;i<y.length;i++)
        {
            str += (y[i]) + " ";
        }
        System.out.println(str);
        long tim = System.currentTimeMillis();
        InPlaceSorts.selectionSort(y);
        System.out.println(System.currentTimeMillis()-tim);
        str = "";
        for(int i=0;i<y.length;i++)
        {
            str += (y[i]) + " ";
        }
        System.out.println(str);







        System.out.println("\n");
        System.out.println("\n");

        int[] x = new int[10000];
        for(int i=0;i<x.length;i++)
        {
            x[i] = (int)(Math.random()*10);
        }
        str = "";
        for(int i=0;i<y.length;i++)
        {
            str += (x[i]) + " ";
        }
        System.out.println(str);
        long time = System.currentTimeMillis();
        InPlaceSorts.insertionSort(x);
        System.out.println(System.currentTimeMillis() - time);
        str = "";
        for(int i=0;i<y.length;i++)
        {
            str += (x[i]) + " ";
        }

        System.out.println(str);














    }
    public String[] randomStringArr(int num, int length){
        String[] arr = new String[num];
        while(num>0)
        {
            int i=0;
            String s = "";
            while(i<length)
            {
                char c = (char)((Math.random()*26)+97);
                s = s+c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;

    }
}

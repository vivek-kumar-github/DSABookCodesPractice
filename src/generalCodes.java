public class generalCodes {
    public static void main(String[] args) {
        //StdDraw.point(0.9,0.9);
        //StdDraw.line(0.5, 0.5, 0.8, 0.8);
        //StdDraw.circle(0.5, 0.5, 0.4);
        //StdDraw.square(0.5, 0.5, 0.3);
        /*
        double[] x = {0.9, 0.2, 0.3, 0.4};
        double[] y = {0.9, 0.6, 0.7, 0.8};
        StdDraw.polygon(x, y);
         */
        /*
        int N = 100;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N*N);
        StdDraw.setPenRadius(.01);
        for (int i = 1; i <= N; i++)
        {
            StdDraw.point(i, i);
            StdDraw.point(i, i*i);
            StdDraw.point(i, i*Math.log(i));
        }
        */
        /*
        int N1 = 50;
        double[] a = new double[N1];
        for (int i = 0; i < N1; i++)
            a[i] = StdRandom.random();
        for (int i = 0; i < N1; i++)
        {
            double x = 1.0*i/ N1;
            double y = a[i]/2.0;
            double rw = 0.5/ N1;
            double rh = a[i]/2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
         */
        /*
        int N = 50;
        double[] a = new double[N];
        for (int i = 0; i < N; i++)
            a[i] = StdRandom.random();
        Arrays.sort(a);
        for (int i = 0; i < N; i++)
        {
            double x = 1.0*i/N;
            double y = a[i]/2.0;
            double rw = 0.5/N;
            double rh = a[i]/2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
         */
        /*
        INT TO BINARY
        int n = 2147483647;
        String s = "";
        for(int i = n; n > 0; n /= 2) s = (n%2) + s;
        System.out.println(s);

         */
        /*
        //IMPLEMENTATION OF LOG FUNCTION
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int log = 0;
        while(n > 1){
            n /= 2;
            log++;
        }
        System.out.println(log);

         */
        /*
        String s = "Hii I am Vivek Kumar Bhola Is from Pakistan 🧨🎆";
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));

         */

//        String string1 = "hello";
//        String string2 = string1;
//        string1 = "world";
//        StdOut.println(string1);
//        StdOut.println(string2);

//        String s = "Hello World";
//        s.toUpperCase();
//        s.substring(6, 11);
//        StdOut.println(s);

        Number[] nums = new Number[5];
        nums[0] = new Integer(1);
        nums[1] = new Double(2.0);
        System.out.println(nums.toString());
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
    }


    public static String exR1(int n)
    {
        if (n <= 0) return "";
        return exR1(n-3) + n + exR1(n-2) + n;
    }

    public static int multiply(int a, int b)
    {
        if (b == 0)     return 0;
        if (b % 2 == 0) return multiply(a+a, b/2);
        return multiply(a+a, b/2) + a;
    }

    public static String revstring(String s)
    {
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N/2);
        String b = s.substring(N/2, N);
        return revstring(b) + revstring(a);
    }
}

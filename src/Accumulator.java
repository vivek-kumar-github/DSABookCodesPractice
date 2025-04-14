//public class  Accumulator
//{
//    private double total;
//    private int N;
//    public void addDataValue(double val)
//    {
//        N++;
//        total += val;
//    }
//    public double mean()
//    {  return total/N;  }
//    public static void main(String[] args)
//    {
//        int T = 5;
//        Accumulator a = new Accumulator();
//        for (int t = 1; t <= T; t++) a.addDataValue(t);
//        StdOut.println(a.mean());
//    }
//}
public class Accumulator
{
    private double m;
    private double s;
    private int N;
    public void addDataValue(double x)
    {
        N++;
        s = s + 1.0 * (N-1) / N * (x - m) * (x - m);
        m = m + (x - m) / N;
    }
    public double mean()
    {  return m;  }
    public double var()
    {  return s/(N - 1);  }
    public double stddev()
    {  return Math.sqrt(this.var());  }

        public static void main(String[] args)
    {
        int T = 5;
        Accumulator a = new Accumulator();
        for (int t = 1; t <= T; t++) a.addDataValue(t);
        StdOut.println(a.mean());
        StdOut.println(a.var());
        StdOut.println(a.stddev());
    }
}

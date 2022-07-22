import static java.lang.Integer.MAX_VALUE;
public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public long min() {
        long min = MAX_VALUE;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
    public long summ(){
        int sum=0;
        for (long sale : sales) {
            sum+=sale;
        }
        return sum;
    }
    public long cutAvg(){
        return (summ()-max()-min())/(sales.length-2);
    }
}


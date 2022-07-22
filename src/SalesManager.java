import static java.lang.Integer.MAX_VALUE;
public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int min() {
        int min = MAX_VALUE;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
    public int summ(){
        int sum=0;
        for (int sale : sales) {
            sum+=sale;
        }
        return sum;
    }
    public int cutAvg(){
        return (summ()-max()-min())/(sales.length-2);
    }
}


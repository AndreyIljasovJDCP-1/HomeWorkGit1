public class Main {
    public static void main(String[] args) {
        SalesManager salesManager=new SalesManager(new long[]{100, 200, 300, 500, 0});
        System.out.println(salesManager.cutAvg());

    }
}

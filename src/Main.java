public class Main {
    public static void main(String[] args) {
        SalesManager salesManager=new SalesManager(new int[]{100, 200, 300, 500, 0, 10});
        System.out.println(salesManager.max());
    }
}

public class Items {
    public static void main(String[] args) {
        float price=9.99f;
        int items = 50;
        double totalprice = items*price;
        char currency = '$';

        System.out.println("Number of Items: "+items);
        System.out.println("Cost per Item: "+price +currency);
        System.out.println("Total cost: "+totalprice +currency);
    }
}

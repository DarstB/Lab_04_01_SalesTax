public class Main {
    public static void main(String[] args) {
        double SALES_TAX = 0.05;
        double purchasePrice = 42.73;

        double computedSalesTax = purchasePrice * SALES_TAX;
        double totalPrice = computedSalesTax + purchasePrice;

        System.out.println("The computed sales tax is $" + computedSalesTax + " and the total price is $" + totalPrice);
    }
}
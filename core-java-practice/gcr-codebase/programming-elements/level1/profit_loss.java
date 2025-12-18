public class profit_loss {
    public static void main(String[] args) {
        int cp = 129;
        int sp = 191;
        int profit = sp - cp;
        int pp = (profit * 100) / cp;
        System.out.println("The Cost Price is INR "+cp+" and Selling Price is INR "+ sp );
        System.out.println("The Profit is INR "+profit+ " and the Profit Percentage is "+pp+"%");
    }
}

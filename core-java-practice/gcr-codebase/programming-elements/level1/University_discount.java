public class University_discount {
    public static void main(String[] args) {
        int fee = 125000;
        int dis = (int)(0.1 * fee);
        System.out.println("The discount amount is INR "+dis+" and final discounted fee is INR "+(fee-dis));
    }
}

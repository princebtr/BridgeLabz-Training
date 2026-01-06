public class Pallindrome {
    public boolean isPallindrome(int x) {
        int num=x;
        int rev=0;
        int temp;
        while(x!=0){
            temp=x%10;
            rev = rev *10+temp;
            x/=10;
        }
        if (num<0){
            return false;
        }
        else if (rev==num){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Pallindrome p=new Pallindrome();
        System.out.println(p.isPallindrome(121));
    }
}

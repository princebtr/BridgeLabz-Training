import java.util.*;
class moveHash{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == '#') s1.append('#');
            else s2.append(c);
        }
        String res = s1.toString()+s2.toString();
        System.out.println(res);
        sc.close();
    }
}

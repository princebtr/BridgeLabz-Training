public class RomanToInteger {

    public static int romanToInt(String s) {
        int result = 0;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            if (i + 1 < len && s.substring(i, i + 2).equals("CM")) {
                result += 900;
                i++;
            } else if (i + 1 < len && s.substring(i, i + 2).equals("CD")) {
                result += 400;
                i++;
            } else if (i + 1 < len && s.substring(i, i + 2).equals("XC")) {
                result += 90;
                i++;
            } else if (i + 1 < len && s.substring(i, i + 2).equals("XL")) {
                result += 40;
                i++;
            } else if (i + 1 < len && s.substring(i, i + 2).equals("IX")) {
                result += 9;
                i++;
            } else if (i + 1 < len && s.substring(i, i + 2).equals("IV")) {
                result += 4;
                i++;
            } else {
                switch (s.charAt(i)) {
                    case 'I':
                        result += 1;
                        break;
                    case 'V':
                        result += 5;
                        break;
                    case 'X':
                        result += 10;
                        break;
                    case 'L':
                        result += 50;
                        break;
                    case 'C':
                        result += 100;
                        break;
                    case 'D':
                        result += 500;
                        break;
                    case 'M':
                        result += 1000;
                        break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String roman = "MCMXCIV";
        int value = romanToInt(roman);

        System.out.println("Roman: " + roman);
        System.out.println("Integer: " + value);
    }
}

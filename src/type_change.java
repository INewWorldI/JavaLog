public class type_change {

    public static void main(String args[]) {
        String str = "3";

        System.out.println(str.charAt(0) - '0');
        System.out.println('3' - '0' + 1);
        System.out.println(Integer.parseInt("3") + 1);
        System.out.println("3" + 1);
        System.out.println(3 + '0');   // '0은 숫자로 48
    }
}


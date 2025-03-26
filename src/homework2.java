public class homework2 {
    public static void main(String[] args){
        int a = 6;
        int b = 8;
        int c = 0;

        c = a;
        a = b;
        b = c;

        System.out.println("a:" + a);
        System.out.println("b:" + b);

        a = 5;
        b = 9;

        b = a + b - (a = b);
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }
}
public class Main {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;
        int answer = 1;

        while (exponent > 0) {
            answer = answer * base;
            exponent--;
        }

        System.out.println(answer);
    }
}

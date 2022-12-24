public class Enclosing {
    static class Nested{
        private static double rate = 8.0;
        private int price = 6;
    }
    public static void main(String[] args) {
        System.out.println(Enclosing.Nested.rate);

        Nested nested = new Nested();
        System.out.println(nested.price);
    }
}

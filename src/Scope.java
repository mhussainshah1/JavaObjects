public class Scope {

    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;// "a" is eligible for garbage collection
        String three = one;
        one = null;
        System.gc();
    }//"b" is eligible for garbage collection

    protected void finalize() {
        System.out.println("Calling finalize");
    }
}
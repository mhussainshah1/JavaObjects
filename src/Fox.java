public class Fox {
    private class Den {
    }

    public void goHome() {
        new Den();
    }

    public static void visitFriend() {
//        new Den();
        new Fox().new Den();
    }
}

class Squirrel {
    public void visitFox() {
//        new Den();
//        new Fox().new Den();
    }
}

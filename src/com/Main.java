package com;

public class Main {
    private static int i = 1;
    int j = 2;

    static class Inner {
        static int q = i;
        static int w = 3;

        enum e {}

        void method() {
            System.out.println("Method");
        }

        int getI() {
            return i;
        }

        static void staticMethod() {
        }

        Inner() {
            System.out.println("constructor");
        }
    }

    static class Inner2 extends Inner {
    }

    class Inner3 extends Inner {
        void method() {
            System.out.println("inner 3");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Inner inner = main.new Inner3();
        inner.method();
        Main.Inner inner1 = new Main.Inner();
        System.out.println(inner1.getI());
    }
}

class OгterClass extends Main.Inner {
    public static void main(String[] args) {
        Main main = new Main();
        Main.Inner inner = new Main.Inner();
    }
}
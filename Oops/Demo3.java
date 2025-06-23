package Oops;

class C1 {
    C1() {
        System.out.println("c1 construtor");
    }

    void show() {
        System.out.println("c1 show method");
    }
}


class D1 extends C1 {
    D1() {
        System.out.println("d1 construtor");
    }

    void show2() {
        System.out.println("d1 show method");
    }
}


class E1 extends C1 {
    E1() {
        System.out.println("e1 construtor");
    }

    void show3() {
        System.out.println("e1 show method");
    }
}

public class Demo3 {
    public static void main(String[] args) {
        E1 e1 = new E1();
        e1.show();
        e1.show3();

        D1 d1 = new D1();
        d1.show();
        d1.show2();

    }
}

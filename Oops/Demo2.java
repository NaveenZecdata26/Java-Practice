package Oops;

class C {
    C() {
        System.out.println("c construtor");
    }

    void show() {
        System.out.println("c show method");
    }
}


class D extends C {
    D() {
        System.out.println("d construtor");
    }

    void show2() {
        System.out.println("d show method");
    }
}

class E extends D {
    E() {
        System.out.println("e construtor");
    }

    void show3() {
        System.out.println("e show method");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        E e = new E();
        e.show();
        e.show2();
        e.show3();

    }
}

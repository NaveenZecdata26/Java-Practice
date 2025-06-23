package Memory;

class A
{}
public class Demo1 {
    public static void main(String[] args) {
       A a[] = new A[1000000000];
    for(int i =0;i<a.length;i++)
    {
        a[i] = new A();
        a[i]=null;
    }


    }
}

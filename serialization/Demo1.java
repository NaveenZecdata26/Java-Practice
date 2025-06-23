package serialization;

import java.io.*;

class A implements Serializable
{
    int x;
    int y;
    A(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "x="+x +" y="+y;
    }
}
public class Demo1 {

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        A a1 = new A(10,20);
        A a2 = new A(11,12);
        A a3 = new A(21,22);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
        ObjectOutputStream  objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(a1);
        objectOutputStream.writeObject(a2);
        objectOutputStream.writeObject(a3);

        FileInputStream fileInputStream = new FileInputStream("abc.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        A a11 =(A)objectInputStream.readObject();
        A a12 =(A)objectInputStream.readObject();
        A a13 =(A)objectInputStream.readObject();
        System.out.println("deSerialized Objects");
        System.out.println(a11);
        System.out.println(a12);
        System.out.println(a13);

    }
}

package Oops;
class cal
{

    int x, y,z;
    cal(){}
    cal(int x,int y,int z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    int sumOfTwo(int x,int y)
    {
        return (x+y);
    }
    int sumOfThree(int x,int y,int z)
    {
        return (x+y+z);
    }
}
public class Demo5 {
    public static void main(String[] args) {
        cal cal = new cal();
         int sumOfThree = cal.sumOfThree(10,20,30);
         int sumOfTwo = cal.sumOfTwo(11,34);
        System.out.println(sumOfTwo);
        System.out.println(sumOfThree);


    }
}

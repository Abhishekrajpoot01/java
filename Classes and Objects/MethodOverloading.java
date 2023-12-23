public class MethodOverloading {
    int a,b;
    float p,q;
    int add(int x,int y)
    {
        return (x+y);
    }
    double add(double x,double y)
    {
        return (x+y);
    }
    public static void main(String[] args) {
        MethodOverloading ob= new MethodOverloading();
        int result = ob.add(3,5);
        double result2 = ob.add(10.0,12.0);
        System.out.println("The result of integer add is "+ result);
        System.out.println("The result of double add is "+result2);
    }
}

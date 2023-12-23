public class Rectangle1 {
    int length,breadth;
    Rectangle1(int x,int y)
    {
        length = x;
        breadth = y;
    }
    int rectArea()
    {
        return (length*breadth);
    }
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1(20,30);
        int area= r.rectArea();
        System.out.println("The area is "+area);
    }
}


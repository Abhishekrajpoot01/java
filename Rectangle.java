public class Rectangle {
    int length, breadth;
    void getdata(int x,int y){
        length =x;
        breadth=y;
    }
    int rectArea()
    {
        int area= length*breadth;
        return (area);
    }
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        rect1.length=15;
        rect1.breadth=18;
        int area1=rect1.length*rect1.breadth;
        rect2.getdata(20,30);
        int area2 = rect2.rectArea();
        System.out.println("The area is "+area1);
        System.out.println("The area is "+area2);
    }

    
}

public class Nesting {
    int a,b;
    Nesting(int x,int y)
    {
        a=x;
        b=y;
    }    
    int largest()
    {
        if(a>b)
        {
            return a;
        }
        else{
            return b;
        }
    }
    void display()
    {
        int large=largest();
        System.out.println("The largest is "+large);
    }
    public static void main(String[] args) {
        Nesting ob = new Nesting(10,12);
        ob.display();
    }
}

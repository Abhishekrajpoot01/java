class DefaultConstructor{
        int length,breadth;
        DefaultConstructor()
        {
            length = 15;
            breadth = 20;
        }    
        DefaultConstructor(int x,int y)
        {
            length = x;
            breadth = y;
        }
        int perimeter()
        {
            return (2*(length + breadth));
        }
        public static void main(String[] args) {
            DefaultConstructor dc = new DefaultConstructor();
            DefaultConstructor dc1 = new DefaultConstructor(34,35);
            int peri1= dc.perimeter();
            int peri2= dc1.perimeter();
            System.out.println("The first perimeter is "+peri1);
            System.out.println("The second perimeter is "+peri2);
        }
}
class Mathoperation{
    static double mul(double d,double e)
    {
        return d*e;
    }
    static float divide (float x,float y)
    {
        return x/y;
    }
}
class MathApplication {
    public static void main(String[] args) {
        float a = (float) Mathoperation.mul(4.0,5.0);
        float b= Mathoperation.divide(a,(float) 2.0);
        System.out.println("b= "+b);
    }
}

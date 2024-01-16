abstract class shape
{
    double s1,s2,s3,radius;
    shape(double s1,double s2,double s3)
    {
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    shape(double radius)
    {
        this.radius=radius;
    }
    abstract void calarea();
    abstract void calperimeter();
}
class circle extends shape{
    circle(double radius)
    {
        super(radius);
    }
    void calarea()
    {
        System.out.println("area of circle:"+(3.14*radius*radius));
    }
    void calperimeter()
    {
        System.out.println("perimeter of circle:"+(2*3.14*radius));
    }
}
class triangle extends shape{
    triangle(double s1,double s2,double s3)
    {
        super(s1,s2,s3);
    }
    void calperimeter()
    {
        System.out.println("perimeter of triangle:"+(s1+s2+s3));
    }
    void calarea()
    {
        double s = (s1 + s2 + s3) / 2;
        System.out.println("perimeter of triangle:"+Math.sqrt(s * (s - s1) * (s - s2) * (s - s3)));
    }

}
class shapesMain
{
    public static void main(String[] a)
    {
        circle c= new circle(5.0);
        c.calarea();
        c.calperimeter();
        triangle t=new triangle(3.0, 4.0, 5.0);
        t.calarea();
        t.calperimeter();
    }
    


}

   
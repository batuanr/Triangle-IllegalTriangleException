public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c)  throws  IllegalTriangleException{
       if (a <= 0 || b <= 0 || c <= 0){
           throw new IllegalTriangleException("sai rồi");
       }
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

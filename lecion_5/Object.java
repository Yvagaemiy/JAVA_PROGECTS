package lecion_5;
public class Object{
    public static void main( String [] args ){
    Object o  = 1 ; 
    GetType (o);              // java.lang.Integer
    o = 1.2 ; 
    GetType (o);                   // java.lang.Double
    }
    static void GetType (Object obj ){
    System.out.println(obj.getClass(). getName());
    }
}
   




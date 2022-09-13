public class operadoresRelacionais {

    public static void main(String[] args) {

        int i1 = 10;
        int i2 =20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'g';  
        String s1 = "Bane";
        String s2 = "Sinestro";
        String s3 = "Zoom";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 6479L;
        long l2 = 3104L;
        byte y1 = 4;
        short h1 = 71;


        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 > i2 " + (i1 > i2));
        System.out.println("i1 <= i2 " + (i1 <= i2));

        System.out.println("f1 == f2 " + (f1 == f2));
        System.out.println("f1 != f2 " + (f1 != f2));
        System.out.println("f1 > f2 " + (f1 > f2));
        System.out.println("f1 <= f2 " + (f1 <= f2));

        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 > c2 " + (c1 > c2));
        System.out.println("c1 <= c2 " + (c1 <= c2));

        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 != s2 " + (s1 != s2));
        System.out.println("s1 > s2 da erro " );
        System.out.println("s1 <= s2  da erro ");

        System.out.println("b1 == b2 " + (b1 == b2));
        System.out.println("b1 != b2 " + (b1 != b2));
        System.out.println("b1 > b2 da erro " );
        System.out.println("b1 <= b2  da erro");

        System.out.println("b1 == b2 " + (b1 == b2));
        System.out.println("b1 != b2 " + (b1 != b2));
        System.out.println("b1 > b2 da erro " );
        System.out.println("b1 <= b2  da erro ");

        System.out.println("i2 > f1 " + (i2 > f2));
        System.out.println("d1 == h1 " + (d1 != h1));
        System.out.println("s2 = c1 da erro pq são tipos de dados muito diferentes" );
        System.out.println("s3  = i2 da erro pq são tipos de dados muito diferentes");

        System.out.println("l1 == i2 " + (l1 == i2));
        System.out.println("l1 != i2 " + (l2 >= i1));
        System.out.println("y1 != h1 " + (y1 != h1));

    }
}

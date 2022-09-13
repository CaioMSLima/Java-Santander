public class Casting {
    // \casting ou conversao de tipos de dados 
    public static void main(String[] args) {
        
        //convertndo de short para byte   
        byte b1;
        short s1 = 1000;
        b1 = (byte)s1; //como short tem capacidade maior que um byte vc precisa expecificar  colocando (bytes) ,foi rebaixado de short para byte.
        //reduzindo a capacidade do short para caber no byte , isso se chama dowcasting ocorrendo perda de informação.

        //convertendo um int para long.
        long l1;
        int i1 = 10;
        l1 = i1; // como int tem capacidade menor que o long , não precisa  expecificar explicito, promocao de jnt para long
         //Aumento da capacidade do it para caber em long, ocorreu um upcasting.

         int i2;
         long l2 = 100000000000000L;
        i2 = (int) l2; //com long tem capacidade maior que um int vc precisa expecificar  colocando (int), foi rebaixado de long para int.
        //reduzindo a capacidade do long para caber no int, isso se chama dowcasting ocorrendo perda de informação.

        int i3;
        long l3 = 10000L;
        i3 = (int) l3; //com long tem capacidade maior que um int vc precisa expecificar  colocando (int), foi rebaixado de long para int.
        //reduzindo a capacidade do long para caber no int, isso se chama dowcasting mas não ocorrendo perda de informação.

        double d1;
        float f1 = 10.5f;
        d1 = f1; //como float tem capacidade menor que o double , não precisa expecificar, explicito, promocao de float para double
        //Aumento da capacidade do it para caber em long, ocorreu um upcasting.

        float f2;
        double d2 = 10000.58d;
        f2 = (float) d2;//com double tem capacidade maior que um float vc precisa expecificar  colocando (float), foi rebaixado de double para float.
        //reduzindo a capacidade do double para caber no float, isso se chama dowcasting mas não ocorrendo perda de informação.

        float f3;
        double d3 = 10000.588888888888888888888888888888888888888888888888888888888888888888888888888d;
        f3 = (float) d3;//com double tem capacidade maior que um float vc precisa expecificar  colocando (float), foi rebaixado de double para float.
        //reduzindo a capacidade do double para caber no float, isso se chama dowcasting ocorrendo perda de informação.

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4;//com float tem capacidade maior que um int vc precisa expecificar  colocando (int), foi rebaixado de float para int.
        //reduzindo a capacidade do float para caber no int, isso se chama dowcasting ocorrendo perda de informação 
        // ocorrendo un truncamento(perca da parte fracionada).

        System.out.println("b1:" + b1);
        System.out.println("l1:" + l1);
        System.out.println("i2:" + i2);
        System.out.println("i3:" + i3);
        System.out.println("d1:" + d1);
        System.out.println("f2:" + f2);
        System.out.println("f3:" + f3);
        System.out.println("i4:" + i4);
        
    }
   


}

public class operadoresLogicos {
    public static void main(String[] args) {
        
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;


        System.out.println("b1 && b2 " + (b1 && b2)); // &&(E, and), verdeade se os dois forem true
        System.out.println("b1 && b3 " + (b1 && b4));

        System.out.println("b3 || b2 " + (b3 || b2)); // ||(Ou, or), verdeade se um  dos dois forem true
        System.out.println("b4 || b2 " + (b4 || b2));

        System.out.println("b1 ^ b3 " + (b1 ^ b3));// ^ (Disjunção só é verade quando ambos forem opstos)
        System.out.println("b4 ^ b1 " + (b4 ^ b1));

        System.out.println("!b3 " + !b3);// diferente ou negação ,se b3 = true entao vai dar false
        System.out.println("!b4 " + !b4);

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 53f;

        System.out.println("((i1 + i2) < (f2 -  f1 ))&& true  " + (((i1 + i2) < (f2 -  f1 ))&& true));
        System.out.println("((i1 > i2) || (f2 < f1 ))" + ((i1 > i2) || (f2 < f1 )));

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependetes = 4;
        int mediaDependentes = 2;

         System.out.println((salarioMensal < mediaSalario) && (quantidadeDependetes >= mediaDependentes));

         boolean salarioBaixo = salarioMensal < mediaSalario;
         boolean muitosDependentes = quantidadeDependetes >= mediaDependentes;

         System.out.println((salarioBaixo) && (muitosDependentes));

         boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("recebeAuxilio" + recebeAuxilio);

    }
}

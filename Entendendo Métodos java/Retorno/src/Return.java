public class Return {
    public static void main(String[] args) {
        
        //Retorno
        System.out.println("Exercício retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,7);
        System.out.println("Área do retâgulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(8,7,3);
        System.out.println("Área do trapézio" + areaTrapezio);
        
    }
    
}

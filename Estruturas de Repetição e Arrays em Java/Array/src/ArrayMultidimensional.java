import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
Após isso determine o menor número da matriz e a sua posição(linha, coluna).
*/

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int [4][4];

        for(int i = 0 ; i < M.length; i++ ){
            for(int j  = 0; j < M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Matriz: ");
        for (int[] linha : M) {
            for (int elementoDaColuna : linha){
                System.out.print(elementoDaColuna  + " ");
            }
            System.out.println();
        }
    }
}

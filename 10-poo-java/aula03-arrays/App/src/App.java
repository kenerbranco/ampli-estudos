import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Declarar um Array vazio
        int arrayVazio[] = new int[8];
        System.out.println(arrayVazio[1]);

        // Localizar índice de um elemento de Array
        int array[] = {2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array, 1, 4, 4));

        // Copiar Array
        int arrayOriginal[] = {2, 3, 4, 5, 6, 7};
        int novoArray[] = Arrays.copyOf(arrayOriginal, 4);
        System.out.println(Arrays.toString(novoArray));

        // Verifica dois arrays e retorna true se forem iguais e false se forem diferentes
        int arrayUm[] = {2, 3, 4};
        int arrayDois[] = {2, 3, 4};
        System.out.println(Arrays.equals(arrayUm, arrayDois));
    }
}

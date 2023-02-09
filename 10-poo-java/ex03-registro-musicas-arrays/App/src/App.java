import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("*** Ex03 - Projeto Registro Músicas [Arrays] ***");

        // Configuração tamanho das Arrays Código e Execuções das Músicas
        int tamArr = 2;

        // Declaração das Arrays
        int arrayCodigo[] = new int[tamArr];
        int arrayExecucoes[] = new int[tamArr];
        String arrayNome[] = new String[tamArr];
        String arrayGenero[] = new String[tamArr];
        String arrayAutor[] = new String[tamArr];

        // Declaração entradas da class Scanner
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        // Gravação dados das músicas
        for(int i=0; i<tamArr; i++) {
            // Entrada código da música
            System.out.printf("[%d] Código da música: ", i+1);
            arrayCodigo[i] = entrada.nextInt();

            // Entrada nome da música
            System.out.printf("[%d] Nome da música: ", i+1);
            arrayNome[i] = entradaString.nextLine().toUpperCase();
            
            // Entrada gênero da música
            System.out.printf("[%d] Gênero da música: ", i+1);
            String entradaGenero = entradaString.nextLine();
            arrayGenero[i] = entradaGenero.substring(0,entradaGenero.indexOf(" "));

            // Entrada autor da música
            System.out.printf("[%d] Autor da música: ", i+1);
            String entradaAutor = entradaString.nextLine();
            arrayAutor[i] = entradaAutor.substring(0,1).toUpperCase().concat(entradaAutor.substring(1));

            // Entrada qtd execições da música
            System.out.printf("[%d] Quantidade de execuções desta música: ", i+1);
            arrayExecucoes[i] = entrada.nextInt();
        }

        // Imprimir dados das músicas
        for(int i=0; i<tamArr; i++) {
            System.out.printf("--- Música %d ---\n", i+1);
            System.out.printf("Código: %d\n", arrayCodigo[i]);
            System.out.printf("Nome da música: %s\n", arrayNome[i]);
            System.out.printf("Gênero da música: %s\n", arrayGenero[i]);
            System.out.printf("Autor da música: %s\n", arrayAutor[i]);
            System.out.printf("Execuções: %d\n", arrayExecucoes[i]);
            System.out.println("-------------------");
        }

        entrada.close();
        entradaString.close();
    }
}

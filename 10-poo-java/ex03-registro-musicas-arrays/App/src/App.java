import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("*** Ex03 - Projeto Registro Músicas [Arrays] ***");

        // Configuração tamanho das Arrays Código e Execuções das Músicas
        int tamArr = 5;

        // Declaração das Arrays
        int arrayCodigo[] = new int[tamArr];
        int arrayExecucoes[] = new int[tamArr];

        try (Scanner entrada = new Scanner(System.in)) {
            // Gravar dados das músicas
            for(int i=0; i<tamArr; i++) {
                System.out.printf("[%d] Digite o código da música: ", i+1);
                arrayCodigo[i] = entrada.nextInt();
                System.out.printf("[%d] Digite a quantidade de execuções desta música: ", i+1);
                arrayExecucoes[i] = entrada.nextInt();
            }

            //Imprimir dados das músicas
            for(int i=0; i<tamArr; i++) {
                System.out.printf("--- Música %d ---\n", i+1);
                System.out.printf("Código: %d\n", arrayCodigo[i]);
                System.out.printf("Execuções: %d\n", arrayExecucoes[i]);
                System.out.println("-------------------");
            }
        } catch(Exception event) {
            System.out.println("Error! " + event);
        }
    }
}

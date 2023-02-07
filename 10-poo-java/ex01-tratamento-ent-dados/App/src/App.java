import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int i;
        int codigo = 0;

        do { 

            try {
                try (Scanner entrada = new Scanner(System.in)) {
                    System.out.println("Informe o código do produto [0 - 200]: ");
                    codigo = entrada.nextInt();
                }
                if((codigo < 0) || (codigo > 200)) {

                    System.out.println("Valor inválido, digite um valor entre 0 - 200!");
                    i = 0;

                } else { i = 1; }

            } catch(Exception error) {

                i = 0;
                System.out.println("Valor inválido, tente novamente.");
                System.out.println("Erro apresentado: " + error);
            }

        } while(i == 0);

        System.out.println("Valor inserido: " + codigo);

    }
}

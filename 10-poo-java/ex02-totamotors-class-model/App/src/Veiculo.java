public class Veiculo {
    
    private int ano;
    private String modelo;
    private String cor;
    private double preco;

    // Funções GET
    public int getAno() {
        return this.ano;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public double getPreco() {
        return this.preco;
    }

    // Funções SET
    public void setAno(int ano) {
        
        try {
            this.ano = ano;
            System.out.println("Ano cadastrado com sucesso!");

        } catch(Exception error) {
            System.out.println("Erro ao cadastrar ano.");
            System.out.println(error);
        }  
    }

    public void setModelo(String modelo) {
        
        try {
            this.modelo = modelo;
            System.out.println("Modelo cadastrado com sucesso!");

        } catch(Exception error) {
            System.out.println("Erro ao cadastrar modelo.");
            System.out.println(error);
        }  
    }

    public void setCor(String cor) {
        
        try {
            this.cor = cor;
            System.out.println("Cor cadastrado com sucesso!");

        } catch(Exception error) {
            System.out.println("Erro ao cadastrar cor.");
            System.out.println(error);
        }  
    }

    public void setPreco(double preco) {
        
        try {
            this.preco = preco;
            System.out.println("Preço cadastrado com sucesso!");

        } catch(Exception error) {
            System.out.println("Erro ao cadastrar preço.");
            System.out.println(error);
        }  
    }

}

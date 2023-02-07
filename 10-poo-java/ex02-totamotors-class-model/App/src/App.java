public class App {
    public static void main(String[] args) throws Exception {
        
        Veiculo carroUm = new Veiculo();
        Veiculo carroDois = new Veiculo();

        carroUm.postAno(2011);
        carroUm.postModelo("ELX 1.4");
        carroUm.postCor("Preto");
        carroUm.postPreco(30500);

        System.out.println(carroUm.getModelo());

        carroDois.postPreco(60200);
        System.out.println(carroDois.getPreco());

    }
}

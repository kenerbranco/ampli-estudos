public class App {
    public static void main(String[] args) throws Exception {
        
        Veiculo carroUm = new Veiculo();
        Veiculo carroDois = new Veiculo();

        carroUm.setAno(2011);
        carroUm.setModelo("ELX 1.4");
        carroUm.setCor("Preto");
        carroUm.setPreco(30500);

        System.out.println(carroUm.getModelo());

        carroDois.setPreco(60200);
        System.out.println(carroDois.getPreco());

    }
}

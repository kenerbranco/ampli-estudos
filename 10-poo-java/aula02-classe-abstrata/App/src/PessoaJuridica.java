public class PessoaJuridica extends Pessoa {

    public String cnpj;

    @Override
    public void exibirNome() {
        System.out.println(this.nomeCompleto);
    }

    @Override
    public void exibirEndereco() {
        System.out.println(this.endereco);
    }

    public void exibirCnpj() {
        System.out.println(this.cnpj);
    }
    
}

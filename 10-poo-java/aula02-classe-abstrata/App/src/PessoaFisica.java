public class PessoaFisica extends Pessoa {

    public String cpf;

    @Override
    public void exibirNome() {
        System.out.println(this.nomeCompleto);
    }

    @Override
    public void exibirEndereco() {
        System.out.println(this.endereco);
    }

    public void exibirCpf() {
        System.out.println(this.cpf);
    }

}

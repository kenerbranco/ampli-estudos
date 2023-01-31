public class App {
    public static void main(String[] args) throws Exception {
        
        PessoaFisica pessoaFisicaUm = new PessoaFisica();
        PessoaFisica pessoaFisicaDois = new PessoaFisica();

        PessoaJuridica pessoaJuridicaUm = new PessoaJuridica();
        PessoaJuridica pessoaJuridicaDois = new PessoaJuridica();

        pessoaFisicaUm.nomeCompleto = "Pessoa Um";
        pessoaFisicaUm.endereco = "Rua Um";
        pessoaFisicaUm.cpf = "000.000.000-01";

        pessoaFisicaDois.nomeCompleto = "Pessoa Dois";
        pessoaFisicaDois.endereco = "Rua Dois";
        pessoaFisicaDois.cpf = "000.000.000-02";

        pessoaJuridicaUm.nomeCompleto = "Empresa Um";
        pessoaJuridicaUm.endereco = "Avenida Um";
        pessoaJuridicaUm.cnpj = "001.001.001/0001-01";

        pessoaJuridicaDois.nomeCompleto = "Empresa Dois";
        pessoaJuridicaDois.endereco = "Avenida Dois";
        pessoaJuridicaDois.cnpj = "002.002.002/0001-02";

        System.out.println("Dados Pessoa 01");
        pessoaFisicaUm.exibirNome();
        pessoaFisicaUm.exibirEndereco();
        pessoaFisicaUm.exibirCpf();

        System.out.println("---------------");

        System.out.println("Dados Pessoa 02");
        pessoaFisicaDois.exibirNome();
        pessoaFisicaDois.exibirEndereco();
        pessoaFisicaDois.exibirCpf();

        System.out.println("---------------");

        System.out.println("Dados Juridica 01");
        pessoaJuridicaUm.exibirNome();
        pessoaJuridicaUm.exibirEndereco();
        pessoaJuridicaUm.exibirCnpj();

        System.out.println("---------------");

        System.out.println("Dados Juridica 02");
        pessoaJuridicaDois.exibirNome();
        pessoaJuridicaDois.exibirEndereco();
        pessoaJuridicaDois.exibirCnpj();

        System.out.println("---------------");

    }
}

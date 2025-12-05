public class Empresa {
    private String razaoSocial;
    private String cnpj;
    private Endereco endereco;

    public Empresa(String razaoSocial, String cnpj) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }
}
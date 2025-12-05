class Empresa {
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private Endereco endereco;

    public Empresa(String nomeFantasia, String cnpj) {
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() { return nomeFantasia; }
}
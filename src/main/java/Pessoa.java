public abstract class Pessoa {
    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco; // Associação com Endereço

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() { return nome; }
}
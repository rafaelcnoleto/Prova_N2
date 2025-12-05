public class Produto {
    private String nome;
    private String descricao;
    private double valorUnitario;
    private int quantidadeEstoque;
    private Subcategoria subcategoria;
    private Fabricante fabricante;

    public Produto(String nome, double valorUnitario, Subcategoria subcategoria) {
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.subcategoria = subcategoria;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public String getNome() { return nome; }
}
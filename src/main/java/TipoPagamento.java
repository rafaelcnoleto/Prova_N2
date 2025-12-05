public class TipoPagamento {
    private String descricao;

    // O construtor PRECISA ser public
    public TipoPagamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() { return descricao; }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
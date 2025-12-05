public class ItemPedido {
    private Produto produto;
    private int quantidade;
    private double valorUnitario; // Importante: Valor no momento da venda

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = produto.getValorUnitario(); // Snapshot do preço
    }

    public double calcularSubtotal() {
        return this.quantidade * this.valorUnitario;
    }

    public Produto getProduto() { return produto; }
}


import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private Date dataEmissao;
    private String status; // PENDENTE, APROVADO, FINALIZADO
    private double valorTotal;

    // Relacionamentos
    private Cliente cliente;
    private Vendedor vendedor;
    private Empresa empresa;
    private TipoPagamento tipoPagamento;
    private Supervisor aprovador; // Opcional

    // Composição
    private List<ItemPedido> itens;

    public Pedido(Cliente cliente, Vendedor vendedor, Empresa empresa) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.empresa = empresa;
        this.dataEmissao = new Date();
        this.status = "PENDENTE";
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {
        ItemPedido item = new ItemPedido(produto, quantidade);
        this.itens.add(item);
        calcularTotal();
    }

    private void calcularTotal() {
        this.valorTotal = 0;
        for (ItemPedido item : itens) {
            this.valorTotal += item.calcularSubtotal();
        }
    }

    // Getters para status e total
    public double getValorTotal() { return valorTotal; }
    public void setStatus(String status) { this.status = status; }
    public void setAprovador(Supervisor supervisor) { this.aprovador = supervisor; }
}
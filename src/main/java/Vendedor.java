public class Vendedor extends Funcionario {
    public Vendedor(String nome, String telefone, String matricula, double salario) {
        super(nome, telefone, matricula, salario);
    }

    public void registrarPedido(Pedido pedido) {
        System.out.println("Vendedor " + this.getNome() + " registrou o pedido.");
    }
}
class Supervisor extends Funcionario {
    public Supervisor(String nome, String telefone, String matricula, double salario) {
        super(nome, telefone, matricula, salario);
    }

    public void aprovarPedido(Pedido pedido) {
        pedido.setStatus("APROVADO");
        System.out.println(">>> Pedido aprovado pelo supervisor: " + this.getNome());
    }
}
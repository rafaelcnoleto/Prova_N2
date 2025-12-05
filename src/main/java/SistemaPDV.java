public class SistemaPDV {
    public static void main(String[] args) {
        // 1. Configuração do Ambiente
        Empresa loja = new Empresa("MegaLoja Informatica", "12.345.678/0001-99");
        Categoria catEletronicos = new Categoria("Eletrônicos");
        Subcategoria subCelulares = new Subcategoria("Smartphones", catEletronicos);
        TipoPagamento pagtoPix = new TipoPagamento("Pix");

        // 2. Cadastro de Pessoas
        Cliente cliente = new Cliente("João da Silva", "(11) 99999-0000", "111.222.333-44");
        Vendedor vendedor = new Vendedor("Ana Vendedora", "(11) 98888-1111", "V01", 2500.00);
        Supervisor supervisor = new Supervisor("Carlos Gerente", "(11) 97777-2222", "S01", 5000.00);

        // 3. Cadastro de Produtos
        Produto celular = new Produto("iPhone 15", 6000.00, subCelulares);
        Produto capa = new Produto("Capa Protetora", 150.00, subCelulares);

        // 4. Simulação de Venda
        System.out.println("Iniciando venda...");
        vendedor.registrarPedido();

        Pedido pedido = new Pedido(cliente, vendedor, loja);
        pedido.adicionarItem(celular, 2); // 2 Celulares (R$ 12.000)
        pedido.adicionarItem(capa, 1);    // 1 Capa (R$ 150)
        pedido.setTipoPagamento(pagtoPix);

        System.out.println("Valor parcial: " + pedido.getValorTotal());

        // 5. Regra de Negócio: Aprovação se > 10.000
        if (pedido.getValorTotal() > 10000.00) {
            System.out.println("Valor alto detectado. Solicitando aprovação...");
            supervisor.aprovarPedido(pedido);
        }
    }
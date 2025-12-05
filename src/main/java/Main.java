import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// ==========================================
// 1. Classes de Apoio e Localização
// ==========================================

class Endereco {
    private String logradouro;
    private String numero;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;

    public Endereco(String logradouro, String numero, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
    }

    // Getters e Setters (simplificado)
    public String getLogradouro() { return logradouro; }
}

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

// ==========================================
// 2. Hierarquia de Pessoas (Herança)
// ==========================================

abstract class Pessoa {
    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() { return nome; }
}

class Cliente extends Pessoa {
    private String cpf;
    private Date dataNascimento;

    public Cliente(String nome, String telefone, String cpf) {
        super(nome, telefone);
        this.cpf = cpf;
    }
}

abstract class Funcionario extends Pessoa {
    private String cpf;
    private String matricula;
    private double salario;

    public Funcionario(String nome, String telefone, String matricula, double salario) {
        super(nome, telefone);
        this.matricula = matricula;
        this.salario = salario;
    }
}

class Vendedor extends Funcionario {
    public Vendedor(String nome, String telefone, String matricula, double salario) {
        super(nome, telefone, matricula, salario);
    }

    public void registrarPedido() {
        System.out.println("Vendedor " + this.getNome() + " iniciou um novo pedido.");
    }
}


// ==========================================
// 3. Catálogo de Produtos
// ==========================================

class Fabricante {
    private String nome;
    public Fabricante(String nome) { this.nome = nome; }
}

class Categoria {
    private String descricao;
    public Categoria(String descricao) { this.descricao = descricao; }
}

class Subcategoria {
    private String descricao;
    private Categoria categoriaPai;

    public Subcategoria(String descricao, Categoria categoriaPai) {
        this.descricao = descricao;
        this.categoriaPai = categoriaPai;
    }
}

class Produto {
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

    public double getValorUnitario() { return valorUnitario; }
    public String getNome() { return nome; }
}

// ==========================================
// 4. Core do Sistema: Vendas e Pedidos
// ==========================================

class TipoPagamento {
    private String descricao;
    public TipoPagamento(String descricao) { this.descricao = descricao; }
    public String getDescricao() { return descricao; }
}

class ItemPedido {
    private Produto produto;
    private int quantidade;
    private double valorUnitario; // Snapshot do preço no momento da venda

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = produto.getValorUnitario();
    }

    public double calcularSubtotal() {
        return this.quantidade * this.valorUnitario;
    }

    public Produto getProduto() { return produto; }
    public int getQuantidade() { return quantidade; }
}



// ==========================================
// 5. Classe Principal (Execução)
// ==========================================


}
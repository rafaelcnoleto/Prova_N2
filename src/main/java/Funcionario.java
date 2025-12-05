public abstract class Funcionario extends Pessoa {
    private String cpf;
    private String matricula;
    private double salario;

    public Funcionario(String nome, String telefone, String matricula, double salario) {
        super(nome, telefone);
        this.matricula = matricula;
        this.salario = salario;
    }
}
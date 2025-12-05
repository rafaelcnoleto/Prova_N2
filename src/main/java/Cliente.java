import java.util.Date;

class Cliente extends Pessoa {
    private String cpf;
    private Date dataNascimento;

    public Cliente(String nome, String telefone, String cpf) {
        super(nome, telefone);
        this.cpf = cpf;
    }
}
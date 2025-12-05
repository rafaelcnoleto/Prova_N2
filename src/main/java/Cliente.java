import java.util.Date;

public class Cliente extends Pessoa {
    private String cpf;
    private Date dataNascimento;

    public Cliente(String nome, String telefone, String cpf) {
        super(nome, telefone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
package desafios.funcionarios;

public abstract class Funcionario {

    private String nome;
    private long cpf;
    private final double SALARIO_MINIMO = 1212.0;

    public Funcionario(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public double getSALARIO_MINIMO() {
        return SALARIO_MINIMO;
    }
}

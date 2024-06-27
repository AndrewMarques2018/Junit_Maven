import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String Nome;
    private LocalDate dataNascimento;

    public Pessoa(String nome, LocalDate dataNascimento) {
        Nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(this.dataNascimento, LocalDate.now());
    }

    public String getNome() {
        return Nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}

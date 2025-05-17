package src;

public class Aluno {
    private String nome;
    private String matricula;
    private float[] notas = new float[4];
    private int notasCadastradas = 0;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void definirNota(float nota) {
        this.notas[++notasCadastradas] = nota;
    }

    public float calcularMedia() {
        float soma = 0;
        for (float nota : notas) {
            soma += nota;
        }
        return soma / notasCadastradas;
    }

    public boolean isAprovado() {
        return calcularMedia() >= 7.0f;
    }
}

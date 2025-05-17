package src;

public class Turma {
    private Aluno[] alunos;

    public Turma(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void imprimirAprovados() {
        for (Aluno aluno : alunos) {
            if (aluno.isAprovado()) {
                System.out.println("Aluno " + aluno.getNome() + ": aprovado");
            }
        }
    }

    public void imprimirReprovados() {
        for (Aluno aluno : alunos) {
            if (!aluno.isAprovado()) {
                System.out.println("Aluno " + aluno.getNome() + ": reprovado");
            }
        }
    }
}

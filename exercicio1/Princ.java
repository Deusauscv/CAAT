import exercicio1.Aluno;
import exercicio1.Lista;

public class Princ {

    public static void main(String[] args) {
        Lista lista = new Lista();
    lista.inserir(new Aluno(1, "Deusa", "9563977", 18.2));
        lista.inserir(new Aluno(2, "Davilson", "9998877", 15.0));
        lista.inserir(new Aluno(3, "Eliane", "9887766", 18.2));

        // Teste de Duplicado (não deve permitir)
        lista.inserir(new Aluno(1, "Intruso", "000", 10));

        System.out.println("\n--- Lista da Turma ---");
        lista.listar();

        System.out.println("\n--- Alunos com nota 18.2 ---");
        lista.mostrarPorNota(18.2);

        System.out.println("\n--- Removendo Davilson (ID 2) ---");
        lista.removerPorId(2);
        lista.listar();
    }


}
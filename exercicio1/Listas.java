public class Listas {
    private No inicio;
    private No fim;

    public Listas() {
        this.inicio = null;
        this.fim = null;
    }

    private boolean isVazio() { return inicio == null; }

    // --- INSERIR (Impedindo duplicados por ID) ---
    public void inserir(Aluno novo) {
        if (pesquisarPorId(novo.getId()) != null) {
            System.out.println("ERRO: Já existe aluno com o ID " + novo.getId());
            return;
        }
        
        No novoNo = new No(novo);
        if (isVazio()) {
            inicio = fim = novoNo;
        } else {
            fim.setProx(novoNo);
            fim = novoNo;
        }
        System.out.println("Aluno " + novo.getNome() + " inserido.");
    }

    // --- PESQUISAS ---
    public Aluno pesquisarPorId(int id) {
        No atual = inicio;
        while (atual != null) {
            if (atual.getInfo().getId() == id) return atual.getInfo();
            atual = atual.getProx();
        }
        return null;
    }

    public void pesquisarPorNome(String nome) {
        No atual = inicio;
        while (atual != null) {
            if (atual.getInfo().getNome().equalsIgnoreCase(nome)) 
                System.out.println("Encontrado: " + atual.getInfo());
            atual = atual.getProx();
        }
    }

    public void mostrarPorNota(double nota) {
        No atual = inicio;
        while (atual != null) {
            if (atual.getInfo().getNota() == nota) System.out.println(atual.getInfo());
            atual = atual.getProx();
        }
    }

    // --- REMOVER POR ID ---
    public void removerPorId(int id) {
        if (isVazio()) return;

        if (inicio.getInfo().getId() == id) {
            inicio = inicio.getProx();
            if (inicio == null) fim = null;
            return;
        }

        No atual = inicio;
        while (atual.getProx() != null && atual.getProx().getInfo().getId() != id) {
            atual = atual.getProx();
        }

        if (atual.getProx() != null) {
            if (atual.getProx() == fim) fim = atual;
            atual.setProx(atual.getProx().getProx());
            System.out.println("Removido ID " + id);
        }
    }

    public void listar() {
        if (isVazio()) {
            System.out.println("Lista Vazia.");
            return;
        }
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.getInfo() + " -> ");
            atual = atual.getProx();
        }
        System.out.println("null");
    }
}
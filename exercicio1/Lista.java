package exercicio1;



public class Lista {
    private No inicio;
    private No fim;

  
    
    public Lista(No inicio, No fim) {
        this.inicio = null;
        this.fim = null;
    }

    public Lista() {
       
    }

    // metodos
    private boolean isVazio() {
        return (inicio == null);

    }

    // inserir no inicio
    public void inserirIni(Aluno info) {
        // criar o novo No
        No novo = new No( info);

        // verificar se a lista esta vazia
        if (isVazio()) { // a lista esta vazia

            this.inicio = novo;
            this.fim = novo;
        } else { // a lista esta vazia
            novo.setProx(inicio);
            inicio = novo;
        }

    }

    //listar todos os elementos da lista
    public void listar(){
        String nhaLista = "";
        if(isVazio()){ 
        System.out.println("Lista Vazia.");
        } else {
        No atual = inicio;
        while(atual != null){
            nhaLista+=atual.getInfo();
            nhaLista+=" -> ";
            atual = atual.getProx();

         }
            nhaLista+="null";
            System.out.println(nhaLista);

       
        }

    }

    // inserir no Fim
    public void inserirFim(Aluno info) {
        // criar o novo No
        No novo = new No(info);

        // verificar se a lista esta vazia
        if (isVazio()) { // a lista esta vazia

            this.inicio = novo;
            this.fim = novo;
        } else { // a lista esta vazia
           this.fim.setProx(novo); // O atual fim aponta para o novo
        this.fim = novo;        // O ponteiro 'fim' se move para o novo nó
        }

    }
   
    

 //inserir em qiualquer posição 
    public void inserirPosicao(Aluno info, int posicao) {
    if (posicao <= 0) {
        inserirIni(info);
        return;
    }

    No novo = new No(info);
    No atual = inicio;
    
    // Caminha até o nó anterior à posição desejada
    for (int i = 0; i < posicao - 1 && atual != null; i++) {
        atual = atual.getProx();
    }

    if (atual == null || atual == fim) {
        inserirFim(info);
    } else {
        novo.setProx(atual.getProx());
        atual.setProx(novo);
    }
}


    
//remover no icicio (inicio.prox)
public void removerIni(Aluno info) {

     // verificar se a lista esta vazia
    if (isVazio()) {
        System.out.println("A lista já está vazia.");
        return;
    }
    
    this.inicio = this.inicio.getProx();

    if (this.inicio == null) {
        this.fim = null;
    }

    }

    //Remover no Fim
public void removerFim(Aluno info ) {
    if (isVazio()) return;

    if (inicio == fim) { // Só existe um elemento
        inicio = null;
        fim = null;
        return;
    }

    No atual = inicio;
    // Percorre até encontrar o penúltimo (aquele que aponta para o fim)
    while (atual.getProx() != fim) {
        atual = atual.getProx();
    }

    atual.setProx(null);
    fim = atual;
}

//Remover em qualquer posição
   
public void removerPosicao(Aluno info, int posicao) {
    if (isVazio()) {
        System.out.println("Lista vazia, impossível remover.");
        return;
    }

    // Caso 1: Remover o primeiro elemento (posição 0)
    if (posicao <= 0) {
        removerIni(info);
        return;
    }

    No atual = inicio;
    No anterior = null;
    int contador = 0;

    // Caminha até a posição desejada ou até o fim da lista
    while (atual != null && contador < posicao) {
        anterior = atual;
        atual = atual.getProx();
        contador++;
    }

    // Caso 2: Posição não encontrada (maior que o tamanho da lista)
    if (atual == null) {
        System.out.println("Posição inválida.");
        return;
    }

    // Caso 3: Remover o último elemento
    if (atual == fim) {
        anterior.setProx(null);
        fim = anterior;
    } else {
        // Caso 4: Remover elemento do meio
        anterior.setProx(atual.getProx());
    }
}


}








package exercicio1;



public class No {

    public Aluno info;
    private No prox;


      public No (Aluno aluno ){
        this.info = aluno;
        this.prox = null;
  
    }


      public Aluno getInfo() {
          return info;
      }


      public void setInfo(Aluno info) {
          this.info = info;
      }


      public No getProx() {
          return prox;
      }


      public void setProx(No prox) {
          this.prox = prox;
      }

 
    
}

    


package exercicio1;


public class Aluno {

    private int id;
    private String Nome;  
    private String Telefone;
    private double Nota;

    
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }


  

    public Aluno() {
        this.id = 0;
        this.Nome = " ";
        this.Telefone = " ";
        this.Nota = 0.0;

    }

    public Aluno(int id, String Nome, String Telefone, double Nota) {
        this.id = id;
        this.Nome = Nome;
        this.Telefone = Telefone;
        this.Nota = Nota;
    }


    @Override

    public String toString() {
        return "ID: " + id + " | Nome: " + Nome + " | Tel: " + Telefone + " | Nota: " + Nota;
    }
    
}

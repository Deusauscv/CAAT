public class FrikFrak {
    private static String[][] tab = new String[3][3]; //tab - tabuleiro de 3x3
    private static Scanner Sc = new Scanner(System.in);

    public static void inicializa(){
        for (int i = 0; i < 3; i++) { //percorrer cada linha
        for (int j = 0; j <3; j++){//percorrer cada coluna
            tab[i][j] = " ";

        }    

        }
    }
    
private static boolean posicaoValida(int linha, int coluna){
    return (linha >= 0 && linha < 3 && coluna>= 0 && coluna < 3 );
}

private static boolean posicaoLivre(int linha, int coluna) {
    return tab [linha][coluna].equals(" ");
}

public static void jogar(String peca, int linha, int coluna ){
    tab[linha][coluna] = peca;
}


public static void mostrarTabuleiro(){

    
    System.out.println("+---+---+---+");
    System.out.println("| "+tab[0][0]+" | "+tab[0][1]+" | "+tab[0][2]+" | ");
    System.out.println("+---+---+---+");
    System.out.println("| "+tab[1][0]+" | "+tab[1][1]+" | "+tab[1][2]+" | ");
    System.out.println("+---+---+---+");
    System.out.println("| "+tab[2][0]+" | "+tab[2][1]+" | "+tab[2][2]+" | ");
    System.out.println("+---+---+---+");
    
    }

    public static void main(String[] args) {
        inicializa();
        int pecasColocadas = 0;
        String jogadorAtual = "X";
        

        System.out.println(" Seja bem-vindo ao Frik-Frak!");

        while (pecasColocadas < 6) {
            mostrarTabuleiro();
            System.out.println("Jogador" + jogadorAtual + ", escolha a linha e coluna (0-2): ");

            int S = Sc.nextInt();
            int C = Sc.nextInt();

            if (posicaoValida(S, C) && posicaoLivre(S, C)){
                tab[S][C] = jogadorAtual;
                pecasColocadas++;

                jogadorAtual = (jogadorAtual.equals("X")) ? "O" : "X";
            } else {
                System.out.println("Jogada inválida! Tente novamente");

            }
        }

        System.out.println("Fase de colocação terminada. ");


    
    }

}

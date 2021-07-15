package Game;

public class Tabuleiro {

    public char[][] jvelha = new char[3][3];

    int fimdejogo() {
    	
        if (jvelha[0][0] == 'X' && jvelha[0][1] == 'X' && jvelha[0][2] == 'X') { //Check Horizontal
            return 1;
        } else if (jvelha[1][0] == 'X' && jvelha[1][1] == 'X' && jvelha[1][2] == 'X') { //Check Horizontal
            return 1;
        } else if (jvelha[2][0] == 'X' && jvelha[2][1] == 'X' && jvelha[2][2] == 'X') { //Check Horizontal
            return 1;
        } else if (jvelha[0][0] == 'X' && jvelha[1][0] == 'X' && jvelha[2][0] == 'X') { //Check Vertical
            return 1;
        } else if (jvelha[0][1] == 'X' && jvelha[1][1] == 'X' && jvelha[2][1] == 'X') { //Check Vertical
            return 1;
        } else if (jvelha[0][2] == 'X' && jvelha[1][2] == 'X' && jvelha[2][2] == 'X') { //Check Vertical
            return 1;
        } else if (jvelha[0][0] == 'X' && jvelha[1][1] == 'X' && jvelha[2][2] == 'X') { //Check Diagonal 
            return 1;
        } else if (jvelha[0][2] == 'X' && jvelha[1][1] == 'X' && jvelha[2][0] == 'X') { //Check Diagonal 
            return 1;
            
        } //Verifica se o jogador ganhou
        else if (jvelha[0][0] == 'O' && jvelha[0][1] == 'O' && jvelha[0][2] == 'O') { //Check Horizontal
            return 3;
        } else if (jvelha[1][0] == 'O' && jvelha[1][1] == 'O' && jvelha[1][2] == 'O') { //Check Horizontal
            return 3;
        } else if (jvelha[2][0] == 'O' && jvelha[2][1] == 'O' && jvelha[2][2] == 'O') { //Check Horizontal
            return 3;
        } else if (jvelha[0][0] == 'O' && jvelha[1][0] == 'O' && jvelha[2][0] == 'O') { //Check vertical
            return 3;
        } else if (jvelha[0][1] == 'O' && jvelha[1][1] == 'O' && jvelha[2][1] == 'O') { //Check vertical
            return 3;
        } else if (jvelha[0][2] == 'O' && jvelha[1][2] == 'O' && jvelha[2][2] == 'O') { //Check vertical
            return 3;
        } else if (jvelha[0][0] == 'O' && jvelha[1][1] == 'O' && jvelha[2][2] == 'O') { //Check diagonal 
            return 3;
        } else if (jvelha[0][2] == 'O' && jvelha[1][1] == 'O' && jvelha[2][0] == 'O') { //Check diagonal 
            return 3;
        } else { //Check de empate, percorre o tabuleiro verificando se estão ocupados. Retorna 0 se o jogo ainda não terminou
       
            for (int i = 0;
                    i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (jvelha[i][j] == '@') {
                        return 0;// Jogo não terminou
                    }
                }
            }
           
            return 2; //Retorna 2 em caso de empate
        }
    }

    void iniciar() { //Preenche o tabuleiro com "@", posição vazia
        for (int i = 0;
                i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                jvelha[i][j] = '@';

            }

        }
    }
    
}

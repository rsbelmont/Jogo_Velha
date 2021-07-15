package Game;

import java.util.Random;

public class Computador1 extends Jogador {//Classe para o computador nivel facil pegando a herança do Jogador

    public char[][] jogar(char[][] tab, int quantJog) {//override da função de jogada do jogador
    	
        Random aleatorio = new Random();//Instancia objeto randômico para o jogo do Computador
        
        int linha; //Linha da tabuleiro
        int coluna; //Coluna da tabuleiro 
        
        while (true) {
         
            	
                linha = aleatorio.nextInt(3); // Seta valor aleatorio para linha
                coluna = aleatorio.nextInt(3);// Seta valor aleatorio para coluna
                
                if (tab[linha][coluna] == '@') {
                    tab[linha][coluna] = 'X';
                    return tab;
                }
            }
        }
            
    }


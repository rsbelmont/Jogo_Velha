package Game;

import java.util.Random;

public class Computador2 extends Jogador {//Classe herança de Jogador

    public char[][] jogar(char[][] tab, int quantJog) {
    	
        Random aleatorio = new Random();//Instancia objeto randômico para o jogo do Computador
        
        int linha; //Linha do tabuleiro
        int coluna; //Coluna do tabuleiro 
        
        while (true) {

              if (testeJogadaDefensiva(tab) == 1) { //Impede o jogador de completar uma sequência no tab
                tab = jogadaDefensiva(tab); //Executa a jogada defensiva
                return tab;

           
              }
              linha = aleatorio.nextInt(3);// Seta valor aleatorio para linha
              coluna = aleatorio.nextInt(3);// Seta valor aleatorio para coluna
                if (tab[linha][coluna] == '@') {
            	  
                    tab[linha][coluna] = 'X';
                    return tab;
                
                }
              }
            
        }
    

    //teste se a situação pede a jogada defensiva
    public int testeJogadaDefensiva(char[][] tab) {
        
        if (tab[0][0] == 'O' && tab[0][1] == 'O' && tab[0][2] == '@') {
            return 1;
        } else if (tab[1][0] == 'O' && tab[1][1] == 'O' && tab[1][2] == '@') {
            return 1;
        } else if (tab[2][0] == 'O' && tab[2][1] == 'O' && tab[2][2] == '@') {
            return 1;
        } else if (tab[0][0] == 'O' && tab[0][1] == '@' && tab[0][2] == 'O') {
            return 1;
        } else if (tab[1][0] == 'O' && tab[1][1] == '@' && tab[1][2] == 'O') {
            return 1;
        } else if (tab[2][0] == 'O' && tab[2][1] == '@' && tab[2][2] == 'O') {
            return 1;
        } else if (tab[0][0] == '@' && tab[0][1] == 'O' && tab[0][2] == 'O') {
            return 1;
        } else if (tab[1][0] == '@' && tab[1][1] == 'O' && tab[1][2] == 'O') {
            return 1;
        } else if (tab[2][0] == '@' && tab[2][1] == 'O' && tab[2][2] == 'O') {
            return 1;
        }
       
        else if (tab[0][0] == 'O' && tab[1][0] == 'O' && tab[2][0] == '@') { //vertical
            return 1;
        } else if (tab[0][1] == 'O' && tab[1][1] == 'O' && tab[2][1] == '@') { //vertical
            return 1;
        } else if (tab[0][2] == 'O' && tab[1][2] == 'O' && tab[2][2] == '@') { //vertical
            return 1;
        } else if (tab[0][0] == 'O' && tab[1][0] == '@' && tab[2][0] == 'O') { //vertical
            return 1;
        } else if (tab[0][1] == 'O' && tab[1][1] == '@' && tab[2][1] == 'O') { //vertical
            return 1;
        } else if (tab[0][2] == 'O' && tab[1][2] == '@' && tab[2][2] == 'O') { //vertical
            return 1;
        } else if (tab[0][0] == '@' && tab[1][0] == 'O' && tab[2][0] == 'O') { //vertical
            return 1;
        } else if (tab[0][1] == '@' && tab[1][1] == 'O' && tab[2][1] == 'O') { //vertical
            return 1;
        } else if (tab[0][2] == '@' && tab[1][2] == 'O' && tab[2][2] == 'O') { //vertical
            return 1;
            
            
        } else if (tab[0][0] == 'O' && tab[1][1] == 'O' && tab[2][2] == '@') { //diagonal 
            return 1;
        } else if (tab[0][2] == 'O' && tab[1][1] == 'O' && tab[2][0] == '@') { //diagonal 
            return 1;
        } else if (tab[0][0] == 'O' && tab[1][1] == '@' && tab[2][2] == 'O') { //diagonal 
            return 1;
        } else if (tab[0][2] == 'O' && tab[1][1] == '@' && tab[2][0] == 'O') { //diagonal 
            return 1;
        } else if (tab[0][0] == '@' && tab[1][1] == 'O' && tab[2][2] == 'O') { //diagonal 
            return 1;
        } else if (tab[0][2] == '@' && tab[1][1] == 'O' && tab[2][0] == 'O') { //diagonal 
            return 1;
        }
        
        else {
            return 0;
        }
    }
    
    public char[][] jogadaDefensiva(char[][] tab) {//execução da jogada defensiva
    	
        //horizontais ofensivas
        if (tab[0][0] == 'O' && tab[0][1] == 'O' && tab[0][2] == '@') {
            tab[0][2] = 'X';
            return tab;
        } else if (tab[1][0] == 'O' && tab[1][1] == 'O' && tab[1][2] == '@') {
            tab[1][2] = 'X';
            return tab;
        } else if (tab[2][0] == 'O' && tab[2][1] == 'O' && tab[2][2] == '@') {
            tab[2][2] = 'X';
            return tab;
        } else if (tab[0][0] == 'O' && tab[0][1] == '@' && tab[0][2] == 'O') {
            tab[0][1] = 'X';
            return tab;
        } else if (tab[1][0] == 'O' && tab[1][1] == '@' && tab[1][2] == 'O') {
            tab[1][1] = 'X';
            return tab;
        } else if (tab[2][0] == 'O' && tab[2][1] == '@' && tab[2][2] == 'O') {
            tab[2][1] = 'X';
            return tab;
        } else if (tab[0][0] == '@' && tab[0][1] == 'O' && tab[0][2] == 'O') {
            tab[0][0] = 'X';
            return tab;
        } else if (tab[1][0] == '@' && tab[1][1] == 'O' && tab[1][2] == 'O') {
            tab[1][0] = 'X';
            return tab;
        } else if (tab[2][0] == '@' && tab[2][1] == 'O' && tab[2][2] == 'O') {
            tab[2][0] = 'X';
            return tab;
        }
        
        
        else if (tab[0][0] == 'O' && tab[1][0] == 'O' && tab[2][0] == '@') { //vertical
            tab[2][0] = 'X';
            return tab;
        } else if (tab[0][1] == 'O' && tab[1][1] == 'O' && tab[2][1] == '@') { //vertical
            tab[2][1] = 'X';
            return tab;
        } else if (tab[0][2] == 'O' && tab[1][2] == 'O' && tab[2][2] == '@') { //vertical
            tab[2][2] = 'X';
            return tab;
        } else if (tab[0][0] == 'O' && tab[1][0] == '@' && tab[2][0] == 'O') { //vertical
            tab[1][0] = 'X';
            return tab;
        } else if (tab[0][1] == 'O' && tab[1][1] == '@' && tab[2][1] == 'O') { //vertical
            tab[1][1] = 'X';
            return tab;
        } else if (tab[0][2] == 'O' && tab[1][2] == '@' && tab[2][2] == 'O') { //vertical
            tab[1][2] = 'X';
            return tab;
        } else if (tab[0][0] == '@' && tab[1][0] == 'O' && tab[2][0] == 'O') { //vertical
            tab[0][0] = 'X';
            return tab;
        } else if (tab[0][1] == '@' && tab[1][1] == 'O' && tab[2][1] == 'O') { //vertical
            tab[0][1] = 'X';
            return tab;
        } else if (tab[0][2] == '@' && tab[1][2] == 'O' && tab[2][2] == 'O') { //vertical
            tab[0][2] = 'X';
            return tab;
            
            
        } else if (tab[0][0] == 'O' && tab[1][1] == 'O' && tab[2][2] == '@') { //diagonal 
            tab[2][2] = 'X';
            return tab;
        } else if (tab[0][2] == 'O' && tab[1][1] == 'O' && tab[2][0] == '@') { //diagonal 
            tab[2][0] = 'X';
            return tab;
        } else if (tab[0][0] == 'O' && tab[1][1] == '@' && tab[2][2] == 'O') { //diagonal 
            tab[1][1] = 'X';
            return tab;
        } else if (tab[0][2] == 'O' && tab[1][1] == '@' && tab[2][0] == 'O') { //diagonal 
            tab[1][1] = 'X';
            return tab;
        } else if (tab[0][0] == '@' && tab[1][1] == 'O' && tab[2][2] == 'O') { //diagonal 
            tab[0][0] = 'X';
            return tab;
        } else if (tab[0][2] == '@' && tab[1][1] == 'O' && tab[2][0] == 'O') { //diagonal 
            tab[0][2] = 'X';
            return tab;
        } //Termino das diagonais ofensivas
        else {
            return tab;
         }
       }
    }





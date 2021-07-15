package Game;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
      
    	
    	Tabuleiro jogo = new Tabuleiro();//Instancia a classe Tabuleiro
        Scanner teclado = new Scanner(System.in); //Instancia o teclado para captura do input jogador
        jogo.iniciar();//Preenche o tabuleiro com caracteres '#' = vazio
        
        Jogador jogador = new Jogador();//Instancia a classe Jogador
        
        
        
        
        
        System.out.println("### BEM VINDO AO JOGO DA VELHA!!! ###");
        System.out.println();
        System.out.println("- Os numeros de 1 a 9 do teclado numérico representam o tabuleiro do jogo.");
        System.out.println("- O símbolo '@' representa o campo que ainda não foi escolhido.");
        System.out.println("- O símbolo 'O' representa a sua jogada e o 'X' a jogada do computador.");
        System.out.println("- Para iniciar escolha o nível que deseja enfrentar o Computador:");
        System.out.println("  1- FÁCIL 2- NORMAL 3- DIFÍCIL");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        
        int dificuldade = teclado.nextInt();
        
        while (dificuldade>3 || dificuldade<=0) {
        
        		System.out.println("Escolha uma opção de dificuldade válida 1, 2 ou 3!");
        		dificuldade = teclado.nextInt();              	
        }
       
        
        if (dificuldade == 1) {//Inicia o jogo na dificuldade 1 fácil
        	
          	  System.out.println("Você selecionou o modo 1- Fácil:");

        	  Computador1 cpu1 = new Computador1(); //Instancia a classe computador1
              
              int qtJogada = 0;//Contole de jogadas
              
              exibir(jogo.jvelha);   //Exibe o tabuleiro inicial
         
              
              while (jogo.fimdejogo() == 0) { //Loop para a repetição de jogadas, o jogador inicia o jogo
                  while (true) {
                  
                  	System.out.println("Digite um número de 1 a 9 para sua jogada:");
                  	
                  	int jogada = teclado.nextInt();//Efetua a jogada de acordo com o teclado numérico (1 a 9)
                  	
                      try {
                          
                          if (jogador.testeJogada(jogada, jogo.jvelha) == 1) {//Retornara 1 se estiver ocupado
                             
                              jogo.jvelha = jogador.jogar(jogada, jogo.jvelha); //Executa a jogada na posição escolhida
                            
                              break; //Para o loop  
                              
                          } else { //Se posição já esta ocupada
                          	
                          	System.out.println("Jogada inválida, tente novamente");
                           
                          }
                          
                      } catch (Exception e) { //Se o valor digitado não for positivo inteiro ou entre 1 e 9
                      	System.out.println("Jogada inválida, tente novamente");
                         
                      }
                  }
                 
                  qtJogada++; //Incremento para qtjogada +1
                 
                  //realiza o teste se o jogador não concluiu o jogo ou preencheu a última posição possível no tabuleiro
                  if(jogo.fimdejogo() != 0){ //Para o loop caso o jogo termine
                      break;
                  }
          
                  exibir(jogo.jvelha);   //Exibe o tabuleiro         
                  System.out.println("______");

                  jogo.jvelha = cpu1.jogar(jogo.jvelha, qtJogada);//Jogada do computador
                
                  exibir(jogo.jvelha);//Exibe o tabuleiro   
                  System.out.println("______");
              }//Fim do while
        	
              
        }
        	else if (dificuldade ==2){ //Inicia o jogo na dificuldade 2 normal
        		
            	  System.out.println("Você selecionou o modo 2- Normal:");

        		  Computador2 cpu2 = new Computador2(); //Instancia a classe computador
                  
                  int qtJogada = 0;//Contole de jogadas
                  
                  exibir(jogo.jvelha);   //Exibe o tabuleiro inicial
             
                  
                  while (jogo.fimdejogo() == 0) { //Loop para a repetição de jogadas, o jogador inicia o jogo
                      while (true) {
                        
                      	System.out.println("Digite um número de 1 a 9 para sua jogada:");
                      	
                      	int jogada = teclado.nextInt();//Efetua a jogada de acordo com o teclado numérico (1 a 9)
                      	
                          try {
                              
                              if (jogador.testeJogada(jogada, jogo.jvelha) == 1) {//Retornara 1 se estiver ocupado
                                 
                                  jogo.jvelha = jogador.jogar(jogada, jogo.jvelha); //Executa a jogada na posição escolhida
                                
                                  break; //Para o loop  
                                  
                              } else { //Se posição já esta ocupada
                              	
                              	System.out.println("Jogada inválida, tente novamente");
                               
                              }
                              
                          } catch (Exception e) { //Se o valor digitado não for positivo inteiro ou entre 1 e 9
                          	System.out.println("Jogada inválida, tente novamente");
                             
                          }
                      }
                     
                      qtJogada++; //Incremento para qtjogada +1
                     
                      //realiza o teste se o jogador não concluiu o jogo ou preencheu a última posição possível no tabuleiro
                      if(jogo.fimdejogo() != 0){ //Para o loop caso o jogo termine
                          break;
                      }
              
                      exibir(jogo.jvelha);   //Exibe o tabuleiro         
                      System.out.println("______");

                      jogo.jvelha = cpu2.jogar(jogo.jvelha, qtJogada);//Jogada do computador
                    
                      exibir(jogo.jvelha);//Exibe o tabuleiro   
                      System.out.println("______");
                  }//Fim do while   		
        	}
                  else if (dificuldade ==3){ //Inicia o jogo na dificuldade 3 dificil
                	  
                  	  System.out.println("Você selecionou o modo 3- Difícil:");

                	  
                	  Computador3 cpu3 = new Computador3(); //Instancia a classe computador
                      
                      int qtJogada = 0;//Contole de jogadas
                      
                      exibir(jogo.jvelha);   //Exibe o tabuleiro inicial
                 
                      
                      while (jogo.fimdejogo() == 0) { //Loop para a repetição de jogadas, o jogador inicia o jogo
                          while (true) {
                            
                          	System.out.println("Digite um número de 1 a 9 para sua jogada:");
                          	
                          	int jogada = teclado.nextInt();//Efetua a jogada de acordo com o teclado numérico (1 a 9)
                          	
                              try {
                                  
                                  if (jogador.testeJogada(jogada, jogo.jvelha) == 1) {//Retornara 1 se estiver ocupado
                                     
                                      jogo.jvelha = jogador.jogar(jogada, jogo.jvelha); //Executa a jogada na posição escolhida
                                    
                                      break; //Para o loop  
                                      
                                  } else { //Se posição já esta ocupada
                                  	
                                  	System.out.println("Jogada inválida, tente novamente");
                                   
                                  }
                                  
                              } catch (Exception e) { //Se o valor digitado não for positivo inteiro ou entre 1 e 9
                              	System.out.println("Jogada inválida, tente novamente");
                                 
                              }
                          }
                         
                          qtJogada++; //Incremento para qtjogada +1
                         
                          //realiza o teste se o jogador não concluiu o jogo ou preencheu a última posição possível no tabuleiro
                          if(jogo.fimdejogo() != 0){ //Para o loop caso o jogo termine
                              break;
                          }
                  
                          exibir(jogo.jvelha);   //Exibe o tabuleiro         
                          System.out.println("______");

                          jogo.jvelha = cpu3.jogar(jogo.jvelha, qtJogada);//Jogada do computador
                        
                          exibir(jogo.jvelha);//Exibe o tabuleiro   
                          System.out.println("______");
                      }//Fim do while   
                  }
        
        System.out.println("______");
        exibir(jogo.jvelha);//Exibe o tabuleiro   
        
        
        
        
        if (jogo.fimdejogo() == 1) {//Exibe o estado final do jogo
            System.out.println("\nO COMPUTADOR VENCEU :(");
            
        } else if(jogo.fimdejogo() == 3){ 
            System.out.println("\nVOCE VENCEU!!");
            
        }else if(jogo.fimdejogo() == 2){ 
            System.out.println("\nEMPATOU!! TENTE NOVAMENTE!");
        }
    }

    
    static void exibir(char[][] tab) {//Exibição do tabuleiro
    	
      
        for (int l = 0; l < 3; l++) { //Loop para percorrer os campos do tabuleiro
            for (int c = 0; c < 3; c++) {
                System.out.print(tab[l][c] + " "); //Imprime na tela o tabuleiro com espaço entre os campos
            }
           
           System.out.println("\n"); //Espaçamento
            }
    }

}

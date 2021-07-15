package Game;

public class Jogador {//Executa a jogada do player


	public char[][] jogar(int jogada, char[][] tab) {
        switch (jogada) {// switch para cada opção de entrada da jogada do player 1 a 9
            case 7:
                tab[0][0] = 'O';
                return tab;
            case 8:
                tab[0][1] = 'O';
                return tab;
            case 9:
                tab[0][2] = 'O';
                return tab;
            case 4:
                tab[1][0] = 'O';
                return tab;
            case 5:
                tab[1][1] = 'O';
                return tab;
            case 6:
                tab[1][2] = 'O';
                return tab;
            case 1:
                tab[2][0] = 'O';
                return tab;
            case 2:
                tab[2][1] = 'O';
                return tab;
            case 3:
                tab[2][2] = 'O';
                return tab;
            default:
                return tab;
        }
    }

    public int testeJogada(int jogada, char[][] tab) { //Check se a jogada é valida
        switch (jogada) {
            case 7:
                if (tab[0][0] == '@') {
                    return 1;
                }
                break;
            case 8:
                if (tab[0][1] == '@') {
                    return 1;
                }
                break;

            case 9:
                if (tab[0][2] == '@') {
                    return 1;
                }
                break;
            case 4:
                if (tab[1][0] == '@') {
                    return 1;
                }
                break;
            case 5:
                if (tab[1][1] == '@') {
                    return 1;
                }
                break;
            case 6:
                if (tab[1][2] == '@') {
                    return 1;
                }
                break;
            case 1:
                if (tab[2][0] == '@') {
                    return 1;
                }
                break;
            case 2:
                if (tab[2][1] == '@') {
                    return 1;
                }
                break;
            case 3:
                if (tab[2][2] == '@') {
                    return 1;
                }
                break;
            default:
                return 0;
        }
        return 0;
    }
}

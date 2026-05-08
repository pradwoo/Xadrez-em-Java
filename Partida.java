public class Partida {

    private final Peca[][] casas;

    public Partida() {
        casas = new Peca[8][8];
    }

    public void adicionarPeca(Peca peca) {
        casas[peca.getLinha()][peca.getColuna()] = peca;
    }

    public void inicializarTabuleiro() {

        //Torres
        adicionarPeca(new Torre("Branco", 0, 0));
        adicionarPeca(new Torre("Branco", 0, 7));

        adicionarPeca(new Torre("Preto", 7, 0));
        adicionarPeca(new Torre("Preto", 7, 7));

        //Cavalos
        adicionarPeca(new Cavalo("Branco", 0, 1));
        adicionarPeca(new Cavalo("Branco", 0, 6));

        adicionarPeca(new Cavalo("Preto", 7, 1));
        adicionarPeca(new Cavalo("Preto", 7, 6));

        //Bispos
        adicionarPeca(new Bispo("Branco", 0, 2));
        adicionarPeca(new Bispo("Branco", 0, 5));

        adicionarPeca(new Bispo("Preto", 7, 2));
        adicionarPeca(new Bispo("Preto", 7, 5));

        //Rainhas
        adicionarPeca(new Rainha("Branco", 0, 3));
        adicionarPeca(new Rainha("Preto", 7, 3));

        //Reis
        adicionarPeca(new Rei("Branco", 0, 4));
        adicionarPeca(new Rei("Preto", 7, 4));

        // Peões brancos
        adicionarPeca(new Peao("Branco", 1, 0));
        adicionarPeca(new Peao("Branco", 1, 1));
        adicionarPeca(new Peao("Branco", 1, 2));
        adicionarPeca(new Peao("Branco", 1, 3));
        adicionarPeca(new Peao("Branco", 1, 4));
        adicionarPeca(new Peao("Branco", 1, 5));
        adicionarPeca(new Peao("Branco", 1, 6));
        adicionarPeca(new Peao("Branco", 1, 7));

        // Peões pretos
        adicionarPeca(new Peao("Preto", 6, 0));
        adicionarPeca(new Peao("Preto", 6, 1));
        adicionarPeca(new Peao("Preto", 6, 2));
        adicionarPeca(new Peao("Preto", 6, 3));
        adicionarPeca(new Peao("Preto", 6, 4));
        adicionarPeca(new Peao("Preto", 6, 5));
        adicionarPeca(new Peao("Preto", 6, 6));
        adicionarPeca(new Peao("Preto", 6, 7));
        }

    public void imprimirTabuleiro() {

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {

                if (casas[i][j] == null) {
                    System.out.print("- ");
                }

                else {
                    System.out.print(casas[i][j].getSimbolo() + " ");
                }
            }

            System.out.println();
        }
    }
}
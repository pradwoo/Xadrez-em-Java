public class Tabuleiro {
    private final Peca[][] casas;

    public Tabuleiro() {
        casas = new Peca[8][8];
    }

    /**
     *
     * @param peca
     */
    public void adicionarPeca(Peca peca) {
        casas[peca.getLinha()][peca.getColuna()] = peca;
    }

    /**
     *
     * @param peca
     * @param novaLinha
     * @param novaColuna
     */
    public void moverPeca(Peca peca, int novaLinha, int novaColuna) {

        if (peca.movimentoValido(novaLinha, novaColuna)) {

            casas[peca.getLinha()][peca.getColuna()] = null;

            peca.mover(novaLinha, novaColuna);

            casas[novaLinha][novaColuna] = peca;

            System.out.println("Movimento realizado!");
        } else {
            System.out.println("Movimento inválido!");
        }
    }
}
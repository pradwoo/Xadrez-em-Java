public class Rei extends Peca {

    public Rei(String cor, int linha, int coluna) {
        super(cor, linha, coluna);
    }

    @Override
    public boolean movimentoValido(int novaLinha, int novaColuna) {

        int dl = novaLinha - linha;
        int dc = novaColuna - coluna;

        if (dl < 0) {
            dl = -dl;
        }

        if (dc < 0) {
            dc = -dc;
        }

        if (dl > 1 || dc > 1) {
        } else {
            return true;
        }

        return false;
    }

    @Override
    public String getSimbolo() {
        return "R";
    }
}
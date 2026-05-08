public class Torre extends Peca {

    public Torre(String cor, int linha, int coluna) {
        super(cor, linha, coluna);
    }

    @Override
    public boolean movimentoValido(int novaLinha, int novaColuna) {

        if (linha != novaLinha && coluna != novaColuna) {
        } else {
            return true;
        }

        return false;
    }

    @Override
    public String getSimbolo() {
        return "T";
    }
}
public class Peao extends Peca {

    public Peao(String cor, int linha, int coluna) {
        super(cor, linha, coluna);
    }

    @Override
    public boolean movimentoValido(int novaLinha, int novaColuna) {

        if ("Branco".equals(cor)) {
            
            if (novaLinha == linha + 1 &&
                    novaColuna == coluna) {
                
                return true;
            }
        }

        else {
            
            if (novaLinha == linha - 1 &&
                    novaColuna == coluna) {
                
                return true;
            }
        }

        return false;
    }

    @Override
    public String getSimbolo() {
        return "P";
    }
}
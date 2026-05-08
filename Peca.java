//Classe geral das Peças
public class Peca {

    protected String cor;
    protected int linha;
    protected int coluna;

    public Peca(String cor, int linha, int coluna) {
        this.cor = cor;
        this.linha = linha;
        this.coluna = coluna;
    }

    public String getCor() {
        return cor;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void mover(int novaLinha, int novaColuna) {
        linha = novaLinha;
        coluna = novaColuna;
    }

    public boolean movimentoValido(int novaLinha, int novaColuna) {
        return true;
    }

    public String getSimbolo() {
        return "?";
    }
}
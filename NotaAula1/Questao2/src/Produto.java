public class Produto {

    private String nome, cor;
    private double peso, valor, desconto, parcela, valorParcelado, valorDescontado;
    private int codigo, estoque;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public int getEstoque() {
        return estoque;
    }

    public double getDesconto() {
        desconto = valor * 0.05;
        return valorDescontado = valor - desconto;
    }

    public void setParcela(double parcela) { this.parcela = parcela; }
    public double getParcela() {
        if (parcela <= 3) {
            return valorParcelado = valor / parcela;
        }else {
            return valorParcelado = (valor / parcela) / 0.9;
        }
    }
}
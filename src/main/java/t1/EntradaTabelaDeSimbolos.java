package t1;

public class EntradaTabelaDeSimbolos {
    private String nome, tipo;
    private LAEnums.TipoDeDado simbolo;

    public EntradaTabelaDeSimbolos(String nome, String tipo, LAEnums.TipoDeDado simbolo) {
        this.nome = nome;
        this.tipo = tipo;
        this.simbolo = simbolo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getTipo() {
        return tipo;
    }

    public LAEnums.TipoDeDado getTipoDeDado() { return simbolo; }

    @Override
    public String toString() {
        return nome+"("+tipo+")";
    }
}

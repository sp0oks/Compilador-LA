package t1;

public class EntradaTabelaDeSimbolos {
    private String nome, tipo;
    private LAEnums.tipoSimbolo simbolo;

    public EntradaTabelaDeSimbolos(String nome, String tipo, LAEnums.tipoSimbolo simbolo) {
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

    public LAEnums.tipoSimbolo getSimbolo() { return simbolo; }

    @Override
    public String toString() {
        return nome+"("+tipo+")";
    }
}

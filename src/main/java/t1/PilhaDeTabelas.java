package t1;

import java.util.LinkedList;
import java.util.List;

public class PilhaDeTabelas {

    private LinkedList<TabelaDeSimbolos> pilha;

    public PilhaDeTabelas() {
        pilha = new LinkedList<TabelaDeSimbolos>();
    }

    public void empilhar(TabelaDeSimbolos ts) {
        pilha.push(ts);
    }

    public TabelaDeSimbolos topo() {
        return pilha.peek();
    }

    public boolean existeSimbolo(String nome) {
        for (TabelaDeSimbolos ts : pilha) {
            if (ts.existeSimbolo(nome)) {
                return true;
            }
        }
        return false;
    }

    public void desempilhar() { TabelaDeSimbolos ret = pilha.pop(); }

    public List getTodasTabelas() {
        return pilha;
    }

    public void print(){
      for (TabelaDeSimbolos ts : pilha) {
          System.out.println(ts.toString());
      }
    }

    public String getTipoSimbolo(String nome){
      for (TabelaDeSimbolos ts : pilha) {
          if(ts.getTipoSimbolo(nome) != null) return ts.getTipoSimbolo(nome);
      }
      return null;
    }

    public LAEnums.TipoDeDado getTipoDeDado(String nome){
        for (TabelaDeSimbolos ts : pilha) {
            if(ts.getTipoDeDado(nome) != null) return ts.getTipoDeDado(nome);
        }
        return null;
    }
}

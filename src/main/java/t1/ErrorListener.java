package t1;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.BitSet;

public class ErrorListener implements ANTLRErrorListener {

    SaidaParser sp;

    public ErrorListener(SaidaParser sp) {
        this.sp = sp;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> rcgnzr, Object o, int i, int i1, String string, RecognitionException re) {
        if (!sp.isModificado()) {
	        Token t = (Token)o;
	        String token = t.getText();
	        if (token.equals("<EOF>"))
	            token = "EOF";
            sp.println("Linha " + i + ": erro sintatico proximo a " + token);
        }
    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean bln, BitSet bitset, ATNConfigSet atncs) {
        if (!sp.isModificado()) {
            sp.println("Ambiguidade: linha " + i + ":" + i1);
        }
    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitset, ATNConfigSet atncs) {
    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atncs) {
    }
}

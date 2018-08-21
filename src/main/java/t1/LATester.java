package main.java.t1;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class LATester {

    public static void main(String args[]) throws IOException, RecognitionException {
        SaidaParser sp = new SaidaParser();
        try {
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[0]));
            LALexer lexer = new LALexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LAParser parser = new LAParser(tokens);
            parser.addErrorListener(new ErrorListener(sp));
            parser.programa();
        } catch (ParseCancellationException pce) {
            if (pce.getMessage() != null) {
                sp.println(pce.getMessage());
            }
        } catch (ArrayIndexOutOfBoundsException iobe)  {
	    System.out.println("Erro: nenhum argumento foi dado ao executar o compilador.");
	} catch (FileNotFoundException fnfe) {
	    System.out.println("Erro: o arquivo passado no argumento não foi encontrado."); 
	}
    }
}

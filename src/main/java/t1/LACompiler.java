package t1;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.io.*;

public class LACompiler {

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
            System.out.println("Erro: nenhum arquivo de entrada foi dado ao executar o compilador.");
        } catch (FileNotFoundException fnfe) {
            System.out.println("Erro: o arquivo passado no argumento não foi encontrado.");
        }

        if (sp.isModificado()) {
            sp.print("Fim da compilacao");
            String out = sp.toString();
            try {
                File fd = new File(args[1]);
                fd.createNewFile();
                PrintWriter pw = new PrintWriter(new FileWriter(fd));
                pw.println(out);
                pw.close();
            } catch (ArrayIndexOutOfBoundsException iobe) {
                File fd = new File("saida.txt");
                fd.createNewFile();
                PrintWriter pw = new PrintWriter(new FileWriter(fd));
                pw.println(out);
                pw.close();
            }
        }
    }
}

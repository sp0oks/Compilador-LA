package t1;

public class GeradorDeCodigo extends LABaseVisitor<String> {
    SaidaParser sp;
    public GeradorDeCodigo(SaidaParser sp) { this.sp = sp; }
}

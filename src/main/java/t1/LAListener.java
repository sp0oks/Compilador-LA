// Generated from LA.g4 by ANTLR 4.7.1
package t1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LAParser}.
 */
public interface LAListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LAParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LAParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LAParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(LAParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(LAParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(LAParser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(LAParser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaracao_local_var}
	 * labeled alternative in {@link LAParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local_var(LAParser.Declaracao_local_varContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaracao_local_var}
	 * labeled alternative in {@link LAParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local_var(LAParser.Declaracao_local_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaracao_local_const}
	 * labeled alternative in {@link LAParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local_const(LAParser.Declaracao_local_constContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaracao_local_const}
	 * labeled alternative in {@link LAParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local_const(LAParser.Declaracao_local_constContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaracao_local_tipo}
	 * labeled alternative in {@link LAParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local_tipo(LAParser.Declaracao_local_tipoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaracao_local_tipo}
	 * labeled alternative in {@link LAParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local_tipo(LAParser.Declaracao_local_tipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(LAParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(LAParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(LAParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(LAParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(LAParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(LAParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(LAParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(LAParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(LAParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(LAParser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(LAParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(LAParser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(LAParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(LAParser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(LAParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(LAParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaracao_global_proc}
	 * labeled alternative in {@link LAParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global_proc(LAParser.Declaracao_global_procContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaracao_global_proc}
	 * labeled alternative in {@link LAParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global_proc(LAParser.Declaracao_global_procContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaracao_global_func}
	 * labeled alternative in {@link LAParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global_func(LAParser.Declaracao_global_funcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaracao_global_func}
	 * labeled alternative in {@link LAParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global_func(LAParser.Declaracao_global_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(LAParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(LAParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(LAParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(LAParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(LAParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(LAParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmdLeia}
	 * labeled alternative in {@link LAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(LAParser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmdLeia}
	 * labeled alternative in {@link LAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(LAParser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmdEscreva}
	 * labeled alternative in {@link LAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(LAParser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmdEscreva}
	 * labeled alternative in {@link LAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(LAParser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmdSe}
	 * labeled alternative in {@link LAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(LAParser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmdSe}
	 * labeled alternative in {@link LAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(LAParser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmdCaso}
	 * labeled alternative in {@link LAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(LAParser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmdCaso}
	 * labeled alternative in {@link LAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(LAParser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmdPara}
	 * labeled alternative in {@link LAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(LAParser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmdPara}
	 * labeled alternative in {@link LAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(LAParser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmdEnquanto}
	 * labeled alternative in {@link LAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(LAParser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmdEnquanto}
	 * labeled alternative in {@link LAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(LAParser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmdFaca}
	 * labeled alternative in {@link LAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(LAParser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmdFaca}
	 * labeled alternative in {@link LAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(LAParser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmdAtribuicao}
	 * labeled alternative in {@link LAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(LAParser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmdAtribuicao}
	 * labeled alternative in {@link LAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(LAParser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmdChamada}
	 * labeled alternative in {@link LAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(LAParser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmdChamada}
	 * labeled alternative in {@link LAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(LAParser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmdRetorne}
	 * labeled alternative in {@link LAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(LAParser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmdRetorne}
	 * labeled alternative in {@link LAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(LAParser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(LAParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(LAParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(LAParser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(LAParser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(LAParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(LAParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(LAParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(LAParser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(LAParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(LAParser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(LAParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(LAParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(LAParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(LAParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(LAParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(LAParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parcela_unario_id}
	 * labeled alternative in {@link LAParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario_id(LAParser.Parcela_unario_idContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parcela_unario_id}
	 * labeled alternative in {@link LAParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario_id(LAParser.Parcela_unario_idContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parcela_unario_expr}
	 * labeled alternative in {@link LAParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario_expr(LAParser.Parcela_unario_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parcela_unario_expr}
	 * labeled alternative in {@link LAParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario_expr(LAParser.Parcela_unario_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parcela_unario_func}
	 * labeled alternative in {@link LAParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario_func(LAParser.Parcela_unario_funcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parcela_unario_func}
	 * labeled alternative in {@link LAParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario_func(LAParser.Parcela_unario_funcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parcela_unario_atom_int}
	 * labeled alternative in {@link LAParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario_atom_int(LAParser.Parcela_unario_atom_intContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parcela_unario_atom_int}
	 * labeled alternative in {@link LAParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario_atom_int(LAParser.Parcela_unario_atom_intContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parcela_unario_atom_real}
	 * labeled alternative in {@link LAParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario_atom_real(LAParser.Parcela_unario_atom_realContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parcela_unario_atom_real}
	 * labeled alternative in {@link LAParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario_atom_real(LAParser.Parcela_unario_atom_realContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parcela_nao_unario_id}
	 * labeled alternative in {@link LAParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario_id(LAParser.Parcela_nao_unario_idContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parcela_nao_unario_id}
	 * labeled alternative in {@link LAParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario_id(LAParser.Parcela_nao_unario_idContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parcela_nao_unario_cad}
	 * labeled alternative in {@link LAParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario_cad(LAParser.Parcela_nao_unario_cadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parcela_nao_unario_cad}
	 * labeled alternative in {@link LAParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario_cad(LAParser.Parcela_nao_unario_cadContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(LAParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(LAParser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(LAParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(LAParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(LAParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(LAParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(LAParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(LAParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parcela_logica_atom}
	 * labeled alternative in {@link LAParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica_atom(LAParser.Parcela_logica_atomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parcela_logica_atom}
	 * labeled alternative in {@link LAParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica_atom(LAParser.Parcela_logica_atomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parcela_logica_expr}
	 * labeled alternative in {@link LAParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica_expr(LAParser.Parcela_logica_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parcela_logica_expr}
	 * labeled alternative in {@link LAParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica_expr(LAParser.Parcela_logica_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(LAParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(LAParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(LAParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(LAParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(LAParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(LAParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(LAParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(LAParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link LAParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(LAParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(LAParser.Op_unarioContext ctx);
}
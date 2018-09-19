grammar LA;

@header {package t1;}
@lexer::members {void erroLexico(String msg) { throw new ParseCancellationException(msg); }}

programa
:	declaracoes 'algoritmo'  corpo 'fim_algoritmo'
;

declaracoes
:	(decl_local_global)*
;

decl_local_global
:	declaracao_local
|	declaracao_global
;

declaracao_local
:	'declare'  variavel # declaracao_local_var
|	'constante'  IDENT ':' TIPO_BASICO '=' valor_constante # declaracao_local_const
|	'tipo'  IDENT ':' tipo # declaracao_local_tipo
;

variavel
: id1=identificador (',' id2+=identificador)* ':' tipo
;

identificador
:	IDENT ('.'  IDENT)* dimensao
;

dimensao
: 	('[' exp_aritmetica ']')*
;

tipo
:	registro
|	tipo_estendido
;

tipo_basico_ident
:	TIPO_BASICO
|	IDENT
;

tipo_estendido
:	'^'? tipo_basico_ident
;

valor_constante
:	CADEIA
|	NUM_INT
|	NUM_REAL
|	'verdadeiro'
|	'falso'
;

registro
:	'registro'  (variavel)* 'fim_registro'
;

declaracao_global
:	'procedimento'  IDENT '(' parametros? ')' (declaracao_local)* (cmd)* 'fim_procedimento' # declaracao_global_proc
|   'funcao' IDENT '(' parametros? ')' ':' tipo_estendido (declaracao_local)* (cmd)* 'fim_funcao' # declaracao_global_func
;

parametro
:	'var'? identificador (',' identificador)* ':' tipo_estendido
;

parametros
:	parametro (','  parametro)*
;

corpo
:	(declaracao_local)* (cmd)*
;

cmd
:   'leia' '(' '^'? identificador (',' identificador)* ')'  # cmdLeia
|	'escreva' '(' expressao (',' expressao)* ')'    # cmdEscreva
|	'se' expressao 'entao' (cmd)* ('senao' (cmd)*)? 'fim_se'    # cmdSe
|	'caso' exp_aritmetica 'seja' selecao ('senao' (cmd)*)? 'fim_caso'   # cmdCaso
|	'para' IDENT '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' (cmd)* 'fim_para'  # cmdPara
|	'enquanto' expressao 'faca' (cmd)* 'fim_enquanto'   # cmdEnquanto
|	'faca' (cmd)* 'ate' expressao   # cmdFaca
| 	'^'? identificador '<-' expressao   # cmdAtribuicao
|	IDENT '(' expressao (';' expressao)? ')'    # cmdChamada
|	'retorne'  expressao    # cmdRetorne
;

selecao
:	(item_selecao)*
;

item_selecao
:	constantes ':'  (cmd)*
;

constantes
:	numero_intervalo (','  numero_intervalo)*
;

numero_intervalo
:	op_unario? NUM_INT ('..'  op_unario? NUM_INT)?
;

exp_aritmetica
:	termo (op1 termo)*
;

termo
:	fator (op2 fator)*
;

fator
:	parcela (op3 parcela)?
;

parcela
:   op_unario? parcela_unario
|   parcela_nao_unario
;

parcela_unario
:   '^'? identificador # parcela_unario_id
|   '(' expressao ')' # parcela_unario_expr
|   IDENT '(' expressao (','  expressao)* ')' # parcela_unario_func
|   NUM_INT # parcela_unario_atom_int
|   NUM_REAL # parcela_unario_atom_real
;

parcela_nao_unario
:   '&'  identificador # parcela_nao_unario_id
|   CADEIA # parcela_nao_unario_cad
;

exp_relacional
:   exp_aritmetica (op_relacional exp_aritmetica)?
;

expressao
:	termo_logico ('ou' termo_logico)*
;

termo_logico
:	fator_logico ('e' fator_logico)*
;

fator_logico
:	'nao'? parcela_logica
;

parcela_logica
:	('verdadeiro'  | 'falso') # parcela_logica_atom
|	exp_relacional # parcela_logica_expr
;

op_relacional
:	'=' | '<>' | '>=' | '<=' | '>' | '<'
;

op1
:   '+' | '-'
;

op2
:   '*' | '/'
;

op3
:   '%'
;

op_unario
:   '-'
;

TIPO_BASICO
:	'literal' | 'inteiro' | 'real' | 'logico'
;

IDENT
:	[a-zA-Z_] [0-9a-zA-Z_]*
;

CADEIA
:	'"' .*? '"'
;

NUM_INT
:	[0-9]+
;

NUM_REAL
:	NUM_INT '.' NUM_INT
;

COMENT
:	'{' .*? '}'
	-> skip
;

ESPACO
:	[ \r\n\t]+
	-> skip
;

COMENT_N_FECHADO
:   '{' .*?
    {erroLexico("Linha " + (getLine()+1) + ": comentario nao fechado");}
;

SIMB_N_IDENTIFICADO
:	.
	{erroLexico("Linha " + getLine() + ": " + getText() + " - simbolo nao identificado");}
;

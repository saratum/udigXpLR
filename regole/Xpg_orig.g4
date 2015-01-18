grammar Xpg;

xpgfile: layers productions;

layers: LAYERS LPAREN layer* RPAREN;

layer: layername ENDOFLINE;

layername: (LOWER|UPPER|DIGITS) (LOWER|UPPER|UNDERSCORE|DIGITS)*;

productions: production+;

production: nonterminal ARROW linearRepresentation ENDOFLINE;

linearRepresentation: (nonterminal | terminal) 
                       relations*?
                        rules? 
                        triples? 
                        semanticrules?;

relations:  (relation (nonterminal | terminal));
rules: DELTA LPAREN myrule+ RPAREN;
triples: GAMMA LGPAREN (triple)+ RGPAREN;
semanticrules: SEMANTICRULE LGPAREN semanticrule RGPAREN;

relation: LT driver COMMA? tester?  GT;
triple:  LPAREN terminal SEMICOLON condition SEMICOLON myrule+ RPAREN ;
condition: STRING
         | TRUE 
         | FALSE 
         ;
driver:  idrelation;
tester:  idrelation;
myrule:  STRING COMMA?;
idrel: STRING;
semanticrule: STRING;

idrelation: (LOWER|UPPER|DIGITS) (LOWER|UPPER|UNDERSCORE|DIGITS)* ;
nonterminal: LOWER (LOWER|UPPER|DIGITS|UNDERSCORE)* APICE*?;
terminal: UPPER (UPPER)* APICE*?;

DELTA: 'DELTA' COLON;
GAMMA: 'GAMMA' COLON;
SEMANTICRULE: 'SEMANTICRULE' COLON;

LAYERS: 'LAYERS';
TRUE: 'true';
FALSE: 'false';
ARROW: '->';
LT: '<';
GT: '>';
LPAREN: '(';
RPAREN: ')';
LGPAREN: '{';
RGPAREN: '}';
SEMICOLON: ';';
COMMA: ',';
COLON: ':';
APICE: '\'';
UNDERSCORE: '_';

UPPER: [A-Z];
LOWER: [a-z];
DIGITS: [0-9]+;
ENDOFLINE: ';\n';

STRING : '"' .*? '"' ;
WS  :  ( ' ' | '\t' | '\r' | '\n' )+ -> skip
    ;
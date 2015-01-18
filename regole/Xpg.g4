grammar Xpg;

xpgfile: productions;

productions: production+;

production: nonterminal ARROW linearRepresentation ENDOFLINE;

linearRepresentation: (nonterminal | terminal) 
                       relations*?
                        deltarules? 
                        triples? 
                        semanticrules?;

relations:  (relation (nonterminal | terminal));
deltarules: DELTA LPAREN rules+ RPAREN;
triples: GAMMA LGPAREN (triple)+ RGPAREN;
semanticrules: SEMANTICRULE LGPAREN semanticrule RGPAREN;

relation: LT driver COMMA? tester?  GT;
triple:  LPAREN terminal SEMICOLON condition SEMICOLON rules+ RPAREN ;
condition: STRING
         | TRUE 
         | FALSE 
         ;
driver:  idrelation;
tester:  idrelation;
rules:  deltarule COMMA?;
deltarule: (LOWER|UPPER|UNDERSCORE|DIGITS)* EQUALS (LOWER|UPPER|UNDERSCORE|DIGITS)*  ;
idrel: STRING;
semanticrule: STRING;

idrelation: (LOWER|UPPER|DIGITS) (LOWER|UPPER|UNDERSCORE|DIGITS)* ;
nonterminal: LOWER (LOWER|UPPER|DIGITS|UNDERSCORE)* APICE*?;
terminal: UPPER (UPPER)* APICE*?;

DELTA: 'DELTA' COLON;
GAMMA: 'GAMMA' COLON;
SEMANTICRULE: 'SEMANTICRULE' COLON;

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
EQUALS: '=';
UPPER: [A-Z];
LOWER: [a-z];
DIGITS: [0-9]+;

ENDOFLINE: ';\n';

STRING : '"' .*? '"' ;
WS  :  ( ' ' | '\t' | '\r' | '\n' )+ -> skip
    ;

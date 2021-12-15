grammar PrimaryGrammar;

@header {
package PrimaryGrammar;
import types.*;
import java.util.*;
}

@parser::members {
static protected Map<String,Symbol> symbolTable = new HashMap<>();
}

program: statList EOF;

statList: (stat)*;

stat:
    title               
    | question
    | declaration
    | assignment 
    | arrayOps
    | getQuestion
    | editQuestion
    | show
    | captureQuestion
    | report
    | shuffleAnswers;

title: 'quiz' TEXT;

question: mChoice | matching ;

mChoice returns [String varName]: 'question' ID ':' 'type' 'multiple-choice' 'theme' TEXT 'text' TEXT 'answers''{' answer* '}';
matching returns [String varName]: 'question' ID ':' 'type' 'matching' 'theme' TEXT 'setLeft''{' matchAnswerLeft*'}''setRight''{'matchAnswerRight*'}' ( | ('rightPeer''{'rightPeer*'}'));

answer: ID TEXT ( | '->' BOOLEAN) ;
matchAnswerLeft: ID TEXT;
matchAnswerRight: ID TEXT;
rightPeer: ID '->' ID;

type returns[Type res]: 
      'text'        {$res = new TextType();}
    | 'number'      {$res = new NumberType();}
    | 'real'        {$res = new RealType();}
    | 'question'    {$res = new QuestionType();}
    | 'bool'        {$res = new BooleanType();}
    ;
    
declaration: 
    type ID                     #DeclarationId
    | 'array[' type ']' ID     #DeclarationArray
    ; 

assignment: 
    ( (type | ) ID '=' expr )                     #AssignmentId
    | (('array[' type ']' | ) ID '=' arrayValues)   #AssignmentArray
    ;
//add array type

arrayValues returns[Type arrType]:
    ( | 'get' 'all' 'from') TEXT ( | withFilter)    #ArrayValuesWithGet 
    | '[' ( | expr(','expr)* ) ']'                  #ArrayValuesWithoutGet
    ;

arrayOps:
    ID 'shuffle'              #ArrayShuffle
    | ID  add                 #ArrayAdd
    | ID remove               #ArrayRemove
    | ID 'shuffle' 'answers'  #ArrayShuffleAnswers
    ;

add returns [Type vType]:
    'add' expr (','expr)*       
    ;
remove returns [Type vType]:
    'remove' expr (','expr)*
    ;

expr returns[Type eType, Type vType, String varName]: 
    sign=('+'|'-') e=expr                           #signExpr
    | <assoc=right> e1=expr '^' e2=expr             #powExpr
    | e1=expr op=('*'| '/' | '%') e2=expr           #multDivModExpr
    | e1=expr op=('+' | '-') e2=expr                #addSubExpr
    | '(' e=expr ')'                                #parenExpr
    | arrayGet                                      #arrayGetEXpr 
    | TEXT                                          #textExpr
    | REAL                                          #realExpr
    | INTEGER                                       #integerExpr
    | BOOLEAN                                       #booleanExpr
    | ID                                            #idExpr
    ;

withFilter returns [String filter]:
    'with' 'type' (TEXT)(','TEXT)*                                 #FilterType
    | 'with' 'theme' '(' ( TEXT | ID )( ',' TEXT | ',' ID )* ')'    #FilterTheme
    ;

arrayGet returns [Type vType]: 
    ID'['INTEGER']'                        #ArrGetInt
    | ID 'size'                            #ArraySize
    ;

getQuestion: 'get' ID ('from' TEXT | ) 'as' ID ( | ':' ( ('select' (ID)(','ID)* ) )+ );

editQuestion: 'edit' ID ':' ( ('select' (ID)(','ID)* ))+;

show: expr 'show';

shuffleAnswers: ID 'shuffle' 'answers';

captureQuestion: 'capture' 'request' ID;

report: 'report' (TEXT|ID);

INTEGER: [0-9]+;
REAL: [0-9]+ '.' [0-9]*;
TEXT: '"' .*? '"';
BOOLEAN: 'TRUE' | 'FALSE' ;
ID: [a-zA-Z.0-9]+ ;
COMMENT: '#' .*? '\n' -> skip ;
WS: [ \t\r\n]+ -> skip;
ERROR: .;
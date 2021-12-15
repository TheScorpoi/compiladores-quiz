grammar SecondaryGrammar;

@header {
package SecondaryGrammar;
}

program: stat* EOF ;

stat: question ;

question: mChoice | matching ;

mChoice: 'question' ID ':' 'type' 'multiple-choice' 'theme' TEXT 'text' TEXT 'answers''{' answer* '}';
matching: 'question' ID ':' 'type' 'matching' 'theme' TEXT 'setLeft''{' matchAnswerLeft*'}''setRight''{'matchAnswerRight*'}' ( | ('rightPeer''{'rightPeer*'}'));

answer: ID TEXT ( | '->' BOOLEAN) ;
matchAnswerLeft: ID TEXT;
matchAnswerRight: ID TEXT;
rightPeer: ID '->' ID;

TEXT: '"' .*? '"';
BOOLEAN: 'TRUE' | 'FALSE' ;
ID: [a-zA-Z0-9]+ ;
COMMENT: '#' .*? '\n' -> skip ;
WS: [ \t\r\n]+ -> skip;

grammar GrammarShellForMancoosi;

options {
	backtrack=true;
	k=1;
}


mainRule
	: header (statement)*
	;

header
	: SHARP EXCL path  (param)? '\n'
	;


statement
	: template
	| command_statement
	| control_statement
	| loop_statement
	| function_statement
	| redirection_statement
	;

template
	: templateA1
	| templateA2
	| templateA3
	| templateA4
	| templateA5
	| templateA6
	| templateA7
	| templateA8
	| templateA9
	| templateA10
	| templateA11
	| templateA12_13
	| templateA14
	| templateA15	
	| templateA16
	| templateA17
	| templateA18
	| templateA19
	| templateA20
	| templateA21
	| templateA22
	| templateA23
	| templateA24
	| templateA25
	| templateA26
	| templateA27
	| templateA28
	| templateA29
	| templateA30
	| templateA31
	| templateA32
	| templateA33
	| templateA34
	| templateA35
	| templateA36
	| templateA37
	| templateA38
	| templateA39
	| templateA40
	| templateA41
	| templateA42
	| templateA43
	| templateA44
	| templateA45
	| templateA46
	| templateA47
	| templateA48
	| templateA49
	| templateA50
	| templateA51
	| templateA52
	;

templateA1
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK ('\n')? AND ('\n')? 'which' 'update-desktop-database' GREAT PATHNULL NUMBER GREATAND NUMBER ';' 'then' ('\n')? 'update-desktop-database' MINUS 'q' ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA2
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'remove' DQUOTE? RSBRACK ('\n')? AND ('\n')? 'which' 'update-desktop-database' GREAT PATHNULL NUMBER GREATAND NUMBER ';' 'then' ('\n')? 'update-desktop-database' MINUS 'q' ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA3
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK ('\n')? AND ('\n')? 'which' 'install-docs' GREAT PATHNULL NUMBER GREATAND NUMBER ';' 'then' ('\n')? 'install-docs' MINUS 'i' doc_id ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA4
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'remove' DQUOTE? RSBRACK OR ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'upgrade' DQUOTE? RSBRACK ('\n')? AND ('\n')? 'which' 'install-docs' GREAT PATHNULL
	NUMBER GREATAND NUMBER ';' 'then' ('\n')? 'install-docs' MINUS 'r' doc_id ('\n' | ';') 'fi' ('\n' | ';')
	;
	
templateA5
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK ('\n')? AND ('\n')? LSBRACK MINUS 'x' PATHEMACSINST RSBRACK ';' 'then' ('\n')? 
	PATHEMACSINST pack ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA6
	:  'if' ('\n')? LSBRACK MINUS 'x' PATHEMACSREM RSBRACK ';' 'then' ('\n')?  PATHEMACSREM pack ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA7
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK ('\n')? AND ('\n')? 'which' 'update-gconf-defaults' GREAT PATHNULL NUMBER GREATAND NUMBER ';' 'then' ('\n')? 'update-gconf-defaults' ('\n' | ';') 'fi' ('\n' | ';')
	;
	
templateA8
	: 'if' ('\n')?  'which' 'update-gconf-defaults' GREAT PATHNULL NUMBER GREATAND NUMBER ';' 'then' ('\n')? 'update-gconf-defaults' ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA9
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK  ';' 'then' ('\n')?  'gconf-schemas' DMINUS 'register' schemas+ ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA10
	:  'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'remove' DQUOTE? RSBRACK OR ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'upgrade' DQUOTE? RSBRACK ';' 'then' ('\n')?  'gconf-schemas' DMINUS 'unregister' schemas+ ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA11
	:  'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'purge' DQUOTE? RSBRACK  ';' 'then' ('\n')? 'OLD_DIR' EQU  PATHGCONFSCH ('\n')? 'SCHEMA_FILES' EQU DQUOTE schemas+ DQUOTE '\n' 'if' ('\n')? 
	LSBRACK ('\n')? MINUS 'd' '$OLD_DIR' RSBRACK ';' 'then' ('\n')? 'for' ('\n')? 'SCHEMA' ('\n')? 'in' ('\n')? '$SCHEMA_FILES' ';' 'do' '\n'  'rm' MINUS 'f' PATHOLDSCHEMA '\n' 'done' ('\n' | ';')  'rmdir' MINUS 'p' 
	DMINUS 'ignore-fail-on-non-empty' '$OLD_DIR' ('\n' | ';') 'fi' ('\n' | ';') 'fi' ('\n' | ';')
	; 

templateA12_13
	: 'if' ('\n')?  'which' 'update-icon-caches' GREAT PATHNULL NUMBER GREATAND NUMBER ';' 'then' ('\n')? 'update-icon-caches' (dirlist ('\n' | ';')?)+ 'fi' ('\n' | ';')
	;
	
templateA14
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK  ';' 'then' ('\n')? 'install-info' DMINUS 'quiet' file ('\n' | ';') 'fi' ('\n' | ';')
	;
	
templateA15
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'remove' DQUOTE? RSBRACK ('\n')? OR ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'upgrade' DQUOTE? RSBRACK ';' 
	'then' ('\n')? 'install-info' DMINUS 'quiet' DMINUS 'remove' file ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA16
	:  'if' ('\n')? LSBRACK MINUS 'x' DQUOTE script_path DQUOTE RSBRACK ';' 'then' ('\n')? 'update-rc.d' script initparms+ GREAT PATHNULL OR error_handler ('\n' | ';')  'fi' ('\n' | ';') 
	;

templateA17
	: 'if' ('\n')? LSBRACK MINUS 'x' DQUOTE script_path DQUOTE RSBRACK ';' 'then' ('\n')? 'update-rc.d' script initparms+ GREAT PATHNULL ('\n' | ';') 
	'if' ('\n')? LSBRACK MINUS 'n' DQUOTE input_variable DQUOTE RSBRACK ';' 'then' ('\n')? UNDERSCORE 'dh_action' EQU 'restart'  ('\n')? 'else'  ('\n')?  UNDERSCORE 'dh_action' EQU 'start'  ('\n' | ';') 'fi' ('\n' | ';') 
	'if' ('\n')? LSBRACK MINUS 'x' DQUOTE AP  'which' 'invoke-rc.d' NUMBER GREAT PATHNULL AP DQUOTE RSBRACK ';' 'then' ('\n')?  'invoke-rc.d' script '$_dh_action' OR error_handler ('\n')? 
	'else' ('\n')? script_path '$_dh_action' OR error_handler  ('\n' | ';')  'fi'  ('\n' | ';') 'fi' ('\n' | ';') 
	;

templateA18
	: 'if' ('\n')? LSBRACK MINUS 'x' DQUOTE script_path DQUOTE RSBRACK AND  LSBRACK DQUOTE input_variable DQUOTE EQU 'remove' RSBRACK ';' 
	'then' ('\n')?  'if' ('\n')? LSBRACK MINUS 'x' DQUOTE AP  'which' 'invoke-rc.d' NUMBER GREAT PATHNULL AP DQUOTE RSBRACK ';' 'then' ('\n')?  'invoke-rc.d' script 'stop' OR error_handler ('\n')? 
	'else' ('\n')? script_path 'stop' OR error_handler  'fi' ('\n' | ';') 'fi' ('\n' | ';') 
	;

templateA19
	:  'if' ('\n')? LSBRACK MINUS 'x' DQUOTE script_path DQUOTE RSBRACK ';' 'then' ('\n')? 'update-rc.d' script initparms+ GREAT PATHNULL ('\n' | ';')  
	'if' ('\n')? LSBRACK MINUS 'x' DQUOTE AP  'which' 'invoke-rc.d' NUMBER GREAT PATHNULL AP DQUOTE RSBRACK ';' 'then' ('\n')?  'invoke-rc.d' script 'start' OR error_handler ('\n')? 
	'else' ('\n')? script_path 'start' OR error_handler  ('\n' | ';') 'fi' ('\n' | ';') 'fi' ('\n' | ';') 
	;

templateA20
	:  'if' ('\n')? LSBRACK MINUS 'x' DQUOTE script_path DQUOTE RSBRACK ';' 'then' ('\n')? 'if' ('\n')? LSBRACK MINUS 'x' DQUOTE AP  'which' 'invoke-rc.d' NUMBER GREAT PATHNULL AP DQUOTE RSBRACK ';' 
	'then' ('\n')?  'invoke-rc.d' script 'stop' OR error_handler ('\n')? 'else' ('\n')? script_path 'stop' OR error_handler  ('\n' | ';')  'fi' ('\n' | ';') 'fi' ('\n' | ';') 
	;

templateA21
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'purge' DQUOTE? RSBRACK ';' 'then' ('\n')? 'update-rc.d' script 'remove' GREAT PATHNULL OR error_handler  ('\n' | ';') 'fi' ('\n' | ';')
	;
	
templateA22
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK ';' 'then' ('\n')? 'ldconfig' ('\n' | ';') 'fi' ('\n' | ';') 
	;

templateA23
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'remove' DQUOTE? RSBRACK ';' 'then' ('\n')? 'ldconfig' ('\n' | ';') 'fi' ('\n' | ';') 
	;

templateA24
	: 'inst' EQU pack_path (';' | '\n') 'if'  LSBRACK MINUS 'f' '$inst' RSBRACK ';' 'then' ('\n')? 'chmod' 'a+x' '$inst' ('\n' | ';') 
	'if'  LSBRACK MINUS 'x' DQUOTE AP  'which' 'update-menus' NUMBER GREAT PATHNULL AP DQUOTE RSBRACK ';' 'then' ('\n')? 'update-menus'  ('\n' | ';') 'fi' ('\n' | ';') 'fi' ('\n' | ';') 
	;

templateA25
	:  'inst' EQU pack_path (';' | '\n') 'if'  LSBRACK DQUOTE input_variable DQUOTE EQU DQUOTE 'remove' DQUOTE RSBRACK AND LSBRACK MINUS 'f' DQUOTE '$inst' DQUOTE RSBRACK ';' 
	'then' ('\n')?  'chmod' 'a-x' '$inst' ('\n' | ';') 'fi' ('\n' | ';')  'if'  LSBRACK MINUS 'x' DQUOTE AP  'which' 'update-menus' NUMBER GREAT PATHNULL AP DQUOTE RSBRACK ';' 'then' ('\n')? 'update-menus'  ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA26
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK ('\n')? AND ('\n')? LSBRACK MINUS 'x' DQUOTE AP 'which' 'update-menus' NUMBER GREAT PATHNULL AP DQUOTE RSBRACK ';' 
	'then' ('\n')? 'update-menus' ('\n' | ';') 'fi' ('\n' | ';')  	
 	;

templateA27
	:  'if' ('\n')? LSBRACK MINUS 'x' DQUOTE AP 'which' 'update-menus' NUMBER GREAT PATHNULL AP DQUOTE RSBRACK ';' 'then' ('\n')? 'update-menus' ('\n' | ';') 'fi' ('\n' | ';')  
	;

templateA28
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK ';' 'then' ('\n')?  'if' ('\n')? LSBRACK MINUS 'e' kvers_path RSBRACK ';' 
	'then' ('\n')? 'depmod' MINUS 'a' MINUS 'F' kvers_path kvers OR  'true' ('\n' | ';') 'fi' ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA29
	:  'if' ('\n')? LSBRACK MINUS 'e' kvers_path RSBRACK ';' 'then' ('\n')?  'depmod' MINUS 'a' MINUS 'F' kvers_path kvers OR 'true' ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA30
	: 'PYTHON' EQU pyver ('\n' | ';') 'if' ('\n')? 'which' '$PYTHON' GREAT PATHNULL NUMBER GREATAND NUMBER ('\n')? AND ('\n')?  LSBRACK MINUS 'e' PATHCOMPYTH RSBRACK ';' 
	'then' ('\n')? 'DIRLIST' EQU DQUOTE (dirlist '\n'?)+ DQUOTE ( '\n' | ';' ) 'for' ('\n')? 'i' 'in' '$DIRLIST' ';' 'do' '\n' '$PYTHON' PATHCOMPYTH MINUS 'q' '$i' ('\n' | ';') 'done' ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA31
	: 'dpkg' MINUS 'L' pack VBAR ('\n')? 'awk' PSINGLE input_variable TILDE  SLASH BSLASH '.py' '$' SLASH LGRAF 'print' input_variable DQUOTE 'c' BSLASH 'n' DQUOTE input_variable DQUOTE 'o' DQUOTE RGRAF PSINGLE VBAR ('\n')? 'xargs' 'rm' MINUS 'f' GREATAND NUMBER ('\n' | ';')
	;

templateA32
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK ('\n')? AND ('\n')? 'which' 'scrollkeeper-update' GREAT PATHNULL NUMBER GREATAND NUMBER ';' 'then' ('\n')? 'scrollkeeper-update' MINUS 'q' ('\n' | ';') 'fi' ('\n' | ';')	
 	;

templateA33
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'remove' DQUOTE? RSBRACK ('\n')? AND ('\n')? 'which' 'scrollkeeper-update' GREAT PATHNULL NUMBER GREATAND NUMBER ';' 'then' ('\n')? 'scrollkeeper-update' MINUS 'q' ('\n' | ';') 'fi' ('\n' | ';')	
 	;
 
 templateA34
 	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK ';' 'then' ('\n')? 'rm' MINUS 'f' centralcat ('\n' | ';') 'for' 'ordcat' 'in' ordcats+ ';' 
 	'do' ('\n')? 'update-catalog' DMINUS 'quiet'  DMINUS 'add' centralcat '$' LGRAF 'ordcat' RGRAF ('\n' | ';') 'done' ('\n' | ';') 'update-catalog' DMINUS 'quiet' DMINUS 'add' DMINUS 'super' centralcat ('\n' | ';') 'fi' ('\n' | ';')
 	;

 templateA35
 	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'remove' DQUOTE? RSBRACK ('\n')? OR ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'upgrade' DQUOTE? RSBRACK ';' 
 	'then' ('\n')? 'update-catalog' DMINUS 'quiet' DMINUS 'remove' DMINUS 'super' centralcat ('\n' | ';') 'fi' ('\n' | ';')
 	;
 
// DOT 'old'	
 templateA36
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'purge' DQUOTE? RSBRACK ('\n')? ';' 'then' ('\n')? 'rm' MINUS 'f' centralcat centralcat ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA37
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK ('\n')? AND ('\n')? LSBRACK MINUS 'x' DQUOTE AP 'which' 'update-mime-database' NUMBER GREAT PATHNULL AP DQUOTE RSBRACK ';' 
	'then' ('\n')? 'update-mime-database' PATHMIME ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA38
	:  'if' ('\n')? LSBRACK MINUS 'x' DQUOTE AP 'which' 'update-mime-database' NUMBER GREAT PATHNULL AP DQUOTE RSBRACK ';' 'then' ('\n')? 'update-mime-database' PATHMIME ('\n' | ';') 'fi' ('\n' | ';')	
 	;

templateA39
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK ('\n')? AND ('\n')? LSBRACK MINUS 'x' DQUOTE AP 'which' 'update-mime' NUMBER GREAT PATHNULL AP DQUOTE RSBRACK ';' 
	'then'  ('\n')? 'update-mime' ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA40
	:  'if' ('\n')?  'which' 'update-mime' GREAT PATHNULL NUMBER GREATAND NUMBER ';' 'then' ('\n')? 'update-mime' ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA41
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK ('\n' | ';') 'then' ('\n')? 'if' ('\n')? 'which' 'suidregister' GREAT PATHNULL NUMBER GREATAND NUMBER ('\n')? AND ('\n')? LSBRACK MINUS 'e' PATHSUID RSBRACK ('\n' | ';') 
	'then' ('\n')? 'suidregister' MINUS 's' pack file owner group perms ('\n' | ';') 
	'elif' ('\n')? LSBRACK MINUS 'e' file RSBRACK (';' |'\n') 'then' ('\n')? 'chown' owner COLON group file ('\n' | ';') 'chmod' perms file ('\n' | ';') 'fi' ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA42
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'remove' DQUOTE? RSBRACK ('\n')? AND ('\n')? LSBRACK MINUS 'e' PATHSUID RSBRACK ('\n')? AND ('\n')? 'which' 'suidunregister' GREAT PATHNULL NUMBER GREATAND NUMBER ';' 'then' ('\n')? 'suidunregister' MINUS 's' pack file ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA43
	:'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'install' DQUOTE? RSBRACK OR ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'upgrade' DQUOTE? RSBRACK ';' 'then' ('\n')? 'if' ('\n')? LSBRACK MINUS 'e' DQUOTE old DQUOTE RSBRACK ';' 'then' ('\n')? 'if' ('\n')? LSBRACK
	 DQUOTE AP 'md5sum'  BSLASH DQUOTE old BSLASH DQUOTE VBAR 'sed' MINUS 'e' BSLASH DQUOTE PATHSS DOT '*' SLASH SLASH BSLASH DQUOTE AP DQUOTE EQU DQUOTE AP 'dpkg-query' MINUS 'W' MINUS 'f' EQU PSINGLE '$' LGRAF 'Conffiles' RGRAF PSINGLE old VBAR 'sed' MINUS 'n' MINUS 'e' BSLASH DQUOTE
	 BSLASH BSLASH BSLASH BSLASH PSINGLE old PSINGLE PATHSS DOT '*' SLASH PATHP BSLASH DQUOTE AP DQUOTE RSBRACK ('\n')? 'then' ('\n')? 'rm' MINUS 'f' DQUOTE old DQUOTE ('\n' | ';') 'fi' ('\n' | ';') 'fi' ('\n' | ';') 'if'('\n')? LSBRACK MINUS 'L' DQUOTE rule_placeholder DQUOTE RSBRACK ';' 
	 'then' ('\n')? 'rm' MINUS 'f' DQUOTE rule_placeholder DQUOTE ('\n' | ';') 'fi' ('\n' | ';') 'fi' ('\n' | ';')
	;

// .dpkg-new
templateA44
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK (';' | '\n') 'then' ('\n')? 'if' LSBRACK MINUS 'e' DQUOTE old DQUOTE  RSBRACK (';' | '\n') 'then' ('\n')? 'echo' DQUOTE  'Preserving' 'user' 'changes' 'to' rule_placeholder 
	DOT DOT DOT DQUOTE (';' | '\n')  'if' LSBRACK MINUS 'e' DQUOTE rule_placeholder DQUOTE  RSBRACK (';' | '\n') 'then' ('\n')? 'mv' MINUS 'f' DQUOTE rule_placeholder DQUOTE  DQUOTE word DQUOTE  ('\n' | ';') 'fi' ('\n' | ';')  'mv' MINUS 'f' DQUOTE old DQUOTE  DQUOTE rule_placeholder DQUOTE  ('\n' | ';') 'fi'  ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA45
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK (';' | '\n') 'then' ('\n')? LPAR  ('\n')? 'while' 'read' 'line' (';')? 'do'  ('\n')? 'set' DMINUS '$line'  (';' | '\n') 'dir' EQU DQUOTE input_variable DQUOTE ';' 'mode' EQU DQUOTE input_variable DQUOTE ';' 'user' EQU DQUOTE input_variable DQUOTE ';' 'group' EQU DQUOTE 
	input_variable DQUOTE  (';' | '\n')
	 'if' LSBRACK EXCL MINUS 'e' DQUOTE '$dir' DQUOTE RSBRACK  
	(';' | '\n') 'then'  ('\n')? 'if' 'mkdir' DQUOTE '$dir' DQUOTE NUMBER GREAT PATHNULL  (';' | '\n') 'then' ('\n')? 'chown' DQUOTE '$user' DQUOTE COLON DQUOTE '$group' DQUOTE DQUOTE '$dir' DQUOTE  (';' | '\n') 'chmod' DQUOTE '$mode' DQUOTE DQUOTE '$dir' DQUOTE ('\n' | ';') 'fi'('\n' | ';') 'fi'  (';' | '\n') 'done' (';' | '\n') RPAR DLESS 
	'DATA' ('\n' | ';' ) (dirlist (perms owner group)? (';' | '\n'))+ 'DATA' ('\n' | ';') 'fi' ('\n' | ';') 
	;

templateA46
	: LPAR ('\n')? 'while' 'read' 'dir' (';')? 'do' ('\n') 'rmdir' DQUOTE '$dir' DQUOTE NUMBER GREAT PATHNULL OR 'true'  ('\n' | ';') 'done' ('\n' | ';')  RPAR DLESS 'DATA' ('\n' | ';' ) (dirlist (perms owner group)? (';' | '\n'))+ 'DATA' ('\n' | ';')
	;

templateA47
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK ('\n' | ';') 'then' ('\n')? 'update-alternatives' DMINUS 'install' PATHXWINDOW  'x-window-manager' wm priority ('\n' | ';') 'fi' ('\n' | ';')
	;
	
templateA48
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK ('\n' | ';') 'then' ('\n')? 'update-alternatives' DMINUS 'install' PATHXWINDOW 'x-window-manager' wm priority DMINUS 'slave' PATHXMANAGER 'x-window-manager.1.gz' wmman ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA49
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'remove' DQUOTE? RSBRACK ('\n' | ';') 'then' ('\n')? 'update-alternatives' DMINUS 'remove' 'x-window-manager' wm ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA50
	: 'if' ('\n')? 'which' 'update-fonts-dir' GREAT PATHNULL NUMBER GREATAND NUMBER ';' 'then' ('\n')? cmds 'fi' ('\n' | ';')
	;
	
templateA51
	: 'if' LSBRACK param DQUOTE AP 'which' 'update-fonts-dir' NUMBER GREAT PATHNULL AP DQUOTE RSBRACK ';' 'then' ('\n')? cmds 'fi' ('\n' | ';')
	;
	
templateA52
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'purge' DQUOTE? RSBRACK ('\n')? AND ('\n')? LSBRACK MINUS 'e' PATHCONFMOD RSBRACK  ';' 'then' ('\n')? DOT PATHCONFMOD ('\n' | ';') 'db_purge' ('\n' | ';') 'fi' ('\n' | ';')
	;

doc_id
	: PATHDOCID
	| path
	| id
	;

pack_path
	: PATHPACK
	;

pack
	: id
	;

schemas
	: word
	| path
	;

dirlist
	: path
	;

file
	: path
	| id
	;

old
	: id
	;

rule_placeholder
	: id
	;

kvers
	: NUMBER
	| id
	;

kvers_path	: PATHKVERS
	;

pyver
	: NUMBER
	;

wm
	: word
	;

priority
	: param
	;

wmman
	: param
	;

cmds
	: statement+
	;

initparms
	: option_param
	| word
	| path
	| COLON
	| AP nestedCommand AP
	| NUMBER
	| command_name
	| BSLASH
	| PSINGLE
	| TILDE
	| '*'
	;

centralcat
	: path
	| id
	| var
	;

ordcats
	: param
	;

script_path
	: PATHSCRIPT
	;

script
	: id
	;
	
error_handler
	: simple_command
	;

owner
	: id
	;

perms
	: NUMBER
	| id
	;

group
	: id
	;

function_statement
	: 'function' ('\n')? id ('\n')? statement_group
	| id LPAR RPAR ('\n')? statement_group
	;

redirection_statement
	: statement_group redirection ('\n' | ';')
	;

redirection
	: NUMBER? (GREAT | DLESS | LESS | DGREAT | LESSAND | DLESSDASH | LESSGREAT
	  | GREATAND | ANDGREAT | CLOBBER) ( path | word | var)
	| LESSAND (NUMBER | MINUS)
	| NUMBER LESSAND (NUMBER | MINUS)
	| NUMBER? GREATAND (NUMBER | MINUS) 
	| GREATAND
	;
	
statement_group
	: LPAR ('\n')? statement* RPAR ('\n' | ';')
	| LGRAF ('\n')? statement* (';')? RGRAF ('\n' | ';')
	;

	
command_statement
	: list_of_commands ('\n' | ';')
 	;
	
command_name
	: word
	| path
	| DOT
	| COLON
	;

nestedCommand
	: command_name param* 
	;

control_statement
	: if_statement
	| case_statement
	;
   
loop_statement
	: for_statement
	| until_statement
	| while_statement
	;
    
until_statement
	: 'until' ('\n')? condition (';' | '\n')? 'do' ('\n')? statement* 'done' ('\n' | ';')
	;


while_statement
	: 'while' ('\n')? condition (';' | '\n')? 'do' ('\n')? statement* 'done' ('\n' | ';')
	;

case_statement
	: 'case' ('\n')? (DQUOTE)? word (DQUOTE)? 'in' ('\n')? body_case+ 'esac' ('\n' | ';')
	;
	
body_case
	: case_condition ('\n')? (statement)* ('\n')? DSEMI? ('\n')?
	;

case_condition
	: LPAR? word ('\n')? (VBAR word)* ('\n')? RPAR
	;

if_statement
	: 'if' ('\n')? condition (';' | '\n')? 'then' ('\n')? statement* ifelse_branch* else_branch?  'fi' ('\n' | ';')
	;

ifelse_branch
	: 'elif' ('\n')? condition (';' | '\n')? 'then' ('\n')? statement*
	;
	
else_branch
	: 'else' ('\n')? statement*
	;

condition
	: conditional_expr_list ((AND | OR) ('\n')? command_expr_list)*
	| command_expr_list ((AND | OR) ('\n')? conditional_expr_list)*
	;

conditional_expr_list
	: conditional_expression ((AND | OR) ('\n')? conditional_expression)*
	;
	
command_expr_list
	: LSBRACK? EXCL? pipeline RSBRACK? ((AND | OR) ('\n')? LSBRACK? EXCL? pipeline RSBRACK?)*
	;

for_statement
	: 'for' ('\n')? word 'in' (word | path)+ (';' | '\n')? 'do' ('\n')? statement* 'done' ('\n' | ';')
	;

assignment_statement
	: word EQU (params)*
	;
	
conditional_expression
	:  LSBRACK EXCL? (boolean_expression | command_expression)  RSBRACK
	;

boolean_expression
	: DQUOTE? word DQUOTE? (EQU | NOTEQU) DQUOTE? param DQUOTE?
	| DQUOTE? word DQUOTE?
	;

command_expression
	: param (DQUOTE? param DQUOTE?)*
	;
	
simple_command
	: assignment_statement
	| command_name (params)*
	;

params
	: DQUOTE? PSINGLE? (param)+ PSINGLE? DQUOTE?
	;
	 
param
	: option_param
	| word
	| path
	| redirection
	| NUMBER
	| COLON
	| AP nestedCommand AP
	| command_name
	| BSLASH
	| SLASH
	| PSINGLE
	| TILDE
	| '*'
	| AP
	;

option_param
	: MINUS word?
	| DMINUS word?
	;

word
	: input_variable
	| in_command_variable
	| shell_variable
	| special_variable
	| external_variable
	| substitution_variable
	| id
	;
	
pipeline
	: ('time')? simple_command (VBAR ('\n')? simple_command)*
	;

list_of_commands
	: pipeline ((AND | OR) pipeline)*
	| asynchronous
	;

asynchronous
	: pipeline (AMPERSAND pipeline)* (AMPERSAND)?
	;

path
	: PATHP
	| PATHSS
	| PATHKVERS
	| PATHSCRIPT
	| PATHOLDSCHEMA
	| PATHPACK
	| PATHGCONFSCH
	| PATHSUID
	| PATHXWINDOW
	| PATHEMACSINST
	| PATHEMACSREM
	| PATHXMANAGER
	| PATHCONFMOD
	| PATHMIME
	| PATHDOCID
	| PATHCOMPYTH
	| PATHNULL
	| PATHREL
	| PATH
	;


var	: '$i'
	| '$SCHEMA_FILES'
	| '$PYTHON'
	| '$DIRLIST'
	| '$_dh_action'
	| '$dir'
	| '$inst'
	| '$user'
	| '$group'
	| '$line'
	| '$mode'
	| '$OLD_DIR'
	| VAR
	;

substitution_variable
	: '$' LGRAF id RGRAF
	;

input_variable
	: VARINPUT
	;
	
in_command_variable
	: var
	;
	
external_variable
	: UNDERSCORE id
	| '$' UNDERSCORE id
	;
	
special_variable
	: VARQMARK
	| VARDOLLAR
	| VAREXCL
	| VARSTAR
	| VARAT
	;
	
shell_variable
	: VARHOME
	| VARPATH
	| VARPS
	;

id	: 'HOME'
	| 'PATH'
	| 'PS' 
	| 'update-desktop-database'
	| 'which'
	| 'configure'
	| 'remove'
	| 'install-docs'
	| 'upgrade'
	| 'update-gconf-defaults'
	| 'register'
	| 'unregister'
	| 'OLD_DIR'
	| 'SCHEMA_FILES'
	| 'SCHEMA'
	| 'purge'
	| 'rm'
	| 'rmdir'
	| 'ignore-fail-on-non-empty'
	| 'update-icon-cache'
	| 'quiet'
	| 'install-info'
	| 'update-rc.d'
	| 'ldconfig'
	| 'update-menus'
	| 'PYTHON'
	| 'DIRLIST'
	| 'scrollkeeper-update'
	| 'update-mime-database'
	| 'update-mime'
	| 'dh_action'
	| 'restart'
	| 'start'
	| 'invoke-rc.d'
	| 'stop'
	| 'inst'
	| 'a+x'
	| 'a-x'
	| 'catalog'
	| 'super'
	| 'update-catalog'
	| 'old'
	| 'suidunregister'
	| 'update-alternatives'
	| 'install'
	| 'x-window-manager'
	| 'depmod'
	| 'add'
	| 'update-fonts-dir'
	| 'md5sum'
	| 'sed'
	| 's'
	| 'p'
	| 'ordcat'
	| 'dpkg-query'
	| 'Conffiles'
	| 'db_purge'
	| 'slave'
	| 'x-window-manager.1.gz'
	| 'suidregister'
	| 'chown'
	| 'chmod'
	| 'read'
	| 'dir'
	| 'true'
	| 'echo' 
	| 'Preserving'
	| 'user'
	| 'changes'
	| 'to'
	| 'o'
	| 'mv'
	| 'line'
	| 'mode'
	| 'mkdir'
	| 'group'
	| 'dpkg'
	| 'awk'
	| 'py'
	| 'print'
	| 'c'
	| 'xargs'
	| 'n'
	| 'set'
	| '*'
	| 'q'
	| 'i'
	| 'r'
	| 'x'
	| 'd'
	| 'f'
	| 'e'
	| 'a'
	| 'F'
	| 'L'
	| 'W'
	| ID
	;


NUMBER	: DIGIT ('a' .. 'z' | 'A' .. 'Z' | UNDERSCORE | MINUS |  DOT | '+' | DIGIT)*;

fragment DIGIT	: '0'..'9';

VARQMARK	: '$' QMARK 
	;
VARDOLLAR	: '$' '$'
	;

VARSTAR	: '$' '*'
	;

VARAT	:'$' '@'
	;

VAREXCL	: '$' EXCL
	;
	
VARHOME	: '$' 'HOME'
	;
	
VARPATH	: '$' 'PATH'
	;

VARPS	: '$' 'PS' NUMBER
	;

VARINPUT	: '$' NUMBER
	;

VAR	: '$' ( 'a' .. 'z' | 'A' .. 'Z' | MINUS | QMARK | DOT | '+' | LSBRACK | RSBRACK)( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | MINUS | QMARK |UNDERSCORE | DOT | '+' | LSBRACK | RSBRACK)*
	;

ID	: ('a'..'z' | 'A'..'Z' | '+')( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | UNDERSCORE | MINUS | QMARK | DOT | '+' | '*' | LSBRACK | RSBRACK)*
	;

PATHP	: SLASH 'p'
	;

PATHSS	: 's' SLASH
	;

PATHKVERS	: '/boot/System.map-' NUMBER
	;

PATHSCRIPT	: '/etc/init.d/' ID
	;

PATHPACK	: '/etc/menu-methods/' ID
	;

PATHOLDSCHEMA
	: '$OLD_DIR/$SCHEMA'
	;

PATHGCONFSCH
	: '/etc/gconf/schemas'
	;

PATHSUID
	: '/etc/suid.conf'
	;

PATHXWINDOW
	: '/usr/bin/x-window-manager'
	;

PATHEMACSINST
	: '/usr/lib/emacsen-common/emacs-package-install'
	;

PATHEMACSREM
	: '/usr/lib/emacsen-common/emacs-package-remove'
	;

PATHCOMPYTH
	: '/usr/lib/$PYTHON/compileall.py'
	;

PATHXMANAGER
	: '/usr/share/man/man1/x-window-manager.1.gz'
	;

PATHCONFMOD
	: '/usr/share/debconf/confmodule'
	;

PATHMIME
	: '/usr/share/mime'
	;

PATHDOCID	: '/usr/share/doc-base/' ID
	;

PATHNULL	: '/dev/null'
	;

PATHREL	: ((ID | VAR) SLASH)+
	;

PATH	: (ID | VAR | DDOT | DOT )? (SLASH (ID | VAR))+ SLASH?
	;

AMPERSAND 	: '&';

COLON	: ':';

VBAR	: '|';

UNDERSCORE : '_';	

QMARK 	: '?';

SHARP	: '#';

EXCL	: '!';	

MINUS	: '-';

SLASH	: '/';

BSLASH	: '\\';

DMINUS	: '--';

AND	: '&&';

OR	: '||';

LSBRACK	: '[';

RSBRACK	: ']';

LPAR	: '(';

RPAR	: ')';

LGRAF	: '{';

RGRAF	: '}';

DQUOTE	: '"';

DOT	: '.';

DDOT	:'..';

AP      	: '\u0060';

PSINGLE	: '\u0027';

EQU	: '=';

NOTEQU	: '!=';

DLESS	: '<<';

DGREAT	: '>>';

LESSAND	: '<&';

GREATAND	: '>&';

LESSGREAT	: '<>';

DLESSDASH	: '<<-';

CLOBBER	: '>|';

LESS	: '<';

GREAT	: '>';

ANDGREAT	: '&>';

DSEMI	: ';;';

TILDE	: '\u007E';

COMMENT
@init {
    skip();
}	
	: {getCharPositionInLine()>0}? =>  ( ' ' | '\t')+ SHARP ~(EXCL) (~('\n' | '\r' | DQUOTE))* '\r'?
	| {getCharPositionInLine()==0}? => ( ' ' | '\t')* SHARP  ~(EXCL | '\n') (~('\n' | '\r'))* '\r'? '\n'
	| {getCharPositionInLine()==0}? => ( ' ' | '\t')* SHARP   '\r'? '\n'
	;

BLANKLINE
	:  {getCharPositionInLine()==0}? => ( ' ' | '\t')* '\n' {skip();};

NOTNEWLINE	: (BSLASH '\n') {skip();};

WS 	: ( ' ' | '\t')+ { $channel=HIDDEN;};


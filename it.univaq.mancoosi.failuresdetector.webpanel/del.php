<?php

include("include/php_common.php"); // Contiene il codice PHP comune a tutti i files

$deletefile = 0;
$result2 = mysql_query('SHOW COLUMNS FROM '.$_GET['t']) or die('cannot show columns from '.$table);
$numerorighe = mysql_num_rows($result2);
while($row2 = mysql_fetch_row($result2)) {

$cont = 0;
foreach($row2 as $key=>$value) {
if ($cont == 0){ 

if ($value == "file"){ $deletefile = 1; }
if ($value == "query"){ $deletequery = 1; }

}
$cont++;
}

}

if ($deletequery == 1){
$dq = mysql_query("DELETE FROM ass_oclqueries2keywords WHERE IDfirst = ".$_GET['ID']);
}

if ($deletefile == 1){
$name = SQLp('SELECT file FROM '.$_GET['t'].' WHERE ID = '.$_GET['ID']);
unlink($_SERVER["DOCUMENT_ROOT"]."/failuresdetector/".$_GET['t']."/".$name);
}

$login = mysql_query("DELETE FROM ".$_GET['t']." WHERE ID = ".$_GET['ID']);
?>
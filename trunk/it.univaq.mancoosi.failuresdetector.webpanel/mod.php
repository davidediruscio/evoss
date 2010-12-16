<?php

include("include/php_common.php"); // Contiene il codice PHP comune a tutti i files



if ($_GET['c'] == 'file'){
$oldname = SQLp('SELECT file FROM '.$_GET['t'].' WHERE ID = '.$_GET['ID']);
rename($_SERVER["DOCUMENT_ROOT"]."/failuresdetector/".$_GET['t']."/".$oldname, $_SERVER["DOCUMENT_ROOT"]."/failuresdetector/".$_GET['t']."/".$_GET['v']);
}

$login = mysql_query("UPDATE ".$_GET['t']." SET ".$_GET['c']." = \"".$_GET['v']."\" WHERE ID = ".$_GET['ID']);
?>
<?php

include("include/php_common.php"); // Contiene il codice PHP comune a tutti i files

$login = mysql_query("UPDATE ".$_POST['t']." SET ".$_POST['c']." = \"".$_POST['v']."\" WHERE ID = ".$_POST['ID']);
?>
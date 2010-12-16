<?php

include("include/php_common.php"); // Contiene il codice PHP comune a tutti i files

$login = mysql_query("DELETE FROM ".$_GET['t']." WHERE ID = ".$_GET['ID']);
?>
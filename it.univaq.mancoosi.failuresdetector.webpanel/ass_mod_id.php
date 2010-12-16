<?php

include("include/php_common.php"); // Contiene il codice PHP comune a tutti i files

$k = array();
$v = array();
$elementi = 0;
$cont = 1;

  foreach ($_POST as $key => $value) {
    $k[] = $key;
	$v[] = $value;
	$elementi++;
  }
  
  $querystring = "UPDATE ".$_GET['t']." SET idfirst = ".$_POST['idfirst'].", idsecond = ".$_POST['idsecond']." WHERE ID = ".$_POST['ID'];
 
  $login = mysql_query($querystring) or die("Error >> ".$querystring." << : ".mysql_errno()." - ".mysql_error());
  header("Location: ass_edit.php?t=".$_GET['t']."&ID=".$_POST['ID']."&st=1");
?>
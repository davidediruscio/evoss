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
  
  $querystring = "INSERT INTO ".$_GET['t']." (idfirst,idsecond) VALUES (".$_POST['idfirst'].",".$_POST['idsecond'].")";
 
  $login = mysql_query($querystring) or die("Error (".$querystring."): ".mysql_errno()." - ".mysql_error());
  header("Location: ass_add.php?t=".$_GET['t']."&st=1");
?>
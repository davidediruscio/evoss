<?php

include("include/php_common.php"); // Contiene il codice PHP comune a tutti i files

$login = SQL("SELECT * FROM users WHERE nickname = '".$_POST['user']."' AND password = '".$_POST['pass']."'");
if ($login != null){ 

setcookie("user",$_POST['user'],time()+1000000000,"/");
setcookie("pass",$_POST['pass'],time()+1000000000,"/");
$_SESSION["user"] = $_POST['user'];
$_SESSION["pass"] = $_POST['pass'];

?>Logging In....<?php 
} else { ?>
Wrong Username or Password! Try Again...
<?php } ?>
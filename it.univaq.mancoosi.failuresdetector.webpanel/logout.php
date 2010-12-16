<?php
session_start();
session_destroy();
setcookie("ID", "", time()-3600,"/");
setcookie("user", "", time()-3600,"/");
setcookie("pass", "", time()-3600,"/");
?>
<meta HTTP-EQUIV="REFRESH" content="0; url=index.php">
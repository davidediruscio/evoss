<?php 

        if (isset($_COOKIE['pass'])) {

			$login = SQL("SELECT * FROM users WHERE nickname = '".$_POST['user']."' AND password = '".$_POST['pass']."'");
			if ($login != null){
			header("Location: panel.php");
			}
			
			}



?>
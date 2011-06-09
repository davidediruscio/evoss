<?php

if (isset($_COOKIE['pass'])) {
header( "Location: panel.php" );
}

include("include/php_common.php"); // Contiene il codice PHP comune a tutti i files
include("include/header_commondoctype.php"); // Contiene il tag <html> e gli standard del documento
?>

<head>

<?php 
include("include/header_index.php");  // Contiene i META TAG caratteristici di questo file (Titolo, Keywords...)
?>

</head>

<?php 
include("include/body_common.php"); // Contiene il tag <body>, il tag <table> principale, lo sfondo e le immagini in Preload

/////////////////////////////////////////////////
// Qui va inserito il codice PHP di questa pagina
/////////////////////////////////////////////////

include("include/php_index.php"); // Contiene il codice PHP della Pagina Iniziale

////////////////////////////////////
// Fine codice PHP di questa pagina
////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////
// Qui va inserito il codice HTML di questa pagina o l'eventuale inclusione di HTML
///////////////////////////////////////////////////////////////////////////////////

?>

<form name="formlogin" id="formlogin">

<span id="box" class="box">

<span id="titletext" class="titletext">EVOSS FD</span>
<span id="sottotitolo1" class="sottotitolo" style="display: block;">User:</span>
<span id="descrizione1" class="descrizione" style="display: block;">Insert your username</span>
<span id="sottotitolo2" class="sottotitolo2" style="display: none;">Pass:</span>
<span id="descrizione2" class="descrizione" style="display: none;">Insert your password</span>

<input type="text" id="user" name="user" class="dato" maxlength="14" style="display: block;">
<input type="password" id="pass" name="pass" class="dato" maxlength="14" style="display: none;">

</span>

<span id="errorlogin" class="errorlogin"></span>
		
</form>		
		
<?php

////////////////////////////////////
// Fine codice HTML di questa pagina
////////////////////////////////////

include("include/footer.php"); // Contiene le scritte a fondo pagina
?>  
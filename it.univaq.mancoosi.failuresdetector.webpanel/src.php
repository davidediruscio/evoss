<?php
include("include/php_common.php"); // Contiene il codice PHP comune a tutti i files
include("include/header_commondoctype.php"); // Contiene il tag <html> e gli standard del documento
?>

<head>

<?php 
include("include/header_common.php"); // Contiene i META TAG comuni a tutti i files e i files comuni JS
include("include/header_panel.php");  // Contiene i META TAG caratteristici di questo file (Titolo, Keywords...)
?>

</head>

<?php 
include("include/body_common.php"); // Contiene il tag <body>, il tag <table> principale, lo sfondo e le immagini in Preload

/////////////////////////////////////////////////
// Qui va inserito il codice PHP di questa pagina
/////////////////////////////////////////////////

include("include/php_duty.php");


////////////////////////////////////
// Fine codice PHP di questa pagina
////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////
// Qui va inserito il codice HTML di questa pagina o l'eventuale inclusione di HTML
///////////////////////////////////////////////////////////////////////////////////

include("template/top.php");  

?>




							
                                            <div class="art-postmetadataheader">
                                                <h2 class="art-postheader">
                                                    Table <?php print strtoupper($_GET['t']); ?> - <?php print $compito; ?>
                                                </h2>
                                            </div>


<div>											
					
<form name='search' id='search' method='post' action='srcit.php?t=<?php print $_GET['t']; ?>'>					
<table style='width: 100%;' align='center'>
<tr>
<td align='center'>SEARCH</td>
<td>
<input type='text' style='width: 98.5%;' name='ricerca' value='' maxlength='255' />
</td>
</tr>
</table>
</form>

<table style='width: 100%' align='center'>
<tr>
<td colspan='2' style='text-align: center; border: 0px;'><a href='srcall.php?t=<?php print $_GET['t']; ?>'>If you want to see all records, sorted by ID, click here!</a></td>
</tr>
</table>

</div>

<?php

include("template/leftright.php");
include("template/right.php"); // Editabile  	
include("template/rightdown.php");							
include("template/footer.php"); // Editabile
include("template/bottom.php"); 

////////////////////////////////////
// Fine codice HTML di questa pagina
////////////////////////////////////

include("include/footer.php"); // Contiene le scritte a fondo pagina
?>  
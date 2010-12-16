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

//include("include/php_panel.php"); // Contiene il codice PHP della Pagina Iniziale

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
                                                    Keywordize
                                                </h2>
                                            </div>
											
											
<div>											

<form id='keyform' name='keyform' method='post' action='keywordize_id.php'>											
<table style='width: 100%;' align='center'>
<tr>
<td align='center'>QUERY OCL</td><td>

<textarea id='oclquery' name='oclquery' rows='5' style='width: 98.5%;'></textarea>



</td></tr>
<tr>
<td colspan='2' style='border: 0px; margin: 0px; text-align: center;'>
<input type='hidden' name='table' value='<?php print $_GET['t']; ?>' />
<input type='image' name='submit' src='images/go.png' />
</td></tr>
<tr><td colspan='2' style='border: 0px; margin: 0px; text-align: center;'><br/>This tool analyze OCL Queries, and extract some keywords from it. These keywords describe what the code represent and are used to find queries that share common objective, or that are equals.</td></tr>
</table>

</form>
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
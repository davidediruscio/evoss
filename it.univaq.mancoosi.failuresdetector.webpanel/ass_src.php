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
include("include/php_ass.php");

$findf1 = SQL('SELECT myfield FROM conf_findfield WHERE mytable = "'.$assoc[0].'"');
foreach($findf1 as $k => $findfield1) {} 
$findf2 = SQL('SELECT myfield FROM conf_findfield WHERE mytable = "'.$assoc[1].'"');
foreach($findf2 as $k => $findfield2) {}

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
                                                    <center>Association  <?php print strtoupper($assoc[0]); ?> <> <?php print strtoupper($assoc[1]); ?><br/>
													<small><?php print $compito; ?></small></center>
													
                                                </h2>
                                            </div>


<div>											
					
<form name='search' id='search' method='post' action='ass_srcit.php?t=<?php print $_GET['t']; ?>'>					
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
<td colspan='2' style='text-align: center; border: 0px;'>
Insert a common term between the 2 tables. The system will find associations of this term between the 2 tables.
<br/><br/>
<a href='ass_srcall.php?t=<?php print $_GET['t']; ?>'>If you want to see all associations, click here!</a>
</td>
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
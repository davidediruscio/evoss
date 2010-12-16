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


if (isset($_GET['st'])){ 
if ($_GET['st'] == 1){
?>
 <div class="added">Record successfully added!</div><br/>
<?php } 
if ($_GET['st'] == 2){
?>											
 <div class="error">Record NOT added! The file you submitted is not a valid ASCII TEXT file!</div><br/>											
<?php }		
if ($_GET['st'] == 3){
?>											
 <div class="error">Record NOT added! Duplicate name found. Please change the name of your source text file!</div><br/>	
<?php } 
if ($_GET['st'] == 4){
?>		
 <div class="error">Record NOT added! The query you submitted is a duplicate of one that exist!</div><br/>	
<?php } ?> 
<?php } ?>


							
                                            <div class="art-postmetadataheader">
                                                <h2 class="art-postheader">
                                                    Table <?php print strtoupper($_GET['t']); ?> - <?php print $compito; ?>
                                                </h2>
                                            </div>


<div>											

<form id='addform' name='addform' method='post' enctype="multipart/form-data" action='add_id.php?t=<?php print $_GET['t']; ?>'>											
<table style='width: 100%;' align='center'>
<?php
$cont = 1;
while ($cont < mysql_num_rows($result2)){
print "<tr>";

print "<td align='center'>".strtoupper($campi[$cont])."</td>";
print "<td>";

switch ($tipo[$cont]){
        case "int":
        print "<input type='numeric' size='".($grandezza[$cont]+1)."' id='".$campi[$cont]."' name='".$campi[$cont]."' value='' maxlength='".$grandezza[$cont]."' />";
        break;
        case "varchar":
        print "<input type='text' style='width: 98.5%;' id='".$campi[$cont]."' name='".$campi[$cont]."' value='' maxlength='".$grandezza[$cont]."' />";
        break;
	    case "text":
        print "<textarea id='".$campi[$cont]."' name='".$campi[$cont]."' rows='5' style='width: 98.5%;'></textarea>";
        break;
		case "tinytext":
        print "<input type='file' id='".$campi[$cont]."' name='".$campi[$cont]."'></textarea>";
        break;
}


print "</td>";
print "</tr>";
$cont++;
}

?>
<tr>
<td colspan='2' style='border: 0px; margin: 0px; text-align: center;'>
<input type='hidden' name='table' value='<?php print $_GET['t']; ?>' />
<input type='image' name='submit' src='images/aggiungi.png' />
</td></tr>
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
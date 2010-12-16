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

if (isset($_GET['st'])){ 
?>
                                            
                                                <div class="added">
                                                    Record successfully added!
                                                </div>
 
											
											<br/>
<?php } ?>


							
                                            <div class="art-postmetadataheader">
                                                <h2 class="art-postheader">
                                                    <center>Association  <?php print strtoupper($assoc[0]); ?> <> <?php print strtoupper($assoc[1]); ?><br/>
													<small><?php print $compito; ?></small></center>
													
                                                </h2>
                                            </div>


<div>											

<form id='addform' name='addform' method='post' action='ass_add_id.php?t=<?php print $_GET['t']; ?>'>											
<table style='width: 100%;' align='center'>
<tr class="art-postmetadataheader" style='font-weight: bold;'><td colspan='2'><?php print strtoupper($assoc[0]); ?></td><td colspan='2'><?php print strtoupper($assoc[1]); ?></td></tr>
<tr style='width: 100%;'>

<?php
$cont = 1;
while ($cont < mysql_num_rows($result2)){
print "<td style='text-align: center;' align='center'>".strtoupper($campi[$cont])."</td>";
print "<td><input type='text' style='width: 95.5%;' id='".$campi[$cont]."' name='".$campi[$cont]."' value='' readonly='readonly' maxlength='".$grandezza[$cont]."' /></td>";
$cont++;
}
?>

</tr>
<tr>
<td colspan='2'>
<select id='firstselect' name='firstselect' size='12' style='width: 100%'>

<?php

$first = SQL("SELECT * FROM ".$assoc[0]." ORDER BY ".$findfield1['myfield']." DESC");
foreach($first as $k => $firstq) {

print "<option value='".$firstq['ID']."' onclick='ass_sign(1,".$firstq['ID'].");'>".$firstq[$findfield1['myfield']]."</option>";

} 

?>
</select>



</td>
<td colspan='2'>

<select id='secondselect' name='secondselect' size='12' style='width: 100%'>

<?php

$second = SQL("SELECT * FROM ".$assoc[1]." ORDER BY ".$findfield2['myfield']." DESC");
foreach($second as $k => $secondq) {

print "<option value='".$secondq['ID']."' onclick='ass_sign(2,".$secondq['ID'].");'>".$secondq[$findfield2['myfield']]."</option>";

} 

?>
</select>

</td>
</tr>
<tr>
<td colspan='4' style='border: 0px; margin: 0px; text-align: center;'>
<input type='hidden' name='table' value='<?php print $_GET['t']; ?>' />
<input type='image' name='submit' onclick='ass_add_check();' src='images/aggiungi.png' />
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
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

<form id='addform' name='addform' method='post' action='ass_add_id.php?t=<?php print $_GET['t']; ?>'>											
<table style='width: 100%;' align='center'>
<tr class="art-postmetadataheader" style='font-weight: bold;'><td width='50%'><?php print strtoupper($assoc[0]); ?></td><td width='50%'><?php print strtoupper($assoc[1]); ?></td><td align='center' style='text-align: center !important;'>M</td><td align='center' style='text-align: center !important;'>D</td></tr>
								
											

<?php

$qu = "SELECT ".$_GET['t'].".ID as ID, ".$assoc[0].".".$findfield1['myfield']." as ".$assoc[0].", ".$assoc[1].".".$findfield2['myfield']." as ".$assoc[1]."  FROM ".$_GET['t']." JOIN ".$assoc[0]." ON ".$_GET['t'].".idfirst = ".$assoc[0].".ID JOIN ".$assoc[1]." ON ".$_GET['t'].".idsecond = ".$assoc[1].".ID WHERE ".$assoc[0].".".$findfield1['myfield']." like '%".$_POST['ricerca']."%' OR ".$assoc[1].".".$findfield2['myfield']." like '%".$_POST['ricerca']."%'";
$fulltable = SQL($qu);

$cont = 0;
if ($fulltable != null){ 
foreach($fulltable as $k => $fullt) { 
print "<tr id='".$_GET['t']."_".$fullt['ID']."'><td>".$fullt[$assoc[0]]."</td><td>".$fullt[$assoc[1]]."</td><td><a href='ass_edit.php?t=".$_GET['t']."&ID=".$fullt['ID']."'><img src='images/edit.jpg' border='0' /></a></td><td><a href=\"javascript:ass_deletethis('".$_GET['t']."',".$fullt['ID'].");\"><img src='images/cancella.gif' width='13' border='0' /></a></td></tr>";
$cont++;
  }
}
?>

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
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
											

<?php

$findf = SQL('SELECT myfield FROM conf_findfield WHERE mytable = "'.$_GET['t'].'"');
foreach($findf as $k => $findfield) {} 


$campis = SQL('SELECT * FROM '.$_GET['t'].' WHERE '.$findfield["myfield"].' like "%'.$_POST['ricerca'].'%" ORDER BY ID ASC');
if ($campis != null){ 
print "<table style='width: 100%;' align='center'>";
$cont = 0;
foreach($campis as $k => $campix) { 
while ($cont < $numerorighe){
if ($cont == 0){ print "<tr><td style='width: 100%; border: 0px; margin: 0px;'><form id='".$_GET['t']."_".$campix[$campi[$cont]]."' width='100%'><table style='width: 100%; margin: 0px;' id='".$_GET['t']."_".$campix[$campi[$cont]]."'><tr><td class='art-postmetadataheader' style='width: 100%; text-align: center;' colspan='2'><b>".strtoupper($campi[$cont])." DEL RECORD: ".$campix[$campi[$cont]]."</b> &nbsp; &nbsp; <a href='javascript:deletethis(\"".$_GET['t']."\",".$campix[$campi[$cont]].");'><img src='images/cancella.gif' width='10' style='border: 0px; margin: 0px;' /></a></td></tr>"; $IDz = $campix[$campi[$cont]]; }
else { 

print "<tr><td style='width: 100px; text-align: right;'><b>".strtoupper($campi[$cont])."</b></td><td>";

switch ($tipo[$cont]){
        case "int":
        print "<input onblur='updatethis(\"".$_GET['t']."\",\"".$campi[$cont]."\",".$IDz.");' id='".$_GET['t']."_".$campi[$cont]."_".$IDz."' class='inputedit' type='numeric' size='".($grandezza[$cont]+1)."' name='".$campi[$cont]."' value='".$campix[$campi[$cont]]."' maxlength='".$grandezza[$cont]."' />";
        break;
        case "varchar":
        print "<input onblur='updatethis(\"".$_GET['t']."\",\"".$campi[$cont]."\",".$IDz.");' id='".$_GET['t']."_".$campi[$cont]."_".$IDz."' class='inputedit' type='text' style='width: 98.5%;' name='".$campi[$cont]."' value='".$campix[$campi[$cont]]."' maxlength='".$grandezza[$cont]."' />";
        break;
	    case "text":
		if ($campi[$cont] == "query"){ print $campix[$campi[$cont]]; } else
        { print "<textarea onblur='updatethis(\"".$_GET['t']."\",\"".$campi[$cont]."\",".$IDz.");' id='".$_GET['t']."_".$campi[$cont]."_".$IDz."' class='inputedit' name='".$campi[$cont]."' rows='5' style='width: 98.5%;'>".$campix[$campi[$cont]]."</textarea>"; }
        break;
		case "tinytext":
        print "<input onblur='updatethis(\"".$_GET['t']."\",\"".$campi[$cont]."\",".$IDz.");' id='".$_GET['t']."_".$campi[$cont]."_".$IDz."' class='inputedit' type='text' style='width: 98.5%;' name='".$campi[$cont]."' value='".$campix[$campi[$cont]]."' maxlength='30' />";
        break;
}

print "</td></tr>"; 
}

$cont++;
    }
	print "</table></form></td></tr>";
	$cont = 0;
  }
print "</table>";
}
?>


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
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

$keywords = Array();
$error = 0;


if (strpos($_POST['oclquery'],"ancoosi::") == 1 && strpos($_POST['oclquery'],"->") > 0){ 

$oclquery = $_POST['oclquery'];
$rows = explode("->",$oclquery);

$k = str_replace("mancoosi::", "",$rows[0]);
$k = str_replace("()","",$k);
$k = str_replace(".","",$k);
$keywords[] = $k;

$cont = 0;
foreach ($rows as $value) {
if ($cont > 0){


// Controllo se all'interno dello step c'è una funzione composta
// Come? Controllo se all'interno della riga vi sono parentesi e se in esse vi sono parametri

if (strpos($value,"()") > 0){ 
// Funzione Semplice. Non c'è nulla da cercare al suo interno, ma dobbiamo controllare se c'è qualcosa alla sua destra

if (strpos($value,".") > 0){ 

$simple = explode(".",$value);
$simpleq = ucfirst($simple[1]);
$simpleq = str_replace("()","",$simpleq);
$simpleq = str_replace(".","",$simpleq);
$simpleq = str_replace("=","Eq", $simpleq);
$simpleq = str_replace("<","Lt", $simpleq);
$simpleq = str_replace(">","Gt", $simpleq);
$simpleq = str_replace("'","", $simpleq);
$simpleq = str_replace(" ","", $simpleq);

$keywords[] = $simpleq;

}


 
}
else { 
// La Funzione Semplice non c'è. E quella composta?
if (strpos($value,")") > (strpos($value,"(")+1)) {
 // Funzione Composta trovata!
 
 $pos1 = strpos($value,"(");
 $pos2 = strpos($value,")") + 1;
 $infunc = substr($value, $pos1, $pos2-$pos1);
 $namefunc = ucfirst(str_replace($infunc,"", $value));
 
 // $namefunc contiene il nome della funzione. Ora dobbiamo trattare l'interno della funzione e prelevare solo ciò che ci serve
 
 $it = str_replace("(","", $infunc);
 $it = str_replace(")","", $it);
 
 $infuncd = explode(".",$it);
 
 // $infuncd[1] contiene tutto ciò che ci serve per creare la seconda parte della keyword. Dobbiamo però trattare gli elementi interni
 
 $part2 = str_replace("=","Eq", $infuncd[1]);
 $part2 = str_replace("<","Lt", $part2);
 $part2 = str_replace(">","Gt", $part2);
 $part2 = str_replace("'","", $part2);
 $part2 = str_replace(" ","", $part2);
 $part2 = ucfirst($part2);
 
 $keywords[] = $namefunc.$part2;
 
}
 
}




}
$cont++;
}

} else {
$error = 1;
}

////////////////////////////////////
// Fine codice PHP di questa pagina
////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////
// Qui va inserito il codice HTML di questa pagina o l'eventuale inclusione di HTML
///////////////////////////////////////////////////////////////////////////////////

include("template/top.php");  

if ($error == 1){
?>
g<div class="error">Invalid Query inserted!</div><br/>
<?php
}
?>

                                            <div class="art-postmetadataheader">
                                                <h2 class="art-postheader">
                                                    Keywordize - Result
                                                </h2>
                                            </div>
											
<div>												
											
<table style='width: 100%;' align='center'>
<tr>
<td align='center'>OCL QUERY</td>
<td width='80%'><?php print $_POST['oclquery']; ?></td>
</tr>
<tr>
<td align='center'>KEYWORDS</td>
<td width='80%'>

<?php 

foreach ($keywords as $value) {
print $value."<br/>";
}

 ?>

</td>
</tr>
</table>											
											
											
											

</div>
<div class="art-postmetadataheader">
                                                <h2 class="art-postheader">
                                                    Keywordize Again!
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
<tr><td colspan='2' style='border: 0px; margin: 0px; text-align: center;'>This tool analyze OCL Queries, and extract some keywords from it. These keywords describe what the code represent and are used to find queries that share common objective, or that are equals.</td></tr>
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
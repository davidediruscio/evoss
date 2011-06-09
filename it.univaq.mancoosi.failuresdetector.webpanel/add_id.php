<?php

// FUNZIONI ///

function keywordize($query){ 


$keywords = Array();
$error = 0;


if (strpos($query,"ancoosi::") == 1 && strpos($query,"->") > 0){ 

$oclquery = $query;



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
   
  }
  return $keywords;
}

/////////////////////////// FINE FUNZIONI

include("include/php_common.php"); // Contiene il codice PHP comune a tutti i files

$k = array();
$v = array();
$elementi = 0;
$cont = 1;
$ok = 1;

if(isset($_FILES["file"])){

$upload_dir = $_SERVER["DOCUMENT_ROOT"]."/jars";



$file_name  = $_FILES["file"]["name"];
$fn = explode(".",$file_name);
$file_name = $fn[0].".jar";
$_FILES["file"]["name"] = $file_name;




if (!file_exists($upload_dir."/".$file_name)){

if(is_uploaded_file($_FILES["file"]["tmp_name"])) {
	move_uploaded_file($_FILES["file"]["tmp_name"], "$upload_dir/$file_name");
}

} else { 
	echo "Error";
	$ok = 2; 

}

}

if ($ok == 1){

  foreach ($_POST as $key => $value) {
    $k[] = $key;
	$v[] = $value;
	$elementi++;
  }
  
  $querystring = "INSERT INTO ".$_GET['t']." (".$k[0];
  
  while ($cont < $elementi-3){
  $querystring .= ",".$k[$cont];
  $cont++;
  }
  $cont = 1;
  
  $querystring .= ") VALUES (\"".$v[0]."\"";
  
  while ($cont < $elementi-3){
  $querystring .= ",\"".$v[$cont]."\"";
  $cont++;
  }
  
  $querystring .= ")";
 
  $login = mysql_query($querystring) or die("Error (".$querystring."): ".mysql_errno()." - ".mysql_error());
  $insid = mysql_insert_id();
  
  if(isset($_FILES["file"])){
  $login = mysql_query("UPDATE ".$_GET['t']." SET file = \"".$_FILES["file"]["name"]."\" WHERE ID = ".mysql_insert_id());
  }
  
  
  
  if ($_GET['t'] == "oclqueries"){
  $keywords_ex = Array();
  $keywords = keywordize($_POST['query']);
  
 
  // Dobbiamo capire se esiste già una query che contiene le stesse keyword della query inserita ora
  
  $oclqueries = SQL('SELECT * FROM oclqueries');
  $matching = 0;
  $cont = 0;
  foreach ($oclqueries as $q) {
  
  $tabk = SQL('SELECT DISTINCT keyword, oclqueries.ID as IDo FROM `ass_oclqueries2keywords` JOIN oclqueries on ass_oclqueries2keywords.IDfirst = oclqueries.ID JOIN keywords on ass_oclqueries2keywords.IDsecond = keywords.ID WHERE oclqueries.ID = '.$q['ID']);
  if ($tabk != null){
  foreach ($tabk as $k => $keyk) {
  $keywords_ex[$cont][] = $keyk['keyword'];
  }
    
  
  $mat = match($keywords,$keywords_ex[$cont]);
  if ($mat == 1){ $matching = 1; }
  
  $cont++;
   }
  }
  
  print $matching;
  
  if ($matching == 0){
  
  // Se la query non esiste, inseriscila :)
  
  foreach ($keywords as $value) {

  $existk = SQL('SELECT * FROM keywords WHERE keyword = "'.$value.'"');
  if ($existk == null){ $dokey = mysql_query("INSERT INTO keywords (keyword) VALUES ('".$value."')"); 
                        $keywid = mysql_insert_id();
						$dokey = mysql_query("INSERT INTO ass_oclqueries2keywords (idfirst,idsecond) VALUES (".$insid.",".$keywid.")");
  }
  else { 
             foreach ($existk as $keyex) {} 
			 $dokey = mysql_query("INSERT INTO ass_oclqueries2keywords (idfirst,idsecond) VALUES (".$insid.",".$keyex['ID'].")");
			 
	    }
  
  

  }
  header("Location: add.php?t=".$_GET['t']."&st=1");
  } else {
  $login = mysql_query("DELETE FROM oclqueries WHERE ID = ".$insid);
  header("Location: add.php?t=".$_GET['t']."&st=4");
  }
  
  
  }
  
  
  
  
  
  
  
  
  
  
  
  }
  if ($ok == 0)
  {
  header("Location: add.php?t=".$_GET['t']."&st=2");
  }
  if ($ok == 2)
  {
  header("Location: add.php?t=".$_GET['t']."&st=3");
  }
?>

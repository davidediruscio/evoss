<?php
$n = explode("/",$_SERVER['SCRIPT_NAME']);
$nm = explode(".",$n[count($n)-1]);
$op = $nm[0];

switch ($op) {
    case "add":
        $compito = "Add Record";
        break;
    case "src":
        $compito = "Search Record";
        break;
	    case "srcall":
        $compito = "List Record";
        break;
	    case "srcit":
        $compito = "Search: ".$_POST['ricerca'];
        break;
    case "mod":
        $compito = "Modify Record";
        break;
    case "del":
        $compito = "Delete Record";
        break;
}

$result2 = mysql_query('SHOW COLUMNS FROM '.$_GET['t']) or die('cannot show columns from '.$table);

if(mysql_num_rows($result2)) {

$numerorighe = mysql_num_rows($result2);

while($row2 = mysql_fetch_row($result2)) {

$cont = 0;
foreach($row2 as $key=>$value) {
if ($cont < 2){ 


if ($cont == 0){ $campi[] = $value; }
if ($cont == 1){ $val = explode("(",$value);

                 if (isset($val[1])){ 
				 $g = explode(")",$val[1]);
				 $grandezza[] = $g[0];
				 } else $grandezza[] = 0;
				 
				 $tipo[] = $val[0];
				 

			   }

$cont++;
}

}

}
}
?>
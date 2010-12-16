<?php

switch ($op) {
    case "ass_add":
        $compito = "Add Association";
        break;
    case "ass_src":
        $compito = "Search Association";
        break;
	    case "ass_srcall":
        $compito = "List Associations";
        break;
	    case "ass_srcit":
        $compito = "Search: ".$_POST['ricerca'];
        break;
    case "ass_edit":
        $compito = "Modify Association";
        break;
    case "ass_del":
        $compito = "Delete Association";
        break;
}

$tablee = str_replace("ass_","", $_GET['t']);
$assoc = explode("2",$tablee);

?>
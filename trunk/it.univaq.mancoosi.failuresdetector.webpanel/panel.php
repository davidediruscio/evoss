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
                                                    Welcome to the Board!
                                                </h2>
                                            </div>

											<br/>
											<b>Instructions</b><br/>
											With this panel you can administrate the Failures Control. To do it, you can use the right menu.<br/>
											You can edit:<br/><br/>
											
											<b> 
											- THE LIST OF OCL QUERIES<br/>
											- THE LIST OF KNOWN FAILURES<br/>
											- THE LIST OF POSSIBLE SOLUTIONS<br/>
											- THE LIST OF USERS THAT CAN ACCESS TO THE PANEL
											</b>
											
											<br/><br/>
											<b> Press: </b><br/>
											<b> [+] </b> to add an element to the associate list <br/>
											<b> [M/C] </b> to start the search for an existing element. Once found, you can then modify or delete it.
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
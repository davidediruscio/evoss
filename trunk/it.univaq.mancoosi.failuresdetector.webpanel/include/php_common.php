<?php
session_start();

$_SESSION['logged'] = 0;
$_SESSION['moderatore'] = 0;
$_SESSION['staff'] = 0;
$_SESSION['admin'] = 0;
$_SESSION['ID'] = 0;
$_SESSION['sesso'] = 0;

$tagcloud = "";

$data = date("Y-m-d H:i:s");
$ip = $_SERVER['REMOTE_ADDR'];

// Le variabili più importanti usabili dopo questo file:
//
// $data : la data corrente
// $ip : l'indirizzo IP del visitatore
// $_SESSION['ID'] : l'ID del visitatore loggato
// $_SESSION['nickname'] : il nickname del visitatore loggato
// $_SESSION['logged'] : 0 se non loggato , 1 se loggato
// $_SESSION['admin'] : indica se l'utente è l'admin;
// $_SESSION['bannato'] : indica se l'utente è stato bannato;
//

// Contiene le definizioni di autenticazione del Database SQL. Le informazioni vengono prese dal file config.txt

$rows = 4;
$myFile = "config.txt";
$fh = fopen($myFile, 'r');
while($theData[] = fgets($fh)){ }
fclose($fh);

$cont = 0;
foreach ($theData as $k){ 
if ($cont < $rows){ 
$lineconfig = explode("=",$k);
$q[] = trim($lineconfig[1]);
$cont++;
}
}


		$connection = mysql_connect($q[0],$q[2],$q[3]);

if ($connection) {			
	if (mysql_select_db($q[1])) {
		
	} else {
      echo("Errore di connessione al Database!");
	}
}

// Questa parte gestisce l'autenticazione. 
// Se l'utente ha settato un cookie, recupera le informazioni dal cookie. Altrimenti deve avere una sessione già aperta. In questi 2 casi recupera tutti i dati e procede. Altrimenti l'utente è sloggato.


        if (isset($_COOKIE['pass'])) {

		    $_SESSION['nickname']   = trim(antipirate($_COOKIE['user']));
		    $_SESSION['password']   = $_COOKIE['pass'];
			


		
		    }


	/////////////////////////////////////////////////////////////
////														    ////
//// Contiene le funzioni comuni a tutte le pagine PHP del sito ////
////															////
    /////////////////////////////////////////////////////////////

function SQL($query){
	$oid = mysql_query($query) or die("Error (".$query."): ".mysql_errno()." - ".mysql_error());
	
	$result = "";
	do {
		$data = mysql_fetch_assoc($oid);
		if ($data) {
		$result[] = $data;
		}
	} while ($data);
	
	return $result;
}	

function SQLp($query){
	$oid = mysql_query($query) or die("Error (".$query."): ".mysql_errno()." - ".mysql_error());
	
	$result = "";
	do {
		$data = mysql_fetch_assoc($oid);
		if ($data) {
		$result = $data;
		}
		
	} while ($data);
	
	foreach($result as $k => $v) {}
	
	return $v;
}	
	
	
			
function EseguiQuery($query,$par,$name){
	$oid = mysql_query($query) or die("Error (".$query."): ".mysql_errno()." - ".mysql_error());
	$result = "";
	do {
		$data = mysql_fetch_assoc($oid);
		if ($data) {
			
			if ($par > 1) {$result[] = $data;} else {$result = $data[$name];}
		}
	} while ($data);
	
	return $result;
}

function mysql_query2($query){
	$oid = mysql_query($query) or die("Error (".$query."): ".mysql_errno()." - ".mysql_error());
	return $oid;
}


function match($k1,$k2){ 
if (count($k1) != count($k2)){ return 0; }

$roweq = 0;
foreach ($k1 as $k11) {
foreach ($k2 as $k22) {
if ($k22 == $k11){ $roweq = 1; }
}
if ($roweq == 0) { return 0; } else { $roweq = 0; } 


}
return 1;
}


function invia_email($destinatario,$oggetto,$corpo){

  $email_to =new PHPMailer(); 

  $email_to->From     = "noreply@apocanow.it"; 
  $email_to->FromName = "APOCANOW :: Videogames Community"; 
  $email_to->Subject  = $oggetto;
  $email_to->Body     = $corpo;
  $email_to->Sender   = "noreply@apocanow.it"; 
   
   
  $email_to->isSMTP(); 
  $email_to->SMTPAuth = true; 
  $email_to->Host     = "mail.tin.it";   
  $email_to->Username = "apocanow84@tin.it"; 
  $email_to->Password = "qwertyx"; 
  $email_to->Mailer   = "smtp"; 
  $email_to->replyTo  = "noreply@apocanow.it"; 
   

  $email_to->AddAddress($destinatario);   
  $email_to->Send();
           
  $email_to->ClearAddresses(); 
  $email_to->ClearBCCs(); 
  $email_to->ClearAttachments(); 
}

function webmaster_email($mittente,$oggetto,$corpo){

  $destinatario = "apocalisse_@apocanow.it";
  $email_to =new PHPMailer(); 

  $email_to->From     = $mittente; 
  $email_to->FromName = $mittente;
  $email_to->Subject  = $oggetto;
  $email_to->Body     = $corpo;
  $email_to->Sender   = $mittente; 
   
   
  $email_to->isSMTP(); 
  $email_to->SMTPAuth = true; 
  $email_to->Host     = "mail.tin.it";   
  $email_to->Username = "apocanow84@tin.it"; 
  $email_to->Password = "qwertyx"; 
  $email_to->Mailer   = "smtp"; 
  $email_to->replyTo  = "noreply@apocanow.it"; 
   

  $email_to->AddAddress($destinatario);   
  $email_to->Send();
           
  $email_to->ClearAddresses(); 
  $email_to->ClearBCCs(); 
  $email_to->ClearAttachments(); 
}



// Questa funzione rende il nome ideale per essere messo come URL
function nomegoogle($nomegoogle){

$nomegoogle = str_replace("#**#","'",$nomegoogle); 
$nomegoogle = str_replace(":","",$nomegoogle);
$nomegoogle = str_replace("'"," ",$nomegoogle);
$nomegoogle = str_replace(" ","-",$nomegoogle);
$nomegoogle = str_replace("è","e",$nomegoogle);
$nomegoogle = str_replace("à","a",$nomegoogle);
$nomegoogle = str_replace("ò","o",$nomegoogle);
$nomegoogle = str_replace("ì","i",$nomegoogle);
$nomegoogle = str_replace("ù","u",$nomegoogle);
$nomegoogle = strtolower($nomegoogle);
return $nomegoogle;

}

// Questa funzione rende il nome ideale per essere messo come Titolo del Link
function nometitle($nometitle){
$nometitle = str_replace("-"," ",$nometitle);
$nometitle = ucfirst($nometitle);
return $nometitle;
}

function nomeprint($nomeprint){
$nomeprint = str_replace("_s","'s",$nomeprint);
$nomeprint = str_replace("-"," ",$nomeprint);
$nomeprint = ucfirst($nomeprint);
return $nomeprint;
}

function htmltotag($messaggio){
$messaggio = str_replace("#**#","'",$messaggio);
$messaggio = str_replace("<b>","[b]",$messaggio);
$messaggio = str_replace("</b>","[/b]",$messaggio);
$messaggio = str_replace("<i>","[i]",$messaggio);
$messaggio = str_replace("</i>","[/i]",$messaggio);
$messaggio = str_replace("<u>","[u]",$messaggio);
$messaggio = str_replace("</u>","[/u]",$messaggio);
$messaggio = str_replace("<div align='left'>","[left]",$messaggio);
$messaggio = str_replace("<div align='center'>","[center]",$messaggio);
$messaggio = str_replace("<div align='right'>","[right]",$messaggio);
$messaggio = str_replace("</div>","[/left]",$messaggio);
$messaggio = str_replace("<br/>","\n",$messaggio);
$messaggio = str_replace("&lt;","<",$messaggio);
$messaggio = str_replace("&gt;",">",$messaggio);
$messaggio = youtubetotag($messaggio);
$messaggio = trim($messaggio);
return $messaggio;
}

// Questa funzione taglia le parole troppo lunghe
function youtubetotag($messaggio){

while (strpos($messaggio,"<embed src='http://www.youtube.com/v/") > 0){
$parte1 = strpos($messaggio,"<embed src='http://www.youtube.com/v/");
$messaggio = str_replace(substr($messaggio,$parte1,49),"",$messaggio);
}
$messaggio = str_replace("<center><object width='425' height='373'><param name='movie' value='http://www.youtube.com/v/","[youtube id=\"",$messaggio);
$messaggio = str_replace("&hl=en&color1=0x2b405b&color2=0x6b8ab6&border=1'></param><param name='wmode' value='transparent'></param>hl=en&color1=0x2b405b&color2=0x6b8ab6&border=1' type='application/x-shockwave-flash' wmode='transparent' width='425' height='373'></embed></object></center>","\"]",$messaggio);
$messaggio = trim($messaggio);
return $messaggio;
}


// Questa funzione restituisce l'età di una persona a partire dai suoi dati di nascita
function age($giornonascita,$mesenascita,$annonascita){

$annomeno = 0;
$oggi_giorno = date("d");
$oggi_mese = date("m");
$oggi_anno = date("Y");

if ($oggi_mese < $mesenascita){ $annomeno = 1; }
if ($oggi_mese == $mesenascita && $oggi_giorno < $giornonascita){ $annomeno = 1; }
$eta = $oggi_anno - $annonascita - $annomeno;

return $eta;

}

// Questa funzione sostituisce gli smiles al testo del messaggio in entrata
function censura($messaggio){
$messaggio = str_replace("cazz","[badword]",$messaggio);
$messaggio = str_replace("merd","[badword]",$messaggio);
$messaggio = str_replace("stronz","[badword]",$messaggio);
$messaggio = str_replace("porc","[badword]",$messaggio);
$messaggio = str_replace("vaffan","[badword]",$messaggio);
$messaggio = str_replace("culo","[badword]",$messaggio);
$messaggio = str_replace("incul","[badword]",$messaggio);
$messaggio = str_replace("coglion","[badword]",$messaggio);
$messaggio = str_replace("froc","[badword]",$messaggio);
$messaggio = str_replace("fott","[badword]",$messaggio);
$messaggio = str_replace("mannaggia","[badword]",$messaggio);
$messaggio = str_replace("trombat","[badword]",$messaggio);
$messaggio = str_replace("trombar","[badword]",$messaggio);
$messaggio = str_replace("scopat","[badword]",$messaggio);
$messaggio = str_replace("scopar","[badword]",$messaggio);
$messaggio = str_replace("troia","[badword]",$messaggio);
$messaggio = str_replace("troie","[badword]",$messaggio);
$messaggio = str_replace("puttan","[badword]",$messaggio);
$messaggio = str_replace("baldracc","[badword]",$messaggio);
$messaggio = str_replace("schifos","[badword]",$messaggio);
$messaggio = str_replace("nazi","[badword]",$messaggio);
return $messaggio;
}

// Questa funzione sostituisce gli smiles al testo del messaggio in entrata
function smiles($messaggio,$sezione){

$smile = EseguiQuery("SELECT * FROM smiles where sezione = '{$sezione}'",4,"");
foreach($smile as $k => $v) { 

$messaggio = str_replace($v['abbreviazione'],"<img src=\"immagini/smiles/".$v['sezione']."_".$v['nome'].".gif\" border=\"0\" alt=\"".$v['nome']."\" />",$messaggio); }

return $messaggio;

}

// Questa funzione modifica il punteggio di un utente
function punti($nickname,$operando,$valore){

$punti = EseguiQuery("SELECT punti FROM utenti where nickname = '{$nickname}'",1,"punti");
if ($operando == "-") $punti = $punti - $valore;
if ($operando == "+") $punti = $punti + $valore;

$sql = "UPDATE utenti SET punti = {$punti} where nickname = '{$nickname}'";
$result = mysql_query($sql);	

}

// Questa funzione sostituisce il testo agli smiles del messaggio in entrata
function unsmiles($messaggio,$sezione){

$smile = EseguiQuery("SELECT * FROM smiles where sezione = '{$sezione}'",4,"");
foreach($smile as $k => $v) { 

$messaggio = str_replace("<img src=\"immagini/smiles/".$v['sezione']."_".$v['nome'].".gif\" border=\"0\" alt=\"".$v['nome']."\" />",$v['abbreviazione'],$messaggio); }


$messaggio = str_replace("<br />","",$messaggio); 
return $messaggio;

}

// Questa funzione taglia le parole troppo lunghe
function smilestotag($messaggio){
$messaggio = str_replace("[b]","",$messaggio);
$messaggio = str_replace("[/b]","",$messaggio);
$messaggio = str_replace("[i]","",$messaggio);
$messaggio = str_replace("[/i]","",$messaggio);
$messaggio = str_replace("[u]","",$messaggio);
$messaggio = str_replace("[/u]","",$messaggio);
$messaggio = str_replace("[left]","",$messaggio);
$messaggio = str_replace("[/left]","",$messaggio);
$messaggio = str_replace("[center]","",$messaggio);
$messaggio = str_replace("[/center]","",$messaggio);
$messaggio = str_replace("[right]","",$messaggio);
$messaggio = str_replace("[/right]","",$messaggio);
$messaggio = str_replace("#**#","'",$messaggio);

$messaggio = " ".$messaggio;

while (strpos($messaggio,"[quote") > 0 && strpos($messaggio,"[quote") != null ){
$prima=strpos($messaggio,"[quote");
$seconda=strpos($messaggio,"[/quote]",$prima) + 8;
$lunghezza = $seconda-$prima;
$quote = substr($messaggio,$prima,$lunghezza);
$messaggio = str_replace($quote,"",$messaggio);
}

$messaggio = str_replace("[/quote]","",$messaggio);

while (strpos($messaggio,"[spoiler]") > 0 && strpos($messaggio,"[spoiler]") != null ){
$prima=strpos($messaggio,"[spoiler]");
$seconda=strpos($messaggio,"[/spoiler]",$prima) + 10;
$lunghezza = $seconda-$prima;
$quote = substr($messaggio,$prima,$lunghezza);
$messaggio = str_replace($quote,"",$messaggio);
}

$messaggio = str_replace("[/spoiler]","",$messaggio);

return $messaggio;
}

// Questa funzione taglia le parole troppo lunghe
function antishock($messaggio,$caratteri){

/* Questa prima parte tronca le parole troppo lunghe */
$parole = explode(' ', $messaggio);
$numero_cicli = count($parole);
$result = "";
  
for($i = 0; $i < $numero_cicli; $i++) {
$lunghezza_parola = strlen($parole[$i]);
if($lunghezza_parola>$caratteri) {

$result .= substr($parole[$i],0,$caratteri)." ";
} else {
$result .= $parole[$i]." ";
}
}
return $result; 
} 


function cut($messaggio,$n){

/* Questa prima parte tronca le parole troppo lunghe */
$caratteri = $n;
$parole = explode(' ', $messaggio);
$numero_cicli = count($parole);
$result = "";
  
for($i = 0; $i < $numero_cicli; $i++) {
$lunghezza_parola = strlen($parole[$i]);
if($lunghezza_parola>$caratteri) {

$result .= substr($parole[$i],0,$n)." ";
} else {
$result .= $parole[$i]." ";
}
}

return $result; 
} 
   
// Questa funzione traduce gli smiles in tag
function antipirate($messaggio){

/* Questa prima parte tronca le parole troppo lunghe */
$caratteri = 25;
$parole = explode(' ', $messaggio);
$numero_cicli = count($parole);
$result = "";
  
for($i = 0; $i < $numero_cicli; $i++) {
$lunghezza_parola = strlen($parole[$i]);
if($lunghezza_parola>$caratteri) {

$result .= substr($parole[$i],0,25)." ";
} else {
$result .= $parole[$i]." ";
}
} 
   
$messaggio = $result;

/* Questa seconda parte toglie o modifica le stringhe equivoche */

$messaggio = str_replace("&","&amp;",$messaggio); 
$messaggio = str_replace("<","&lt;",$messaggio); 
$messaggio = str_replace(">","&gt;",$messaggio); 
$messaggio = str_replace('"','&quot;',$messaggio); 
$messaggio = str_replace("'","#**#",$messaggio); 
$messaggio = str_replace(" OR ","",$messaggio); 
$messaggio = str_replace(" AND ","",$messaggio); 
$messaggio = nl2br($messaggio);

return $messaggio;
} 

// Questa funzione rimette gli apici ai messaggi con gli #@# 
function mettiapici($messaggio){
$messaggio = str_replace("#**#","'",$messaggio); 
$messaggio = str_replace("#@#","'",$messaggio); 
$messaggio = str_replace("Ã¨","è",$messaggio);
$messaggio = str_replace("Ã²","ò",$messaggio);
$messaggio = str_replace("Ã¹","ù",$messaggio);
$messaggio = str_replace("Ã","à",$messaggio);
$messaggio = str_replace(" Â  ","",$messaggio);
$messaggio = str_replace("Â","",$messaggio);
$messaggio = str_replace("l?","l'",$messaggio);
$messaggio = str_replace("â€¦","...",$messaggio);

return $messaggio;
} 

// Questa funzione toglie gli spazi
function toglispazi($messaggio){
$messaggio = str_replace("<br />","",$messaggio);
return $messaggio;
} 

// Questa funzione tronca la frase a 350 caratteri
function cut350($messaggio){
$messaggio = substr($messaggio,0,350)."...";
return $messaggio;
} 

// Questa funzione tronca la frase a 450 caratteri
function cut450($messaggio){
$messaggio = substr($messaggio,0,450)."...";
return $messaggio;
} 

function cutX($messaggio,$x){
$messaggio = substr($messaggio,0,$x)."...";
return $messaggio;
} 

// Questa funzione rimette gli apici ai messaggi con gli #@# 
function togliapici($messaggio){
$messaggio = str_replace("'","#**#",$messaggio); 
return $messaggio;
} 

// Questa funzione calcola il tempo che il server ha impiegato a processare la pagina
function processing_time($START=false)
{
    $an = 4;    
    if(!$START) return time() + microtime();
    $END = time() + microtime();
    return round($END - $START, $an);
}


// Questa funzione sostituisce i <br/> con i newline nelle textarea
function br2nl($messaggio){
$messaggio = str_replace("<br/>","\\n",$messaggio); 
$messaggio = str_replace("<br>","\\n",$messaggio); 
return $messaggio;
} 

// Questa funzione crea l'avatar della foto selezionata per l'id specificato
function CreaAvatarP($IDfoto,$IDutente){

	list($width, $height, $type, $attr) = getimagesize('foto/'.$IDfoto.'.jpg');
	$thumb = imagecreatetruecolor(72, 72);
    $source = imagecreatefromjpeg('foto/'.$IDfoto.'.jpg');
    imagecopyresized($thumb, $source, 0, 0, 0, 0, 72, 72, $width, $height);
	imagejpeg($thumb, "avatarprofili/".$IDutente.".jpg", 75);

}

// Questa funzione restituisce il tempo passato tra la data odierna e quella passata sull'argomento della funzione
function GetFarDate($data){

$dataexp = explode(" ",$data);
list($anno, $mese, $giorno) = explode("-",$dataexp[0]); 
list($ore, $minuti, $secondi) = explode(":",$dataexp[1]); 

$minuti = -ceil((mktime ($ore,$minuti,$secondi,$mese,$giorno,$anno) - time())/60);
$giorni = -ceil((mktime (0,0,0,$mese,$giorno,$anno) - time())/86400);
$mesi = -ceil((mktime (0,0,0,$mese,$giorno,$anno) - time())/2678400);
$anni = -ceil((mktime (0,0,0,$mese,$giorno,$anno) - time())/32140800);

if ($anni == 1) return "1 Anno Fa";
if ($anni > 1) return $anni." Anni Fa";
if ($mesi == 1) return "1 Mese Fa";
if ($mesi > 1) return $mesi." Mesi Fa";
if ($giorni == 1) return "Ieri";
if ($giorni > 1) return $giorni." Giorni Fa";
if (floor($minuti/60) == 1) return "1 Ora Fa";
if (floor($minuti/60) > 1) return floor($minuti/60)." Ore Fa";
if ($minuti < 2) return "Proprio Ora";
if ($minuti > 1  && $minuti < 60) return $minuti." Minuti Fa";
if ($minuti > 119) return floor($minuti/60)." Ore Fa";
}

// Questa funzione logga tutti i tipi di operazioni all'interno del sito
function Logz($IDnickname,$nickname,$op,$tipo,$ref,$cat,$IDoggetto){
$ip = $_SERVER['REMOTE_ADDR'];
$data = date("Y-m-d H:i:s");

     $sql = "INSERT INTO log (IDnickname,nickname,operazione,tipo,ref,cat,ip,data,IDoggetto) values ({$IDnickname},'{$nickname}','{$op}','{$tipo}','{$ref}','{$cat}','{$ip}','{$data}',{$IDoggetto})";
	 $result = mysql_query($sql) or die("Errore [Log] [Funzione Logz]: ".mysql_errno()." - ".mysql_error());

	 $numlog = EseguiQuery("SELECT log FROM ricercheveloci where tag = 'sito'",1,"log");
	 $numlog = $numlog + 1;
	 $sql = "UPDATE ricercheveloci SET log = {$numlog} , ultimoinserimento = '{$data}' where tag = 'sito'";
     $result = mysql_query($sql);	
	 
}

// Questa funzione gestisce le notifiche sul sito
function Notifica($IDnickname,$nickname,$op,$tipo,$ref,$cat,$IDoggetto,$IDdest,$nickdest){
$ip = $_SERVER['REMOTE_ADDR'];
$data = date("Y-m-d H:i:s");

     $sql = "INSERT INTO notifiche (IDnickname,nickname,operazione,tipo,ref,cat,ip,data,IDoggetto,IDdest,nickdest) values ({$IDnickname},'{$nickname}','{$op}','{$tipo}','{$ref}','{$cat}','{$ip}','{$data}',{$IDoggetto},{$IDdest},'{$nickdest}')";
	 $result = mysql_query($sql) or die("Errore [Notifica] [Funzione Notifica]: ".mysql_errno()." - ".mysql_error());

	 $notifiche = EseguiQuery("SELECT * FROM centronotifiche WHERE nickname = '".$nickdest."'",2,"");
	 
	 if ($notifiche != null){
	 foreach($notifiche as $k => $n) {}
	 $numlog = $n['notifiche'] + 1;
	 $sql = "UPDATE centronotifiche SET notifiche = {$numlog} where nickname = '".$nickdest."'";
     $result = mysql_query($sql);	
	 } else {
	 
	 $sql = "INSERT INTO centronotifiche (nickname,IDnickname,notifiche) values ('{$nickdest}',{$IDdest},1)";
	 $result = mysql_query($sql);
	 
	 }
	 
	 
}

header("Content-type: text/html; charset=ISO-8859-1");

// Questa utile funzione invia un messaggio privato dal mittente al destinatario indicato
function Send($nicksorg,$nickdest,$messaggio){

$messaggio = str_replace("'","#**#",$messaggio);

$IDnickname = EseguiQuery("SELECT ID FROM utenti where nickname = '{$nicksorg}'",1,"ID");
$utente = EseguiQuery("SELECT ID,msgamici,messaggi FROM utenti where nickname = '{$nickdest}'",2,"");
if ($utente != null){
foreach($utente as $k => $v) { $IDdest = $v['ID']; $msgamici = $v['msgamici']; $messaggi = $v['messaggi']; }
if ($IDdest > 0 && $IDdest != $_SESSION['ID']){  // Il sistema blocca i messaggi tra sorg e dest identici!

$amico = EseguiQuery("SELECT * FROM amici where IDnickname = '{$IDnickname}' AND IDdest = '{$IDdest}' OR IDnickname = '{$IDdest}' AND IDdest = '{$IDnickname}'",2,"");
if ($amico != null){

foreach($amico as $k => $v) { $blocca = $v['blocca']; $approvato = $v['approvato']; }
} else { $blocca = 0; $approvato = 0; }

if ($msgamici == 1 && $approvato == 1 && $blocca == 0 || $msgamici == 0 && $blocca == 0 || $_SESSION['admin'] == 1){  
				

	$_old = EseguiQuery("SELECT * FROM centromessaggiprivati where IDnickname = '{$IDnickname}' AND IDdest = '{$IDdest}'",5,"");	
	if ($_old  != null){ foreach($_old as $k => $v) { $old = $v['ID']; $inviati = $v['inviati']; }}
	$_old2 = EseguiQuery("SELECT * FROM centromessaggiprivati where IDnickname = '{$IDdest}' AND IDdest = '{$IDnickname}'",5,"");	
	if ($_old2 != null){ foreach($_old2 as $k => $v) { $old2 = $v['ID']; $ricevuti = $v['ricevuti']; }}
	if ($_old != null){

	$data = date("Y-m-d H:i:s");
	
    $inviati = $inviati + 1;	
	$sql = "UPDATE centromessaggiprivati SET inviati = {$inviati} where ID = '{$old}'";
	$result = mysql_query($sql);
	
    $ricevuti = $ricevuti + 1;	
	$sql = "UPDATE centromessaggiprivati SET ricevuti = {$ricevuti} where ID = '{$old2}'";
	$result = mysql_query($sql);

     $sql = "INSERT INTO messaggiprivati (IDnickname,nickname,IDdest,nickdest,IDtab,messaggio,data) values ({$IDnickname},'{$nicksorg}',{$IDdest},'{$nickdest}',{$old},'{$messaggio}','{$data}')";	
     $result = mysql_query($sql);

	 $messaggi = $messaggi + 1;
     $sql = "UPDATE utenti SET messaggi = {$messaggi} where ID = '{$IDdest}'";
     $result = mysql_query($sql);
	 return 1;
	}
	else
	{
	
	
     $data = date("Y-m-d H:i:s");
     $sql = "INSERT INTO centromessaggiprivati (IDnickname,nickname,IDdest,nickdest,inviati,ricevuti,ultimomsg) values ({$IDnickname},'{$nicksorg}',{$IDdest},'{$nickdest}',1,0,'{$data}')";
	 $result = mysql_query($sql);
     $IDtab = EseguiQuery("SELECT ID FROM centromessaggiprivati where IDnickname = '{$IDnickname}' AND IDdest = '{$IDdest}'",1,"ID");	

     $sql = "INSERT INTO centromessaggiprivati (IDnickname,nickname,IDdest,nickdest,inviati,ricevuti,ultimomsg) values ({$IDdest},'{$nickdest}',{$IDnickname},'{$nicksorg}',0,1,'{$data}')";
     $result = mysql_query($sql);
     $sql = "INSERT INTO messaggiprivati (IDnickname,nickname,IDdest,nickdest,IDtab,messaggio,data) values ({$IDnickname},'{$nicksorg}',{$IDdest},'{$nickdest}',{$IDtab},'{$messaggio}','{$data}')";
     $result = mysql_query($sql);
	 $messaggi = $messaggi + 1;
     $sql = "UPDATE utenti SET messaggi = {$messaggi} where ID = '{$IDdest}'";
     $result = mysql_query($sql);
	 return 1;
    }


}

}
} else { return 0; }
}


// Questa utile funzione invia un messaggio privato dal mittente al destinatario indicato
function sendmail($nicksorg,$oggetto,$messaggio){

$email = EseguiQuery("SELECT email FROM utenti where nickname = '{$nicksorg}'",1,"email");
invia_email($email,$oggetto,$messaggio);

}
			
?>
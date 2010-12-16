function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_preloadImages() { //v3.0
  var d=document; if(d.immagini){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2]; document.him.src = MM_swapImage.arguments[4]; }
}


// FUNZIONI DI UTILIZZO DI AJAX
//
// funzione per assegnare l'oggetto XMLHttpRequest
// compatibile con i browsers più recenti e diffusi
function assegnaXMLHttpRequest() {

// lista delle variabili locali
var
 // variabile di ritorno, nulla di default
 XHR = null,
 
 // informazioni sul nome del browser
 browserUtente = navigator.userAgent.toUpperCase();


 // browser standard con supporto nativo
 // non importa il tipo di browser
 if(typeof(XMLHttpRequest) == "function" || typeof(XMLHttpRequest) == "object")
  { XHR = new XMLHttpRequest(); } 

 // browser Internet Explorer
 // è necessario filtrare la versione 4
 else if(
  window.ActiveXObject &&
  browserUtente.indexOf("MSIE 4") < 0
 ) {
 
  // la versione 6 di IE ha un nome differente
  // per il tipo di oggetto ActiveX
  if(browserUtente.indexOf("MSIE 5") < 0)
   XHR = new ActiveXObject("Msxml2.XMLHTTP");

  // le versioni 5 e 5.5 invece sfruttano lo stesso nome
  else
   XHR = new ActiveXObject("Microsoft.XMLHTTP");
 }

 return XHR;
} 



// funzione di caricamento testo, accetta una stringa contenente il nome di un file da leggere
// elementz: l'ID dell'oggetto in cui viene caricato il file. formz: il nome del form in cui si trovano gli elementi da trasferire. Se non esiste inserite 'no'! 
// nomeFile: nome del file. tipoconn: GET o POST.
function ajaxthis(elementz,formz,nomeFile,tipoconn) {

    // assegnazione oggetto XMLHttpRequest
    ajax = assegnaXMLHttpRequest();
	
    // assegnazione elemento del documento
    elemento = document.getElementById(elementz);

	
    // impostazione richiesta asincrona in GET
    // del file specificato
	
	if (document.forms[formz]) {

    // ERRORE QUI
	stringa = PreparaDati(formz);

    }
	else
	{ stringa = ""; }
    ajax.open(tipoconn, nomeFile, true);

    ajax.onreadystatechange = function() {
      
      // verifica dello stato
      if(ajax.readyState < 4) { elemento.innerHTML = "<img src='/img/loading.gif' /> Verifica dati in corso..."; }
      if(ajax.readyState == 4) {
        // verifica della risposta da parte del server
        if(ajax.status == 200)
          // operazione avvenuta con successo
          elemento.innerHTML = ajax.responseText;
        else {
          // errore di caricamento
          elemento.innerHTML = "Errore di Caricamento. Contattare il Webmaster.";
          elemento.innerHTML += "Errore riscontrato: " + statusText[ajax.status];

        }
      } 
    }

	
	if (tipoconn == "get") {
    ajax.setRequestHeader("Connection", "close");
    }
	else {
	ajax.setRequestHeader("Content-Type","application/x-www-form-urlencoded; charset=ISO-8859-1");
	ajax.setRequestHeader("Content-length", stringa.length);
    ajax.setRequestHeader("Connection", "close");
    }	

	if (tipoconn == "get") {
    ajax.send(null);
    }
	else {
	ajax.send(stringa);
    }


} 


// Invia i dati di un form ma non restituisce output 
function ajaxthisF(formz,nomeFile,tipoconn) {

    // assegnazione oggetto XMLHttpRequest
    ajax = assegnaXMLHttpRequest();
		
    // impostazione richiesta asincrona in GET
    // del file specificato
	
	if (document.forms[formz]) {

    // ERRORE QUI
	stringa = PreparaDati(formz);

    }
	else
	{ stringa = ""; }
    ajax.open(tipoconn, nomeFile, true);

    ajax.onreadystatechange = function() {}

	
	if (tipoconn == "get") {
    ajax.setRequestHeader("Connection", "close");
    }
	else {
	ajax.setRequestHeader("Content-Type","application/x-www-form-urlencoded; charset=ISO-8859-1");
	ajax.setRequestHeader("Content-length", stringa.length);
    ajax.setRequestHeader("Connection", "close");
    }	

	if (tipoconn == "get") {
    ajax.send(null);
    }
	else {
	ajax.send(stringa);
    }


} 


function ajaxthisN(nomeFile,tipoconn) {

    // assegnazione oggetto XMLHttpRequest
    ajax = assegnaXMLHttpRequest();
	stringa = "";
	
    // assegnazione elemento del documento
	
    // impostazione richiesta asincrona in GET
    // del file specificato
	
    ajax.open(tipoconn, nomeFile, true);

    ajax.onreadystatechange = function() {}

	if (tipoconn == "get") {
    ajax.setRequestHeader("Connection", "close");
    }
	else {
	ajax.setRequestHeader("Content-Type","application/x-www-form-urlencoded; charset=ISO-8859-1");
	ajax.setRequestHeader("Content-length", stringa.length);
    ajax.setRequestHeader("Connection", "close");
    }	

	if (tipoconn == "get") {
    ajax.send(null);
    }
	else {
	ajax.send(stringa);
    }


} 


// Funzione AJAX di Redirect. Se la pagina restituisce OK, effettua il redirect!
function ajaxthisR(elementz,formz,nomeFile,redir,tipoconn) {

    // assegnazione oggetto XMLHttpRequest
    ajax = assegnaXMLHttpRequest();
	
    // assegnazione elemento del documento
    elemento = document.getElementById(elementz);

	
    // impostazione richiesta asincrona in GET
    // del file specificato
	
	if (document.forms[formz]) {

    // ERRORE QUI
	stringa = PreparaDati(formz);

    }
	else
	{ stringa = ""; }
    ajax.open(tipoconn, nomeFile, true);

    ajax.onreadystatechange = function() {
      
      // verifica dello stato
      if(ajax.readyState < 4) { elemento.innerHTML = "<img src='/img/loading.gif' /> Verifica dati in corso..."; }
      if(ajax.readyState == 4) {
        // verifica della risposta da parte del server
        if(ajax.status == 200){
          // operazione avvenuta con successo
          elemento.innerHTML = ajax.responseText;
		  
		  if (ajax.responseText == "Logging In....") location.href = redir;
		  
		  }
        else {
          // errore di caricamento
          elemento.innerHTML = "Errore di Caricamento. Contattare il Webmaster.";
          elemento.innerHTML += "Errore riscontrato: " + statusText[ajax.status];

        }
      } 
    }

	
	if (tipoconn == "get") {
    ajax.setRequestHeader("Connection", "close");
    }
	else {
	ajax.setRequestHeader("Content-Type","application/x-www-form-urlencoded; charset=ISO-8859-1");
	ajax.setRequestHeader("Content-length", stringa.length);
    ajax.setRequestHeader("Connection", "close");
    }	

	if (tipoconn == "get") {
    ajax.send(null);
    }
	else {
	ajax.send(stringa);
    }


}



function ajaxthisT(elementz,formz,nomeFile,tipoconn,time) { // Questa è una funzione Ajax che ritarda l'esecuzione del tempo TIME.
setTimeout("ajaxthis('"+elementz+"','"+formz+"','"+nomeFile+"','"+tipoconn+"')",time);
} 

function PreparaDati(nome){ // Funzione di Escape per la preparazione dei dati Ajax
  stringa = "";
  var form = document.forms[nome];
  var numeroElementi = form.elements.length;

  for(var i = 0; i < numeroElementi; i++){
    if(i < numeroElementi-1){
      stringa += form.elements[i].name+"="+escape(encodeURIComponent(form.elements[i].value))+"&";

    }else{
      stringa += form.elements[i].name+"="+escape(encodeURIComponent(form.elements[i].value));

    }
}
  ultimoCarattere = stringa.charAt(stringa.length - 1);
  if (ultimoCarattere == "&"){ stringa = stringa.substr(0,stringa.length-1); }
  return stringa;
}


// FINE DELLE FUNZIONI AJAX

  // Funzione che adatta lo sfondo alla pagina
  
  var backgroundset=false;
  function fixedBackground(url)
  {
    if(!backgroundset)
    {
      document.body.style.overflow = 'hidden';
      document.body.style.padding  = '0px';
      document.body.style.margin   = '0px';

      var overlay = document.createElement('DIV');
      overlay.style.position    = 'absolute';
      overlay.style.top         = '0px';
      overlay.style.left        = '0px';
      overlay.style.height      = '100%';
      overlay.style.width       = '100%';
      overlay.style.overflow    = 'auto';

      overlay.innerHTML         = document.body.innerHTML;
      document.body.innerHTML   = '<img id="background" height="100%"  width="100%" src="' + url + '" style="left: 0; bottom: 0; right: 0; top: 0; z-index: 0" />';

      document.body.appendChild(overlay);

      backgroundset=true;
    }
    else
      background.src=url;
  }










function antipirate(splitted){ // Evita che possano fare Injection nelle tabelle
splitted = splitted.replace(/</g,"&lt;");
splitted = splitted.replace(/>/g,"&gt;");
splitted = splitted.replace(/&/g,"&amp;");
splitted = splitted.substr(0,90);
return splitted;
} 

function eviddx(x,y){ // Evidenzia le scritte del menu di destra
document.getElementById('dx_'+x).src='/immagini/templates/2010/menudx/menudx_'+y+'_'+x+'_c.gif';
return splitted;
} 

function eviddx2(x,y){ // Evidenzia le scritte del menu di destra
document.getElementById('dx_'+x).src='/immagini/templates/2010/menudx/menudx_'+y+'_'+x+'.gif';
return splitted;
} 

function show(ID){
document.getElementById(ID).style.display = 'block';
}

function hide(ID){
document.getElementById(ID).style.display = 'none';
}

function annulla(){ // Elimina la finestra centrale
document.getElementById("primopiano").style.display = 'none';
document.getElementById("primopianomid").style.display = 'none';
document.getElementById('body').className = 'body';
}

function blocca(){ // Fa apparire la finestra centrale
document.getElementById("primopiano").style.display = 'block';
document.getElementById("primopianomid").style.display = 'block';
document.getElementById('body').className = 'body_alt';
}

function bavv(file){ // Fa apparire la finestra centrale e carica all'interno un file PHP
blocca();
if (file == null) { file = "/iscriviti_form.php"; }
ajaxthis('primopiano','t',file,'get');
}

function red(x) {
document.getElementById(x).style.backgroundColor = "#ef4833";
}

function orange(x) {
document.getElementById(x).style.backgroundColor = "#ff8e00";
}

function green(x) {
document.getElementById(x).style.backgroundColor = "lightgreen";
}

function colorvalue(x) {
if (document.getElementById(x).value == 0) orange(x); 
else green(x); 
}

function isred(x) {
if (document.getElementById(x).style.backgroundColor == "#ef4833") return 1; 
else return 0;
}

function isorange(x) {
if (document.getElementById(x).style.backgroundColor == "#ff8e00") return 1; 
else return 0;
}

function isgreen(x) {
if (document.getElementById(x).style.backgroundColor == "lightgreen") return 1; 
else return 0;
}

function verifica(x) {
var acceptnumlet = /^[A-Za-z0-9 \à\è\ì\ò\ù.\_\-]+$/;
var acceptlet = /^([a-zA-Z])+$/;

  if (x == 'nick'){
  if (document.getElementById('nicklogin').value.length < 2 || !document.getElementById('nicklogin').value.match(acceptnumlet)){ red("nicklogin"); } else { green("nicklogin"); }
  if (document.getElementById('nicklogin').value.length == 0){ orange("nicklogin"); }
  }
  
  if (x == 'pass'){
  if (document.getElementById('passlogin').value.length < 6 || !document.getElementById('passlogin').value.match(acceptnumlet)){ red("passlogin"); } else { green("passlogin"); }
  if (document.getElementById('passlogin').value.length == 0){ orange("passlogin"); }
  }
  
  if (!(document.getElementById('nicklogin').value.length < 2 || !document.getElementById('nicklogin').value.match(acceptnumlet) || document.getElementById('passlogin').value.length < 6 || !document.getElementById('passlogin').value.match(acceptnumlet))){ document.getElementById('loginimage').src = '/immagini/templates/2010/bottoni/loginx.gif'; } else { document.getElementById('loginimage').src = '/immagini/templates/2010/bottoni/login.gif'; }
  
}

function controllanick(x) {
var acceptnumlet = /^[A-Za-z0-9 \à\è\ì\ò\ù.\_\-]+$/;

if (document.getElementById(x).value.length > 1 && document.getElementById(x).value.match(acceptnumlet)) {
ajaxthis('controllanick','iscrizione','/include/login_ajax_controlla.php?nick='+document.getElementById(x).value,'get');
} else { alert("Devi inserire un NICKNAME valido per poter controllare se esiste nel nostro Database!"); }

}

function nickesiste(x) {
var acceptnumlet = /^[A-Za-z0-9 \à\è\ì\ò\ù.\_\-]+$/;

if (document.getElementById(x).value.length > 1 && document.getElementById(x).value.match(acceptnumlet)) {
ajaxthis('nickcontrol','messaggio','/include/login_ajax_nickesiste.php?nick='+document.getElementById(x).value,'get');
} else { alert("Devi inserire un NICKNAME valido per poter controllare se esiste nel nostro Database!"); }

}


function controllaemail(x) {
var acceptemail = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;

if (document.getElementById(x).value.match(acceptemail)) {
ajaxthis('controllaemail','iscrizione','/include/login_ajax_controllamail.php?email='+document.getElementById(x).value,'get');
} else { alert("Devi inserire una E-MAIL valida per poter controllare se esiste nel nostro Database!"); }

}

function controllaemailR(x) {
var acceptemail = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;

if (document.getElementById(x).value.match(acceptemail)) {
ajaxthis('controllaemail','recuperopass','/include/login_ajax_controllamailREV.php?email='+document.getElementById(x).value,'get');
} else { alert("Devi inserire una E-MAIL valida per poter controllare se esiste nel nostro Database!"); }

}

function logga() {
var acceptnumlet = /^[A-Za-z0-9 \à\è\ì\ò\ù.\_\-]+$/;
var malert = "";
var no = 0;
if (document.getElementById('nicklogin').value.length < 2 || !document.getElementById('nicklogin').value.match(acceptnumlet)){ malert = malert + "Il NICKNAME deve essere composto da caratteri ALFABETICI e lungo almeno 2 caratteri! \n"; no = 1;  }
if (document.getElementById('passlogin').value.length < 6 || !document.getElementById('passlogin').value.match(acceptnumlet)){ malert = malert + "La PASSWORD deve essere composta da caratteri ALFANUMERICI e lunga almeno 5 caratteri!"; no = 1; }
if (no == 1){ alert(malert); } else { alert("Tentativo di inserimento andato a buon fine!"); blocca(); ajaxthis('primopiano','login','/login_invia.php','post'); }
}

function verificaI(x) {
var acceptnumlet = /^[A-Za-z0-9 \à\è\ì\ò\ù.\_\-]+$/;
var acceptlet = /^([a-zA-Z])+$/;
var acceptemail = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;

  if (x == 'nick'){
  document.getElementById('controllonick').value = 0;
  document.getElementById('bottonecontrollo').src = "/immagini/templates/2010/bottoni/controlla.gif";
  if (document.getElementById('nickiscr').value.length < 2 || !document.getElementById('nickiscr').value.match(acceptnumlet)){ red("nickiscr"); } else { orange("nickiscr"); }
  if (document.getElementById('nickiscr').value.length == 0){ orange("nickiscr"); }
  if (document.getElementById('nickiscr').value == document.getElementById('passiscr').value && document.getElementById('passiscr').value.length > 5){ red("passiscr"); }
  if (document.getElementById('nickiscr').value != document.getElementById('passiscr').value && document.getElementById('passiscr').value.length > 5){ green("passiscr"); } 
}
  
  if (x == 'pass'){
  if (document.getElementById('passiscr').value.length < 6 || !document.getElementById('passiscr').value.match(acceptnumlet) || document.getElementById('nickiscr').value == document.getElementById('passiscr').value){ red("passiscr"); } else { green("passiscr"); }
  if (document.getElementById('passiscr').value.length == 0){ orange("passiscr"); }
  if (document.getElementById('passiscr2').value.length > 0){ red("passiscr2"); }
  if (document.getElementById('passiscr2').value == document.getElementById('passiscr').value && document.getElementById('passiscr').value.length > 0){ green("passiscr2"); }
  }
 
  if (x == 'pass2'){
  if (document.getElementById('passiscr2').value != document.getElementById('passiscr').value){ red("passiscr2"); } else { green("passiscr2"); }
  if (document.getElementById('passiscr2').value.length == 0){ orange("passiscr2"); }
  }
  
  if (x == 'email'){
  document.getElementById('controlloemail').value = 0;
  document.getElementById('bottonecontrolloe').src = "/immagini/templates/2010/bottoni/controlla.gif";
  if (!document.getElementById('emailiscr').value.match(acceptemail)){ red("emailiscr"); } else { orange("emailiscr"); }
  if (document.getElementById('emailiscr').value.length == 0){ orange("emailiscr"); }
  }
  
  if (x == 'nome'){
  if (!document.getElementById('nome').value.match(acceptlet) || document.getElementById('nome').value.length < 2 ){ red("nome"); } else { green("nome"); }
  if (document.getElementById('nome').value.length == 0){ orange("nome"); }
  }
  
  if (!(document.getElementById('nickiscr').value.length < 2 || !document.getElementById('nickiscr').value.match(acceptnumlet) || document.getElementById('passiscr').value.length < 6 || !document.getElementById('passiscr').value.match(acceptnumlet) || document.getElementById('nickiscr').value == document.getElementById('passiscr').value || document.getElementById('passiscr2').value != document.getElementById('passiscr').value || document.getElementById('passiscr2').value != document.getElementById('passiscr').value || document.getElementById('controlloemail').value || !document.getElementById('nome').value.match(acceptlet) || document.getElementById('nome').value.length < 2 || document.getElementById('giornonascita').value < 1 || document.getElementById('mesenascita').value < 1 || document.getElementById('annonascita').value < 1 || document.getElementById('localita').value < 1)){ document.getElementById('iscriviimage').src = '/immagini/templates/2010/bottoni/iscrivix.gif'; } else { document.getElementById('iscriviimage').src = '/immagini/templates/2010/bottoni/iscrivi.gif'; }  
}

function iscrivi() {
var acceptnumlet = /^[A-Za-z0-9 \à\è\ì\ò\ù.\_\-]+$/;
var acceptlet = /^([a-zA-Z])+$/;
var acceptemail = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
var malert = "";
var no = 0;
if (document.getElementById('nickiscr').value.length < 2 || !document.getElementById('nickiscr').value.match(acceptnumlet)){ malert = malert + "- Il NICKNAME deve essere lungo almeno 2 caratteri ALFANUMERICI. \n"; no = 1;  }
if (document.getElementById('controllonick').value == 0){ malert = malert + "- Devi controllare che il NICKNAME non sia già nel nostro Database e se lo è inserirne un altro. \n"; no = 1; }
if (document.getElementById('passiscr').value.length < 6 || !document.getElementById('passiscr').value.match(acceptnumlet) || document.getElementById('nickiscr').value == document.getElementById('passiscr').value){ malert = malert + "- La PASSWORD deve essere lunga almeno 5 caratteri ALFANUMERICI. \n"; no = 1; }
if (document.getElementById('passiscr2').value != document.getElementById('passiscr').value){ malert = malert + "- Devi inserire la PASSWORD anche nella casella RECUPERA PASSWORD. \n"; no = 1; }
if (document.getElementById('controlloemail').value == 0){ malert = malert + "- Devi controllare che l'indirizzo E-MAIL non sia già nel nostro Database e se lo è inserirne un altro. \n"; no = 1; }
if (!document.getElementById('nome').value.match(acceptlet) || document.getElementById('nome').value.length < 2 ){ malert = malert + "- Il NOME deve essere lungo almeno 2 caratteri ALFABETICI. \n"; no = 1; }
if (document.getElementById('giornonascita').value < 1){ malert = malert + "- Inserisci il GIORNO DI NASCITA. \n"; no = 1; }
if (document.getElementById('mesenascita').value < 1){ malert = malert + "- Inserisci il MESE DI NASCITA. \n"; no = 1; }
if (document.getElementById('annonascita').value < 1){ malert = malert + "- Inserisci l'ANNO DI NASCITA. \n"; no = 1; }
if (document.getElementById('localita').value < 1){ malert = malert + "- Inserisci la LOCALITA' in cui ti trovi. \n"; no = 1; }





if (no == 1){ alert(malert); } else { alert("Tentativo di inserimento andato a buon fine!"); blocca(); ajaxthis('primopiano','iscrizione','/iscriviti_invia.php','post'); }

}

function recupera() {
var acceptemail = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
var malert = "";
var no = 0;
if (!document.getElementById('emailiscr').value.match(acceptemail)){ malert = malert + "- Devi inserire una E-MAIL valida e funzionante. \n"; no = 1; }
if (no == 1){ alert(malert); return false; } else { alert("Tentativo di inserimento andato a buon fine!"); return true; }
}

function lunghezza(l,x) {
var rimanenti = 0;
rimanenti =  l - document.getElementById(x).value.length;
if (document.getElementById(x).value.length > l){ document.getElementById(x).value = document.getElementById(x).value.slice(0,l); rimanenti = 0;  }
document.getElementById(x+'_rim').value = rimanenti;
}

function sign(l,x) {
document.getElementById(x).value = l;
}

function showimg(x) {
blocca();
ajaxthis('primopiano','','/include/showimg.php?imgurl='+x,'get');
}

function inviaemail() {
var acceptemail = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
if (document.getElementById('mittente').value.match(acceptemail) && document.getElementById('corpo').value.length > 20){
ok = confirm("Stai per inviare una E-Mail al Webmaster di APOCANOW\nProcedere? "); 


if(ok==true)
{
ajaxthis('aj_ris','contatti','/include/email_invia.php','post');
} 

} else { alert ("- Devi inserire una E-MAIL di risposta valida \n - Devi scrivere una E-Mail lunga almeno 20 Caratteri");
 }

}

function messaggioprivatoinvia() {
if (document.getElementById('controllonick').value == 1 && document.getElementById('messaggioprivato').value.length > 1){
ok = confirm("Stai per inviare un Messaggio Privato  a "+document.getElementById('nickdest').value+"\nProcedere? "); 


if(ok==true)
{
ajaxthis('primopiano','messaggio','/include/messaggioprivato_invia.php','post');
} 

} else { alert ("- Devi INSERIRE un Destinatario e CONTROLLARE che sia corretto \n - Il messaggio che invii NON PUO' ESSERE VUOTO"); }
}
document.onkeydown = keyDown;
var swvar = 0;

function keyDown(e){
var ie=(/MSIE (\d+\.\d+);/.test(navigator.userAgent))?1:0;

 
 if (!ie) {var keyCode=e.which;}
 if (ie) {var keyCode=event.keyCode;}
 
 if(keyCode==13 && document.getElementById("user").style.display == "none"){ go(); clear(); keyCode = 0; }
 if(keyCode==13 && document.getElementById("user").style.display == "block"){ roll(); }
  
 
 

 }
 
 function activate(name){
 document.getElementById(name).disabled = false;
 document.getElementById(name).value = '';
 document.getElementById(name).style.backgroundColor = 'white';
 document.getElementById(name).focus();
 }
 
 function deactivate(name){
 document.getElementById(name).disabled = true;
 document.getElementById(name).value = 'Attendere Prego...';
 document.getElementById(name).style.backgroundColor = 'silver';
 document.getElementById(name).focus();
 }
 
 function clear(){

 document.getElementById("sottotitolo2").style.display = "none"; 
 document.getElementById("sottotitolo1").style.display = "block";

 document.getElementById("descrizione2").style.display = "none"; 
 document.getElementById("descrizione1").style.display = "block";


 document.getElementById("pass").style.display = "none";
 document.getElementById("user").style.display = "block";

 document.getElementById("pass").value = "";
 document.getElementById("user").value = "";
 
 deactivate("user");
 setTimeout("activate('user')", 2500); 

 }
 
 function roll(){

 document.getElementById("user").style.display = "none";
 document.getElementById("pass").style.display = "block";

 document.getElementById("sottotitolo1").style.display = "none";
 document.getElementById("sottotitolo2").style.display = "block";
 
 document.getElementById("descrizione1").style.display = "none";
 document.getElementById("descrizione2").style.display = "block";

 document.getElementById("pass").focus();
 }
 
 function go(){
 ajaxthisR("errorlogin","formlogin","index_ajax.php","panel.php","POST");
 } 
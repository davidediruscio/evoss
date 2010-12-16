 function deletethis(t,id){
 
 var answer = confirm("Do you want to delete record N°"+id+" of table "+t.toUpperCase()+"???");
 
 if (answer){
 document.getElementById(t+"_"+id).innerHTML = "<tr><td class='deleted' colspan='2' style='text-align: center; width: 500px;'> Record Deleted! </td></tr>";
 ajaxthisN("del.php?t="+t+"&ID="+id,"get");
 }
 }
 
 function ass_deletethis(t,id){
 
 var answer = confirm("Do you want to delete record N°"+id+" of table "+t.toUpperCase()+"???");
 
 if (answer){
 document.getElementById(t+"_"+id).innerHTML = "<td class='deleted' colspan='4' style='text-align: center; width: 500px;'> Record Deleted! </td>";
 ajaxthisN("ass_del.php?t="+t+"&ID="+id,"get");
 }
 }
 
 function updatethis(t,c,id){
 var answer = confirm("Do you want to modify field "+c.toUpperCase()+", ID N°"+id+"?");
 if (answer){
		ajaxthisN("mod.php?t="+t+"&c="+c+"&ID="+id+"&v="+document.getElementById(t+"_"+c+"_"+id).value,"post");
		alert("Modify of field "+c.toUpperCase()+", ID N°"+id+" completed!");
	}

 }

 function ass_sign(s,id){
 if (s == 1) document.getElementById("idfirst").value = id;
 if (s == 2) document.getElementById("idsecond").value = id;
 }
 
 function ass_add_check(){
 if (!(document.getElementById("idfirst").value > 0 && document.getElementById("idsecond").value > 0)){ 
 alert("You have to complete association selecting an element of the right table and one element of the left table!"); 
 return false;
 }
}


                            <div class="art-block">
                                <div class="art-block-body">
                                            <div class="art-blockheader">
                                                 <div class="t"> Manage Elements</div>
                                            </div>
                                            <div class="art-blockcontent">
                                                <div class="art-blockcontent-body">
                                            <!-- block-content -->
                                                            <div>
                                                                              <ul>
<?php																			  
																			  
/* show tables */
$qu = "SHOW TABLES where tables_in_failuresdetector not like 'ass_%' AND tables_in_failuresdetector not like 'conf_%' AND tables_in_failuresdetector not like 'keywords'";
$result3 = mysql_query($qu,$connection);
while($tableNames = mysql_fetch_row($result3)) {

$table = $tableNames[0];
print '<li>'.$table.' <a href="add.php?t='.$table.'">[+]</a> <a href="src.php?t='.$table.'">[M/D]</a></li>';
}																			  
																		  
?>																			  															   
																			   
																			   
																			   
                                                                              </ul>
                                                                              
                                                                              </div>
                                            <!-- /block-content -->
                                            
                                            		<div class="cleared"></div>
                                                </div>
                                            </div>
                            		<div class="cleared"></div>
                                </div>
                            </div>


							
							
							<div class="art-block">
                                <div class="art-block-body">
                                            <div class="art-blockheader">
                                                 <div class="t"> Manage Associations</div>
                                            </div>
                                            <div class="art-blockcontent">
                                                <div class="art-blockcontent-body">
                                            <!-- block-content -->
                                                            <div>
                                                                              <ul>
<?php																			  
																			  
/* show tables */
$qu = "SHOW TABLES where tables_in_failuresdetector like 'ass_%' AND tables_in_failuresdetector not like '%keywords%'";
$result = mysql_query($qu,$connection) or die('cannot show tables');
while($tableName = mysql_fetch_row($result)) {

$table = $tableName[0];
$tablee = str_replace("ass_","", $table);
$assoc = explode("2",$tablee);
print '<li>'.$assoc[0].' <> '.$assoc[1].'<br/><center> <a href="ass_add.php?t='.$table.'">[+]</a> <a href="ass_src.php?t='.$table.'">[M/D]</a></center></li>';
}																			  
																		  
?>																			  															   
																			   
																			   
																			   
                                                                              </ul>
                                                                              
                                                                              </div>
                                            <!-- /block-content -->
                                            
                                            		<div class="cleared"></div>
                                                </div>
                                            </div>
                            		<div class="cleared"></div>
                                </div>
                            </div>		
							
							
							
							
							
							
							
							<div class="art-block">
                                <div class="art-block-body">
                                            <div class="art-blockheader">
                                                 <div class="t"> Tools</div>
                                            </div>
                                            <div class="art-blockcontent">
                                                <div class="art-blockcontent-body">
                                            <!-- block-content -->
                                                            <div>
                                                                              <ul>
<li> keywordize <a href="keywordize.php">[>>]</a> </li>																	  															   
																			  </ul>
                                                                              
                                                                              </div>
                                            <!-- /block-content -->
                                            
                                            		<div class="cleared"></div>
                                                </div>
                                            </div>
                            		<div class="cleared"></div>
                                </div>
                            </div>		
							
							
							
							
							
							
							


							

                            <div class="art-block">
                                <div class="art-block-body">
                                            <div class="art-blockheader">
                                                 <div class="t"> Config Board</div>
                                            </div>
                                            <div class="art-blockcontent">
                                                <div class="art-blockcontent-body">
                                            <!-- block-content -->
                                                            <div>
                                                                              <ul>
<?php																			  
																			  
/* show tables */
$qu = "SHOW TABLES where tables_in_failuresdetector like 'conf_%'";
$result = mysql_query($qu,$connection) or die('cannot show tables');
while($tableName = mysql_fetch_row($result)) {

$table = $tableName[0];
$tablee = str_replace("conf_","", $table);
print '<li>'.$tablee.' <a href="add.php?t='.$table.'">[+]</a> <a href="src.php?t='.$table.'">[M/D]</a></li>';
}		
																	  
																	  
?>																			  															   
																			   
																			   
																			   
                                                                              </ul>
                                                                              
                                                                              </div>
                                            <!-- /block-content -->
                                            
                                            		<div class="cleared"></div>
                                                </div>
                                            </div>
                            		<div class="cleared"></div>
                                </div>
                            </div>		
							
							

                            <div class="art-block">
                                <div class="art-block-body">
                                            <div class="art-blockheader">
                                                 <div class="t">Contact Us</div>
                                            </div>
                                            <div class="art-blockcontent">
                                                <div class="art-blockcontent-body">
                                            <!-- block-content -->
                                                            <div>
                                                                  <img src="images/contact.jpg" alt="an image" style="margin: 0 auto;display:block;width:95%" />
                                                            <br />
                                                            <a href='mailto:apocanow@hotmail.it'>Andrea Cherri</a> <br/>
															<a href='mailto:davewilson@hotmail.it'>Davide Arcelli</a>
														
                                                            </div>
                                            <!-- /block-content -->
                                            
                                            		<div class="cleared"></div>
                                                </div>
                                            </div>
                            		<div class="cleared"></div>
                                </div>
                            </div>
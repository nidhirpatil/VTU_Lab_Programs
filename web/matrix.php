<?php
header('Content-Type: text/plain');// without this header "\t and \n" wont work

$matrix1 = array( 
					array(1, 2), 
					array(4, 5), 
				); 
$matrix2 = array( 
					array(1, 2), 
					array(4, 5), 
				);
echo "\n\n\n";
echo "The order of the matrix A is:" . count($matrix1) . "x" . count($matrix1[0]);
echo "\n";
echo "The order of the matrix B is:" . count($matrix2) . "x" . count($matrix2[0]);
echo "\n";
$rowCount= count($matrix1);
$colCount = count($matrix1[0]);
echo "\nThe output Transpose of matrix A is:\n";
for($r = 0; $r < $rowCount; $r++)
{ 
	for($c=0; $c < $colCount; $c++) 
	{ 
	echo $matrix1[$c][$r]." \t"; 
	
	} 
	echo " \n";
}
echo "\nThe sum of matrix is:\n"; 
for($r = 0; $r < $rowCount; $r++) 
{ for($c=0; $c < $colCount; $c++) 
{ 
$val= $matrix1[$r][$c] + $matrix2[$r][$c]; 
echo $val."\t"; 
} 
echo "\n"; 
}
// multiplication 
echo "\nThe product of matrix A and B is:\n"; 
$r = array();
for ($i=0;$i< $rowCount;$i++){
		for($j=0;$j<$colCount;$j++){
			$r[$i][$j]=0;
			for($k=0;$k<$rowCount;$k++){
				$r[$i][$j]+=$matrix1[$i][$k]*$matrix2[$k][$j];
			}
		echo $r[$i][$j]."\t" ;
		}
	echo "\n";
	}
?>

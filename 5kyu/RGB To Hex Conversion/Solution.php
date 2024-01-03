<?php 

function rgb($r,$g,$b){
  $array = [$r, $g, $b];
  $resault = [];
  
  foreach($array as $hex) {
    if ($hex > 255) {
    	$hex = 255;
    } else if ($hex < 0) {
    	$hex = 0;
    }
    
    $color = sprintf("%02X", $hex);
    $resault[] = $color;
  }
  
  return implode("", $resault);
}
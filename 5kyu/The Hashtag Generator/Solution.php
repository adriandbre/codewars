<?php

function generateHashtag($str) {
	if (empty($str)) return false;
    
    $words = explode(" ", $str);
    $finalWords = [];
    
	for ($i = 0; $i < count($words); $i++) {
    	if ($words[$i] !== "") {
            array_push($finalWords, ucwords($words[$i]));
        }
    }
    
    $resault = "#" . implode("", $finalWords) == "#" ? false : "#" . implode("", $finalWords);
    
    return strlen($resault) > 140 ? false : $resault;
}
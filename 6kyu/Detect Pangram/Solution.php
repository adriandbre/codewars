<?php

function detect_pangram($string) { 
	$alphabet = "abcdefghijklmnopqrstuvwxyz";
	$sentence = str_split(strtolower(preg_replace('/[^a-z]/i', '', $string)));
    asort($sentence);
    
    $res = array_unique($sentence);
    implode(",", $res);
    
    return implode("", $res) == $alphabet;
}
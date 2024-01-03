<?php

function divisors($integer) {
    $res = [];
    for ($i = 2; $i < $integer; $i++) {
        if ($integer % $i == 0) {
            array_push($res, $i);
        }
    }
    
    return count($res) > 0 ? $res : "" . $integer . " is prime";
}
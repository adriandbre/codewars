<?php

function arrayDiff($a, $b) {
    $resault = [];
  
    foreach(array_diff($a, $b) as $diff) {
      array_push($resault, $diff);
    }
  
    return $resault;
}

// Can use the substitue $resault[] = $diff, instead of array_push(); or use array_values in a single return statement.
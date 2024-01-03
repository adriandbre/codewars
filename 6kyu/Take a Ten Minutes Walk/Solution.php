<?php

function isValidWalk($walk) {
	if (count($walk) !== 10) return false;
    return count(array_filter($walk, function($el) { return $el == 'n'; })) == count(array_filter($walk, function($el) { return $el == 's'; })) && count(array_filter($walk, function($el) { return $el == 'w'; })) == count(array_filter($walk, function($el) { return $el == 'e'; }));
} 
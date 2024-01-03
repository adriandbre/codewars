<?php

function solution($string) {
  return preg_replace('/([A-Z])/', ' $1', $string);
}
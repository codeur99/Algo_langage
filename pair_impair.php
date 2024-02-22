<?php
  
  $nombre = readline ("Veuillez entrez un nombre");
  $reste = $nombre%2;
  
  if( $reste == 0) {
    echo "nombre  pair";

  } else {

    echo "nombre impair";
}

?>
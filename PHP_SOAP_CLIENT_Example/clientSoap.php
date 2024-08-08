<?php

// Récupère les valeurs des paramètres a, b et operation depuis la requête GET
$a = $_GET["a"];
$b = $_GET["b"];
$operation = $_GET["operation"];

////////
$opts = array(
    'ssl' => array(
        'ciphers' => 'RC4-SHA',
        'verify_peer' => false,
        'verify_peer_name' => false
    )
);
$params = array(
    'encoding' => 'UTF-8',
    'verifypeer' => false,
    'verifyhost' => false,

    'stream_context' => stream_context_create($opts)
);

/////


// Spécifier l’emplacement du fichier WSDL du service web
$wsdl = 'http://localhost:8080/firstwebservice/ws/calService?wsdl';

// Créer une instance de la classe SoapClient pour communiquer avec le service web
$client = new SoapClient($wsdl,$params);

// Définir les arguments à envoyer au service web


$result = null;

try {
    // Effectuer une opération en fonction de la valeur de l’opération spécifiée
    switch ($operation) {
        case 'add':
            $args = [
                'number1' => $a,
                'number2' => $b,
            ];

            $result = $client->add($args);
            echo "Resultat: " . $result->sum;
            break;
        case 'sous':
            $args = [
                'subs1' => $a,
                'subs2' => $b,
            ];
            $result = $client->subtract($args);
            echo "Resultat: " . $result->difference;
            break;
        case 'div':
            $args = [
                'divide1' => $a,
                'divide2' => $b,
            ];
            $result = $client->divide($args);
            echo "Resultat: " . $result->quotient;

            break;
        case 'mult':
            $args = [
                'factor1' => $a,
                'factor2' => $b,
            ];            
            $result = $client->multiply($args);
            echo "Resultat: " . $result->product;
            break;
    }



} catch (SoapFault $e) {
    // Gèrer les erreurs en cas de problème avec l’appel au service web
    echo "Error: " . $e->getMessage();
}

?>

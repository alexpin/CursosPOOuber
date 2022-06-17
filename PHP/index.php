<?php

    require_once("Car.php");
    require_once("UberX.php");
    require_once("UberPool.php");
    require_once("Account.php");

    $UberX = new UberX("CVB123", new Account("Andres Herrera", "AND456"), "Chevrolet", "Spark");
    $UberX->PrintDataCar();

    $UberPool = new UberPool("TYU567", new Account("Andrea Ferran", "AND765"), "Dodge", "Attitude");
    $UberPool->PrintDataCar();
?>
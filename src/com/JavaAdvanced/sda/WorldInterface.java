package com.JavaAdvanced.sda;
//Krijoni nje interface World :
       // me metoda :
        //-> numriiKontinenteve();
        //-> printoEmrinEGalaksise();
        //-> merrEmrinEKontinentitTePare();
        //-> ktheSiperfaqenEUjit();
// Ndertoni 3 klasa Toka, Marsi , Jupiteri qe implementojne interfacin World.
// Ndertoni Klasen WorldImplementation qe do kete 3 objektet e klasave perkatese pra
// Toka marsi dhe jupiteri dhe ato do i therrisni te gjitha metodat e klasave

interface WorldInterface {
    abstract int numriKontinenteve();
    abstract String printoEmrineGalaksise();
    abstract String merrEmrinEKontinentitTePare();
    abstract int ktheSiperfaqenEUjit();
}

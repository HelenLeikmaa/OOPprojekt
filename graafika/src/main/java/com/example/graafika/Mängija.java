package com.example.graafika;

class Mängija {

    private String nimi;


    public Mängija(String nimi) {
        this.nimi = nimi;
    }


    @Override
    public String toString() {
        return "\t*** Mängija informatsioon ***\n" +
                " ---------------------------------------- \n" +
                " nimi: " + nimi + '\n';
    }
}

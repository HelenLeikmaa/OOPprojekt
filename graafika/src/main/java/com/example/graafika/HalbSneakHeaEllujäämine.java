import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
package com.example.graafika;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HalbSneakHeaEllujäämine {
    public void esimeneInfoMängijaleHalbSneakHeaEllujäämine() {
        List<String> asjad = new ArrayList<>();
        asjad.add("kompass");
        System.out.println("Tere! Oled jõudnud läbi portaali Maailma. Sul on kehv hiilimise ja hea ellujäämise oskus.");
        System.out.println("Avastad, et sul on kaasas " + asjad.toString());
        esimeneInfoMängijaleHalbSneakHeaEllujäämine();
    }
    public int esimenePeatükkHalbSneakHeaEllujäämine(List<String> asjad) throws IOException {
        try(FileWriter fw = new FileWriter("logid.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {

            Scanner info = new Scanner(System.in);
            String text = "Ärkad ülesse ja avastad, et oled keset turuplatsi! Jooked tänavate vahele, et mitte tähelepanu äratada. \n" +
                    "Saad aru, et oled keskaegsel raeplatsil, sa näed justkui tulnukas välja oma 21. sajandi riietega!\n Mõistad, et pead sisse sulanduma!";
            out.println("\nUus mäng: \n" + text);
            System.out.println( "\n" +text);
            while (true) {
                text = "Kas varastad kohalikke riideid müügiplatsilt või kummalise märgendiga raudrüü komplekti? (A, B)";
                System.out.println(text);
                String vastus = info.nextLine();
                if (vastus.equals("A") || vastus.equals("B")){
                    text = "Proovisid varastada, kuid jäid haledalt vahele! Sind ümbritsevad korrapidajad kes viivad su vangi!";
                    System.out.println(text);
                    out.println(text);
                    text = "Vangis sõbrustad kongikaaslastega, ühe Silveri nimelise poissmehega saad eriti hästi läbi!\nPeale õhtusööki lähevad kõik vangid välja, seal mõned mängivad mänge, mõned jutustavad.\n" +
                            "Ise aga jutustad Silveriga edasi. Kuulete kaugel hüüatust: \nOu sina tatikas seal, sina olid see kes käis minu venna kõrtsis laamendamas jah?\nNäed suurt meest oma rusikatega jooksmas Silveri poole.";
                    System.out.println(text);
                    out.println(text);
                    while (true){
                        text = "Kas ründad meest või kaitsed Silverit? (A, B)";
                        System.out.println(text);
                        vastus = info.nextLine();
                        if (vastus.equals("B")) {
                            text = "Kaitsemine õnnestus ja Silver ei saanud haiget. \nRusikatega vehklema tulnud mees nabiti kinni ja viidi ära korravalvurite poolt.\nSilver tänas sind ja lubas sulle kõrgema tiitli sõjakoolis, küsides täpsustusi said teada,\n" +
                                    "et homme lähevad kõik sõjakooli kuna käimas on sõda ja Silver on hoopiski kuninga sohilaps,\nsaad tema kaitsmise eest kõrgema auastme sõjakoolis koheselt!\nHommiku saabudes saadetigi kõik teele sõjakooli.";
                            System.out.println(text);
                            out.println(text);
                            text = "Edasi mängimiseks külasta meie veebilehte ja osta terve mäng!";
                            System.out.println(text);
                            return 1;
                        }else if (vastus.equals("A")) {
                            text = "Rünnak oli edukas ja lõid mehe maha! Edasi tegelesid korravalvurid mehega.\nSilver tänas sind ja te rääkisite edasi. Said temalt teada, et homme lähevad kõik mehed sõjakooli kuna käimas on sõda.\nHommiku saabudes lähevadki kõik sõjakooli, sina samuti.";
                            System.out.println(text);
                            out.println(text);
                            text = "Edasi mängimiseks külasta meie veebilehte ja osta terve mäng!";
                            System.out.println(text);
                            return 2;
                        } else
                            System.out.println("Sisestasid ebakorrektse vastuse.");
                    }
                } else
                    System.out.println("Sisestasid ebakorrektse vastuse.");
            }
        }
    }
}

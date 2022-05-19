package com.example.graafika;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeaSneakHalbEllujäämine {
    // sneak on hea ja ellujäämine on hea
    // 1 tähendab et on hea, 0 tähendab, et see on halb.


    public void esimeneInfoMängijaleHeaSneakHalbEllujäämine() throws IOException {
        List<String> asjad = new ArrayList<>();
        asjad.add("pehmed sussid");
        System.out.println("Tere! Oled jõudnud läbi portaali Maailma. Sul on hea hiilimise ja kehv ellujäämise oskus.");
        System.out.println("Avastad, et sul on kaasas " + asjad.toString());
        esimenePeatükkHeaSneakHalbEllujäämine(asjad);
    }

    public int esimenePeatükkHeaSneakHalbEllujäämine(List<String> asjad) throws IOException{
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
                if (vastus.equals("A")){
                    text = "Varastasid kohalikud riided ja saad vabalt kõndida igalpool ringi!\nUudistad ringi kuni leiad müüri kus läheduses valvavad korravalvurid.";
                    System.out.println(text);
                    out.println(text);
                    while (true){
                        text = "Kas proovid sisse hiilida või proovid üle müüri ronida? (A, B)";
                        System.out.println(text);
                        vastus = info.nextLine();
                        if (vastus.equals("A") || vastus.equals("B")){
                            text = "Sisenemine õnnestus! Leiad ennast suurest kindlusest, \nkus treenivad sinuealised mehed, sisse sulandumiseks hakkad trenni kiiresti kaasa tegema.\nPeale treeningu lõppu lähevad kõik sõõma, järgned neile ja teed järjekorras sõprugi!\n" +
                                    "Õhtul peale vabaaega hakkavad kõik sisse minema ja kaasa minnes saad aru, et oled vangis!\nEnam pole teed tagasi ja aksepteerid oma saatuse. Vangikongis jutustades saad teada, \net kõik sobivas vanuses mehed saadetakse homme sõjakooli kuna toimumas on sõda." +
                                    "\nÖö jooksul väga und ei saanud kuna oled ikka veel segaduses kuidas kõik juhtus.\nHommiku saabudes ajatakse varakult püsti ja rivistusse, kus sind valiti ka välja ja saadetakse sõjakooli!.";
                            System.out.println(text);
                            out.println(text);
                            text = "Edasi mängimiseks külasta meie veebilehte ja osta terve mäng!";
                            System.out.println(text);
                            return 1;
                        } else
                            System.out.println("Sisestasid ebakorrektse vastuse.");
                    }
                } else if (vastus.equals("B")) {
                    text = "Varastasid kummalise raudrüü ja panid selle selga. Kõndides tänavatel ringi saad aru, et sulandud hästi sisse \nja sind vaadatakse austavalt. Varsti aga leiad ennast müüri eest kus eemal on samas rüüs mehed.\n" +
                            "Proovid sisse minna, kuna arvad, et samasuguse rüüga ei tohiks sa tähelepanu äratada.\nVõtad julged sammud meeste poole. Saad nendest ilusasti mööda, kuid kuulud hüüatust ühe mehe suust: Hei, vana sa oled poisu?\n" +
                            "Pöörad ringi ja hoiad silmad maas vastates talle, et oled 25. Selle peale mees naerab ja käsib sul olla homme varahommikul platsis!\nLubades sul edasi minna lähed leiad esimese pingi kuhu istuda ja maha rahuneda.\nAga selleks hetkeks kui maha istud jookseb su juurde rüüs mees ja palub, et sa tema öise vahtuse endale võtaksid.\n" +
                            "Ehmatusest nõustud ja ta veab su endaga kaasa ja jätab su postile. Mis seal ikka passidki seal terve öö.\nHommiku saabudes oled väga unine, kuid sul tuleb meelde et pidid olema sissepääsu juures hommikul. \n" +
                            "Su juurde tuleb see sama mees ja annab tänutäheks kuldmündi sulle valve ülevõtmise eest.\nSelleks ajaks on kogunenud hulk mehi värava juurde ja lähed nendega kaasa.\nTeepeal saad aru et minnaks sõjakooli kuna toimumas on sõda!";
                    System.out.println(text);
                    out.println(text);
                    asjad.add("kuldmünt");
                    text = "Edasi mängimiseks külasta meie veebilehte ja osta terve mäng!";
                    System.out.println(text);
                    return 2;
                } else
                    System.out.println("Sisestasid ebakorrektse vastuse.");
            }
        }
    }
}

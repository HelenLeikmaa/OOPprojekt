import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HalbSneakHalbEllujäämine {
    public void esimeneInfoMängijaleHalbSneakHalbEllujäämine() throws IOException, ValeSisestusErind {
        List<String> asjad = new ArrayList<>();
        asjad.add("lömmis mustikas");
        System.out.println("Tere! Oled jõudnud läbi portaali Maailma. Sul on kehv hiilimise ja kehv ellujäämise oskus. See ei ole hea algus.");
        System.out.println("Avastad, et sul on kaasas " + asjad.toString());
        esimenePeatükkHalbSneakHaalbEllujäämine(asjad);
    }

    public int esimenePeatükkHalbSneakHaalbEllujäämine(List<String> asjad) throws IOException, ValeSisestusErind {
        try(FileWriter fw = new FileWriter("logid.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {

            Scanner info = new Scanner(System.in);
            //System.out.println("Leiad ennast keskaegsest raeplatsil. Sul võtab hetk aega, et pilt selgeks saada...");
            out.println("Sul on kehv hiilimise ja kehv ellujäämise oskus. See ei ole hea algus.");
            String text = "Leiad ennast keskaegsest raeplatsil. Sul võtab hetk aega, et pilt selgeks saada...\nKüsid iseendalt miks kõik vahivad mind?";
            System.out.println(text);
            out.println("\nUus mäng: \n" + text);
            while (true){
                System.out.println("Kas jooksed või jääd maha istuma? (A, B) ");
                String vastus = info.nextLine();
                if (vastus.equals("A")) {
                    text = "Jooksed raeplatsi keskel ära majade vahele peitu, saad aru et pead sisse sulanduma!";
                    System.out.println(text);
                    out.println(text);
                    while (true) {
                        System.out.println("Kas lähed ja proovid oma 21. sajandi riided maha müüa ja keskaegsed riided \nasemele osta või proovid varastada kuivavaid riideid? (A, B)");
                        vastus = info.nextLine();
                        if (vastus.equals("A")) {
                            text = "Lähed ja otsid esimese riideid müüva mehe. Kõnetad meest, kuid tema ehmub. \nProovid veenvalt müüa maha oma riideid talle, kuid see ei õnnestu ja lahkud kurvalt. " +
                                    "\nMinnes otsima järgmist müüat kuuled lähenemas hobuseid. \nSu õlale koputab korravalvur kes palub sinuga kaasa tulla!";
                            System.out.println(text);
                            out.println(text);
                            while (true) {
                                System.out.println("Kas otsustad joosta või lähed korravalvuriga kaasa? (A, B) ");
                                vastus = info.nextLine();
                                if (vastus.equals("A")) {
                                    text = "Paned liduma täiest jõust, kuid kukud pea kohe maha tagasi. \nMärkad, et paelad olid lahti jäänud kui müügimehele proovisid enda papusid maha müüa, " +
                                            "\nkuid ebaõnnestudes kurbusest unustasid paelad kinni siduda kurbusest. \nKorravalvurid saavad su kätte ja viivad su vangi. " +
                                            "\nTeepeal selgub et sinu kahtlase riietuse tõttu äratasid liiga palju tähelepanu ja sind raporteeriti korravalvuritele.";
                                    System.out.println(text);
                                    out.println(text);
                                    return 1;
                                } else if (vastus.equals("B")) {
                                    text = "Lähed korravalvuritega kaasa ja teepeal selgub et sinu kahtlase riietuse tõttu äratasid liiga palju tähelepanu ja \nsind raporteeriti korravalvuritele, sõidad vangi!";
                                    System.out.println(text);
                                    out.println(text);
                                    return 2;
                                } else {
                                    System.out.println("Sisestasid ebakorrektse vastuse");
                                }
                            }
                        } else if (vastus.equals("B")) {
                            text = "Leiad paar tänavat eemal nööripeal rippuvaid riideid, proovid neid napsata, kuid aknast oli märkand sind korravalvuri naine! " +
                                    "\nNäed lähenemas endale kahte korravalvurit hobustega!";
                            System.out.println(text);
                            out.println(text);
                            while (true) {
                                System.out.println("Kas jooksed või jääd paigale? (A, B)");
                                vastus = info.nextLine();
                                if (vastus.equals("A")) {
                                    text = "Paned liduma täiest jõust, kuid kukud pea kohe maha tagasi. " +
                                            "\nMärkad et vahepeal olid paelad lahti läinud ja olid nende tõttu maha kukkunud. " +
                                            "\nKorravalvurid saavad su kätte ja viivad su vangi.";
                                    System.out.println(text);
                                    out.println(text);
                                    return 3;
                                } else if (vastus.equals("B")) {
                                    text = "Lähed korravalvuritega kaasa ja sõidad vangi!";
                                    System.out.println(text);
                                    out.println(text);
                                    return 4;
                                } else
                                    System.out.println("Sisestasid ebakorrektse vastuse");
                            }
                        } else {
                            System.out.println("Sisestasid ebakorrektse vastuse");
                        }
                    }
                } else if (vastus.equals("B")) {
                    text = "Sinu juurde tulevad korravalvurid ja  lähed korravalvuritega kaasa, \nning teepeal selgub et sinu kahtlase riietuse tõttu äratasid liiga palju tähelepanu \nja sind raporteeriti korravalvuritele, sõidad vangi!";
                    System.out.println(text);
                    out.println(text);
                    return 5;
                } else {
                    //throw new ValeSisestusErind("Sisestasid ebakorrektse vastuse"); ei tööta nii nagu tahaksin
                    System.out.println("Sisestasid ebakorrektse vastuse");
                }
            }
        }
    }

}

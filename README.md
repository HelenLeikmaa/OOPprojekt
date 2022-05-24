# OOPprojekt
https://helenjapirjo.weebly.com/

Maria Malk (osales ka selles projektis:))
Helen Leikmaa
Pirjo Jõelo


Maria, Heleni ja Pirjo mäng

## Projekti  1. osa kirjeldus:

Programmi eesmärk on pakkuda kasutajale toredat seiklust alternatiivses maailmas.
Selleks loob ta endale etteantud valikute abil tegelase ja siseneb maailma.
Valida saab nime ning etteantud nimekirjast juustevärvuse ja riiete värvuse.
Väike easter egg on meil ka: kui mängija valib riiete värvuseks rebasemustri, või randomilt genereeritud tunkede värvuseks osutub rebane, siis muutub ta ise rebaseks.
Rebasel on üks kahest mängus olevast oskusest kohe alguses paigas (hiilimine e sneak = 8) ja seda mängija muuta ei saa,
lisaks on rebase kasuka värv automaatselt oranž.
Mitte-rebased saavad valida väärtused kahele oskusele: hiilimine ja ellujäämisoskus. Väärtused peavad jääma vahemikku 0 – 10.
Edasised sündmused kulgevad vastavalt valitule; kõik jõuavad eri teid mööda kas sõjakooli või hoopis õnnelikult metsa elama.

Mäng on intuitiivne ja kasutusjuhendit ei vaja.


### Klasside eesmärgid ja olulisemad meetodid:

TegelaseLoomine (e peaklass):
Vajalike andmete algväärtustamine.
Scanneri kasutamine, mängija valikute küsimine:
nimi, tunkede värv, sneak, ellujäämisoskus.
Tunkesid ja juuksevärvi on võimalik lasta randomilt valida.
Võimalik valida, et sneak ja ellujäämisoskus genereeritakse automaatselt.
Tunkede valiku põhjal minnakse edasi kas Rebase või TavaliseMängija klassi abil. Mõlemal juhul
väljastatakse mängijale tema profiil.

Mängija:
Siin klassis on konstruktor ühe parameetriga (nimi).
Lisaks on siin meetod toString kasutajanimega, mida kasutatakse hiljem klassis TegelaseLoomine,
et seal välja printida mängija informatsioon.

Välimus:
Siin genereeritakse suvaliselt mängija tunkede välimus ja/või juustevärv, juhul kui mängija on valinud võimaluse random.
Kui mängija oli juba valinud tunkede välimuse ja/või juustevärvi, siis tagastatakse mängija tehtud valik.

Skill:
Liides, mida kasutame selleks, et vastavalt vajadusele erinevate klasside ellujäämisoskust ja sneaki kasutada.

TavalineMängija:
Siin on konstruktor nelja parameetritega (jumpsuit, juuksed, sneak, ellujäämine).
Kasutatakse ülemklassi Mängija meetodit toString. Klass realiseerib liidest Skill.
Juhul, kui mängija oli valinud, et ei soovi ise oskuste taset määrata, genereeritakse siin sneak ja ellujäämisoskus.

Rebane:
Siin on konstruktor nelja parameetritega (jumpsuit, juuksed, sneak, ellujäämine).
Rebasel määratakse automaatselt sneaki väärtus (Sneak = 8) ja juustevärvus (oranž).
Kasutatakse ülemklassi Mängija meetodit toString ja realiseeritakse liidest Skill.
Ellujäämisoskus genereeritakse siin juhul, kui mängija oli valinud, et ei soovi ise oskuste taset määrata.

OskuseTasemed:
Siin klassis on konstruktor kahe parameetritega (ellujäämisoskus, sneak).
Meetodis misTase() määratakse oskustetaseme pakett sneaki ja ellujäämisoskuse väärtuse järgi.
Skillset1 = sneak >= 5 ja ellujäämisoskus >= 5.
Skillset2 = sneak < 5 ja ellujäämisoskus >= 5.
Skillset3 = sneak >= 5 ja ellujäämisoskus < 5.
Skillset4 = sneak < 5 ja ellujäämisoskus < 5.
Igale skillsetile vastab oma klass.
Skillset1 -> HeaSneakHeaEllujäämine
Skillset2 -> HeaSneakHablEllujäämine
Skillset3 -> HalbSneakHeaEllujäämine
Skillset4 -> HalbSneakHalbEllujäämine

Klassid HeaSneakHeaEllujäämine, HeaSneakHablEllujäämine,
HalbSneakHeaEllujäämine ja HalbSneakHalbEllujäämine:
Igas oskuste klassis on erinev tekst, mis mängijale maailma ja tema tegelase oskuste kohta väljastatakse.
Igas klassis on ka oma ArrayList esemetega, mille tegelane maailma kaasa saab.
Näiteks HalbSneaHeaEllujäämine annab kaasa kompassi.

TegevusEnneKooli:
Siin klassis hakkab arenema rühmatöö 2. etapp, ehk süžee.

### Protsessi kirjeldus
Idee tuli üsna kiiresti: kõigile meeldis mõte tekstipõhisest mängust ja arendasime
tulevase loo nii kaugele, et see täidab esimese ja teise rühmatöö mahu nii, et jääb ülegi.
Keeruline oli endale piiranguid seada, sest tahtsime lihtsalt nii palju teha:)

Programmi kirjutasime mitmekesi.
Selgroo ehitas Maria (kellega alguses kolmekesi pidime töö tegema) ja leppisime koos kokku,
milliseid klasse vaja võiks olla. Algul oli segane, kas kasutada liidest või abstraktset klassi,
lõpuks otsustasime liidese kasuks.

Helen ja Pirjo kirjutasid klassid vastavalt sellele, kellel rohkem aega oli ja millised klassid
omavahel loogiliselt kokku käisid (nt kõik hea-halva ellujäämis- ja sneakioskuse klassid tegi üks inimene).
README ehk projekti kirjelduse tegi Pirjo, selle vaatasime hiljem kolmekesi üle.
Töömaht jagunes umbes nii: Maria 2 t, Pirjo 5 t, Helen 7 t.

Tundsime puudust kellestki, kes kõrval istuks ja aitaks githubiga:P
Õnneks olid meile abiks Arlet Müristaja ja Andre Randmaa.
Heleni suur murekoht oli konstruktorite kasutamine klasside vahel liikumisel.
Pirjol oli probleeme merge'imiskonfliktidega.
Marial ei olnud ühte erilist valdkonda, mis oleks raskusi valmistanud.

Meil läks paremini, kui ootasime, sest meil olid inimesed, kellelt abi küsida, kui ise pusimine väga pikale läks.
Lootsime, et jõuame ka süžee esimese peatüki valmis, kuid see jäi ajapuudusel saavutamata. Läheme sellega järgmises
etapis edasi.
Praegu on paaris klassis sarnaseid koodijuppe, ilmselt saaks need mõne konstruktoriga kompaktsemaks teha.

Testisime kõiki loodud meetodeid klassis TegelaseLoomine. Selleks proovisime kombinatsioone etteantud valikutest, katsetasime
randomit ja erinevaid kombinatsioone oskustest, samuti easter eggi. Veateateid saime töö käigus üksjagu, nüüdseks
on need kõik kõrvaldatud ja programm töötab:)


## Projekti 2. osa kirjeldus

Jätkasime sama projektiga (mis oli graafika seisukohalt traagiline möödalaskmine).
Esimeses osas kirjeldatust me midagi ei eemaldanud, küll aga lisasime sellele juurde!
Mis siis lisandus?

Juurde tuli mitte töötav erindiklass, logifail ja meetodid, kus toimub loo printimine.

Klass Aken:
kohutav, *kohutav* kasutajaliides, mille eesmärk on näidata, et oskame akent luua, 
nuppusid lisada ja sündmusi luua. Sisulist seost mängu endaga ei ole, sest ei jäänud 
aega olemasolevate klasside sidumiseks kasutajaliidesest saadud infoga.



### Protsessi kirjeldus 

Mida ja kui kaua tegi Pirjo?
Teksti sisuga ja logidega tegeles Pirjo. Aega kulus umbes 7 tundi.

Mida ja kui kaua tegi Helen?
Klass Aken ja erind TühiSisendErind on minu kätetöö. Aega kulus umbes 10 tundi, sest 
graafika loomine osutus oluliselt keerukamaks, kui arvasin. 

Mis muret valmistas?
Heleni süda muutus murest raskeks, sest taustapildi saamine VBoxidele ei õnnestunudki. 
Vähe sellest: ma ei jõudnud graafikat ja varasemalt loodud klasside sisu siduda. Väga-väga kurb.
Pirjo: kajuks ei saanud erindeid tööle kuid programm teeb seda mida tahan, visuaalselt vähemalt. 
Loovusest jäi vahel puudu kirjutades sisu

Mis me lõpptulemusest arvame?
Projekt vajab arendamist. Praegu päästab see, et *storyline* on põnev ja lugu on humoorikalt 
kirja pandud. Selle osaga oleme väga rahul:)
Küll jõuame ka uute peatükkideni! Helen plaanib suvel mängu edasi arendada:) 

Kuidas testisime?
Mängisime mitu korda läbi ja kõik toimis:)

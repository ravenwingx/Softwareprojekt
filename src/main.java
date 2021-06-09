import java.util.ArrayList;

public class main {

    /*
    gucken, ob wir eine CSV Datei haben
    dann:
        CSV Datei einlesen
    sonst:
        gucken ob wir eine txt Datei haben
        dann:
            txt Datei einlesen
            sonst:
                Fehlermeldung
     */

    public static void main(String[] args) {
        /*
        CSVinput w = new CSVinput();
        w.read();
        NWA analyse = new NWA();
        analyse.nutzwertMultiply(w.getDates());
*/

        fileChoice f = new fileChoice();
        if(f.getEnd().equals("csv")){
            System.out.println("CSV");
            CSVinput w = new CSVinput(f.getPath());
            w.read();
            NWA analyse = new NWA();
            analyse.nutzwertMultiply(w.getDates());
        }else if(f.getEnd().equals("txt")){
            System.out.println("TXT");
            TXTinput w = new TXTinput(f.getPath());
            w.read();
        }else{
            System.out.println("HERBERT Dieses Dateiformat ist nicht gültig");
        }


    }
}

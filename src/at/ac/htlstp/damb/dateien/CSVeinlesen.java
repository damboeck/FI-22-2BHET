package at.ac.htlstp.damb.dateien;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class CSVeinlesen {

    public static final String filename = "data/RC_Glied.CSV";

    public static void main(String[] args) {
        File file = new File(filename);
        try {
            List<String> data = Files.readAllLines(file.toPath());
            String firstline = data.get(0);
            String[] spalten = firstline.split(",");
            System.out.println(Arrays.toString(spalten));
            // Suche den Datenbereich
            int startdata=-1;
            for (int i=data.size()-1;i>0;i--)
                if (data.get(i).trim().length()>0 &&
                    !data.get(i).startsWith(",,,")) {
                    startdata = i+1;
                    i=0; // oder break
                }
            System.out.println("Datenbereich ab Zeile "+(startdata+1));
            String sb1 = data.get(0).split(",")[1];
            double b1 = Double.parseDouble(sb1);
            System.out.printf("b1 = %f\n",b1);
            Vector<Double> t = new Vector<>();
            Vector<Double> u = new Vector<>();
            for (int i=startdata;i<data.size();i++) {
                if (data.get(i).trim().length()>0) {
                    try {
                        double at = Double.parseDouble(data.get(i).split(",")[3]);
                        double au = Double.parseDouble(data.get(i).split(",")[4]);
                        t.add(at);
                        u.add(au);
                    } catch (Exception e) {
                        System.out.println("Fehler in Zeile "+(i+1)+" -> wird ignoriert.");
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Datei "+filename+" kann nicht gelesen werden!");
        }

    }

}

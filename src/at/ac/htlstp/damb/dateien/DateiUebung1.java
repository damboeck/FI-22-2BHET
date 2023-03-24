package at.ac.htlstp.damb.dateien;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class DateiUebung1 {

    public static void main(String[] args) throws IOException {
        File verzeichnis = new File("data");
        if (!verzeichnis.exists()) verzeichnis.mkdirs();

        File file = new File("data/test.txt");
        if (!file.exists()) file.createNewFile();

        if (file.exists()) System.out.println("Datei existiert");
        else               System.out.println("Datei fehlt");

        List<String> data = Files.readAllLines(file.toPath());

        for (String line:data) {
            System.out.println(line);
        }

        // Änderungen
        data.add(0,"Neue erste Zeile!");
        data.add("Neue letzte Zeile");

        File outfile = new File("data/test1.txt");
        Files.write(outfile.toPath(), data);
    }
}

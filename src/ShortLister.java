import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import static java.nio.file.StandardOpenOption.CREATE;

public class ShortLister {
    public static void main(String[] args) {
        ShortWordFilter swf = new ShortWordFilter();

        JFileChooser chooser = new JFileChooser();
        File selectedFile;
        String record = "";

        try {
            File workingDirectory = new File(System.getProperty("user.dir"));
            chooser.setCurrentDirectory(workingDirectory);
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                selectedFile = chooser.getSelectedFile();

                Path file = selectedFile.toPath();

                InputStream in = new BufferedInputStream(Files.newInputStream(file, CREATE));

                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                ArrayList<String> shortWords = new ArrayList<String>();
                int line = 0;
                while (reader.ready()) {
                    record = reader.readLine();
                    String[] recordArray = record.split(",");
                    for (String s : recordArray) {
                        if (swf.accept(s)) {
                            shortWords.add(s);
                        }
                    }
                    line++;
                }

                CollectClass.collectAllWord(shortWords);
            }

        } catch (FileNotFoundException e) {

        } catch(IOException e) {

        }

    }
}
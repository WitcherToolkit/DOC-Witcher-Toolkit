package fr.meya.DOCWitcherToolkit;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;

public class IncludeMenu {
    private static final String MENU_FILE = "menu.md"; // Change the path if necessary

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java IncludeMenu file1.md file2.md ...");
            System.exit(1);
        }

        try {
            Path menuPath = Paths.get(MENU_FILE);
            if (!Files.exists(menuPath)) {
                System.err.println("Le fichier menu.md n'existe pas : " + MENU_FILE);
                System.exit(1);
            }

            List<String> menuContent = Files.readAllLines(menuPath, StandardCharsets.UTF_8);

            for (String filePath : args) {
                Path path = Paths.get(filePath);
                if (!Files.exists(path)) {
                    System.err.println("Le fichier " + filePath + " n'existe pas.");
                    continue;
                }

                includeMenuAtStart(filePath, menuContent);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void includeMenuAtStart(String filePath, List<String> menuContent) throws IOException {
        List<String> fileContent = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
        fileContent.addAll(0, menuContent);

        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(filePath), StandardCharsets.UTF_8)) {
            for (String line : fileContent) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}
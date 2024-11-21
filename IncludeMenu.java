import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class IncludeMenu {

    private static final String MENU_FILE = "menu.md";

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java IncludeMenu <file_path1> <file_path2> ... <file_pathN>");
            System.exit(1);
        }

        try {
            List<String> menuContent = Files.readAllLines(Paths.get(MENU_FILE));
            for (String filePath : args) {
                includeMenuAtStart(filePath, menuContent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void includeMenuAtStart(String filePath, List<String> menuContent) throws IOException {
        List<String> fileContent = Files.readAllLines(Paths.get(filePath));
        fileContent.addAll(0, menuContent);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : fileContent) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}
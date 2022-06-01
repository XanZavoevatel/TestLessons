import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Fils {
    public static void main(String[] args) throws IOException {

        String pathFile = "src//main//resources//text2.txt";
        Path path = Paths.get(pathFile);
     //   Files.copy(path, Path.of("/home/boris/Programs/JavaProjects/TestLessons/src/main/resources/text/text2.txt"));
    //    Files.createDirectory(Path.of("/home/boris/Programs/JavaProjects/TestLessons/src/main/resources/text/"));
//        System.out.println(Files.exists(path));
//        System.out.println(Files.size(path));
//        System.out.println(Files.readString(path));
//        System.out.println(Files.readAllLines(path));
        if (Files.isRegularFile(path)) {
            System.out.println("Есть такой файл");
        } else {
            System.out.println("Нет такого файла");
        }
    }
}

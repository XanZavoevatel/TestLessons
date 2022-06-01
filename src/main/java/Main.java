import java.io.*;
import java.nio.file.Path;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String pathFile = "/home/boris/Programs/JavaProjects/TestLessons/src/main/resources/Text";
        String message = "1234567";
        Path path = Path.of(pathFile);
        Path path1 = Path.of("/home/boris");

        System.out.println(path.isAbsolute());
        System.out.println(path.toAbsolutePath());
        System.out.println(path.startsWith(path1));
        System.out.println(path.getNameCount());
        System.out.println(path.subpath(0, 9));
        System.out.println(path.subpath(0, 8));
    }
}

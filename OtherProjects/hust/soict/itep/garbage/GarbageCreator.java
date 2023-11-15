package OtherProjects.hust.soict.itep.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class GarbageCreator {
    public static void main(String[] args) throws IOException {
        Random r = new Random(123);
        Path path = Paths.get("/Users/macbookair/oopLabNote.txt");
        byte[] inputBytes = Files.readAllBytes(path);
        long start = System.currentTimeMillis();
        String s = "";
        for (byte b : inputBytes) {
            s += (char)b;
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}

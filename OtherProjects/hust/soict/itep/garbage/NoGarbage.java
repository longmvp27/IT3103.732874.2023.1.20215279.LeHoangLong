package OtherProjects.hust.soict.itep.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class NoGarbage {
    public static void main(String[] args) throws IOException {
        Random r = new Random(123);
        long start = System.currentTimeMillis();
        Path path = Paths.get("/Users/macbookair/oopLabNote.txt");
        byte[] inputBytes = Files.readAllBytes(path);
        String s = "";
        StringBuilder outputStringBuilder = new StringBuilder(s);
        for (byte b : inputBytes) {
            outputStringBuilder.append((char)b);
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}

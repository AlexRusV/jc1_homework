package Files;

import java.io.File;
import java.util.Objects;

public class Task_46 {
    public static void main(String[] args) {
        File file = new File("C://Program Files");
        if (file.isDirectory()) {
            for (File object : Objects.requireNonNull(file.listFiles())){
                if (object.isDirectory()){
                    System.out.println(object.getName() + "  -  folder");
                }
                else {
                    System.out.println(object.getName() + "  -  file");
                }
            }
        }
    }
}

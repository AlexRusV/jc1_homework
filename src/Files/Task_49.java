package Files;

import java.io.*;

public class Task_49 {
    public static void main(String[] args) throws IOException {
        {
            DataOutputStream a;
            try {
                a = new DataOutputStream (new BufferedOutputStream (new FileOutputStream("D:/NEW/text.txt")));
            } catch (FileNotFoundException e) {
                System.out.print("File Not Found");
                return;
            }
            for (int i = 0; i < 21; i++) {
                a.writeInt(i * 10);
            }
            a.close();
            System.out.println(a);
        }
    }
}


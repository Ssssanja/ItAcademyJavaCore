package part11;

import java.io.*;

public class Task49 {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/main/java/part11/api/Data.txt");
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(file));){
            for (int i = 1; i<=20; i++){
                out.writeInt((int)(Math.random()*20));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        DataInputStream dataInputStream = null;
        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }
        int sum = 0;
        System.out.println("Числа из двоичного файла:");
        int i = dataInputStream.readInt();
        while (true){
            System.out.println(i);
            try {
                i = dataInputStream.readInt();
                sum+=i;
            }
            catch (EOFException e){
                break;
            }
        }
        System.out.println("Их среднее арифметическое равно " + (double) sum/20.00);
        if (dataInputStream!=null){
            dataInputStream.close();
        }
    }
}

package part11;

import java.io.*;

public class Task50 {
    public static void main(String[] args) throws IOException {
        String s = "./src/main/java/part11/api/one";

        File dir = new File(s);
        boolean b = dir.mkdir();

        s+= "/two";
        dir = new File(s);
        b = dir.mkdir();

        s+= "/three";
        dir = new File(s);
        b = dir.mkdir();
        FilenameFilter filter = (dirr, name) -> name.startsWith("File");
        File[]list = dir.listFiles(filter);

        createAndFillFiveFiles(s + "/File");
        File sumOfFiles = new File(s + "/SumOfFiles.txt");
        File namesOfFiles = new File(s + "/NamesOfFilesofThisDir.txt");
        b = sumOfFiles.createNewFile();
        saveContentOfFiles(list, sumOfFiles);
        updateListOfFilesInThisDir(dir, namesOfFiles);


    }

    private static void updateListOfFilesInThisDir(File dir, File namesOfFiles) throws IOException {
        File[]list1 = dir.listFiles();
        writeStringInFile(namesOfFiles, "", false);
        for (File f : list1){
            writeStringInFile(namesOfFiles, f.getCanonicalPath() + "\n", true);
        }
    }

    private static void saveContentOfFiles(File[] list, File sumOfFiles) throws IOException {
        writeStringInFile(sumOfFiles, "", false);

        for (File f : list){
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(f));) {
                StringBuilder sb = new StringBuilder();
                String x;
                while ((x = bufferedReader.readLine()) != null) {
                    sb.append(x);
                }
                sb.append("\n");
                writeStringInFile(sumOfFiles, sb.toString(), true);
                }catch (FileNotFoundException e){
                System.out.println("File not Found");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void createAndFillFiveFiles(String standartFileName) throws IOException {
        boolean b;
        for (int i = 1; i<=5; i++){
            String filename = standartFileName + i + ".txt";
            File f = new File(filename);
            b = f.createNewFile();
            String ints = "";
            for (int j = 0; j<10; j++){
                ints += ((int) (Math.random()*20 + 1)) + " ";
            }
            writeStringInFile(f, ints, false);
        }
    }

    private static void writeStringInFile(File f, String ints, boolean append) throws IOException {
        FileWriter fileWriter;
        fileWriter = new FileWriter(f, append);
        fileWriter.write(ints);
        fileWriter.flush();
    }
}

package com.muskan.spring.basics.springpractice;

        import java.io.BufferedReader;
        import java.io.File;
        import java.io.IOException;
        import java.nio.file.DirectoryStream;
        import java.nio.file.Files;
        import java.nio.file.Path;
        import java.nio.file.Paths;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.Map;
        import java.util.TreeMap;

public class FileReadTest {

    private static final String FOLDER_PATH = "D:\\Muskan\\PET";

 /*   public static void fileRead() {
        Path folderPath = Paths.get(FOLDER_PATH);

        // prepare a data structure for a file's name and content
        Map<String, List<String>> linesOfFiles = new TreeMap<String, List<String>>();

        // retrieve a list of the files in the folder
        List<String> fileNames = new ArrayList<>();
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(folderPath)) {
            for (Path path : directoryStream) {
                fileNames.add(path.toString());
            }
        } catch (IOException ex) {
            System.err.println("Error reading files");
            ex.printStackTrace();
        }

        // go through the list of files
        for (String file : fileNames) {
            try {
                // put the file's name and its content into the data structure
                List<String> lines = Files.readAllLines(folderPath.resolve(file));
                linesOfFiles.put(file, lines);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // finally, print everything
        linesOfFiles.forEach((String fileName, List<String> lines) -> {
            System.out.println("Content of " + fileName + " is:");
            lines.forEach((String line) -> {
                System.out.println(line);
            });
            System.out.println("————————————————————————————————");
        });
    }*/

    public static void fileRead(){
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = Files.newBufferedReader(Paths.get("D:\\Muskan\\PET\\Biograph 16 Truepoints\\ACSMonitorNlsMessageId.mc"))) {

            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        System.out.println(sb);
    }

    public void listFilesAndFilesSubDirectories(String directoryName){
        File directory = new File(directoryName);
        //get all the files from a directory
        File[] fList = directory.listFiles();
        for (File file : fList){
            if (file.isFile()){
                System.out.println(file.getAbsolutePath());
            } else if (file.isDirectory()){
                listFilesAndFilesSubDirectories(file.getAbsolutePath());
            }
        }
    }

}



import java.io.*;

public class FileUtils {

    private static final String NOTES_PATH = "./notes/";

    //It's a static initializer. It's executed when the class is loaded.
    //It's similar to constructor
    static {
        boolean isSuccessful = new File(NOTES_PATH).mkdirs();
        System.out.println("Creating " + NOTES_PATH + " directory is successful: " + isSuccessful);
    }

    public static File[] getFilesInDirectory() {
        return new File(NOTES_PATH).listFiles();
    }


    public static StringBuilder fileReader(File file) {
        StringBuilder content = new StringBuilder();
        try {
            BufferedReader reader = null;
            try {

                reader = new BufferedReader(new FileReader(file));
                String line = "";



                while ((line = reader.readLine() )!= null){
                    content.append(line);
                    System.out.println("content"+content);
                }




            } catch (FileNotFoundException e) {

                e.printStackTrace(System.err);
            }
        } catch (IOException e) {
            e.printStackTrace(System.err);

        }
        return content; }


    public static void fileWriter(String content) {
        BufferedWriter writer = null;
        try{
            String fileName = getProperFileName(content);
            File file = new File(NOTES_PATH+fileName);
            writer = new BufferedWriter(new FileWriter(file));}
        catch(IOException e){e.printStackTrace(System.err);}
        try{
            writer.write(content);
            writer.close();}
        catch(IOException e){
            e.printStackTrace(System.err);
        }
    }

    //TODO: Phase1: define method here for reading file with InputStream
    //TODO: Phase1: define method here for writing file with OutputStream

    //TODO: Phase2: proper methods for handling serialization

    private static String getProperFileName(String content) {
        int loc = content.indexOf("\n");
        if (loc != -1) {
            return content.substring(0, loc);
        }
        if (!content.isEmpty()) {
            return content;
        }
        return System.currentTimeMillis() + "_new file.txt";
    }
}

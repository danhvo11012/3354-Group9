import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class EBook {
    String fileDirectory;
    long currentFilePos;

    public EBook(String fileDirectory) {
        this.fileDirectory = fileDirectory;
        currentFilePos = 0;
    }

    public String openBook(long filePos, int amount){
        try {
            FileReader reader = new FileReader(fileDirectory);
            StringBuilder buffer = new StringBuilder(amount);
            this.currentFilePos = filePos;
            long numSkipped = reader.skip(filePos);
            char[] buff = new char[amount];
            int numRead = reader.read(buff, 0, buff.length);

            for (int i = 0; i < numRead; i++){
                buffer.append(buff[i]);
            }

            reader.close();
            return buffer.toString();
        }catch (FileNotFoundException e){
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }




}

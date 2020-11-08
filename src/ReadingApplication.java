import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class ReadingApplication {
    static Vector<EBook> bookList = new Vector<>();

    public static void addBook(String fileName){
        try {
            FileReader reader = new FileReader(fileName);
            EBook eBook = new EBook(fileName);
            bookList.add(eBook);
            reader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

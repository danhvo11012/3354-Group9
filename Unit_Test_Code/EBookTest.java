import static org.junit.jupiter.api.Assertions.*;

class EBookTest {

    @org.junit.jupiter.api.Test
    void openBookSuccess() {
        String fileName = "TestInput.txt";
        int startingPos = 0, amount = 25;
        EBook testBook = new EBook(fileName);
        String actual = testBook.openBook(startingPos, amount),
                expected = "The quick brown fox jumps",
                msg = String.format("Now printing the %d characters after file byte position %d:\n\t'%s'\n",
                        amount, startingPos, actual);
        assertEquals(expected, actual, msg);
        System.out.println(msg);
        System.out.printf("\tExpected: '%s'\n\tActual: '%s'", expected, actual);
    }

    @org.junit.jupiter.api.Test
    void openBookFail() {
        String fileName = "TestInput.txt";
        int startingPos = 0, amount = 20;
        EBook testBook = new EBook(fileName);
        String actual = testBook.openBook(startingPos, amount),
                expected = "The quick brown fox jumps",
                msg = String.format("Now printing the %d characters after file byte position %d:\n\t'%s'\n",
                        amount, startingPos, actual);
        assertEquals(expected, actual, msg);
        System.out.println(msg);
    }
}
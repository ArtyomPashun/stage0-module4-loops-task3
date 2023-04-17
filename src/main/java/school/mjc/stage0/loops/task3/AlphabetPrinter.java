package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        final int A_SYMBOL_ASCII_TABLE = 97;
        final int Z_SYMBOL_ASCII_TABLE = 122;
        for (int i = A_SYMBOL_ASCII_TABLE; i <= Z_SYMBOL_ASCII_TABLE; i++) {
            char result = (char) i;
            System.out.println(result);
        }
    }
}

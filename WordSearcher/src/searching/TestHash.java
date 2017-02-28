package searching;
import datastructures.ArraySymbolTable;
import java.io.IOException;
import java.util.Arrays;
import wordsorter.LoadTextFile;

public class TestHash {
    public static void main(String[] args) throws IOException {
        LoadTextFile TF =new LoadTextFile();
        String[] allShake = TF.loadText();
        
        String[] subShake = Arrays.copyOfRange(allShake, 0, 100000);
        
        ArraySymbolTable lst = new ArraySymbolTable();
        
        for (String string : subShake){
            lst.put(string, 1);
        }
        
        for (String string : lst.keys()){
            System.out.println(string + " : " + lst.get(string));
        }
    }
}
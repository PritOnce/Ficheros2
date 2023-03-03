import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("datos.txt"); BufferedReader bf = new BufferedReader(fr)){
            String leer;

            while((leer = bf.readLine()) !=null){
                System.out.println(leer);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
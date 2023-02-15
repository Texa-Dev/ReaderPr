package pack;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        String file = "C:\\Users\\User\\IdeaProjects\\WriterPr\\setting.txt";
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file)))
        {
            Settings set = (Settings) ois.readObject();

                System.out.println(set);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}
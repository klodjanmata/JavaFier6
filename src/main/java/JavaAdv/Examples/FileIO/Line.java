package JavaAdv.Examples.FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;

public class Line {

    public static final List<String> poezi = Arrays.asList(
            "Natën yjet flasin heshtur,",
            "Hënën shoqërojnë pa fjalë,",
            "Drita tyre, ndriçon rrugën,",
            "Ëndrra sjellin ngadalë.",
            "\n",
            "Secili yll ka historinë,",
            "Një sekret që s'e tregon,",
            "Qielli blu i ruan brenda,",
            "Me mister na magjepson.",
            "\n",
            "Dhe kur nata të largohet,",
            "Dielli ngrohtë do na zgjojë,",
            "Yjet prapë do presin natën,",
            "Që me dritë të na mbulojnë."
    );

    public static void main(String[] args) {
        //printPoesy();
        writePoesyToFile();
    }


    public static void writePoesyToFile(){
        String filePath = "Files/PoeziOutput.txt";
        System.out.println("Trying to write poesy to file");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))){
            for (String line : poezi){
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            System.out.println("Poesy written to file");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void printPoesy(){
        String filePath = "Files/Poezi.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while ( (line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

import java.util.Random;
import java.io.*;
import java.util.Scanner;

public class TestingConfigGen {
    public static void main(String[] args) throws IOException{
        Random rd = new Random();
        File inFile = new File("weeds_train.txt");
        Scanner inScan = new Scanner(inFile);
        BufferedWriter out = new BufferedWriter(new FileWriter("weeds_test.txt"));
        BufferedWriter outLines = new BufferedWriter(new FileWriter("weeds_lines.txt"));
        // if this doesn't work, just set numTrain to amount of images in Images directory
        int numTrain = new File("./Images").list().length-1;
        int numVal = (int)(numTrain*0.2);

        for(int i=0; i<numVal; i++) {
            int line = rd.nextInt(numTrain)+1;
            for(int j=1; j<line; j++) {
                System.out.println(j);
                inScan.nextLine();
            }
            outLines.write(line);
            out.write(inScan.nextLine() + "\n");
            inScan = new Scanner(inFile);
        }
        out.close();
        outLines.close();
    }
}

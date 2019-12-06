import java.io.*;
public class TrainingConfigGen {
    public static void main(String[] args) throws IOException{
        File folder = new File("./Images");
        PrintWriter out = new PrintWriter("weeds_train.txt");
        File[] fileList = folder.listFiles();
        String[] namesList = new String[fileList.length];
        for(int i=0; i< fileList.length; i++) {
            if(fileList[i].isFile()) {
                namesList[i] = "Weeds/" + fileList[i].getName();
                System.out.println("Weeds/" + fileList[i].getName());
            }
        }

        for(String s: namesList) {
            out.write(s + "\n");
        }

        out.close();
    }
}

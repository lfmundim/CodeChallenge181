import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public CodeChallenge {
  public static void main(String[] args) {
    try {
      BufferedReader in = new BufferedReader(new FileReader("./arquivos-exemplo/brinquedos.csv"));
      String read = in.readLine();
      while(read != null){
        String[] tokens = read.split(";");
        
        read = in.readLine();
      }
      in.close();
    }
    catch(IOException e) {
      System.out.println(e);
    }
  }
}

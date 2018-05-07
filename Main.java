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
        Toy toy = new Toy();
        toy.SetId(Integer.parseInt(tokens[0]));
        toy.SetName(tokens[1]);
        toy.SetCost(Float.parseFloat(tokens[2]));
        toy.SetManufacturer(tokens[3]);
        toy.SetMinAge(Integer.parseInt(tokens[4]));
        read = in.readLine();
      }
      in.close();
    }
    catch(IOException e) {
      System.out.println(e);
    }
  }
}

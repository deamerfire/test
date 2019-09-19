
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Resquence {
  public static void main(String [] args)
  {
    Object [] VertexId = null;
    try
    {
      FileInputStream fileIn = new FileInputStream("/home/wuqiong8/Code_janus/ImportData/vertexId.ser");
      ObjectInputStream in = new ObjectInputStream(fileIn);
      VertexId = (Object[]) in.readObject();

      in.close();
      fileIn.close();
    }catch(IOException i)
    {
      i.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    if (VertexId == null)
      throw new AssertionError();
    for(int i=0;i<10;++i){
      
      System.out.println(VertexId[i]);
    }

  }
}

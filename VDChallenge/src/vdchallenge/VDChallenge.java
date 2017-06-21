package vdchallenge;
import org.codehaus.jackson.map.*;
import org.codehaus.jackson.*;
import java.io.File;
import java.math.BigInteger;

public class VDChallenge {
  public static void main(String[] args) throws Exception {
    long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
    
    String pathToJSONfile = "test.json";
    JsonFactory f = new MappingJsonFactory();
    JsonParser jp = f.createJsonParser(new File(pathToJSONfile));
    BigInteger bi = new BigInteger("1");
    BigInteger bi2;        
        while (jp.nextToken() != JsonToken.END_ARRAY) {
            if (jp.nextToken() != JsonToken.END_ARRAY) {
               System.out.println("**RECORD: "+bi+"**");
               bi2 = BigInteger.ONE; 
              while (jp.nextToken() == JsonToken.VALUE_STRING) {   
                JsonNode node = jp.readValueAsTree();
                System.out.print("Attribute: "+bi2+" "+node+" ");
                bi2=bi2.add(BigInteger.ONE); 
              }
              bi = bi.add(BigInteger.ONE);
              System.out.println("");
              System.out.println("");
            } else {
              System.out.println("Error: records should be an array: skipping.");
              jp.skipChildren();
            }
        }
        long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        long actualMemUsed=afterUsedMem-beforeUsedMem;
        System.out.println(actualMemUsed/10000000+" MB");
  }
}

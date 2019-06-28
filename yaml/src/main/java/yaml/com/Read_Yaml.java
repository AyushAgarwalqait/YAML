package yaml.com;


import java.io.*;
//import java.util.HashMap;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;


public class Read_Yaml 
{
    public static void main( String[] args ) throws FileNotFoundException
    {
        
        FileReader fr = new FileReader("src/test/resources/start.yaml");
       // Map map = new HashMap();
        Yaml yaml = new Yaml();
        Map<String,Map<String,String>> obj=yaml.load(fr);
        //System.out.println(obj.get("student").get("name"));
        System.out.println("Data   " + obj);
        //System.out.println("key  " + obj.get("student"));
        
    }
}

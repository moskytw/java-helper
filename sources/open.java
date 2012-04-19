package mosky;

import java.io.*;
import java.util.*;

public class open {

    static public BufferedReader r(String path)
        throws FileNotFoundException
    {
        return new BufferedReader( new FileReader( new File(path) ) );
    }

    static public void w(String path, String[] lines)
        throws IOException
    {
        BufferedWriter bwriter = new BufferedWriter( new FileWriter( new File(path) ) );
        for(String line : lines)
        {
            bwriter.write(line);
            bwriter.newLine();
        }
        bwriter.close();
    }

    static public List<String[]> rcsv(String path, String sepregex)
        throws FileNotFoundException, IOException
    {
        BufferedReader breader = open.r(path);

        List<String[]> list = new ArrayList<String[]>();

        while(true)
        {
            String line = breader.readLine();
            if(line == null) break;
            list.add( line.split(sepregex) );
        }

        return list;
    }
}

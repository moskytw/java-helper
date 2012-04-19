package mosky;

import java.io.*;
import java.util.*;

public class open {

    static public BufferedReader reader(String path)
        throws FileNotFoundException
    {
        return new BufferedReader( new FileReader( new File(path) ) );
    }

    static public List<String> r(String path)
        throws FileNotFoundException, IOException
    {
        // Implement Iterable and Iterator are better than using List and reading
        // all of the file into List (here).

        BufferedReader breader = open.reader(path);
        List<String> lines = new ArrayList<String>();

        while(true)
        {
            String line = breader.readLine();
            if(line == null) break;
            lines.add(line);
        }

        return lines;
    }

    static public void show(String path)
        throws FileNotFoundException, IOException
    {
        List<String> lines = open.r(path);
        for(String line : lines)
            System.out.println(line);
    }

    static public List<String[]> rcsv(String path, String sepregex)
        throws FileNotFoundException, IOException
    {
        List<String> lines = open.r(path);
        List<String[]> list = new ArrayList<String[]>();

        for(String line : lines)
            list.add( line.split(sepregex) );

        return list;
    }

    static public BufferedWriter writer(String path)
        throws IOException
    {
        return new BufferedWriter( new FileWriter( new File(path) ) );
    }

    static public void w(String path, String[] lines)
        throws IOException
    {
        BufferedWriter bwriter = open.writer(path);
        for(String line : lines)
        {
            bwriter.write(line);
            bwriter.newLine();
        }
        bwriter.close();
    }
}

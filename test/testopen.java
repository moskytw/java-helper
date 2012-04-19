import mosky.open;

import java.io.*;
import java.util.*;

public class testopen {

    public static void main(String[] args)
        throws IOException
    {
        String[] lines = {"Hello", "World"};
        open.w("../data/testopen.txt", lines);
        
        BufferedReader breader = open.r("../data/testopen.txt");

        while(true)
        {
            String line = breader.readLine();
            if(line == null) break;
            System.out.println(line);
        }

        System.out.println("");

        List<String[]> list = open.rcsv("../data/input.csv", ",");

        for(String[] items : list)
        {
            for(String item : items)
            {
                System.out.print(item + " ");
            }
        }
        System.out.println("");
    }
}

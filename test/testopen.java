import mosky.open;

import java.io.*;
import java.util.*;

public class testopen {

    public static void main(String[] args)
        throws IOException
    {
        open.w(
            "data/testopen.txt",
            new String[]{"Hello", "World"}
        );
        
        open.show("data/testopen.txt");
        System.out.println("");

        List<String> lines = open.r("data/testopen.txt");
        for(String line : lines)
            System.out.println(line);
        System.out.println("");

        List<String[]> list = open.rcsv("data/input.csv", ",");

        for(String[] items : list)
        {
            for(String item : items)
                System.out.print(item + " ");

            System.out.println("");
        }
        System.out.println("");
    }
}

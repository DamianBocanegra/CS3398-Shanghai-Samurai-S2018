package com.example.puppetmaster123.devlop_browse;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by puppetmaster123 on 4/2/2018.
 */

public class AlgorithmBrowser {

public ArrayList<Algorithms> loadAlgorithms(){
    {
        ArrayList <Algorithms> Algo = new ArrayList<Algorithms>();

        String file = "devlop_browse/AlgoCat.txt";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ":";

        try
        {

            br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null)
            {

                // use comma as separator
                String[] entry = line.split(cvsSplitBy);
                Algorithms newAlgo= new Algorithms(entry[1], entry[2]);

                Algo.add(newAlgo);

            }

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (br != null)
            {
                try
                {
                    br.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }



        return Algo;

    }



}

}

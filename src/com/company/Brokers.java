package com.company;

import java.io.*;
import java.util.ArrayList;

public class Brokers extends Thread implements Serializable {

    private static ArrayList<String>  listOfBrokers = new ArrayList<>();

    public static void main(String [] args) throws IOException {

        listOfBrokers = initializeBrokers("C:\\kafka\\run.bat");
        for(int i = 0; i<=10; i ++) {
            System.out.println(listOfBrokers.get(i));

        }
    }


    public static ArrayList<String> initializeBrokers(String path) throws IOException {
        //System.out.println("se");
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String st = br.readLine();
        String[] info = st.split(" ");

        System.out.println();

        ArrayList <String> brokers = new ArrayList<>();
        for (int i = 0; i < info.length; i++){
            brokers.add(info[i]);
            //System.out.println(i);
        }
        br.close();
        fr.close();
        return brokers;
    }

}
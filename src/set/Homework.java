package set;

import polymorph.B;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class Homework {
    public static void main(String[] args) {
        Set<String> names;
        names = readFile("names.txt");
        int length = getLenght(names);
        System.out.println("There are " + length + " names in your document");
        System.out.println(sortNames(names));
        printLongestName(names);
        findMostUsedName(names);

    }

    public static Set<String> readFile(String fileName){
        try {
            Set<String> names = new HashSet<>();
            FileReader fr = new FileReader("resource/" + fileName);
            BufferedReader reader = new BufferedReader(fr);
            String line;
            while ((line= reader.readLine()) != null){
                names.add(line);
            }
            return names;
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return null;
    }

    public static int getLenght(Set<String> names){
        return names.size();
    }

    public static List<String> sortNames(Set<String> names){
        List<String> array = new ArrayList<String>();
        array.addAll(names);
        Collections.sort(array);
        return array;
    }

    public static void printLongestName(Set<String> names){
        int max = 0;
        String name = "";
        for (String temp : names){
            //max = (temp.length()>max)?temp.length():max;
            if (temp.length() > max){
                max = temp.length();
                name = temp;
            }
        }
        System.out.println("Longest name is: " + name);
    }

    public static List<String> readArray(){
        try{
            List<String> names = new ArrayList<>();
            FileReader fr = new FileReader("resource/names.txt");
            BufferedReader reader = new BufferedReader(fr);
            String line;
            while ((line= reader.readLine()) != null){
                names.add(line);
            }
            return names;
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return null;
    }

    public static void findMostUsedName(Set<String> used){
        List<String> array;
        array = readArray();
        int max = 0;
        String maxName = "";
        for (String usedName : used){
            int count = 0;
            for (String name : array){
                if (name.equals(usedName)){
                    count++;
                }
            }
            if (count > max){
                max = count;
                maxName = usedName;
            }
        }
        System.out.println(maxName);
    }
}

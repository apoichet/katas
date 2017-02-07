package fr.alexandre.practice.bankocr.storyone;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Optional;

/**
 * Created by Alexandre on 15/01/2017.
 */
public class StoryOne {

    public int getNumber(String strNumber){
        Optional<Number> number = Number.getNumberFromLabel(strNumber);
        return number.isPresent() ? number.get().getValue() : 0;
    }

    public void findFile(String fileName){
        try {
            FileReader fileReader = new FileReader(new File("resources" +
                    System.getProperty("file.separator")
                    + "bankocr"
                    + System.getProperty("file.separator")
                    + fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int getNumberFromFile(){


        return 0;
    }

}

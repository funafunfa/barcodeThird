package main;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

/**
 * Created by dcamo on 8/5/2017.
 */
public class bufferTextReader {
    public static void main(String[] args) throws IOException, UnsupportedFlavorException {
        String data = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        bufferData(data);

    }
    public static String[] bufferData(String data) throws IOException, UnsupportedFlavorException {
        String[] strings = new String[3];
        int i = 0;
        boolean done = false;

        while (!done){
            if (data.contains("\t")){
                strings[i] = data.substring(0, data.indexOf("\t"));
                data = data.substring(data.indexOf("\t") + 1, data.length());
                i++;
            }else {
                data = data.substring(data.indexOf("\t") + 1, data.length());
                if (i == 1){
                    strings[1] = data.substring(0, data.length());
                    strings[2] = "-";
                    done = true;
                } else if( i > 2){
                    strings[0] = " ";
                    strings[1] = " ";
                    strings[2] = "More then 3 objects";
                    done = true;
                } else {
                    strings[2] = data.substring(0, data.length());
                    done = true;
                }

            }

        }
        for (String str:strings
                ) {
            System.out.println(str);
        }

        return strings;
    }

}

package ua.andrey;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*9.	Все слова текста рассортировать по возрастанию количества заданной буквы в слове. Слова с одинаковым количеством расположить в алфавитном порядке.*/
public class Main {
    public static void main(String[] args) {
        //String fileName = "src/text.txt";
        String fileName = "src/text1.txt";
        String textString="";

        try (BufferedReader br=new BufferedReader(new FileReader(fileName))){
            String line = "";
            while ((line = br.readLine()) != null) {
                textString=textString+line+" ";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Text text=Parser.parse(textString);
        System.out.println(text);
        System.out.println("After a sort by task(by count of letter,by alphabet if counts are same) ");
        System.out.println(text.sortListOfWordByTask('a'));





    }
}

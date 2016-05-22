package ua.andrey;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public static Text parse(String textString) {
        Text text = new Text();
        String sentenceString = "";
        Pattern patternSentence = Pattern.compile("\\.|\\?|\\!");
        Matcher matcher = patternSentence.matcher(textString);


        int startIndex = 0;
        int i = 1;
        System.out.println();
        while (matcher.find()) {
            sentenceString = textString.substring(startIndex, matcher.start()).trim();


            Sentence sentence=parseSentence(sentenceString);
            text.add(sentence);

            startIndex = matcher.end();
        }
        return text;
    }

    public static Sentence parseSentence(String sentenceString) {
        Pattern patterSentenceElement = Pattern.compile("(\\, )| |\\,");
        Matcher matcher = patterSentenceElement.matcher(sentenceString);
        Sentence sentence=new Sentence();
        int startIndex = 0;
        int i = 1;
        String sentenceElementString = "";
        while (matcher.find()) {
            sentenceElementString = sentenceString.substring(startIndex, matcher.start()).trim();
            SentenceElement word=new Word(sentenceElementString);
            sentence.add(word);
            if(sentenceString.charAt(matcher.start())==','){
                PunctuationMark punctuationMark=new PunctuationMark(sentenceString.charAt(matcher.start())+"");
                sentence.add(punctuationMark);
            }
            startIndex = matcher.end();
        }
        sentenceElementString = sentenceString.substring(startIndex).trim();
        SentenceElement word=new Word(sentenceElementString);
        sentence.add(word);



        return sentence;
    }
}

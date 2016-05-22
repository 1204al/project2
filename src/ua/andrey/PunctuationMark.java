package ua.andrey;

import java.util.List;

public class PunctuationMark extends SentenceElement{


    public PunctuationMark(List<Character> characters) {
        super(characters);
    }

    public PunctuationMark(String charactersString) {
        super(charactersString);
    }
}

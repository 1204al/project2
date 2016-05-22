package ua.andrey;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public abstract class SentenceElement implements Comparable<SentenceElement> {
    protected List<Character> characters = new ArrayList<>();

    public int countOfCharacter(Character ch){
        int count=0;
        for (Character character : characters) {
            if(character.equals(ch)) count++;

        }
        return count;
    }

    public SentenceElement(List<Character> characters) {
        this.characters = characters;
    }


    public SentenceElement(String charactersString) {
        for (int i = 0; i < charactersString.length(); i++) {
            this.characters.add(new Character(charactersString.charAt(i)));
        }
    }

    public int length() {
        return characters.size();
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        for (Character character : characters) {
            sb.append(character);
        }
        return  sb.toString();
    }


    @Override
    public int compareTo(SentenceElement o) {
        return this.toString().compareTo(o.toString());
    }
}

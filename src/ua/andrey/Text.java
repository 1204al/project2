package ua.andrey;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Text {
    private List<Sentence> sentences = new ArrayList<>();

    public void add(Sentence s) {
        sentences.add(s);
    }

    public Sentence get(int index) {
        return sentences.get(index);
    }

    public Text() {
    }

    public Text(List<Sentence> sentences) {

        this.sentences = sentences;
    }

    public int length() {
        return sentences.size();
    }

    public List<SentenceElement> sortListOfWordByTask(Character character) {
        List<SentenceElement> list = new ArrayList<>();
        for (Sentence sentence : sentences) {
            list.addAll(sentence.getElements());
        }
        list.sort(new ComparatorOfTask(character));
        return list;
    }

    public List<SentenceElement> sortListOfWordByTask(char ch) {
        Character character = new Character(ch);
        return sortListOfWordByTask(character);
    }

    class ComparatorOfTask implements Comparator<SentenceElement> {
        private Character ch;

        public ComparatorOfTask(Character ch) {
            this.ch = ch;

        }

        @Override
        public int compare(SentenceElement o1, SentenceElement o2) {
            int t = o1.countOfCharacter(ch) - o2.countOfCharacter(ch);
            return (t != 0 ? t : o1.compareTo(o2));
        }
    }

    @Override
    public String toString() {
        return sentences + "";
    }
}

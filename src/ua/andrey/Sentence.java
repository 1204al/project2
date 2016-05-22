package ua.andrey;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<SentenceElement> elements=new ArrayList<>();

    public SentenceElement get(int index){
        return elements.get(index);
    }

    public void add(SentenceElement sentenceElement){
        elements.add(sentenceElement);
    }
    public int length(){
        return elements.size();
    }
    public Sentence() {
    }

    public Sentence(List<SentenceElement> elements) {
        this.elements = elements;
    }

    public List<SentenceElement> getElements() {
        return elements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sentence sentence = (Sentence) o;

        return elements != null ? elements.equals(sentence.elements) : sentence.elements == null;

    }

    @Override
    public int hashCode() {
        return elements != null ? elements.hashCode() : 0;
    }

    @Override
    public String toString() {
        return elements+"";
    }
}

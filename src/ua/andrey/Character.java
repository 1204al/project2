package ua.andrey;


public class Character implements Comparable<Character> {
    private char ch;


    public Character(char ch) {
        this.ch = ch;

    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;

        char ch1= java.lang.Character.toLowerCase(ch);
        char ch2= java.lang.Character.toLowerCase(character.ch);
        return ch1 == ch2;
    }

    @Override
    public int hashCode() {
        return (int) ch;
    }

    @Override
    public String toString() {
        return ch+"";
    }


    @Override
    public int compareTo(Character anotherCharacter) {
        return this.ch-anotherCharacter.ch;
    }
}

import java.util.Objects;

public class Card {
     public int val;
     String color;
    public Card(int val, String color) {
        this.val = val;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Card{" +
                "val=" + val +
                ", color='" + color + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (obj==null) return false;
        if (!(obj instanceof Card)) return false;
        if(obj==this){
            return  true;
        }
        Card o = (Card) obj;
        return val ==o.val &&
                color.equals(o.color);
    }
}

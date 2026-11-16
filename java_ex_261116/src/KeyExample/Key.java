package KeyExample;


public class Key {
    public int number;

    public Key(int number){
        this.number = number;
    }

    @Override 
    public boolean equals(Object obj){
        if (obj instanceof Key) {
            Key comperKey = (Key) obj;

            if (this.number == comperKey.number) {
                return true;
            }
        }

        return false;
    }

    @Override 
    public int hashCode(){
        return number;
    }
}

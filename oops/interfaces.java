package oops;

public class interfaces {
    public static void main(String[] args) {
        // Queen q1= new Queen();
        // q1.moves();
        omnivore bear= new omnivore();
        bear.eatgrass();
        bear.eatanimal();
        System.out.println(bear.color);
    }
}
//multiple inheritance
interface herbivore{
    String color="orange";
    void eatgrass();
}
interface carnivore{
    // String color="green";
    void eatanimal();
}
class omnivore implements herbivore,carnivore{
    public void eatgrass(){
        System.out.println("eating grass");
    }
    public void eatanimal(){
        System.out.println("eating animal");
    }
}





interface Chessplayer{
    void moves();
}
class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up down left right diagonal");
    }
}
class Rook implements Chessplayer{
    public void moves(){
        System.out.println("upd down left right");
    }
}
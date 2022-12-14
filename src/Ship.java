import java.util.ArrayList;

public class Ship {
    private String name;
    private int length;
    private ArrayList<int[]> coordinates;
    // ship names: aircraft carrier, battleship, cruiser, submarine, and destroyer
    // ship lengths (respectively): 5, 4, 3, 3, 2

    public Ship(String name, int length ) {
        coordinates = new ArrayList<int[]>();
        this.name = name;
        this.length = length;
    }

    public void addCoordinates(int x, int y){
        int[] coord = {x,y};
        coordinates.add(coord);
    }

    public void removeCoordinates(int x, int y) {
        for (int i = coordinates.size() - 1; i >= 0; i--) {
            if (coordinates.get(i)[0] == x && coordinates.get(i)[1] == y) {
                coordinates.remove(i);
            }
        }
    }

    public String getName(){
        return name;
    }

    public int getLength(){
        return length;
    }

    public ArrayList<int[]> getCoordinates(){
        return coordinates;
    }



}

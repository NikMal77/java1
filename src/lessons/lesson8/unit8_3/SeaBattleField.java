package lessons.lesson8.unit8_3;

public class SeaBattleField {
    public int sizeX = 10;
    public int sizeY = 10;
    private byte[][] field = new byte[sizeX][sizeY];

    public class Ship {
        public int x, y;

        public void showFieldInfo(){
            System.out.println("Размер поля: " + sizeX + "x" + sizeY);
        }
    }

    public static void main(String[] args) {
        SeaBattleField seaField = new SeaBattleField();
        SeaBattleField.Ship ship = seaField.new Ship();
        seaField = null;
        ship.showFieldInfo();
    }
}

package shapes;

public class Square extends Rectangle {
    protected double side;
    public Square(){
        super();
        this.side = 0.0;
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public String toString() {
        if (filled){
            return this.color + " square with a side of " + this.side;
        } else {
            return this.color + ", not filled square with a side of " + this.side;
        }
    }
}

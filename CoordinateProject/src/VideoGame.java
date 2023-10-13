public class VideoGame {
    //nested class structure, only this  VideoGame class can access the Coordinate2 class
    public class Coordinate2 {
        //let it be default so you don't need getters and setters, final protects it from being messed up
        final int x;
        final int y;

        public Coordinate2(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "( " + x + ", " + y + " )";
        }

        public double distanceFrom(Coordinate other) { //other is a very common parameter name for methods like this
            return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
        }

        public double distanceFrom() { //overloaded to calculate distance from origin
            return distanceFrom(new Coordinate(0, 0));
        }

        public boolean equals(Coordinate other) {
            return this.x == other.x && this.y == other.y;
        }

        //copy constructor to make a new Object with all the same variables
        public Coordinate2(Coordinate2 other) {
            this(other.x, other.y); //this is the same this as is used when inheriting
        }

        //hashCodes are unique to each Object, Objects with identical values will have the same hashCode, two Coordinates with values (4,4) will have the same hashcode
        public int hashCode() { //for more complex Objects, .equals() methods are similarly complex. hashCode is a  quicker way to check if two objets are equal
            return this.x * 31 + this.y; //not perfect but fast
        }

    }
}

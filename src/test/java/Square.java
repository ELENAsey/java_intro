 class Square {
    private int side;
        public Square(int side){
            this.side = side;
        }
        public int calculateArea() {
           return side * side;
        }
}
 class Square1{
    public static void main(String args[]){
      Square square = new Square(5);
      System.out.println("Площадь квадрата: "
              + square.calculateArea());
    }
}
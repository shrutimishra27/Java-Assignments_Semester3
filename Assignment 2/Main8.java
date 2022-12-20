class Main8 {
    public int x, y;
    
    public Main8() {
        this(23,30); // If calling constructor inside a method in class using this(), then this statement should be the first line.
        x = 4; y = 3;
        this.disp();
    }

    public Main8(int a, int b) {
        System.out.println("Parameterized constructor");
        x = a;
        y = b;
        this.disp();
    }

    public void disp() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public static void main(String[] args) {
        Main8 o1 = new Main8();
        o1.disp();
    }
}
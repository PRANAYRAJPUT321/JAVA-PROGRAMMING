interface Drawable {
    void Draw();
}

class Rectangle implements Drawable{
    public void Draw()
    {
        System.out.println("Drawaing Rectangle");
    }
}
class Circle implements Drawable{
    public void Draw()
    {
        System.out.println("Drawaing Circle");
    }
}
class Testinterface{
    public static void main(String[] args) {
        Drawable d= new Rectangle();
        d.Draw();
    }
}

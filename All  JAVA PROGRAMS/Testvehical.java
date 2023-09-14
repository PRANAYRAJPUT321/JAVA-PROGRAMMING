 interface Vehical {
    public void move();
}
class Car implements  Vehical{
    public void move(){
        System.out.println ("Car is moving");
    }
}
class Bike implements  Vehical{
    public void move(){
        System.out.println ("Bike is moving");
    }
}
class Traveller{
    private Vehical V;
    public Vehical getV(){
        return V;
    }
    public void setV (Vehical V)
    {
        this.V=V;

    }
    public void Startjourney(){
        V.move();
    }
}
class Testvehical{
    public static void main(String[] args) {
        Traveller T=new Traveller();
        T.setV(new Car());
        T.Startjourney();
        T.setV(new Bike());
        T.Startjourney();
    }
}

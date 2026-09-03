public class Mobile
{
    private String brand;
    private String model;
    private int price;
    private int ram;
    private int storage;
    Mobile(String brand,String model,int price,int ram,int storage)
    {
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.ram=ram;
        this.storage=storage;
    }
    public void display()
    {
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
        System.out.println("Ram: "+ram+"GB");
        System.out.println("Storage: "+storage+"GB");
    }

    public static void main(String[]args)
    {
        Mobile m1=new Mobile("OPPO","RENO 16",49999,8,256);
        m1.display();
        System.out.println("----------------------------------------------------------------");
        Mobile m2=new Mobile("REDMI","NOTE 20",20000,8,128);
        m2.display();
    }
}

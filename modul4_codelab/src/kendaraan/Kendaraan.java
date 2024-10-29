package kendaraan;

public abstract class Kendaraan {
    private String name;
    private String model;
    private String warna;
    private int tahun;

    public abstract void start();

    public void getInfo(){
        System.out.println("Kendaraan: " + name);
        System.out.println("Model : " + model);
        System.out.println("Warna : " + warna);
        System.out.println("Tahun : " + tahun);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public int getTahun(){
        return tahun;
    }

    public void setTahun(int tahun){
        this.tahun = tahun;
    }

    public abstract void stop();

    public abstract void brake();

    public abstract void shoot(String vehicle);

    public abstract void Start();

    public abstract void Brake();

    public abstract void Stop();

    public abstract void Shoot(String vehicle);
}

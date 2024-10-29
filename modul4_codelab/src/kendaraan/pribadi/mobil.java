package kendaraan.pribadi;

import kendaraan.Kendaraan;

public abstract class Mobil extends Kendaraan {
    @Override
    public void start() {
        System.out.println("Mobil " + this.getName() + " dinyalakan");
    }

    @Override
    public void stop() {
        System.out.println("Mobil " + this.getName() + " dimatikan");
    }

    @Override
    public void brake() {
        System.out.println("Mobil berhenti");
    }
}

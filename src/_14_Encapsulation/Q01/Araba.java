package _14_Encapsulation.Q01;

public class Araba {
   private String model;
   private String renk;
   private int motor;
   private int yil;

   Araba(){
   }

    public Araba(String model, String renk) {
        this.model = model;
        this.renk = renk;
    }

    @Override
    public String toString() {
        return "Araba " +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
       if (motor<1000){
           System.out.println("1000 cc alti motor yoktur");
       }else
        this.motor = motor;
    }

    public int getYil() {
           return yil;
    }

    public void setYil(int yil) {
        if (yil<0){
            this.yil=(-1)*yil;
            System.out.println("- deger girdin ama duzelttim ");
        }else
            this.yil = yil;
    }

    public Araba(String model, String renk, int motor, int yil) {
        this.model = model;
        this.renk = renk;
      // this.motor = motor;
      // this.yil = yil;
        setMotor(motor);
        setYil(yil);
    }
}

package pack;

import pack.InterfaceCar;

public class Autonomous implements InterfaceCar{
    private int num_passengers;
    private double speed;
    private String status;

    public Autonomous(int num_passengers,double speed){


        this.num_passengers=num_passengers;
        this.speed=speed;
   }

    public int getNumPassengers(){

        return num_passengers;
    }
    public String getStatus(){

        return status;
    }


    @Override
    public double slowDown(double amount) {
        speed=speed-amount;
        return amount;
    }

    @Override
    public double speedUp(double amount) {
        if(amount>getTooFastKPH()){
            status=" Over speeding ";
            speed=getTooFastKPH();
            return getTooFastKPH();
        }
        speed=speed+amount;

        return amount;
    }

    public static double getTooFastKPH(){

        return InterfaceCar.maximum_KPH;
    }

    public static void main(String[] args){
        Control ctrl=new Control();
        for(int i=2;i<100;i++){
            Autonomous auto=new Autonomous(4,180);
            System.out.println("slow down:"+auto.slowDown(20)+" -->"+auto.speed);
            System.out.println("Numbers of Passengers: "+auto.getNumPassengers());
            System.out.println("speed up: "+auto.speedUp(20)+" -->"+auto.speed);
            System.out.println("Speed: "+auto.speed);
            ctrl.add(auto.speed);
            System.out.println("Speed limit: "+auto.getTooFastKPH());
            System.out.println("Size: "+ctrl.getSize());
            System.out.println("\n");
        }

             //More control




    }
}

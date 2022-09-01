package pack;

import java.util.LinkedList;

public class Control {


    private LinkedList<Double> doc=new LinkedList<Double>();
    /*
     * automating the process to know when to slow down
     * using automation principles
     */
    public Control(){

    }
    public void add(double speed){
        doc.add(speed);
    }

    //controls speed input based on certain condition
    public void speedLogic(double speed){

    }





    public int getSize(){

        return doc.size();
    }


}

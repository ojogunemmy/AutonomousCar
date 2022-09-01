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


    protected int getSize(){

        return doc.size();
    }


}

package horloge;
import component.Tache;

import javax.ejb.EJB;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Calendar;


class Horloge  implements ActionListener {
    private @EJB
    Tache tache;

    private boolean stop;

    public Horloge() {
        stop=false;
        Timer t = new Timer(1000,this);
        t.start();

    }

    public static void main(String args[]) {
        Horloge ct = new Horloge();
        while(!ct.stop){

        }



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(String.format("%tT", Calendar.getInstance()).equals("00:00:00")){
            tache.executeTache();
        }
    }

    public void stopHorloge(){
        stop=true;
    }




}

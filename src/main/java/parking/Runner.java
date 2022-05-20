package parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id = "ABC-1234";
        String enterTime = "08:00";
        String exitTime = "11:05";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        //Exception 輕微的error vs Error
        Date d = null;
        try{
            d = sdf.parse(enterTime);
        }catch (Exception e){
            System.out.println("wrong format");
        }
        System.out.println(d);
        System.out.println(d.getTime());
        //long ms = 3*60*60*1000;
        try{
            Date d2 = sdf.parse(exitTime);
            System.out.println(d2);
            System.out.println(d2.getTime());
            int mins = (int)((d2.getTime()-d.getTime())/1000/60);
            System.out.println(mins);
            int fee = 30*(mins/60);
            System.out.println("Fee:"+fee);
            //3:14 => ntd$90 ,3:15 => ntd$120
            //3:15-3:30 =>ntd$
        }catch (Exception e) {
            System.out.println("exit wrong format");
        }
        //d2.setTime(d.getTime()+ms)
        //2022/05/13 08:00
    }
}

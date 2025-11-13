//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class GestoreGaraCavalli {
    static String primo="";
    static PrintWriter pw;
    public static void main(String[] args) {
        scanner input= new Scanner(System.in);
        String tmpS;
        int tmp;
        try{
            pw= new PrintWriter(new FileWriter("risultati_della_gara.txt"));
        } catch (IOException e){
            e.printStackTrace();
        }
        ArrayList<Cavallo> listaCavallo= new ArrayList<Cavallo>();
        for(int i=0;i<=4;i++){
            System.out.println("inserisci il nome del cavallo"+i);
            tmpS=input.nextLine();
            System.out.println("inserisci la lentezza del cavallo"+i);
            tmp=input.nextInt();
            String v=input.nextLine();
            Cavallo c=new Cavallo(tmpS, tmp);
            listaCavallo.add(c);
        }
        for(Cavallo c: listaCavallo){
            c.start();
        }
        if(!listaCavallo.isEmpty()){
            int randomIntex=(int) (Math.random() * listaCavallo.size());
            listaCavallo.get(randomIndex).interrupt();
        }
        System.out.println("il primo cavallo:" + primo)
        scriviNelFile(primo + "ha vinto la gara");

        if (px!= null){
            pw.close();
        }input.close();
    

        for(Cavallo c: listaCavallo){
            try {
                c.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    
         public static String getPrimo() {
        return primo;
    }
    public static synchronized void setPrimo(String primo) {
        if(GestoreGaraCavalli.primo.isEmpty()){
            GestoreGaraCavalli.primo=primo;
        }
    }
public static synchronized void scriviNelFile(String testo){
    if(pw!=null){
        pw.println(testo);
        pw.flush();
    }
}
    }

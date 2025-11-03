//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static String primo="";
    public static void main(String[] args) {
        scanner input= new Scanner(System.in);
        String tmpS;
        int tmp;
        ArrayList<Cavallo> listaCavallo= new ArrayList<>();
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
         Random random = new Random();
        int indexAzzoppato = random.nextInt(listaCavallo.size());
        Cavallo cavalloAzzoppato = listaCavallo.get(indexAzzoppato);
         try {
            Thread.sleep(500 + random.nextInt(1000));
            System.out.println("\nIl cavallo " + cavalloAzzoppato.getName() + " (" + indexAzzoppato + ") è stato AZZOPPATO!\n");
            cavalloAzzoppato.azzoppa();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(Cavallo c: listaCavallo){
            try {
                c.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
         if (primo.equals("")) {
            System.out.println("Nessun cavallo è arrivato al traguardo!");
        } else {
            System.out.println("Il primo cavallo è: " + primo);
        }
    }
         public static String getPrimo() {
        return primo;
    }
    public static void setPrimo(String primo) {
        Main.primo = primo;
    }
    }
}

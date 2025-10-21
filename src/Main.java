//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static String primo="";
    public static void main(String[] args) {
        scanner input= new Scanner(System.in);
        String tmpS;
        int tmp;
        ArrayList<Cavallo> listaCavallo= new ArrayList();
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
        for(Cavallo c: listaCavallo){

        }
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}
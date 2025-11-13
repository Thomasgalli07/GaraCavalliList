public class Cavallo extends Thread{

    private final String name;
    private int lentezza;
    public Cavallo(String name, int lentezza) {
        super();
        this.name = name;
        this.lentezza = lentezza;
    }
    @Override
    public void run(){
        System.out.println("Cavallo " +
                name + " comincia il suo galoppo");
        for (int i = 1; i <= 10; i++) {
            try {
                sleep(lentezza);
            } catch (InterruptedException e) {
                System.out.println("Cavallo " + name + " è stato azzoppato durante la corsa!");
                finito=false;
                return;
            }
            System.out.println(name +" cavalca - passo: " + i);
        }
        if(finito==true){
            GestoreGaraCavalli.setPrimo(name);
            System.out.println(name+ "ha finito la gara");
        }
    }
    
    protected int getLentezza(){
        return lentezza;
    }
    protected void setLentezza(int lentezza){
        this.lentezza=lentezza;
    }
}

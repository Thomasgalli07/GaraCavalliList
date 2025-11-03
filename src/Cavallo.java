public class Cavallo extends Thread{

    private final String name;
    private int lentezza;
    public Cavallo(String name, int lentezza) {
        super();
        this.name = name;
        this.lentezza = lentezza;
        private boolean azzoppato=false;
    }
    @Override
    public void run(){
        System.out.println("Cavallo " +
                name + " comincia il suo galoppo");
        for (int i = 1; i <= 10; i++) {
             if (azzoppato || Thread.currentThread().isInterrupted()) {
                System.out.println("Cavallo " + name + " è stato azzoppato e si ferma al passo " + (i - 1));
                return;
            }
            try {
                sleep(lentezza);
            } catch (InterruptedException e) {
                System.out.println("Cavallo " + name + " è stato azzoppato durante la corsa!");
                return;
            }
            System.out.println(name +" cavalca - passo: " + i);
        }
        if(!azzoppato && Main.getPrimo().equals("")){
            Main.setPrimo(this.name);
        }
    }
    public void azzoppa() {
        this.azzoppato = true;
        this.interrupt();
    }
    
    protected int getLentezza(){
        return lentezza;
    }
    protected void setLentezza(int lentezza){
        this.lentezza=lentezza;
    }
}

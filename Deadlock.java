public class Deadlock {
    String s1="Blue";
    String s2="Cheese";
    Thread t1=new Thread("Thread 1"){
        public void run(){
            while(true){
                synchronized(s1){
                    synchronized(s2){
                        System.out.println(s1+" "+s2);
                    }
                }
            }
        }
    };
    Thread t2=new Thread("Thread 2"){
        public void run(){
            while(true){
                synchronized(s2){
                    synchronized(s1){
                        System.out.println(s2+" "+s1);
                    }
                }
            }
        }
    };
    public static void main(String args[]) {
        Deadlock dead=new Deadlock();
        dead.t1.start();
        dead.t2.start();
    }
}
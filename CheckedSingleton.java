public class CheckedSingleton {
    private volatile static CheckedSingleton instance;
    
    private CheckedSingleton(){
        }
    public static CheckedSingleton getInstance() {
        if (instance == null) {
            synchronized (CheckedSingleton.class)
            {
                if (instance == null) instance = new CheckedSingleton();
            }
        }
        return instance;
    }
    public static void main(String args[]) {
    }
}
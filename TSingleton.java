public class TSingleton {

    private static TSingleton instance;

    private TSingleton(){
        
    }

    public static synchronized TSingleton getInstance(){
        if(instance == null){
            instance = new TSingleton();
        }
        return instance;
    }
}
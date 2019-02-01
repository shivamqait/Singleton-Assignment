public class LSingleton {
    
    private static LSingleton instance;
    
    private LSingleton(){
    
    }
    
    public static LSingleton getInstance(){
        if(instance == null){
            instance = new LSingleton();
        }
        return instance;
    }
}
public class ESingleton { 

    private static final ESingleton instance = new ESingleton();

    private ESingleton() {        
    } 

    public static ESingleton getInstance() {
        return instance; 
    } 
} 
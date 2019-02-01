public class SingletonTest {
    public static void main(String[] args) {
        ESingleton einstance1 = ESingleton.getInstance();
        ESingleton einstance2 = ESingleton.getInstance();
        System.out.println("Instance 1 of ESingleton hash:" + einstance1.hashCode());
        System.out.println("Instance 2 of ESingleton hash:" + einstance2.hashCode());  

        LSingleton linstance1 = LSingleton.getInstance();
        LSingleton linstance2 = LSingleton.getInstance();
        System.out.println("Instance 1 of LSingleton hash:" + linstance1.hashCode());
        System.out.println("Instance 2 of LSingleton hash:" + linstance2.hashCode()); 

        TSingleton tinstance1 = TSingleton.getInstance();
        TSingleton tinstance2 = TSingleton.getInstance();
        System.out.println("Instance 1 of TSingleton hash:" + tinstance1.hashCode());
        System.out.println("Instance 2 of TSingleton hash:" + tinstance2.hashCode()); 
    }
 }
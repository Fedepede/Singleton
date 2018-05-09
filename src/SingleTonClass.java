public class SingleTonClass {

    private static SingleTonClass obj=null;
    private SingleTonClass(){
// en privat konstruktør gør at den ikke kan tilgås fra andre
    }
    public static SingleTonClass objectCreationMethod(){
// gør at der kun kan være 1 Singletonclass
        if(obj==null){
            obj= new SingleTonClass();
        }
        return obj;
    }
    public void display(){
        System.out.println("this is Singleton");
    }
}




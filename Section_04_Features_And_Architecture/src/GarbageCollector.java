public class GarbageCollector {

    public void finalize(){
        System.out.println("Boom !!");
    }

    public void cleanup(){
        System.out.println("Boom !!");
    }

    public static void main(String arg[]){
        GarbageCollector gc = new GarbageCollector();
        GarbageCollector gc1 = new GarbageCollector();
//        gc.cleanup();
//        gc1.cleanup();
        gc=null;
        gc1= null;
        System.gc();
    }

}

package methodoverriding;

class AnimalSuper{
    public void sound(){
        System.out.println("AnimalSuper sound");
    }
}

class DogSub extends AnimalSuper{
    public void sound(){
        System.out.println("DogSub sounds like Bark");
    }
}

class CatSub extends AnimalSuper{
    public void sound(){
        System.out.println("CatSub sounds like Meow");
    }
}



public class DynamicMethodDispatch {
            public static void main(String[] args) {
                AnimalSuper animal = new AnimalSuper();
                animal.sound();
                DogSub dog = new DogSub();
                dog.sound();
                CatSub cat = new CatSub();
                cat.sound();
                

                animal = new DogSub();
                animal.sound();
                animal = new CatSub();
                animal.sound();


            }

}

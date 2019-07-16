package ru.andgub;

public class ClassicalMusic implements Music {
   private ClassicalMusic() {
   }

   public static ClassicalMusic getClassicalMusic() {
       System.out.println("factorying...");
       return new ClassicalMusic();
   }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my distraction");
    }



    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }


}

public class Overr {
    public void play(){
        System.out.println("THE video player s now playing");


    }
    static class Player extends Overr {
        @Override
        public void play(){
            System.out.println("The player has stopped playing");
        }
        public static void  main(String[] args) {
          Overr player= new Overr();
          player.play();;
          Overr act = new Player();


        }


    }
}

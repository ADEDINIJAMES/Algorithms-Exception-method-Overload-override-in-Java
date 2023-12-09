class Video {
    public void play() {
        System.out.println("the video is playing");
    }
}
    class Player extends Video {
        public void play() {// Override
            System.out.println("Don't you know you are making noise");

        }

    }

public class Overr2 {
    public static void main(String[] args) {


        Video video = new Player();
        video.play();

        Video video2 = new Video();
        video2.play();
    }
}

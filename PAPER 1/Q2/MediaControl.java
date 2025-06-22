import java.util.Scanner;

abstract class MediaFile {
    abstract void play();
    void info() {
        System.out.println("Initiating Info Method");
    }
}
interface Downloadable {
    void download();
}
interface Sharable extends Downloadable {
    void share();
}
interface Streamable extends Downloadable {
    void stream();
}
class AudioFile extends MediaFile implements Sharable {
    @Override
    void play() {
        System.out.println("Playing AudioFile");
    }

    @Override
    public void download() {
        System.out.println("Downloading Audio Content");
    }
    @Override
    public void share() {
        System.out.println("Sharing Audio Content");
    }
}
class VideoFile extends MediaFile implements Sharable {
    @Override
    void play() {
        System.out.println("Playing VideoFile");
    }

    @Override
    public void download() {
        System.out.println("Downloading Video Content");
    }
    @Override
    public void share() {
        System.out.println("Sharing Video Content");
    }
}
public class MediaControl {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for AudioFile, 2 for VideoFile :- ");
        int choice = sc.nextInt();
        MediaFile md=null;
        if(choice == 1) {
            md = new AudioFile();
        } else if (choice == 2) {
            md = new VideoFile();
        } else {
            System.exit(1);
        }
        if(md != null) md.play();
        if(md instanceof AudioFile) {
            ((AudioFile)md).download();
            ((AudioFile)md).share();
        }
        if(md instanceof VideoFile) {
            ((VideoFile)md).download();
            ((VideoFile)md).share();
        }
    }    
}

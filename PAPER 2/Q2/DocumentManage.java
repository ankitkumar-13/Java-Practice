import java.util.Scanner;

abstract class Document {
    abstract void open();
    void getType() {
        System.out.println("Document Type");
    }
}
interface Shareable {
    void share();
}
interface CloudShareable extends Shareable {
    void uploadToCloud();
}
class PDFDocument extends Document implements CloudShareable {
    @Override
    public void open() {
        System.out.println("Opening PDF Document...");
    }
    @Override
    public void share() {
        System.out.println("Sharing PDF Document...");
    }
    @Override
    public void uploadToCloud() {
        System.out.println("Uploading PDF Document...");
    }
}
class WordDocument extends Document implements CloudShareable {
    @Override
    public void open() {
        System.out.println("Opening Word Document...");
    }
    @Override
    public void share() {
        System.out.println("Sharing Word Document...");
    }
    @Override
    public void uploadToCloud() {
        System.out.println("Uploading Word Document...");
    }
}
public class DocumentManage {
    public static void main(String args[]) {
        Document dm = null;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x==1) {
            dm = new PDFDocument();
        } else if (x==2) {
            dm = new WordDocument();
        }
        dm.open();
        dm.getType();
        if(dm instanceof PDFDocument){
            ((PDFDocument) dm).open();
            ((PDFDocument) dm).share();
            ((PDFDocument) dm).uploadToCloud();
        } else {
            ((WordDocument) dm).open();
            ((WordDocument) dm).share();
            ((WordDocument) dm).uploadToCloud();
        }
        sc.close();
    }
}
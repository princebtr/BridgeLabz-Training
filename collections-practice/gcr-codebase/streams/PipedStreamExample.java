import java.io.*;
public class PipedStreamExample {
    public static void main(String[] args) throws IOException {
        PipedOutputStream pos=new PipedOutputStream();
        PipedInputStream pis=new PipedInputStream(pos);
        new Thread(() -> {
            try{pos.write("Hello from Writer".getBytes());pos.close();}
            catch(IOException e){e.printStackTrace();}
        }).start();
        new Thread(() -> {
            try{
                int d;
                while((d=pis.read())!=-1){
                    System.out.print((char)d);
                }
            }catch(IOException e){e.printStackTrace();}
        }).start();
    }
}

import java.io.*;
public class ImageByteArray {
    public static void main(String[] args) {
        try(FileInputStream fis=new FileInputStream("image.jpg");
            ByteArrayOutputStream baos=new ByteArrayOutputStream()){
            byte[] buffer=new byte[4096];
            int read;
            while((read=fis.read(buffer))!=-1){
                baos.write(buffer,0,read);
            }
            byte[] img=baos.toByteArray();
            try(ByteArrayInputStream bais=new ByteArrayInputStream(img);
                FileOutputStream fos=new FileOutputStream("copy.jpg")){
                while((read=bais.read(buffer))!=-1){
                    fos.write(buffer,0,read);
                }
            }
        }catch(IOException e){e.printStackTrace();}
    }
}

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.imageio.ImageIO;

public class Serveur {

  public final static int SOCKET_PORT = 9999;  // you may change this
  public final static String FILE_TO_SEND = "/home/simplonco/Bureau/photo.png";  // you may change this

  public static void main (String [] args ) throws IOException {
//    FileInputStream fis = null;
//    BufferedInputStream bis = null;
//    OutputStream os = null;
//    ServerSocket servsock = null;
//    Socket sock = null;
//    try {
//      servsock = new ServerSocket(SOCKET_PORT);
//      while (true) {
//        System.out.println("Waiting...");
//        try {
//          sock = servsock.accept();
//          System.out.println("Accepted connection : " + sock);
//          // send file
//          File myFile = new File (FILE_TO_SEND);
//          byte [] mybytearray  = new byte [(int)myFile.length()];
//          fis = new FileInputStream(myFile);
//          bis = new BufferedInputStream(fis);
//          bis.read(mybytearray,0,mybytearray.length);
//          os = sock.getOutputStream();
//          System.out.println("Sending " + FILE_TO_SEND + "(" + mybytearray.length + " bytes)");
//          os.write(mybytearray,0,mybytearray.length);
//          os.flush();
//          System.out.println("Done.");
//        }
//        finally {
//          if (bis != null) bis.close();
//          if (os != null) os.close();
//          if (sock!=null) sock.close();
//        }
//      }
//    }
//    finally {
//      if (servsock != null) servsock.close();
//    }
    
    try {

		byte[] imageInByte;
		BufferedImage originalImage = ImageIO.read(new File(FILE_TO_SEND));

		// convert BufferedImage to byte array
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ImageIO.write(originalImage, "png", baos);
		baos.flush();
		imageInByte = baos.toByteArray();
		baos.close();

		// convert byte array back to BufferedImage
		InputStream in = new ByteArrayInputStream(imageInByte);
		BufferedImage bImageFromConvert = ImageIO.read(in);

		ImageIO.write(bImageFromConvert, "png", new File(FILE_TO_SEND));
		System.out.println("Ok");

	} catch (IOException e) {
		System.out.println(e.getMessage());
	}
    
  }
}
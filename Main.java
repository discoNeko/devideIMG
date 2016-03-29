import java.util.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;

public class Main {
	public static void main(String[] args){
		System.out.print("input :");
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.next());
		int p = Integer.parseInt(sc.next());
		devide(p,row);
	}

	public static void devide(int p, int row){
		BufferedImage img, img1, img2;
		int w, h, dw = 0, dh = 0;
		try{	
			img = ImageIO.read(new File("0.png"));
			w = img.getWidth();
			h = img.getHeight();
		}catch(Exception e){
			e.printStackTrace();
			return;
		}
		if(p<1 || (row==0 && p>w-1) || (row!=0 && p>h-1)){
			System.out.println("error: size over.");
			return;
		}
		if(row==0){
			dw = p;
			img1 = new BufferedImage(p, h, BufferedImage.TYPE_INT_ARGB);
			img2 = new BufferedImage(w-dw, h, BufferedImage.TYPE_INT_ARGB);
		}else{
			dh = p;
			img1 = new BufferedImage(w, p, BufferedImage.TYPE_INT_ARGB);
			img2 = new BufferedImage(w, h-dh, BufferedImage.TYPE_INT_ARGB);
		}
		Graphics g1 = img1.getGraphics();
		Graphics g2 = img2.getGraphics();
		g1.drawImage(img, 0, 0, null);
		g2.drawImage(img, 0, 0, w-dw, h-dh, dw, dh, w, h, null);

		//output
		try {
			ImageIO.write(img1, "png", new File("devide1.png"));
			ImageIO.write(img2, "png", new File("devide2.png"));
			System.out.println("done.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
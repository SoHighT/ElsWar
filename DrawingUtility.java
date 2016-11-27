package lib;

import com.sun.javafx.tk.FontLoader;
import com.sun.javafx.tk.Toolkit;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class DrawingUtility {

/*	protected static final Font standardFont = Font.font("Tahoma", FontWeight.BOLD, 30);
	protected static final Font smallFont = Font.font("Tahoma", FontWeight.MEDIUM, 9);
	protected static final Image bg = getImage("img/bg.jpg");
	protected static final Image gun = getImage("img/gun.png");
	protected static final Image gun_inf = getImage("img/gun_inf.png");
	protected static final Image shootAnim = getImage("img/shootAnim.png");

	protected static final double transcluentWhite = 0.7;
	protected static final double opaque = 1;*/
	protected static final Image bg = getImage("img/bg.jpg");
	private static Image getImage(String directory) {
		/* fill code */
		try {
			ClassLoader loader = ClassLoader.getSystemClassLoader();

			return new Image(loader.getResourceAsStream(directory));
		} catch (Exception error) {
			return null;
		}

	}

/*	public static Image getShootanim() {
		return shootAnim;
	}

	private static void drawTranscluentWhite(GraphicsContext gc, int x, int y, int radius) {
		gc.setGlobalAlpha(transcluentWhite);
		 fill code 
		gc.setFill(Color.WHITE);
		gc.fillOval(x - radius - 1, y - radius - 1, radius * 2 + 2, radius * 2 + 2);

		gc.setGlobalAlpha(opaque);
	}

	public static void drawShootableObject(GraphicsContext gc, int x, int y, int radius, String name,
			boolean isPointerOver) {
		 fill code 
		gc.setLineWidth(2);
		gc.setStroke(Color.BLACK);
		if (name == "simple") {
			gc.setFill(Color.BLUE);

		} else if (name == "small") {
			gc.setFill(Color.YELLOW);

		} else if (name == "splitter") {
			gc.setFill(Color.RED);

		}
		gc.fillOval(x - radius, y - radius, radius * 2, radius * 2);
		gc.strokeOval(x - radius, y - radius, radius * 2, radius * 2);
		if (isPointerOver) {
			DrawingUtility.drawTranscluentWhite(gc, x, y, radius);
		}

	}

	public static void drawItemGun(GraphicsContext gc, int x, int y, int radius, String name, boolean isPointerOver) {
		 fill code 
		gc.setLineWidth(2);
		gc.setFill(Color.GRAY);
		gc.setStroke(Color.BLACK);
		gc.fillOval(x-radius,y-radius, radius*2, radius*2);
		gc.strokeOval(x-radius,y-radius , radius*2, radius*2);
		
		if (name == "gun"){
			gc.drawImage(gun, x-15, y-15);
		}else if (name == "gun_inf"){
			gc.drawImage(gun_inf, x-15, y-15);
		}
		gc.setGlobalAlpha(opaque);
		if (isPointerOver){
			DrawingUtility.drawTranscluentWhite(gc, x, y, radius);
		}
	}

	public static void drawItemBullet(GraphicsContext gc, int x, int y, int radius, boolean isPointerOver) {
		 fill code 
		gc.setFill(Color.GRAY);
		gc.fillOval(x-radius, y-radius, 2*radius, 2*radius);
		gc.setStroke(Color.BLACK);
		gc.strokeOval(x-radius, y-radius, 2*radius, 2*radius);
		gc.setFill(Color.BLACK);
		gc.fillRect(x-20, y-10, 20, 20);
		gc.fillOval(x-20, y-10, 40, 20);
		if (isPointerOver){
			DrawingUtility.drawTranscluentWhite(gc, x, y, radius);
		}
	}

	public static void drawIconGun(GraphicsContext gc, int bulletQuantity, int maxBullet, boolean isInfiniteBullet) {
		if (gun == null || (isInfiniteBullet && gun_inf == null))
			return;
		gc.setFont(DrawingUtility.smallFont);
		if (isInfiniteBullet) {
			gc.drawImage(gun_inf, ConfigurableOption.screenWidth/2-15, 5);
		} else {
			gc.drawImage(gun, ConfigurableOption.screenWidth/2-15, 5);
			gc.fillText(bulletQuantity + "/" + maxBullet, ConfigurableOption.screenWidth/2+5, 35);
		}
	}

	public static void drawStatusBar(GraphicsContext gc, int remainingSecond, int score, Gun gun, boolean pause) {
		gc.setFill(Color.BLACK);
		gc.fillRect(0, 0, ConfigurableOption.screenWidth, 40);
		gc.setFont(standardFont);
		gc.setFill(Color.WHITE);
		gc.fillText("TIME : "+remainingSecond, 5, 35);
		gc.fillText("SCORE : "+score, ConfigurableOption.screenWidth/2+40, 35);
		 fill code 
		if (gun != null) {
			gun.render(gc);
		}
		 fill code 
		if(pause){
			gc.setFont(standardFont);
			gc.setFill(Color.WHITE);
			FontLoader font=Toolkit.getToolkit().getFontLoader();
			double width=font.computeStringWidth("PAUSE", standardFont);
			double hig=font.getFontMetrics(standardFont).getLineHeight();
			gc.fillText("PAUSE", (ConfigurableOption.screenWidth-width)/2, (ConfigurableOption.screenHeight-hig)/2);
		}
	}

	public static GameAnimation createShootingAnimationAt(int x, int y) {
		GameAnimation anim = new GameAnimation(DrawingUtility.shootAnim, 7, 1);
		anim.centerAnimationAt(x, y);
		anim.play();
		return anim;
	}*/
}

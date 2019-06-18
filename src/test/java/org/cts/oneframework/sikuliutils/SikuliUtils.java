package org.cts.oneframework.sikuliutils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.cts.oneframework.utilities.Screenshots;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliUtils {

	/**
	 * This method makes the screen wait until the image present
	 * 
	 * @param imagePath
	 * 
	 */

	//protected void 
	

	public static  void waitUntilImageFound(String imagePath) throws InterruptedException {
		try {
			Screen screen = new Screen();
			Pattern imagePattern = new Pattern(imagePath);
			screen.wait(imagePattern, 20000);
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	/**
	 * This method performs the set text using image.
	 * 
	 * @param imagePath
	 * @param text        // text to be set
	 */


	public static void sikuliSetText(String imagePath,String text) throws InterruptedException {
		try {
			Screen screen = new Screen();
			Pattern imagePattern = new Pattern(imagePath);
			if(screen.find(imagePattern) != null) {
				screen.type(imagePattern, text);
				Screenshots.addStepWithScreenshotInReport_Sikuli(screen, "Set text");
			}
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}


	/**
	 * This method performs the Enter Keyboard Action.
	 * 
	 * 
	 */

	public static void enterKey() throws InterruptedException {
		Screen s = new Screen();
		s.type(Key.ENTER);
	}

	/**
	 * This method performs the click operation using image.
	 * 
	 * @param imagePath
	 * 
	 */



	public static void sikuliClick(String imagePath) throws InterruptedException {
		try {
			Screen screen = new Screen();
			Pattern click = new Pattern(imagePath);
			if(screen.find(click) != null) {
				screen.wait(click, 10000);
				screen.click(click);
				Screenshots.addStepWithScreenshotInReport_Sikuli(screen, "Click Action");
				
			}
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	public static void captureSikuliScreenshot(Screen screen) {
		try {
			BufferedImage image = screen.capture().getImage();
			String screenshotpath = System.getProperty("java.io.tmpdir");
			String randomNumber = RandomStringUtils.randomNumeric(7);
			String destinationPath = screenshotpath + "\\screenshots\\"+"screenshots" + randomNumber+".png";
			ImageIO.write(image, "png", new File(destinationPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	/**
	 * This method performs the Double-click operation using image.
	 * 
	 * @param imagePath
	 * 
	 */

	public static void sikuliDoubleClick(String imagePath) throws InterruptedException {
		try {
			Screen screen = new Screen();
			Pattern click = new Pattern(imagePath);
			if(screen.find(click) != null) {
				screen.click(click);
			}
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}



	/**
	 * This method performs the Right-click operation using image.
	 * 
	 * @param imagePath
	 * 
	 */

	public static void sikuliRightClick(String imagePath) throws InterruptedException {
		try {
			Screen screen = new Screen();
			Pattern click = new Pattern(imagePath);
			if(screen.find(click) != null) {
				screen.rightClick(click);
			}
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * This method checks whether the image present in the particular screen.
	 * 
	 * @param imagePath
	 * returns boolean
	 */


	public boolean isImagePresent(String imagePath) throws InterruptedException {
		try {
			Screen screen = new Screen();
			Pattern click = new Pattern(imagePath);
			if(screen.find(click) != null) {
				return true;
			}
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}



}

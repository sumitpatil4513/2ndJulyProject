package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {
	 public static void takeScreenShot(String name,WebDriver driver) throws IOException {
		    File source =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    File destination = new File("C:\\Users\\suppo\\Documents\\2ndJulyProject\\ScreenShots"+name+".jpeg");
		    FileHandler.copy(source, destination);
		    }
}

package scripting;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoLogin;
import pomPages.Skillraryloginpage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass 
{
	@Test
	public void tc2() throws IOException, InterruptedException {
		Skillraryloginpage s=new Skillraryloginpage(driver);
		s.gearsbutton();
		s.skillrarydempapp();
		
		driverutilies.switchtabs(driver);
		
		SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
		driverutilies.dropdown(sd.getCoursedd(),pdata.getdata("dropdownopt"));
		
		
		TestingPage tp=new TestingPage(driver);
		driverutilies.draganddrop(driver,tp.getSeleniumtraining(),tp.getCart());
		
		Thread.sleep(1000);
		
		Point loc = tp.getTwitter().getLocation();
		int x = loc.getX();
		int y= loc.getY();
		driverutilies.scrollBar(driver, x, y);
		 
		tp.twitterlogo();
		
		
	}
	

}

package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPage extends BaseUtil {


    //@FindBy(id = "warehouse-savings")
    //@FindBy(xpath = "//*[@id=\"warehouse-savings\"]")
    @FindBy(css = "#warehouse-savings")
    public static WebElement viewWearHouseSavings;

    //@FindBy(id = "warehouse-locations-dropdown")
    @FindBy(css = ".header-menu-dropdown")
    public static WebElement findAWareHouse;

    @FindBy(xpath = "//div[@class='table-cell logo hidden-xs hidden-sm hidden-md hidden-lg']")
    public static WebElement logo;

    public void checkViewWearHouseSavings(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       viewWearHouseSavings.click();
   }
    public void checkFindAWareHouse(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        findAWareHouse.click();
    }
    public void checkLogo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logo.click();
    }


}

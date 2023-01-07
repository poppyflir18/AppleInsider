import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import java.net.URL;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

private final SelenideElement textBoxInput =$x("//input[@type='text']");

public MainPage(String url){
    Selenide.open(url);
}

    /**
     * Search and ENTER
     * @param searchString is search
     */
    public SearchPage search(String searchString){
    textBoxInput.setValue(searchString);
    textBoxInput.sendKeys(Keys.ENTER);
    return new SearchPage();
}


}


import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchPage {
    private final ElementsCollection articleTitles = $$x("//h2//a");

    /**
     * Returns href of the 1st article
     * @return
     */
    public String getHrefFromFirstArticle(){
        return articleTitles.first().getAttribute("href");

    }

}

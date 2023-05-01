package pattern.behavior.memento;

public class MementoTest {

    public static void main(String[] args) {
        PageHistory pageHistory = new PageHistory();

        MementoBrowser browser = new MementoBrowser();
        browser.showCurrentPage();
        pageHistory.addPage(browser.getPageNum());

        browser.goNextPage();
        browser.showCurrentPage();
        pageHistory.addPage(browser.getPageNum());

        browser.goNextPage();
        browser.showCurrentPage();
        pageHistory.addPage(browser.getPageNum());

        browser.setPageNum(pageHistory.getPrevPage(browser.getPageNum()));
        browser.setPageNum(pageHistory.getPrevPage(browser.getPageNum()));
        browser.setPageNum(pageHistory.getPrevPage(browser.getPageNum()));
        browser.showCurrentPage();
    }
}

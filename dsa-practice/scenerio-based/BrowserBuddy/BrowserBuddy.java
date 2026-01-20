package BrowserBuddy;

// Main Class 
public class BrowserBuddy {
    public static void main(String[] args) {

        BrowserManager browser = new BrowserManager();

        browser.openPage("google.com");
        browser.openPage("github.com");
        browser.openPage("stackoverflow.com");

        browser.back();
        browser.forward();

        browser.showCurrentPage();

        browser.closeTab();
        browser.restoreTab();

        browser.showCurrentPage();
    }
}

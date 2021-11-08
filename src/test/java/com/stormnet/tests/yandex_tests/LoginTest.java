package com.stormnet.tests.yandex_tests;

import com.stormnet.tests.AbstractTest;
import com.stormnet.yandex.actions.CreatorMessageFormActions;
import com.stormnet.yandex.actions.PersonalPageActions;
import com.stormnet.yandex.page_wrappers.CommonSignPage;
import com.stormnet.yandex.page_wrappers.DiskPage;
import com.stormnet.yandex.actions.LoginPageActions;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;


public class LoginTest extends AbstractTest {
    @Test(testName = "Login with right credentials")
    @Story("JIRA-1")
    public void loginTestRightCredentials() {

        driver.get("https://mail.yandex.ru/");

        CommonSignPage commonSignPage = new CommonSignPage(driver);
        commonSignPage.getSignInButtonOpenForm().click();


        LoginPageActions loginPageActions = new LoginPageActions(driver);
        loginPageActions.fillUserName("skalRita14")
                .submitForm()
                .waitUntilOpenedPasswordFiled()
                .fillPassword("skalrita")
                .submitForm();

        PersonalPageActions personalPageActions = new PersonalPageActions(driver);
        personalPageActions.waitUntilOpened()
                .writeMessage();

        CreatorMessageFormActions creatorMessageFormActions = new CreatorMessageFormActions(driver);
        creatorMessageFormActions.waitUntilFindElementField()
                .clickToField()
                .waitUntilFindElementChooseMailer()
                .chooseMailer()
                .waitUntilFindElementThemeField()
                .fillThemeField("dfdfd")
                .uploadFile()
                .waitUntilLoadFile()
                .waitUntilFindSendButton()
                .sendMessage()
                .waitUntilFindReturnButton()
                .clickReturnButton();
        driver.navigate().refresh();

        personalPageActions.waitUntilFindFirstMessage()
                .chooseFirstMessage()
                .waitUntilFindMoveToDisk()
                .openPanelWithDiskButton()
                .moveFileToDisk()
                .waitUntilOpenDisk()
                .openDiskPage();

        DiskPage diskPage = new DiskPage(driver);
        diskPage.waitUntilOpenDownloadPage()
                .openDownload();
//template for 9-10 steps
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        Actions actions = new Actions(driver);
        List<WebElement> myElements = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".listing-item__icon-wrapper")));
        WebElement first = myElements.get(0);
        actions.contextClick(first).perform();
        wait.withMessage("ojo")
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='Menu-Text'])[6]")));
        first.findElement(By.xpath("(//span[@class='Menu-Text'])[6]"));
//        first.findElement(By.xpath("//div[@data-key=\"item-5\"]"));
        first.click();
//
//        wait.withMessage("ojo")
//                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'b-tree__name')])[1]")));
//        first.findElement(By.xpath("(//div[contains(@class,'b-tree__name')])[1]"));
//        first.click();
//        first.findElement(By.xpath("(//button[contains(@class,'confirmation-dialog__button_submit')])[2]"));
//        first.click();

    }
}

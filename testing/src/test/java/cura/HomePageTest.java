package cura;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;

public class HomePageTest {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:/Webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void automatiotest() {
//        // Buka YouTube
//        driver.get("https://www.youtube.com");
//
//        // Cari video yang ingin dijalankan
//        driver.findElement(By.name("search_query")).sendKeys("Naruto OP 16");
//        driver.findElement(By.id("search-icon-legacy")).click();
//
//        // Tunggu beberapa detik untuk memastikan hasil pencarian muncul
//        sleep(1000);
//
//        // Klik video pertama dalam hasil pencarian
//        driver.findElement(By.cssSelector("#contents a#video-title")).click();
//        sleep(3000);
//
//
//        // Clear (hapus) teks dari kotak pencarian
//        driver.findElement(By.name("search_query")).clear();
//
//        // Tunggu beberapa detik untuk memastikan teks terhapus
//        sleep(1000);
//        // Cari video yang ingin dijalankan
//        driver.findElement(By.name("search_query")).sendKeys("road of naruto");
//        driver.findElement(By.id("search-icon-legacy")).click();
//        sleep(3000);
//        driver.findElement(By.cssSelector("#contents a#video-title")).click();
//        sleep(10000);
//        driver.findElement(By.name("search_query")).clear();
//
//        // Tunggu beberapa detik untuk memastikan teks terhapus
//        sleep(2000);
//        // Cari video yang ingin dijalankan
//        driver.findElement(By.name("search_query")).sendKeys("One Piece Opening 2");
//        driver.findElement(By.id("search-icon-legacy")).click();
//        sleep(2000);
//        driver.findElement(By.cssSelector("#contents a#video-title")).click();
//        sleep(30000);
//
//        driver.get("https://www.tiktok.com/@oniven/video/7144004080581578010");
//        sleep(40000);

        driver.get("https://accounts.google.com/");

        // Masukkan alamat email
        driver.findElement(By.name("identifier")).sendKeys("rahmatg236@gmail.com");

        // Klik tombol "Next" (atau "Lanjutkan") setelah memasukkan alamat email
        driver.findElement(By.id("identifierNext")).click();

        // Tunggu beberapa detik untuk memuat halaman berikutnya
        sleep(5000);

        // Masukkan kata sandi
        WebElement passwordInput = driver.findElement(By.name("Passwd"));
        passwordInput.sendKeys("wkwlwiqlowas");
        // Klik tombol "Next" (atau "Lanjutkan") setelah memasukkan kata sandi
        driver.findElement(By.id("passwordNext")).click();
        driver.get("https://www.youtube.com");
        driver.findElement(By.name("search_query")).sendKeys("Naruto OP 16");
        driver.findElement(By.id("search-icon-legacy")).click();
        sleep(1000);
        driver.findElement(By.cssSelector("#contents a#video-title")).click();
        sleep(50000);
        driver.findElement(By.name("search_query")).clear();
        sleep(1000);




    }

    @AfterTest
    public void tearDown() {
        // Tunggu beberapa saat sebelum menutup browser
        sleep(1000);
        driver.quit();
    }

    private void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

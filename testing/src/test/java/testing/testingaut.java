package testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Set;

public class testingaut {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:/Webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
//        driver.manage().window().maximize();

    }
    @Test
// utuk mengaktifkan sistem hapus tanda '//'
    public void automatiotest(){
        driver.get("https://klinikpintar.id/aplikasiklinik");

//        driver.findElement(By.id("webType")).click();
//        sleep(3000);
////        link dropdwon pasien
//        driver.findElement(By.linkText("Untuk Pasien")).click();
//        sleep(3000);
//        driver.navigate().back();
//        sleep(3000);
//        driver.findElement(By.id("webType")).click();
//        sleep(3000);
//        //        link dropdwon perusahaan
//        driver.findElement(By.linkText("Untuk Perusahaan")).click();
//        sleep(3000);
//        driver.navigate().back();
//        driver.findElement(By.id("webType")).click();
//        sleep(3000);
//        //        link dropdwon Klinink
//        driver.findElement(By.linkText("Untuk Klinik")).click();
//        sleep(3000);
//        driver.navigate().back();

        //test ke 2
//        String[] headerTexts = {"Pengadaan Farmalkes", "Kerjasama Operasional"};
//        for (String headerText : headerTexts) {
//            // Temukan elemen yang berisi teks header yang ingin Anda klik
//            WebElement headerElement = driver.findElement(By.xpath("//*[contains(text(), '" + headerText + "')]"));
//            headerElement.click();
//            driver.navigate().back();
//        }
        //Test ke 3
//        driver.findElement(By.id("main-cta")).click();
//        sleep(3000);
//        String currentWindowHandle = driver.getWindowHandle();
//
//        // Tunggu hingga jendela baru muncul
//        Set<String> windowHandles = driver.getWindowHandles();
//        for (String windowHandle : windowHandles) {
//            if (!windowHandle.equals(currentWindowHandle)) {
//                driver.switchTo().window(windowHandle);
//                // Anda sekarang berada di tab yang baru dibuka
//                // Lakukan tindakan lain pada tab baru
//
//                // Kembali ke tab sebelumnya
//                driver.close(); // Tutup tab baru
//                driver.switchTo().window(currentWindowHandle); // Kembali ke tab sebelumnya
//            }
//        }
        //test 4
//        WebElement linkElement = driver.findElement(By.xpath("//a[@data-gtm-event='aplikasi_klinik_cta_jadwalkan_demo']"));
//
//        // Periksa atribut "target" untuk menentukan apakah tautan akan membuka di tab baru
//        if ("_blank".equals(linkElement.getAttribute("target"))) {
//            // Menggunakan JavaScript untuk mengklik tautan dan membuka di tab baru
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("arguments[0].click();", linkElement);
//        } else {
//            // Jika tidak membuka di tab baru, Anda dapat menggunakan linkElement.click() seperti biasa
//            linkElement.click();
//        }

        //test 5
//        WebElement elementWithOnclick = driver.findElement(By.xpath("//div[@onclick='toggleBottomMenu()']"));
//        elementWithOnclick.click();
//        sleep(2000);
//        WebElement integrasiLink = driver.findElement(By.linkText("Integrasi kami"));
//        integrasiLink.click();
//        sleep(2000);
//        driver.navigate().back();

        //test 6
//        WebElement elementWithOnclick = driver.findElement(By.xpath("//div[@onclick='toggleBottomMenu()']"));
//        elementWithOnclick.click();
//        sleep(3000);
//        WebElement integrasiLink = driver.findElement(By.linkText("Fitur aplikasi"));
//        integrasiLink.click();
//        sleep(3000);
//        driver.navigate().back();
        //test 7
//        WebElement elementWithOnclick = driver.findElement(By.xpath("//div[@onclick='toggleBottomMenu()']"));
//        elementWithOnclick.click();
//        sleep(3000);
//        WebElement integrasiLink = driver.findElement(By.linkText("Support aplikasi"));
//        integrasiLink.click();
//        sleep(3000);
//
        //Test 8
//        WebElement elementWithOnclick = driver.findElement(By.xpath("//div[@onclick='toggleBottomMenu()']"));
//        elementWithOnclick.click();
//        sleep(3000);
//        WebElement integrasiLink = driver.findElement(By.linkText("Harga"));
//        integrasiLink.click();
//        sleep(3000);

        //Test 9
//        WebElement elementWithOnclick = driver.findElement(By.xpath("//div[@onclick='toggleBottomMenu()']"));
//        elementWithOnclick.click();
//        sleep(3000);
//        WebElement integrasiLink = driver.findElement(By.linkText("Pertanyaan Umum"));
//        integrasiLink.click();
//        sleep(3000);

        //TEST 10
//        // Temukan elemen tautan berdasarkan atribut href
//        WebElement link = driver.findElement(By.cssSelector("a[href='#coba-sekarang']"));
//
//        // Klik tautan
//        link.click();
//
//        // Tunggu sebentar (opsional)
//        try {
//            Thread.sleep(2000); // Tunggu 2 detik (opsional)
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        // TEST 11
//        try {
//            // Temukan tombol "Lihat semua fitur" berdasarkan teksnya
//            WebElement lihatSemuaFiturButton = driver.findElement(By.linkText("Lihat semua fitur"));
//
//            // Klik tombol "Lihat semua fitur"
//            lihatSemuaFiturButton.click();
//
//            // Tunggu sebentar untuk melihat hasilnya
//            Thread.sleep(3000);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            driver.quit();
//        }

        //test 12
//        try {
//            // Temukan tautan "Lihat update" dalam banner pertama
//            WebElement lihatUpdateLink = driver.findElement(By.cssSelector(".grid-cols-1 a"));
//
//            // Klik tautan "Lihat update"
//            lihatUpdateLink.click();
//
//            // Tunggu sebentar untuk melihat hasilnya
//            Thread.sleep(3000);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            driver.quit();
//        }

        //test 13
       try {
           // Temukan elemen "Daftar sekarang" dan klik
           WebElement daftarSekarangButton = driver.findElement(By.cssSelector("a[href='https://klinikpintar.id/aplikasiklinik/form-daftar']"));
           daftarSekarangButton.click();

           // Tunggu sebentar untuk melihat hasilnya
           Thread.sleep(3000);

           // Anda sekarang berada di halaman baru. Anda dapat menambahkan kode berikut untuk berinteraksi dengan halaman tersebut.

       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           driver.quit();
       }

        //test 14
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

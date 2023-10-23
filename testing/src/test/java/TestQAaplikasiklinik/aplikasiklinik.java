package TestQAaplikasiklinik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class aplikasiklinik {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:/Webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
    public void testAplikasiKlinik() {
        // Buka situs web Aplikasi Klinik
        driver.get("https://klinikpintar.id/aplikasiklinik");

        // Langkah 1: Verifikasi halaman depan
        String pageTitle = driver.getTitle();
        if (pageTitle.contains("Aplikasi klinik yang mudah, lengkap, dan terintegrasi")) {
            System.out.println("");
        } else {
            System.out.println("Halaman depan Aplikasi Klinik gagal dimuat");
        }

        // Langkah 2: Navigasi ke halaman "Jadwal Dokter"
        WebElement jadwalDokterLink = driver.findElement(By.linkText("Jadwal Dokter"));
        jadwalDokterLink.click();

        // Verifikasi bahwa halaman "Jadwal Dokter" berhasil dimuat
        String jadwalDokterPageTitle = driver.getTitle();
        if (jadwalDokterPageTitle.contains("Jadwal Dokter")) {
            System.out.println("Halaman 'Jadwal Dokter' berhasil dimuat");
        } else {
            System.out.println("Halaman 'Jadwal Dokter' gagal dimuat");
        }

        // Lakukan pengujian lebih lanjut sesuai dengan konten dan fitur yang ada di halaman "Jadwal Dokter"

        // Kembali ke halaman depan
        driver.navigate().back();

        // Langkah 3: Navigasi ke halaman "Pendaftaran Pasien"
        WebElement pendaftaranPasienLink = driver.findElement(By.linkText("Pendaftaran Pasien"));
        pendaftaranPasienLink.click();

        // Verifikasi bahwa halaman "Pendaftaran Pasien" berhasil dimuat
        String pendaftaranPasienPageTitle = driver.getTitle();
        if (pendaftaranPasienPageTitle.contains("Pendaftaran Pasien")) {
            System.out.println("Halaman 'Pendaftaran Pasien' berhasil dimuat");
        } else {
            System.out.println("Halaman 'Pendaftaran Pasien' gagal dimuat");
        }

        // Lakukan pengujian lebih lanjut sesuai dengan konten dan fitur yang ada di halaman "Pendaftaran Pasien"

        // Tutup browser
        driver.quit();
    }
}
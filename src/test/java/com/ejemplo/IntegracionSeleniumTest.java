package com.ejemplo;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntegracionSeleniumTest {
    @Test
    void abreEjemploYVerificaTitulo(){
        //Configurar Chrome en modo headless (sin ventana, ideal para CI/CD)
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless=new","--no-sandbox","--disable-dev-shm-usage");

        WebDriver driver= new ChromeDriver(options);
        driver.get("https://example.com");

        String titulo= driver.getTitle().toLowerCase();
        driver.quit();

        //verificamos que el titulo contenga "ejemplo"
        assertTrue(titulo.contains("example"),"El titulo de la pagina deberia contener 'example'");

    }
}

package tests.day10_waits_cookies_webTables;

import org.bouncycastle.math.ec.custom.sec.SecT113Field;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class C02_cookies extends TestBase {

@Test
    public void test01(){
  // 1- Amazon anasayfaya gidin
    driver.get("https://www.amazon.com/");

  // 2- tum cookie’leri listeleyin
   // System.out.println(driver.manage().getCookies());

    Set<Cookie> cookiesseti=  driver.manage().getCookies();
    int siraNo=1;
    for (Cookie eachcookie: cookiesseti
         ) {
        System.out.println(siraNo+"-"+eachcookie);
        siraNo++;
    }

    // 3- Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
    Assert.assertTrue(cookiesseti.size()>5);

  // 4- ismi i18n-prefs olan cookie degerinin USD oldugunu test edin


  // 5- ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturun ve sayfaya ekleyin
    Cookie cookie= new Cookie("en sevdigim cookie","çikolatalı");
    driver.manage().addCookie(cookie);

  // 6- eklediginiz cookie’nin sayfaya eklendigini test edin
  // 7- ismi skin olan cookie’yi silin ve silindigini test edin
  // 8- tum cookie’leri silin ve silindigini test edin


}

}

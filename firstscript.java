Public Class FirstTestCase()
{
  Public Static void Main(String args[])
  {
    System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.findElement(By.id("identifierId")).sendKeys("venkyvenkateshsiri41@gmail.com");
    driver.findElement(By.className("VfPpkd-RLmnJb")).click();
    String st = driver.getTitle();
    String s1 = "gmail";
    driver.close();
    if(st.equalsIgnoreCase(s1))
    {
      System.out.print("Test is success")
    }
    else
    {
      System.out.print("Test is failed"+st);
    }
    
  }
  
}

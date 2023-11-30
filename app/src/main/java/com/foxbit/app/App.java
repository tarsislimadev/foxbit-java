package com.foxbit.app;

import java.io.*;

public class App 
{
  public String int2str(int i) { return "" + i; }
  
  public String readLine() {
    String str = "";

    try {
      int b;
      InputStreamReader isr = new InputStreamReader(System.in);
      while ((b = isr.read()) != 10) str += this.int2str(b);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    return str;
  }
  
  public String mainMenu() {
    System.out.println("-------- Menu     --------");
    System.out.println("");
    System.out.println("1. Login");
    System.out.println("2. -");
    System.out.println("3. Logout");
    System.out.print("Choose some option: ");

    return this.readLine();
  }

  
  public static void main( String[] args )
  {
    Main app = new Main();

    System.out.println("mainMenu: " + app.mainMenu());
  }
}

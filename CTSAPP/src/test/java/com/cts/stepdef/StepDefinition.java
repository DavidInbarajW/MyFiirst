package com.cts.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cts.baseclass.LibGlobal;
import com.cts.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends LibGlobal
{
	public static WebDriver driver;
	public static LoginPage lpage;
	
	
	
		@Given("Launch The Appliction")
	public void launch_the_appliction() {
			siteLaunch("https:\\www.facebook.com");
			
			
		}
	    
	@When("Valid Username is entered")
	public void valid_username_is_entered() {
		 lpage=new LoginPage();
		TxtFill(lpage.getTxtUsername(),"david");
		
	}
	@When("Valid Password is Entered")
	public void valid_password_is_entered() {
		TxtFill(lpage.getTxtPassword(),"DAVID");
	
	}
	@When("Login button is Clicked")
	public void login_button_is_clicked() {
		buttonClk(lpage.getBtnClick());
	    
	}
	@Then("Verify user is logged in")
	public void verify_user_is_logged_in() {
		System.out.println("VERIFIED");
	    
	}



}

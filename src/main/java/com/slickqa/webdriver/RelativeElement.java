package com.slickqa.webdriver;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public interface RelativeElement
{
	public WebElement findElement(WebDriver browser, PageElement pageElement, String tagName) throws NoSuchElementException;

	public String getFindByDescription();
}

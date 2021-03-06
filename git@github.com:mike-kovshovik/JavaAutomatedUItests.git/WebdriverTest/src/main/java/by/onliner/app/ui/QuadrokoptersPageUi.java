package by.onliner.app.ui;

import org.openqa.selenium.By;

public class QuadrokoptersPageUi {
	public final String xpathForQuadroParameters = "//div[@id='schema-filter']//span[text()='%s']";
	public final String xpathListOfCheckboxesToCompare = "//div[@id='schema-products']/div[%s]//span[@class='i-checkbox__faux']";
	public final By radiocontrolAirModelHeader = By.className("schema-header__title");
	public final By rangeOfAction = By.xpath("//input[@placeholder='6']");
	public final By additionalParametersLink = By.linkText("Дополнительные параметры");
	public final By numberOfItemsFound = By
			.xpath("//div[@id='schema-filter-button']//span[starts-with(text(), 'Найдено 27')]");
	public final By sortOrderIcon = By.xpath("//span[@class='schema-order__text']");
	public final By sortOrderDropDowOptionCheap = By.xpath("//div[@id='schema-order']//span[text()='Дешевые']");
	public final By firstPrice = By
			.xpath("//div[@id=\"schema-products\"]/div[1]//div[@class=\"schema-product__price\"]/a/span");
	public final By secondPrice = By
			.xpath("//div[@id=\"schema-products\"]/div[2]//div[@class=\"schema-product__line\"]//a/span");
	public final By numberOfItemsToCompare = By
			.xpath("//div[@id='compare-button-container']//a[@class='compare-button__sub compare-button__sub_main']");
}

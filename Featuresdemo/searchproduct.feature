Feature: Search Functionality
Scenario:Open Browser
Given: Open Browser

Scenario Outline: Validate valid Search functionality
	
	Given: User is in Home page
	When: user enters "<product>" in search field
	And: user click on Search button
	Then: Product "<product>" should be displayed
	Examples: 
		| product |
		| iPhone |
		| Macbook Air |
		| Macbook Pro |
		
Scenario:Close Browser
Given: close the Browser
	
	
	
	
	
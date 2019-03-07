Feature: Welcome to the-internet

	Scenario: home_page 
		Given that user is on main page
		When user clicks on Basik Auth button
		Then user should should enter "admin" and "admin" and click ok
		Then user should be loged in

		
	Scenario: dropdown_options
		Given user is on dropdown page
		When user clicks dropdown box
		Then user should select both options one by one and print text to console
		
	Scenario: upload_file
		Given user is on upload page
		When user clicks on browse button
		Then user should be able to upload the file
		
		
	Scenario: download_file
		Given the user is on download page
		When user clicks on selected file and file will be downloaded
		
		
	Scenario: jquery
		Given user is on jquery page
		Then user clicks on all files one by one and downloads them
	
		
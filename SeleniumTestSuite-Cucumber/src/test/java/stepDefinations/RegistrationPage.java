package stepDefinations;

import java.util.List;

import io.cucumber.java.en.Given;

public class RegistrationPage {
	
	
	@Given("create user with following input:")
	public void create_user_with_following_input(io.cucumber.datatable.DataTable dataTable) {
		List<String> data = dataTable.asList();
		System.out.println("Creating user with following input:");
		for(String d:data) {
			System.out.println(d);
		}
		
	}

	

}

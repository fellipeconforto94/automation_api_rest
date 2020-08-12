package tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.Test;


public class ApiTestsFilme {
	
	private final String ID_DO_FILME = "tt1285016";
	private final String API_KEY = "52ec71bf";
	
	@Test
    public void getTituloFilme(){

		given().
        	when().
        		get("http://www.omdbapi.com/?i={ID_DO_FILME}&apikey={API_KEY}",ID_DO_FILME, API_KEY).
        	then().
            	statusCode(200).
            	body("Title", equalTo("The Social Network"));
    }
	
	@Test
	public void getAnoFilme(){

		given().
        	when().
        		get("http://www.omdbapi.com/?i={ID_DO_FILME}&apikey={API_KEY}",ID_DO_FILME, API_KEY).
        	then().
        		statusCode(200).
        		body("Year", equalTo("2010"));
	    }
	
	@Test
	public void getIdiomaFilme(){

		given().
	        when().
	        	get("http://www.omdbapi.com/?i={ID_DO_FILME}&apikey={API_KEY}",ID_DO_FILME, API_KEY).
	        then().
	        	statusCode(200).
	        	body("Language", equalTo("English, French"));
	    }
	
	@Test
    public void getFilmeInexistente(){
		
		given().
			when().
				get("http://www.omdbapi.com/?ii={ID_DO_FILME}&apikey={API_KEY}",ID_DO_FILME, API_KEY).
			then().
        		statusCode(200).
        		body("Error", equalTo("Incorrect IMDb ID."));
	    }

}

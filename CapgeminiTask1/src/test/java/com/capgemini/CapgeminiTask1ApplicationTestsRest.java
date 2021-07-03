package com.capgemini;
  

import static  org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test; 
 import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;
 import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
  
  class CapgeminiTask1ApplicationTestsRest {
  
  @Test void test()
  {
	  Response response =
  RestAssured.get("http://localhost:8096/emp/getempdepart/Analyst");  
  int statusCode = response.getStatusCode();
  assertEquals(statusCode, 200);
  
  }
  
  @Test void addEmployee()
  {
	 
  EmployeeModel employee=new EmployeeModel(21,"ram","Cloud");
  Response response=  given().contentType("application/json").body(employee) .when()
                     .post("http://localhost:8096/emp/addemp")
                     .then()
                     .extract().response();
  String subject=response.getBody().asString();
  assertEquals("employee added",subject);
  Assertions.assertEquals(200, response.statusCode());

  
  }
  
  @Test void getByDepartmentError() { Response response =
  RestAssured.get("http://localhost:8096/emp/getempdepar/Analyst");
  int statusCode = response.getStatusCode(); assertEquals(statusCode, 404);
  
  }
  
  @Test
  void getByEmployeeId()
  {
	  Response response=given() .contentType("application/json")
			  .when().get("http://localhost:8096/emp/getemp/21") 
			  .then()
              .extract().response();
     String name=response.getBody().jsonPath().get("empName");
	 assertEquals(name,"ram");
	 Assertions.assertEquals(200, response.statusCode());
  	}
  
  @Test 
  void getUpdate()
  { 
	  EmployeeModel employee=new EmployeeModel(21,"ram","Bussiness");
	  Response response=given()
			  .contentType("application/json")
			  .body(employee) 
			  .when().put("http://localhost:8096/emp/updateemp") .then()
              .extract().response();
               Assertions.assertEquals(200, response.statusCode());
  }
  
  @Test 
  void getByName() 
  {
	  Response response = RestAssured.get("http://localhost:8096/emp/getemp/1");
	  int statusCode = response.getStatusCode(); 
	  String name=response.getBody().jsonPath().get("empName");
      assertEquals(name,"Lucky");
	  assertEquals(statusCode, 200);
  }
  @Test
  void deleteEmployee() 
  { 
	  Response response = RestAssured.delete("http://localhost:8096/emp/delemp/2");
	  String subject=response.getBody().asString();
	  assertEquals("employee deleted",subject);
      Assertions.assertEquals(200, response.statusCode());
  }
  
  
  
  }
 
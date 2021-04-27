
  package com.casestudy;
  
  import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.skyscreamer.jsonassert.JSONAssert;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
  import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
  import org.springframework.http.HttpStatus;
  import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletResponse;
  import org.springframework.security.test.context.support.WithMockUser;
  import org.springframework.test.context.junit4.SpringRunner;
  import org.springframework.test.web.servlet.MockMvc;
  import org.springframework.test.web.servlet.MvcResult;
  import org.springframework.test.web.servlet.RequestBuilder;
  import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.casestudy.repository.trainRepo;
import com.casestudy.service.trainServiceImpl;
import com.casestudy.traincontroller.RsourceController;
import com.casestudy.user.StationStops;
import com.casestudy.user.Train;
import com.casestudy.user.reservationType;
  
@TestInstance(Lifecycle.PER_CLASS)
  class CaseStudyTrainApplicationTests {
	@Autowired
	private MockMvc mockMvc;


	  @Mock trainRepo trainRepository;
	  
	  @Mock private trainServiceImpl trainService;
	  @Mock private RsourceController trainController;
	  @Autowired
	    private TestRestTemplate restTemplate;
	  
	  @BeforeAll public void init() { 
		  MockitoAnnotations.initMocks(this);
	  }
	  
  
  

  }
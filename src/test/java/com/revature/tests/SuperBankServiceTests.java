package com.revature.tests;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.revature.model.Superallusers;
import com.revature.repository.SuperBankRepositoryImpl;
import com.revature.service.SuperBankService;




import static org.junit.Assert.*;




public class SuperBankServiceTests {


	@Mock
	public SuperBankRepositoryImpl superbankrepositoryImpl;
	
	
	@InjectMocks
	public static SuperBankService service;
	
	@BeforeClass
	public static void setUp() {
		service = new SuperBankService();
	}
	
	@Before
	public void beforeEach() {
		/*
		 * We must initialize anything that has been annotated with our
		 * Mockito annotations.
		 */
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testgetAllSuperUsers() {
		
		/*
		 * I need to supply some mock data that will be returned whenever we
		 * call the getAllSuperPets method. This ensures that I never hit my
		 * database just to test my service layer.
		 */
		
		Mockito.when(SuperBankRepositoryImpl.getAllSuperUsers()).thenReturn(
				Arrays.asList(
						new Superallusers(1, "Name",  "Pass"),
						new Superallusers(2, "Name2", "Pass", "Name2", 329, "CoOwner2", 0, false),
						
				);
		
		Assert.assertNotNull(SuperBankServiceTests.service.getAllAccounts());
		Assert.assertEquals(SuperBankServiceTests.service.getAllAccounts().get(0).getName(), "Name");
		Assert.assertSame(SuperBankServiceTests.service.getAllAccounts().get(0).getName(), "Name");
		
		
	}
	

	@Test
	public void testGetAccountById() {
		Mockito.when(repositoryImpl.getRowById(1)).thenReturn(
				new Superallusers(1, "Name",  "Pass", "Name", 32, "CoOwner", 0, false)
				);

		Assert.assertNotNull(SuperBankServiceTests.service.getRowById(1));
		Assert.assertEquals(((Object) SuperBankServiceTests.service.getRowById(1)).getRole(), 0);
		Assert.assertEquals(SuperBankServiceTests.service.getRowById(1).getName(), "Name");
	}
	
	@Test
	public void testgetRowbyTwoColumns() {
		Mockito.when(repositoryImpl.getRowbyTwoColumns("Name", "Pass")).thenReturn(
				new BankingTable(1, "Name",  "Pass", "Name", 32, "CoOwner", 0, false)
				);

//		Assert.assertNotNull(BankServiceTests.service.getRowbyTwoColumns("Name", "Pass"));
//		Assert.assertEquals(BankServiceTests.service.getRowbyTwoColumns("Name", "Pass").getUsername(), "Name");
	}
}


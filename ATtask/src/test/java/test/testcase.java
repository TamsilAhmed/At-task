package test;

import org.testng.annotations.Test;

import page.Store;

public class testcase extends Store{
	@Test
	public void test1() {
		Store st = new Store();
		st.signup("Tamsil", "moopan12");
	}
	
	
	
	
	
	@Test
	public void test2() throws Exception {
		Store st = new Store();
		
		st.login("Tamsil", "moopan12");
		
		st.product();
		
		st.order("Tamsil", "India", "Chennai", "4005550000000019", "April", "2026");
	}

}

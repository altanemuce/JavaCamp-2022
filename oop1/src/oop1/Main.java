package oop1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Product productOne = new Product();
		productOne.setName("Delonghi Kahve Makinesi");
		productOne.setDiscount(7);
		productOne.setUnitPrice(7500);
		productOne.setUnitsInStock(25);
		productOne.setImageUrl("DelonghiKahveMakinesi.img");

		// set value

		Product productTwo = new Product();
		productTwo.setName("Vestel Kahve Makinesi");
		productTwo.setDiscount(7);
		productTwo.setUnitPrice(2000);
		productTwo.setUnitsInStock(78);
		productTwo.setImageUrl("vestelkahvemakinesi.img");

		Product productThree = new Product();
		productThree.setName("Arçelik Kahve Makinesi");
		productThree.setDiscount(2);
		productThree.setUnitPrice(12000);
		productThree.setUnitsInStock(5);
		productThree.setImageUrl("arçelikkahvemakinesi.img");

		// get value
		System.out.println(productOne.getImageUrl());

		Product[] productsOne = { productOne, productTwo, productThree };

		for (Product product : productsOne) {
			System.out.println(product.getName());
		}

		ArrayList<Product> products = new ArrayList<Product>();
		products.add(productOne);
		products.add(productTwo);
		products.add(productThree);

		for (Product product : products) {
			System.out.println("Ürün : " + product.getName() + " " + product.getUnitPrice() + " "
					+ product.getDiscount() + " " + product.getUnitsInStock() + " " + product.getImageUrl());
		}

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("055454");
		individualCustomer.setCustomerNumber("121221");
		individualCustomer.setFirstName("altan");
		individualCustomer.setLastName("emuce");
		
		CorporateCustomer corporateCustomer=new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("21312");
		corporateCustomer.setTaxNumber("2321321321");
		corporateCustomer.setCustomerNumber("546772");
		
		Customer[] customers= {individualCustomer,corporateCustomer};
		

	}

}

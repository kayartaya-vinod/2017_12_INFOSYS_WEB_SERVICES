package co.vinod.programs;

import java.io.FileWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import co.vinod.entity.Brand;
import co.vinod.entity.Product;

public class P01_GenerateXmlDocument {
	public static void main(String[] args) throws Exception {
		
		JAXBContext ctx = JAXBContext.newInstance(Product.class);
		
		Product p = new Product();
		p.setId(1);
		p.setName("Potato");
		p.setDescription("Royal Potato Medium Size");
		p.setQuantityPerUnit("1 Kg pack");
		p.setUnitPrice(35.0);
		p.setDiscount(0.0);
		p.setPicture("p001potato.png");
		
		p.setBrand(new Brand(1, "Malnad"));
		
		Marshaller marshaller = ctx.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		FileWriter out = new FileWriter("p1.xml");
		marshaller.marshal(p, out);
		out.close();
		
		System.out.println("Done saving the p1.xml");
		
	}
}

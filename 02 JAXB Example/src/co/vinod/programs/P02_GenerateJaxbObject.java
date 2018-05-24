package co.vinod.programs;

import java.io.FileReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import co.vinod.entity.Product;

public class P02_GenerateJaxbObject {
	public static void main(String[] args)throws Exception {
		
		JAXBContext ctx = JAXBContext.newInstance(Product.class);
		
		Unmarshaller um = ctx.createUnmarshaller();
		Object obj = um.unmarshal(new FileReader("p1.xml"));
		
		if(obj instanceof Product){
			Product p1 = (Product) obj;
			System.out.println(p1.getName());
			System.out.println(p1.getDescription());
			System.out.println(p1.getUnitPrice());
			
		}
		
	}
}

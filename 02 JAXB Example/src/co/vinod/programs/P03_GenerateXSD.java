package co.vinod.programs;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

import co.vinod.entity.Product;

public class P03_GenerateXSD {
	
	static class XSDFileCreator extends SchemaOutputResolver {
		
		String filename;
		
		public XSDFileCreator(String filename){
			this.filename = filename;
		}

		@Override
		public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
			FileOutputStream file = new FileOutputStream(filename);
			StreamResult result = new StreamResult(file);
			result.setSystemId(filename);
			return result;
		}
	}

	public static void main(String[] args) throws Exception {
		JAXBContext ctx = JAXBContext.newInstance(Product.class);
		ctx.generateSchema(new XSDFileCreator("product.xsd"));
		System.out.println("Scheam file is now generated!");
	}
}

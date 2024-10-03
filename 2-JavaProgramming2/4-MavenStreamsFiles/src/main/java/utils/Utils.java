package utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.apache.commons.lang3.reflect.FieldUtils;

import com.github.javafaker.File;

import entities.Product;

public class Utils {
	
	public static void salvaProdottiSuDisco(List<Product> prodotti) {
		
		String path = "src/products.txt";
		File file = new File(path);
		
		try {
			
			prodotti.forEach(p -> {
				FileUtils.writeStringToFile(file, 
						p.getCategory() + "@" + p.getName() + "@" + p.getPrice() + "#",
						StandardCharsets.UTF_8, true);
			});
			
			
		}catch(IOException e) {
			throw new RuntimeException(e);
		}
		
	}

}

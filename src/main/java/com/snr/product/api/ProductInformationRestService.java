/**
 * 
 */
package com.snr.product.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snr.product.bean.OrderProducts;
import com.snr.product.bean.Product;

/**
 * @author I326319
 *
 */

@RestController
@RequestMapping("/product")
public class ProductInformationRestService {
	
	@RequestMapping("/productDetails/{productId}")
	public Product getProductDetails(@PathVariable("productId") String productId) {
		return new Product("headphone", "wireless", 2000.0);
	}
	
	@RequestMapping("/myProducts/{orderId}")
	public OrderProducts getProductList(@PathVariable("orderId") String orderId) {
		OrderProducts orderProducts = new OrderProducts();
		List<Product> products = Arrays.asList(new Product("headphone", "wireless", 2000.0),
				new Product("smart watch", "wearable devices", 1200.0),
				new Product("hardDisk", "1TB", 4000.0));
		orderProducts.setProducts(products);
		return orderProducts;
	}

}

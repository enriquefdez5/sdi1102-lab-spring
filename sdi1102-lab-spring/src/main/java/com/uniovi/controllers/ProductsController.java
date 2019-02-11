package com.uniovi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uniovi.entities.Product;
import com.uniovi.services.ProductsService;

@Controller
public class ProductsController {

	@Autowired
	private ProductsService productsService;

	@RequestMapping("/product/listProducts")
	public String getList(Model model) {
		model.addAttribute("productList", productsService.getProducts());
		return "product/listProducts";
	}

	@RequestMapping(value = "/product/addProduct", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute Product product) {
		productsService.addProduct(product);
		return "redirect:/product/listProducts" ;
	}
	
	@RequestMapping(value = "/product/addProduct")
	public String getProduct() {
		return "product/addProduct";
	}
}

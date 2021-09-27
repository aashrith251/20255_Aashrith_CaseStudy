package com.sonata.Controller;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sonata.Model.Product;
import com.sonata.Model.Task;
import com.sonata.Repository.ProductRepository;

@RestController

@CrossOrigin("http://localhost:4200/")

public class ProductController {
	Optional<Product> u1;
	
	@Autowired
	private ProductRepository prepository;
	@GetMapping("/product")
	public List<Product> getAllUsers()
	{
		return prepository.findAll();
	}
	@GetMapping(value= "/product/{id}")
	public ResponseEntity getproductById(@PathVariable(value="id") Long pId)
	{
		u1= prepository.findById(pId);
		return ResponseEntity.ok().body(u1);
	}
	@PostMapping(value = "/product")
	public Product saveProduct(@RequestBody Product product)
	{
		return prepository.save(product);
	}
	
	@PutMapping(value="/product/{id}")
	public ResponseEntity updateProduct(@PathVariable(value="id") Long pId, @Valid @RequestBody Product pdata) {
		u1 = prepository.findById(pId);
		Product p2 = u1.get();
		p2.setpId(pdata.getpId());
		p2.setpName(pdata.getpName());
		p2.setpPrice(pdata.getpPrice());
		Product updateproduct=prepository.save(p2);
		return ResponseEntity.ok(updateproduct);
	}
	
	@DeleteMapping(value="/product/{id}")
	public ResponseEntity deleteProduct(@PathVariable(value="id")Long pId) {
		prepository.deleteById(pId);
		return ResponseEntity.noContent().build();
	}


}
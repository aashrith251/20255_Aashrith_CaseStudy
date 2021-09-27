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
import com.sonata.Model.Login;
import com.sonata.Repository.LoginRepository;
@RestController

@CrossOrigin("http://localhost:4200/")

public class LoginController {
	Optional<Login> u1;
	
	@Autowired
	private LoginRepository prepository;
	@GetMapping("/login")
	public List<Login> getAllUsers()
	{
		return prepository.findAll();
	}
	@GetMapping(value= "/login/{id}")
	public ResponseEntity getuserById(@PathVariable(value="id") Long userId)
	{
		u1= prepository.findById(userId);
		return ResponseEntity.ok().body(u1);
	}
	@PostMapping(value = "/login")
	public Login saveProduct(@RequestBody Login login)
	{
		return prepository.save(login);
	}
	
	@PutMapping(value="/login/{id}")
	public ResponseEntity updateUser(@PathVariable(value="id") Long userId, @Valid @RequestBody Login pdata) {
		u1 = prepository.findById(userId);
		Login p2 = u1.get();
		p2.setuserId(pdata.getuserId());
		p2.setPassword(pdata.getPassword());
		Login updateUser = prepository.save(p2);
		return ResponseEntity.ok(updateUser);
	}
	
	@DeleteMapping(value="/login/{id}")
	public ResponseEntity deleteUser(@PathVariable(value="id")Long userId) {
		prepository.deleteById(userId);
		return ResponseEntity.noContent().build();
	}


}

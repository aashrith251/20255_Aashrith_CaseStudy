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
import com.sonata.Model.User;
import com.sonata.Repository.UserRepository;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	Optional<User> u1;
	
	@Autowired
	private UserRepository prepository;
	@GetMapping("/user")
	public List<User> getAllUsers()
	{
		return prepository.findAll();
	}
	@GetMapping(value= "/user/{id}")
	public ResponseEntity getuserById(@PathVariable(value="id") Long userId)
	{
		u1= prepository.findById(userId);
		return ResponseEntity.ok().body(u1);
	}
	@PostMapping(value = "/user")
	public User saveProduct(@RequestBody User user)
	{
		return prepository.save(user);
	}
	
	@PutMapping(value="/user/{id}")
	public ResponseEntity updateUser(@PathVariable(value="id") Long userId, @Valid @RequestBody User pdata) {
		u1 = prepository.findById(userId);
		User p2 = u1.get();
		
		p2.setUserId(pdata.getUserId());
		p2.setUserName(pdata.getUserName());
		p2.setRole(pdata.getRole());
		p2.setEmail(pdata.getEmail());
		p2.setDob(pdata.getDob());
		p2.setCreatedOn(pdata.getCreatedOn());
		p2.setContactNumber(pdata.getContactNumber());
		p2.setAlive(pdata.isAlive());
		p2.setPassword(pdata.getPassword());
		
		User updateUser = prepository.save(p2);
		return ResponseEntity.ok(updateUser);
	}
	
	@DeleteMapping(value="/user/{id}")
	public ResponseEntity deleteUser(@PathVariable(value="id")Long userId) {
		prepository.deleteById(userId);
		return ResponseEntity.noContent().build();
	}


}

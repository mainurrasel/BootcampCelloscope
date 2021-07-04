package net.celloscope.springdatajdbcdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    public UserController() {
        super();
    }

    //creating a user
    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return this.userRepository.save(user);
    }

    //showing all user
    @GetMapping
    public List<User> getUserList() {
        return (List<User>) userRepository.findAll();
    }


    //    public ResponseEntity<User> getUserById(@PathVariable(value = "id") final Long userId){
//        User user = userRepository.findById(userId).get();
//        return ResponseEntity.badRequest().body(user);
//    }

    //showing a user by id
    @GetMapping("/{id}")
    public User getUserById(@PathVariable(value = "id") final Long userId) {
        return userRepository.findById(userId).get();

    }

    //updating a existing user
    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable(value = "id") final Long userId, @RequestBody User user) {
        user.setId(userId);
        return this.userRepository.save(user);
    }

    //deleting a existing user
    @DeleteMapping("/delete/{id}")
    public void updateUser(@PathVariable(value = "id") final Long userId) {
        this.userRepository.deleteById(userId);
    }


}



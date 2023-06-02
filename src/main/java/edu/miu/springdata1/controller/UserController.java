package edu.miu.springdata1.controller;

import edu.miu.springdata1.entity.Review;
import edu.miu.springdata1.entity.User;
import edu.miu.springdata1.dto.output.UserDto;
import edu.miu.springdata1.dto.input.PagingRequest;
import edu.miu.springdata1.repo.UserRepo;
import edu.miu.springdata1.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/paging")
    public Page<User> paging(@RequestBody PagingRequest pagingRequest) {
        return userService.paging(pagingRequest);
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.findAll();
    }

    @GetMapping("/{id}/dto")
    public UserDto getUserDto(@PathVariable("id") int id){
        return userService.findByIdDto(id);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") int id){
        return userService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") int id){
       userService.deleteById(id);
    }

    @Autowired
    UserRepo userRepo;

    @GetMapping("/test-new")
    public List<User> sampleQuery() {
        return userRepo.sampleQuery();
    }


}

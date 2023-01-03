package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/mapping/users")
public class MappingClassController {

    @GetMapping
    public String user() {
        return "get users";
    }

    @PostMapping
    public String addUser() {
        return "post user";
    }

    @GetMapping
    public String findUser(@PathVariable String userId) {
        return "get userUd = " + userId;
    }

    @PatchMapping
    public String updateUser(@PathVariable String userId) {
        return "update userId=" + userId;
    }

    @DeleteMapping
    public String deleteUser(@PathVariable String userId) {
        return "delete userId=" + userId;
    }

}

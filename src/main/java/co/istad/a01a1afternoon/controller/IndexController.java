package co.istad.a01a1afternoon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @GetMapping("/index/{page}/category/{number}")
    public  String viewIndext(@PathVariable String page,
                              @PathVariable Integer number,
                              @RequestParam(required = false,defaultValue = "") String query){
        System.out.println("Page" +page);
        System.out.println("Category Name"+number);
        System.out.println("Query "+query);
        return "index";
    }
}

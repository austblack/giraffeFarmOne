package com.gf;

import com.objects.Recipe;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ablackmo on 8/19/2016.
 */
@RestController
public class HomeController {


    @RequestMapping("/findRecipes")
    public List<Recipe> findAllRecipes (){


        List<Recipe> phoods = new ArrayList<Recipe>();

        String test = "something";

        test = test + "test";


        return phoods;
    }


    /*
    @RequestMapping("/home")
    public String index() {
        return "AYE WE MADE IT!";
    }
/*
    @RequestMapping("/inThere")
    public String homePage() {
        return "homePage";
    }
*/

}

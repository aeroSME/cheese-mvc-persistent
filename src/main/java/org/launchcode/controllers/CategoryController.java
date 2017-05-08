package org.launchcode.controllers;

import org.launchcode.models.data.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Stephen on 5/8/2017.
 */
@Controller
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryDAO categoryDao;

    // Request path: /category
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("categories", categoryDao.findAll());
        model.addAttribute("title", "Categories");

        return "category/index";
    }
}

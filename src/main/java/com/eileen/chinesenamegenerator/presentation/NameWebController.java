package com.eileen.chinesenamegenerator.presentation;

import com.eileen.chinesenamegenerator.logic.ChineseNameService;
import com.eileen.chinesenamegenerator.logic.InputName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class NameWebController {

    @Autowired
    private ChineseNameService chineseNameService;

    @GetMapping("/")
    public String index(Model model){
        return "index";
    }

    @PostMapping("/create")
    public String createName(@ModelAttribute InputName inputName){
        chineseNameService.generateChineseName(inputName);
        return "result";
    }

}

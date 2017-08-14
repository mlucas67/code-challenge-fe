package com.greatcode.codechallengefrontend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by marshall.lucas on 8/14/2017.
 */
@Controller
public class ConvertController {

    @Autowired
    CodeChallengeService codeChallengeService;

    @GetMapping("/convert")
    public String convertForm(ModelMap model) {
        model.addAttribute("rang", new Rang());
        model.addAttribute("result", new Result());
        return "convert";
    }

    @PostMapping("/convert")
    public String convertSumbit(@ModelAttribute Rang rang, @ModelAttribute Result result)
    {
        boolean isValid = codeChallengeService.validateMinMax(rang.getMin(), rang.getMax());

        if (isValid) {
            result.setResult((codeChallengeService.callWebService(rang)).getResult());
        }

        return "convert";
    }

}

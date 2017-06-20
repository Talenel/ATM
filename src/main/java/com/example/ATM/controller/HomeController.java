package com.example.ATM.controller;

import com.example.ATM.data.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    private AtmRepository atmRepository;

    @RequestMapping("/")
    public String home()
    {
        return "home";
    }

    @GetMapping("/deposit")
    public String greetingForm(Model model) {
        model.addAttribute("transaction", new Transaction("Deposit"));
        return "deposit";
    }

    @PostMapping("/deposit")
    public String greetingSubmit(@ModelAttribute Transaction transaction) {

        atmRepository.save(transaction);
        //@Valid Account account, BindingResult bindingResult
        /*
        if (bindingResult.hasErrors()) {
            return "deposit";
        }
        atmRepository.save(account);
        return "result";
        */
        return "result";
    }


    @RequestMapping("/everything")
    public @ResponseBody Iterable<Transaction> getEveryThing()
    {
        return atmRepository.findAll();
    }

    @GetMapping("/history")
    public String transactionForm(Model model) {
        model.addAttribute("acctNum");
        return "history";
    }

    @PostMapping("/history")
    public String transactionHistory(@ModelAttribute String acctNum)
    {
        String history= "0";
        atmRepository.findAllByAcctNum(Integer.parseInt(acctNum));


        return "history";
    }


}

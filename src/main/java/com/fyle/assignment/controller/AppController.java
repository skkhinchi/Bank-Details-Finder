package com.fyle.assignment.controller;

import com.fyle.assignment.Repository.BankRepository;
import com.fyle.assignment.Repository.BranchesRepository;
import com.fyle.assignment.model.Banks;
import com.fyle.assignment.model.Branches;
import com.fyle.assignment.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Sort;

@Controller
public class AppController {
    @Autowired
    BankRepository bankRepository;

    @Autowired
    BranchesRepository branchesRepository;

    @Autowired
    BranchService branchService;

    @ResponseBody
    @RequestMapping("/findall")
    public List<Banks> banksData() {
        return bankRepository.findAll();

    }

    @ResponseBody
    @RequestMapping("/findAllBranches")
    public List<Branches> branchData() {
        return (List<Branches>) branchesRepository.findAll();

    }

    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }

    //	@RequestMapping("/show-bank")
//	public Branches showBank(@RequestParam String id) {
//		Branches branches=branchService.showMyBank(id);
//		
//		return branches;
//	}
    @ResponseBody
    @RequestMapping("/show-bank")
    public Branches showBank(@RequestParam String id) {
        Branches branches = branchService.showMyBank(id);
        return branches;
    }

//	@ResponseBody
//	@RequestMapping("/show-banks-by-city")
//	public List<Branches> showByCity(@RequestParam String city, @RequestParam int offset,@RequestParam int limit) {

//		List<Branches> branches = branchService.showBankByCity(city,offset,limit);
//		LimitAdd limitAdd = new LimitAdd();
//		limitAdd.setCity(city);
//		limitAdd.setLimit(limit);
//		limitAdd.setOffset(offset);
//		List<Branches> branches = branchService.showBankByCityAndBank(limitAdd);
//
//		return branches;

//	}


    @ResponseBody
    @RequestMapping("/show-banks-by-city")
    public List<Branches> showByCity(@RequestParam String city, @RequestParam Integer page, @RequestParam Integer size) {
        List<Branches> branches = null;


        branches = branchService.showBankByCity(city, PageRequest.of(page, size));
        return branches;
    }


}

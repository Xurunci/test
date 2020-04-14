package com.example.test.controller;



import com.example.test.common.ServerResponse;
import com.example.test.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/product/")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value="checkPriceByPname.do",method=RequestMethod.POST)
    @ResponseBody
    public ServerResponse<Integer> checkPriceByPname(@RequestParam(name = "pName")String pName){
        return productService.checkPriceByPname(pName);
    }



}

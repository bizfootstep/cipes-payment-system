package com.bizzjen.cipes.cipespaymentservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.management.ManagementFactory;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/payment")
public class RecipePaymentController {

    private final static Logger logger = LoggerFactory.getLogger(RecipePaymentController.class);


//    @PostMapping("/buyRecipe")
//    public ResponseEntity<Object> buyRecipe(@RequestBody int recipeId) {
//        System.out.println("Number of threads " + Thread.activeCount());
//        System.out.println("Total Number of threads " + ManagementFactory.getThreadMXBean().getThreadCount());
//        Map<String, String> boughtDetail = new HashMap<>();
//        boughtDetail.put("message", "Successfully paid!" + recipeId);
//        Map<String, Object> response = new HashMap<>();
//        response.put("data", boughtDetail);
//        return ResponseEntity.ok(response);
//    }

    @GetMapping("/order/status/{orderId}")
    public String getOrder(@PathVariable long orderId){
        return "Succesful " + orderId;
    }
}

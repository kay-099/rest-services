package com.mwanza.rest_services;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {
    
    private List<Details> detailsList = new ArrayList<>();

    @GetMapping("/details")
    public List<Details> getAllDetails() {
        return detailsList;
    }

    @PostMapping("/details")
    public String addDetails(@RequestBody Details details) {
        detailsList.add(details);
        return "Data Inserted Successfully";
    }
    
    @PutMapping("/details/{id}")
    public String putMethodName(@PathVariable int id, @RequestBody Details updateDetails) {
        for (Details details : detailsList){
            if (details.getId() == id) {
                details.setName(updateDetails.getName());
                return "Data Updated Successfully";
            }
        }
        return "Details not found!";
    }

    @DeleteMapping("/details/{id}")
    public String deleteDetails(@PathVariable int id) {
        detailsList.removeIf(details -> details.getId()== id);
        return "Data Deleted Successfully";
    }
    
}

package tws.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.Entity.Employees;
import tws.repository.EmployeeMapper;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class Controller {
    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping("/")
    public ResponseEntity<List<Employees>> getall(){
      List<Employees> employees = employeeMapper.selecetAll();
      return ResponseEntity.ok(employees);
    }



}

package com.SOAPTask3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SoapTask3Application {

	public static void main(String[] args) {

		SpringApplication.run(SoapTask3Application.class, args);
	}
	@GetMapping("/add")
	public String add(@RequestParam(value = "model", defaultValue = "monkey Car") String model){
		Car car = new Car();
		car.setModel(model);
		CarDAOImplementation carDAOImplementation = new CarDAOImplementation();
		carDAOImplementation.add(car);
		return String.format("Model added: %s!" + model);
	}
	@GetMapping("/delete")
	public String delete(@RequestParam(value = "id") long id){
		CarDAOImplementation carDAOImplementation = new CarDAOImplementation();
		Car car = carDAOImplementation.findById(id);
		String model = car.getModel();
		carDAOImplementation.delete(id);
		return String.format("Model deleted: %s!" + model);
	}
	@GetMapping("/update")
	public String update(@RequestParam(value = "id") long id, @RequestParam(value = "price") long price){
		CarDAOImplementation carDAOImplementation = new CarDAOImplementation();
		carDAOImplementation.update(id, price);
		Car car = carDAOImplementation.findById(id);
		return String.format("Model updated: %s!" + car.getModel());
	}
	@GetMapping("/findById")
	public String add(@RequestParam(value = "id") long id){
		CarDAOImplementation carDAOImplementation = new CarDAOImplementation();
		Car car = carDAOImplementation.findById(id);
		return String.format("Model: %s!" + car.getModel());
	}
}

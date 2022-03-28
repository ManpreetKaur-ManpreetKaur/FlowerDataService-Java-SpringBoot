package com.example.flowerdataservice.data.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public interface FlowerDataRepository extends JpaRepository<Flower,String> {
}

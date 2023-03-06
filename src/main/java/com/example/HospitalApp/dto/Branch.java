package com.example.HospitalApp.dto;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Branch {
   private int id;
   private String name;
   private long phone;
   private String emil;
}

package com.safalifter.userservice.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "clinics")
public class Clinic extends BaseEntity {
    private String test;
}

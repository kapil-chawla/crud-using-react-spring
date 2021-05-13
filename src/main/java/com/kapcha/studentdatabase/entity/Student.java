package com.kapcha.studentdatabase.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    @Id
    @Getter
    @Setter
    private Long id;
    
    @Getter
    @Setter
    private String name;
    
    @Getter
    @Setter
    private Long rollNumber;

}

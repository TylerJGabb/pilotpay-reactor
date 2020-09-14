package com.gabb.study.persistance.entities;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Pilot extends EntityWithUUID {
    @NonNull private String name;
    @NonNull private String email;
    @NonNull private Integer payRate;

}

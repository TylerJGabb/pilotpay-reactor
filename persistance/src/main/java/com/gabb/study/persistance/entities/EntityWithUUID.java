package com.gabb.study.persistance.entities;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

//this class is a superclass of an entity, and should
//have its attributes mapped into the entity
@MappedSuperclass
@Data //the getId will be passed to others
public class EntityWithUUID {

    //primary key, of type pg-uuid
    @Id @Type(type = "pg-uuid")
    private UUID id;

    //when constructed, will auto-generate a UUID (why can't postgres do this?)
    public EntityWithUUID() {
        this.id = UUID.randomUUID();
    }

}

package com.eazybytes.cards.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
//This annotation enables auditing for the BaseEntity class,
//allowing Spring Data JPA to automatically set the createdBy,
//updatedBy, createdDate, and updatedDate fields when the entity
//is created or updated.
public class BaseEntity {
    @CreatedBy
    @Column(name = "created_by", updatable = false)
    private String createdBy;
    @LastModifiedBy
    @Column(name = "updated_by", insertable = false)
    private String updatedBy;
    @CreatedDate
    @Column(name = "created_date", updatable = false)
    private String createdDate;
    @LastModifiedDate
    @Column(name = "updated_date", insertable = false)
    private String updatedDate;
}

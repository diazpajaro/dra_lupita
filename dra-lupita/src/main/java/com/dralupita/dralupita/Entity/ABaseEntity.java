package com.dralupita.dralupita.Entity;


import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalTime;

@MappedSuperclass
public abstract class ABaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "state", length = 50, nullable = false)
    private Boolean state;

    @Column(name = "created_at", nullable = true)
    private LocalTime createdAt;

    @Column(name = "updated_at", nullable = true)
    private LocalTime updatedAt;

    @Column(name = "deleted_at", nullable = true)
    private LocalTime deletedAt;

    @Column(name = "created_by", length = 50, nullable = true)
    private String createdBy;

    @Column(name = "updated_by", length = 50, nullable = true)
    private String updatedBy;

    @Column(name = "deleted_by", length = 50, nullable = true)
    private String deletedBy;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }
}

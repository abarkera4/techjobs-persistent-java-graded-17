package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    public Employer() {
    }

    @NotBlank
    @Size(max = 255)
    private String location;

    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    public @NotBlank @Size(max = 255) String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank @Size(max = 255) String location) {
        this.location = location;
    }


}

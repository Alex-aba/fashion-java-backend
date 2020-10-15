package com.fashion.fashionjavabackend.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * Class User.
 */
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User {

    @EqualsAndHashCode.Include
    private Long id;

    private String name;

    private String email;

    private String password;

    private Date dateOfCreation;

    private Date dateOfLastModification;
}

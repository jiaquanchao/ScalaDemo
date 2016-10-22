package com.jax.scala.tools;

import java.util.Optional;

/**
 * Created by Jax on 2016/10/22.
 */
public class Company {
    private final Long id;
    private Optional<String> name;

    public Company(Long id, Optional<String> name) {
        this.id = id;
        setName(name);
    }

    public Long getId() { return id; }
    public Optional<String> getName() { return name; }
    public void setName(Optional<String> name) { this.name = name; }
}

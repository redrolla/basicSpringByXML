package com.learningSpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
    private int id;
    private Chamber chamber;

    @Autowired
    public Zoo(Chamber chamber) {
        this.id = 1;
        this.chamber = chamber;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "id=" + id +
                ", chamber=" + chamber +
                '}';
    }
}

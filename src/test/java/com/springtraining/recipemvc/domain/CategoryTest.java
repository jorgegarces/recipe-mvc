package com.springtraining.recipemvc.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    static Category category;

    @BeforeAll
    public static void setUp() {
        category = new Category();
    }

    @Test
    void getId() {

        category.setId(4l);

        Assertions.assertEquals(4l, category.getId());
    }

    @Test
    void getDescription() {
    }

    @Test
    void getRecipes() {
    }
}
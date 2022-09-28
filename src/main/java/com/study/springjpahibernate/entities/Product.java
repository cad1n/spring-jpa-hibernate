package com.study.springjpahibernate.entities;

import jdk.jfr.Category;

import java.util.HashSet;
import java.util.Set;

public class Product {
    private Long id;
    private String name;
    private String description;
    private double price;
    private String imgUrl;

    private Set<Category> categories = new HashSet<>();
}

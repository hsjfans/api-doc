package com.hsjfans.github.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 *
 * An atomic class to mapped the params who are the fields of an entity ( contains the warp ) or
 *
 * the primitive type and etc.
 *
 * Just like an tree
 *
 * @author hsjfans[hsjfans.scholar@gmail.com]
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassField implements Serializable {


    /**
     *  the name of request param
     */
    private String name;


    /**
     *  the regex pattern `@regex '^1{3,4,5,6,7,8}[0-9]{9}$'`
     */
    private String regex;


    /**
     *  the type of param
     */
    private String type;


    /**
     *  contain "@fuzzy"
     *
     *  default false
     */
    private boolean fuzzy = false;


    private boolean ignore = false;


    /**
     *  is nullable or not
     */
    private boolean nullable = false;


    /**
     *  is list or not
     */
    private boolean array = false;


    /**
     *  is enumType or not
     */
    private boolean enumType = false;


    /**
     *  the description
     */
    private String description;


    /**
     *  Collection  class
     */
    private List<ClassField> fields;


    private Object[] enumValues;


}

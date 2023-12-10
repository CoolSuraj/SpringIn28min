package com.suraj.in28min.code.config;


/**
 * 
 * @author Suraj
 * record is introduced in JDK 16 for making POJo classes less verbose that means it adds contructors,getters,setters,etc automaticallly 
 * Person have name and age 
 * A record declaration specifies in a header a description of its contents; 
 * the appropriate accessors, constructor, equals, hashCode, and toString methods are created automatically. A record's fields are final because the class is intended to serve as a simple "data carrier".
 */
public record Person(String name,int age) {

}

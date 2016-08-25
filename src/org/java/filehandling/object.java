package org.java.filehandling;
import java.io.Serializable;
public class object implements Serializable{
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getFather() {
	return father;
}
public void setFather(String father) {
	this.father = father;
}
public String getMother() {
	return mother;
}
public void setMother(String mother) {
	this.mother = mother;
}
private int age;                                              //this program hs just created a class object and assigned variables to it
private String father;
private String mother;
object(String name,int age,String father,String mother){
	this.name=name;
	this.age=age;
	this.father=father;
	this.mother=mother;
}
@Override
public String toString() {
	return "object [name=" + name + ", age=" + age + ", father=" + father + ", mother=" + mother + "]";
}
	

	}



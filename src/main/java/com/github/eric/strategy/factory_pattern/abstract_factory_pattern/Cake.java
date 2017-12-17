package com.github.eric.strategy.factory_pattern.abstract_factory_pattern;


import lombok.Data;

@Data
public class Cake {
   private String name;

   public void print(){
	   System.out.println("this is a normal cake");
   }
}

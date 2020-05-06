package com.springcore.di;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
 
public class TestMessage { 

	public static void main(String[] args) { 
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("shape.xml");
		
		  ShapeWithList shape =appContext.getBean("shapeList",ShapeWithList.class);		  
		  List<Point> points=shape.getPoints(); 		  
		  for(Point p:points)
		  {
		   System.out.println("Values_List :"+p.getX()+" ,"+p.getY());
		  }
		  
		  ShapeWithSet shape2 =appContext.getBean("shapeSet",ShapeWithSet.class);		  
		  Set<Point> points2=shape2.getPoints(); 		  
		  for(Point p:points2)
		  {
		   System.out.println("Values_Set :"+p.getX()+" ,"+p.getY());
		  }
		 
 
	}
}

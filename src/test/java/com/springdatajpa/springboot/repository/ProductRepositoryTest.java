package com.springdatajpa.springboot.repository;



import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import com.springdatajpa.springboot.entity.Product;

@SpringBootTest    // to load full application context
class ProductRepositoryTest {

	@Autowired
	private ProductRepository productRepository;
     @Test
	void saveMethod() {
		//create Product
		
		Product product=new Product();
		
		product.setName("product  1");
		
		product.setDescription("product 1 desription");
		
		product.setSku("100ABC");
		
		product.setPrice(new BigDecimal( 100));
		
		product.setActive(true);
		
		product.setImageUrl("product1.png");
		
		
		//save product
		
		Product savedObject=productRepository.save(product);
		
		//display product info
		System.out.println(savedObject.getId());
		
		System.out.println(savedObject.toString());
		
		
		
	}


     @Test
		void updateUsingSaveMethod() {
    	 
    	 //find or retreive an entity by id
    	 
    	 Long id=1L;
    	 Product product=productRepository.findById(id).get();
    	 
    	 //update entity information
    	 product.setName("updated product 1");
    	 
    	 product.setDescription("updated product 1 desc");
    	 
    	 productRepository.save(product);
    	 
    	 }
     @Test
     void findByIdMethod()
     {
    	 Long id=1L;
    	 
    	Product product=productRepository.findById(id).get();
     }
     
     void saveAllMethod() // saves multiple entity s to the database
       {                    //it returns list of iterators 
    	 
    	 Product product=new Product();
 		
 		product.setName("product  2");
 		
 		product.setDescription("product 2 desription");
 		
 		product.setSku("100ABCD");
 		
 		product.setPrice(new BigDecimal(200));
 		
 		product.setActive(true);
 		
 		product.setImageUrl("product2.png");
 		
    	 
 		 Product product3=new Product();
  		
 		product3.setName("product  3");
  		
 		product3.setDescription("product 3 desription");
  		
 		product3.setSku("100ABCDE");
  		
 		product3.setPrice(new BigDecimal( 300));
  		
 		product3.setActive(true);
  		
 		product3.setImageUrl("product3.png");
  		
     	 }
     
     
     
     @Test
     void findAllMethod()    //It retrives all the entities from database 7 it returns list of Iterable objects
     {
    	 List<Product> products=productRepository.findAll();
    	 
    	 products.forEach((p)->{
    		 System.out.println(p.getName());
    	 });
    	}
  
     
     @Test
     void countMethod() {
    	 long count=productRepository.count();
    	 
    	// long count=productRepository.
    	 System.out.println(count);
     }
     
     @Test
     void existsByIdMethod() {
    	 Long id=7L;
    	 
    	 boolean result=productRepository.existsById(id);
    	 
    	 System.out.println(result);
     }
     
     @Test
     void findByDateCreatedBetweenMethod() {
    	 //start date
    	 LocalDateTime startDate=LocalDateTime.of(2023, 02, 13, 17, 48,33);
    	 
    	 
    	 //end date
    	 LocalDateTime endDate=LocalDateTime.of(2023, 02, 14, 17, 44,32);
    	 
     }
     
     @Test
     void sortgByMultipleFields() {
    	 String sortBy="name";
    	 String sortByDesc="description";
    	 String sortDir="desc";
    	 
    	 Sort sortByName=sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())?
    			          Sort.by(sortBy).ascending():Sort.by(sortBy).descending();
    
    	 Sort sortByDescription=sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())?
		          Sort.by(sortBy).ascending():Sort.by(sortBy).descending();
    	 
    	 Sort groupBySort=sortByName.and(sortByDescription);
    	 
    	 List<Product> products=productRepository.findAll(groupBySort);
    	 
    	 products.forEach((p)->
    	 {
    		 System.out.println(p);
    	 });
     }
    	 
    	 @Test
         void deleteByIdMethod() {
        	 Long id=1L;
        	 productRepository.deleteById(id);
        	 
        	 }
         
         @Test
         void deleteMethod() {     
        	 //find by Id first
        	 
        	 Long id=2L;
        	 Product product=productRepository.findById(id).get();
        	 
        	 //delete entity
        	 productRepository.delete(product);
         }
         @Test
         void deleteAllMethod() 
         {
        	 
        	
        	//productRepository.deleteAll();
         
         
         
        	 Product product=productRepository.findById(5L).get();
        	 
        	 Product product1=productRepository.findById(6L).get();
        	 
        	 productRepository.deleteAll(List.of(product,product1));
         }
    	 

     
     }
     
     




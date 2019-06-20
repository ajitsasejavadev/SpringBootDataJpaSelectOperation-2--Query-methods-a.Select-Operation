package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {


	//Selection of all columns returns the T=ModelClass
	@Query("Select p from com.app.model.Product p")
	public List<Product> getMyData();

	//Selection of one column returns the DT=DataType
	@Query("Select p.prodCost from com.app.model.Product p")
	public List<Double> getCostOnly();

	//Selection of More than One Column returns Object[].
	@Query("Select p.prodCost, p.prodCode from com.app.model.Product p")
	public List<Object[]> getInfo();


	  /**Passing Parameters(inputs at runtime)**/
	     //-----A:Positional Parameters ?1,?2,?3------
	
	@Query("Select p  from com.app.model.Product p where p.prodId=?1 or p.prodCost<?2 ")
	public List<Product> getNewData(Integer pid, Double cost);
	
	
	  //------B:Named Parameters :hyd, :a, :empId -----------
	  
	 
	  @Query("Select p  from com.app.model.Product p where p.prodId=:a or p.prodCost<:b " ) 
	  public List<Product> getMyDataName(Integer a, Double b); 
	 

	
	 @Query("Select p from Product p where p.prodId in:a order By p.prodId desc")
	 public List<Product> getMyData(List<Integer> a);
	 
}

package com.user.repository;




	import org.springframework.stereotype.Repository;



	import org.springframework.data.jpa.repository.JpaRepository;


	import com.user.model.User;

	@Repository
	public interface UserRepository extends JpaRepository<User,Integer>{
		
		
}

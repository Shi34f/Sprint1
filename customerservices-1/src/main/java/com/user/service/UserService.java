package com.user.service;
	

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.data.rest.webmvc.ResourceNotFoundException;
	import org.springframework.stereotype.Service;

	import com.user.model.User;
	import com.user.repository.UserRepository;

	import java.util.List;
	import java.util.Optional;

	@Service
	public class UserService {
		@Autowired
		private UserRepository userRepository;
		
		
		public User addDetails(User user) {
			return userRepository.save(user);	
			
		}

		public List<User> getAllDetails() {
			return userRepository.findAll();
		
		}
		
		
         public Optional<User> getDetailsById(int userId) {
			
			return userRepository.findById(userId);
		}
		
		public void deleteDetailsById(int userId) {
			userRepository.deleteById(userId);
		}
		
		public User updateDetail(User user) {
		
			return userRepository.save(user);
		}
		

		

		

	}




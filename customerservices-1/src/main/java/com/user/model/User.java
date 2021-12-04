package com.user.model;


	

	import javax.persistence.Entity;
	import javax.persistence.Id;
	
	import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
	
	@Entity
	public class User{
		@Id
	
	
		private int userId;
		private String password;
		@NotBlank(message = "Customer name cannot be null")
		private String customerName;
		private int mobileNo;
		private String address;
		public User() {
			super();
		}
		public User(int userId, String password, String customerName, int mobileNo, String address) {
			super();
			this.userId = userId;
			this.password = password;
			this.customerName = customerName;
			this.mobileNo = mobileNo;
			this.address = address;
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public int getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(int mobileNo) {
			this.mobileNo = mobileNo;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		

}

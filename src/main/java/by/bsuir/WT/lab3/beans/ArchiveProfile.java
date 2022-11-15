package main.java.by.bsuir.WT.lab3.beans;

import jakarta.xml.bind.*;

@XmlRootElement(name="profile")
@XmlAccessorType(XmlAccessType.FIELD)
public class ArchiveProfile {
	@XmlElement
	private String username;
	@XmlElement
	private String password;
	@XmlElement
	private AccountType accType;
	
	public ArchiveProfile(String username, String password, AccountType accType) {
		this.username = username;
		this.password = password;
		this.accType = accType;
	}
	
	public ArchiveProfile() {
		this.username = "guest";
		this.password = "guest";
		this.accType = AccountType.GUEST;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AccountType getAccType() {
		return accType;
	}

	public void setAccType(AccountType accType) {
		this.accType = accType;
	}
}

package main.java.by.bsuir.WT.lab3.beans;

import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlRootElement(name="profiles")
@XmlAccessorType(XmlAccessType.FIELD)
public class Profiles {
	@XmlElements({
		@XmlElement(name="profile",type = ArchiveProfile.class),
		})
	private List<ArchiveProfile> profiles;


	public List<ArchiveProfile> getProfiles() {
		return profiles;
	}
	public void setProfiles(List<ArchiveProfile> profiles) {
		this.profiles = profiles;
	}
}

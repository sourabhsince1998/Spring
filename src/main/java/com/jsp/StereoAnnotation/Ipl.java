package com.jsp.StereoAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ipl 
{
	@Value("MI")
 private String teamName;
  @Value("Rohit")
 private String teamCaptain;

public String getTeamName() {
	return teamName;
}

public void setTeamName(String teamName) {
	this.teamName = teamName;
}

public String getTeamCaptain() {
	return teamCaptain;
}

public void setTeamCaptain(String teamCaptain) {
	this.teamCaptain = teamCaptain;
}

@Override
public String toString() {
	return "Ipl [teamName=" + teamName + ", teamCaptain=" + teamCaptain + "]";
}
 
 
}

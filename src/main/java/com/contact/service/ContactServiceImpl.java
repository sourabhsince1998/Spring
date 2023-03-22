package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
@Service
public class ContactServiceImpl implements ContactService {

	
	//fake list of contacts
	List<Contact> list=List.of(
			new Contact(1L,"amit@gmail","Amit",1311L),
			new Contact(2L,"anil@gmail","Anil",1311L),
			
			new Contact(3L,"rohan@gmail","Rohan",1313L),
			new Contact(4L,"sameer@gmail","Sameer",1314L)
			
			
			);
			
	
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}

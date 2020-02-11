package za.co.inaki.assessment.controller;

import java.util.Optional;

import javax.validation.metadata.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import za.co.inaki.assessment.entity.Interest;
import za.co.inaki.assessment.entity.InterestService;

@RestController
public class InterestController 
{

	@Autowired
	private InterestService interestService;
	
	
	
	@RequestMapping(path="/create/{amount}/{interestType}/{startDate}/{endDate}/{repoRate}", method=RequestMethod.POST)
	public Interest createInterestAmount(@PathVariable(name="amount")double amount,
			@PathVariable(name="interestType")int interestType,
			@PathVariable(name="startDate")int startDate,
			@PathVariable(name="endDate")int endDate,
			@PathVariable(name="repoRate")double repoRate)
	{
		return interestService.createInterestAmount(amount, interestType, startDate, endDate, repoRate);
	}
	
	@RequestMapping(path="/get/{id}",method=RequestMethod.GET)
	public Optional<Interest> getAmount(@PathVariable(name="id")int id)
	{
		System.out.print(interestService.getAmount(id));
		return interestService.getAmount(id);
	}
}

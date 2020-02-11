package za.co.inaki.assessment.entity;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.inaki.assessment.repository.InterestRepository;

@Service
public class InterestService 
{

	@Autowired
	private InterestRepository interestRepository;
	
	private Interest interest = new Interest();
	
	public Interest createInterestAmount(double amount,int interestType,int startDate,int endDate,
			double repoRate)
	{
		int duration = startDate + endDate;
		repoRate = 0.05;
		
		switch(interestType)
		{
			case 1:
				repoRate = 0.05;
				break;
			case 2:	
				repoRate = 0.10;
				break;
			case 3:
				repoRate = 0.20;
				break;
			case 4:	
				repoRate = 0.20;
				break;
			case 5:
				repoRate = 0.20;
				break;
			case 6:	
				repoRate = 0.05;
				break;
			case 7:
				repoRate = 0.10;
				break;
			case 8:	
				repoRate = 0.02;
				break;
		
		}
		
		double newAmount = amount * Math.pow(1 + (repoRate/ 12 * duration) * amount, amount); 
		interest.setAgreementType(interestType);
		interest.setStartDateMonth(startDate);
		interest.setEndDateMonth(endDate);
		interest.setRepoRate(repoRate);
		interest.setAmount(amount);
		interest.setCalculatedAmount(newAmount);
		return interestRepository.save(interest);
		
		
	}
	
	public Optional<Interest> getAmount(int id)
	{
		return interestRepository.findById(id);
	}
}

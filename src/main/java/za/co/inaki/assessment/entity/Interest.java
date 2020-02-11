package za.co.inaki.assessment.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="interest")
public class Interest 
{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="repo_rate")
	private double repoRate;
	
	@Column(name="agreement_type")
	private int agreementType;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="result")
	private String result;
	
	@Column(name="calculated_amount")
	private double calculatedAmount;
	
	@Column(name="start_date")
	private int startDateMonth;
	
	@Column(name="end_date")
	private int endDateMonth;

	
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public double getRepoRate() 
	{
		return repoRate;
	}

	public void setRepoRate(double repoRate) 
	{
		this.repoRate = repoRate;
	}

	public int getAgreementType() 
	{
		return agreementType;
	}

	public void setAgreementType(int agreementType) 
	{
		this.agreementType = agreementType;
	}

	public double getAmount() 
	{
		return amount;
	}

	public void setAmount(double amount) 
	{
		this.amount = amount;
	}

	public String getResult() 
	{
		return result;
	}

	public void setResult(String result) 
	{
		this.result = result;
	}

	public double getCalculatedAmount() 
	{
		return calculatedAmount;
	}

	public void setCalculatedAmount(double calculatedAmount) 
	{
		this.calculatedAmount = calculatedAmount;
	}

	public int getStartDateMonth() 
	{
		return startDateMonth;
	}

	public void setStartDateMonth(int startDateMonth) 
	{
		this.startDateMonth = startDateMonth;
	}

	public int getEndDateMonth() 
	{
		return endDateMonth;
	}

	public void setEndDateMonth(int endDateMonth) 
	{
		this.endDateMonth = endDateMonth;
	}

	@Override
	public String toString() {
		return "Interest [id=" + id + ", repoRate=" + repoRate + ", agreementType=" + agreementType + ", amount="
				+ amount + ", result=" + result + ", calculatedAmount=" + calculatedAmount + ", startDateMonth="
				+ startDateMonth + ", endDateMonth=" + endDateMonth + "]";
	}

	
	

	

	
}

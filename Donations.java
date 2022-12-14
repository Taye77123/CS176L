package donations;

public class Donations {
	  private int numIndividualDonations;
	  private int numBusinessDonations;
	  private int numOtherDonations;
	  private double totalIndividualDonations;
	  private double totalBusinessDonations;
	  private double totalOtherDonations;
	  
	  public Donations() {
	    this.numIndividualDonations = 0;
	    this.numBusinessDonations = 0;
	    this.numOtherDonations = 0;
	    this.totalIndividualDonations = 0;
	    this.totalBusinessDonations = 0;
	    this.totalOtherDonations = 0;
	  }
	  
	  public void addIndividualDonation(double amount) {
	    this.numIndividualDonations++;
	    this.totalIndividualDonations += amount;
	  }
	  
	  public void addBusinessDonation(double amount) {
	    this.numBusinessDonations++;
	    this.totalBusinessDonations += amount;
	  }
	  
	  public void addOtherDonation(double amount) {
	    this.numOtherDonations++;
	    this.totalOtherDonations += amount;
	  }
	  
	  public int getNumIndividualDonations() {
	    return this.numIndividualDonations;
	  }
	  
	  public int getNumBusinessDonations() {
	    return this.numBusinessDonations;
	  }
	  
	  public int getNumOtherDonations() {
	    return this.numOtherDonations;
	  }
	  
	  public double getTotalIndividualDonations() {
	    return this.totalIndividualDonations;
	  }
	  
	  public double getTotalBusinessDonations() {
	    return this.totalBusinessDonations;
	  }
	  
	  public double getTotalOtherDonations() {
	    return this.totalOtherDonations;
	  }
	}

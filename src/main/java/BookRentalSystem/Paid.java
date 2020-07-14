
package BookRentalSystem;

import java.util.Date;

public class Paid extends AbstractEvent {

    private Long id;
    private Long rentalId;
    private Integer rate;
    private Date regDate;

    public Paid() { super();}
    public Paid(Payment payment )
    {
        this();
        this.setId(payment.getId());
        this.setRentalId(payment.getRentalId());
        this.setRate(payment.getRate());
        this.setRegTime(payment.getRegDate());
        System.out.println("Success");

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    public Long getRentalId() {
        return rentalId;
    }
    public void setRentalId(Long rentalId) {
        this.rentalId = rentalId;
    }


    public Integer getRate() {
        return rate;
    }
    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Date getRegTime() {
        return regDate;
    }
    public void setRegTime(Date regDate) {
        this.regDate = regDate;
    }
}

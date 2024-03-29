package ir.maktab.model.dto;

import ir.maktab.model.entity.Expert;
import ir.maktab.model.entity.Order;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author Mahsa Alikhani m-58
 */
@Setter
@Getter
@Builder
public class OfferDto {
    private long id;
    private Date offerSubmissionDate;
    private Double proposedPrice;
    private String workDuration;
    private Date startTime;
    private Order order;
    private Expert expert;
}

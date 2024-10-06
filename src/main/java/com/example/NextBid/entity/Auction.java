package com.example.NextBid.entity;

import com.example.NextBid.enums.AuctionStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Auction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long auctionId;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private BigDecimal startPrice;

    private BigDecimal currentBid;

    private LocalDate startTime;

    private LocalDate endTime;

    @Enumerated(EnumType.STRING)
    private AuctionStatus status = AuctionStatus.ONGOING;

    // getters and setters
}

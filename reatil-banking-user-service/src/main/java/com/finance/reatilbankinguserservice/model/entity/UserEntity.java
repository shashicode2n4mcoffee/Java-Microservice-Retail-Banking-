package com.finance.reatilbankinguserservice.model.entity;

import com.finance.reatilbankinguserservice.model.dto.Status;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String authId;

    private String identification;

    @Enumerated(EnumType.STRING)
    private Status status;
}

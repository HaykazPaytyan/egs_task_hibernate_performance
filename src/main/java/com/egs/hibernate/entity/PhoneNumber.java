package com.egs.hibernate.entity;

import lombok.*;

import javax.persistence.*;


@Entity(name = "phone_number")
@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
@SequenceGenerator(name = "default_gen", sequenceName = "phone_number_id_seq", allocationSize = 500)
public class PhoneNumber extends BaseEntity {

    @Column(name = "phone_number", length = 9, nullable = false)
    private String phoneNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}

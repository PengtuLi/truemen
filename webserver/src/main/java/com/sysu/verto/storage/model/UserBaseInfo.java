package com.sysu.verto.storage.model;



import jakarta.persistence.*;



@Entity
@Table(name = "user_base_info")
public class UserBaseInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    private String userName;
    private String avatar;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToOne
    @JoinColumn(name = "uid")
    private UserCoreInfo userCoreInfo;

    // Getters and Setters
}

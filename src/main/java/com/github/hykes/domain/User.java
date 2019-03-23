package com.github.hykes.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2019-03-23 13:26:00
 */
@Entity
@Builder
@Table(name = "jpa_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = -5978313472734844177L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGINT(20) NOT NULL COMMENT 'ID'")
    private Long id;

    @Column(name = "name", columnDefinition = "VARCHAR(32) NOT NULL COMMENT '名称'")
    private String name;

}
package me.asherli.test.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Administrator on 2019/2/19.
 */
@Entity
@Table(name = "user")
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private Integer sex;

}

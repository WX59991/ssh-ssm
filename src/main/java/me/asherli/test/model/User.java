package me.asherli.test.model;

import lombok.Data;
import org.hibernate.annotations.*;
import org.hibernate.annotations.Cache;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Administrator on 2019/2/19.
 */
@Entity
@Table(name = "user")
@Data
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private Integer sex;

}

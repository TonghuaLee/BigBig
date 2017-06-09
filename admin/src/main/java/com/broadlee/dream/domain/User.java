package com.broadlee.dream.domain;

import com.broadlee.dream.common.BaseDomain;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="user")
public class User extends BaseDomain {

	private static final long serialVersionUID = 6726149518794271187L;

	@Column(name="nickname")
	private String nickname;

	@Column(name="password")
	private String password;

	@Column(name="phone")
	private String phone;

	@Column(name="deactivated")
	private Boolean deactivated;

	@Column(name="line_to_saler")
	private Boolean canLineToSaler;

	@Column(name="avatar")
	private String avatar;



	@Column(name="create_time")
	private Date dateCreated;

	public User(Long id) { this.id = id;}

}

package com.broadlee.dream.serviceimpl;

import com.broadlee.dream.common.BaseDao;
import com.broadlee.dream.common.BaseServiceImpl;
import com.broadlee.dream.common.exception.BizException;
import com.broadlee.dream.domain.User;
import com.broadlee.dream.mapper.UserDao;
import com.broadlee.dream.profile.service.UserServiceExtensionManager;
import com.broadlee.dream.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

	@Autowired
	protected UserDao userDao;


	@Resource(name="passwdEncoder")
	protected PasswordEncoder pwdEncoder;

	@Resource(name="userServiceExtensionManager")
	protected UserServiceExtensionManager extMgr;


	@Override
	public User tryLogin(String phone, String passwd){
		User user = new User();
		user.setPhone(phone);

		user = userDao.selectOne(user);
		if(user == null) {
			throw new BizException("010303", "账号不存在");
		}

		if(user!=null && pwdEncoder.matches(passwd, user.getPassword())) {
			return user;
		}

		throw new BizException("010304", "密码错误");
	}

	@Override
	public User findUserByPhone(String phone) {
		return userDao.readUserByPhone(phone);
	}

	@Override
	public User saveUser(User user) {
		userDao.insertUser(user);
		return user;
	}

	@Override
	public User readUserById(Long userId) {
		return userDao.readUserById(userId);
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User createUserFromId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createNewUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createRegisteredUserRoles(User user) {
	}

	@Override
	public String encodePassword(String rawPassword) {
		return pwdEncoder.encode(rawPassword);
	}

	@Override
	public boolean isPasswordValid(String rawPassword, String encodedPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User saveUser(User user, boolean register) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public User registerUser(String phone, String rawpasswd) {
		User olduser = findUserByPhone(phone);
		if(olduser != null) {
			return null;
		} else {
			String password = pwdEncoder.encode(rawpasswd);
			User user = User.builder()
					.password(password)
					.phone(phone)
					.canLineToSaler(true)
					.deactivated(false)
					.dateCreated(new Date())
					.nickname("usr_" + phone)
					.build();

			userDao.insert(user);

			// 触发用户注册 后置处理
			extMgr.postRegisterUser(user);
			return user;
		}
	}

	@Override
	public boolean changePasswd(String passwd, Long id) {
		return userDao.updatePassword( pwdEncoder.encode(passwd), id) > 0;
	}

	@Override
	public String getPhoneById(Long id) {
		return userDao.readPhoneById(id);
	}

	@Override
	public List<User> findAllUsers() {
		return userDao.readAllUsers();
	}

	@Override
	@Transactional
	public boolean updateAvatarUrl(Long id, String newurl) {
		return userDao.updateAvatarUrl(id, newurl) > 0;
	}

	@Override
	@Transactional
	public boolean updateNickname(Long id, String nickname) {
		return userDao.updateNickname(id, nickname) > 0;
	}


	@Override
	public BaseDao<User> getBaseDao() {
		return userDao;
	}

}

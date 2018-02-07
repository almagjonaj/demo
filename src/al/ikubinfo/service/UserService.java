package al.ikubinfo.service;



import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import al.ikubinfo.entity.User;
@Service
public interface UserService {

	public void createUser(User user);
}

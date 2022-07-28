package com.youkeda.application.art.member.control;

import com.youkeda.application.art.member.exception.UserNameInUseException;
import com.youkeda.application.art.member.exception.UserPwdErrorException;
import com.youkeda.application.art.member.model.Gender;
import com.youkeda.application.art.member.model.User;
import com.youkeda.application.art.member.model.UserStatus;
import com.youkeda.application.art.member.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test/user")
public class UserTestControl {

    private static final Logger log = LoggerFactory.getLogger(UserTestControl.class);

    @Autowired
    private UserService userService;

    @GetMapping(path = "/reg")
    public User testRegUser() {
        User user = new User();
        user.setId("0");
        user.setUserName("测试");
        user.setMobile("13595");
        user.setPwd("123456");
        user.setAgreementVersion("1");
        user.setName("测试用户");
        user.setEmail("123456@qq.com");
        user.setGender(Gender.female);
        user.setStatus(UserStatus.enabled);
        user.setNickName("二狗");
        try {
            user = userService.reg(user);
        } catch (UserNameInUseException e) {
            log.error("reg user error.", e);
        }

        return user;
    }

    @GetMapping(path = "/changePwd")
    public void testChangePwd() throws UserPwdErrorException {
        userService.changePwd("0","12138");
    }

    @GetMapping(path = "/update")
    public User testUpdate(){
        User user = new User();
        user.setMobile("180833");
        userService.update(user);
        return user;
    }

    @GetMapping(path = "/getWithUserId")
    public User testGetWithUserId(){
        return userService.getWithUserId("0");
    }

}

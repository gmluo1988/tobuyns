package cn.gmluo.bebetterme.service.impl;

import cn.gmluo.bebetterme.dao.UserDao;
import cn.gmluo.bebetterme.entity.User;
import cn.gmluo.bebetterme.service.UserService;
import cn.gmluo.bebetterme.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 3.业务逻辑层
 * 3.2-service接口实现类
 * Created by gmluo on 2018/4/9.
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
    @Resource(name = "userDaoImpl")
    private UserDao userDao;

    /**
     * 注册方法实现
     *
     * @param user
     */
    @Override
    public void register(User user) {
        userDao.saveUser(user);

    }

    /**
     * 登陆方法实现(使用邮箱和密码登录)
     *
     * @param user
     * @return
     */
    @Override
    public User login(User user) {
        return userDao.findByEmailAndPwd(user);
    }

    /**
     * 分页查询用户信息方法实现
     *
     * @param pageBean
     */
    @Override
    public void getAllUsers(PageBean<User> pageBean) {
        userDao.getAllUsers(pageBean);

    }

    /**
     * 根据用户id查询用户信息方法实现
     *
     * @param id
     * @return
     */
    @Override
    public User findById(int id) {
        return userDao.findById(id);
    }

    /**
     * 更改用户信息方法实现
     *
     * @param user
     */
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);

    }

    /**
     * 删除用户信息方法实现
     *
     * @param id
     */
    @Override
    public void deleteUserById(int id) {
        userDao.deleteUserById(id);

    }
}
package org.xujin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xujin.dao.DeptDao;
import org.xujin.entity.Dept;
import org.xujin.service.DeptService;

import java.util.List;

/**
 * @author xujin
 * @package-name org.xujin.service.impl
 * @createtime 2020-03-22 17:25
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao ;

    @Override
    public boolean add(Dept dept)
    {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return deptDao.findAll();
    }

}

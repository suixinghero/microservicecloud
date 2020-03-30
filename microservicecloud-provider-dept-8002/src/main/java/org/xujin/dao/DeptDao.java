package org.xujin.dao;


import org.xujin.entity.Dept;

import java.util.List;

/**
 * @author xujin
 * @package-name org.xujin.dao
 * @createtime 2020-03-22 17:05
 */

public interface DeptDao {
    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();
}

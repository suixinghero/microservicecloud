package org.xujin.service;

import org.xujin.entity.Dept;

import java.util.List;

/**
 * @author xujin
 * @package-name org.xujin.service
 * @createtime 2020-03-22 17:24
 */

public interface DeptService {
    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();

}

package org.xujin.factory;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.xujin.entity.Dept;
import org.xujin.service.DeptClientService;

import java.util.List;

/**
 * @author xujin
 * @package-name org.xujin.factory
 * @createtime 2020-03-27 17:45
 */

@Component//不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>
{
    @Override
    public DeptClientService create(Throwable throwable)
    {
        return new DeptClientService() {
            @Override
            public Dept get(long id)
            {
                return Dept.newBuilder().deptno(id)
                        .dname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
                        .db_source("no this database in MySQL")
                        .build();
            }

            @Override
            public List<Dept> list()
            {
                return null;
            }

            @Override
            public boolean add(Dept dept)
            {
                return false;
            }
        };
    }
}

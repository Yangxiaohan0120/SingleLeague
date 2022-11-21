package com.example.SingleLeague.dao.Impl;

import com.example.SingleLeague.dao.AlphaDao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @author Chris Yang
 * created 2022-08-16 10:56
 **/

@Repository
@Primary
public class AlphaDaoMyBatisImpl implements AlphaDao {
    @Override
    public String select() {
        return "MyBatis";
    }
}

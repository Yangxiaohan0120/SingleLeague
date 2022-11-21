package com.example.SingleLeague.dao.Impl;

import com.example.SingleLeague.dao.AlphaDao;
import org.springframework.stereotype.Repository;

/**
 * @author Chris Yang
 * created 2022-08-16 10:54
 **/

@Repository("Hibernate")
public class AlphaDaoImpl implements AlphaDao {
    @Override
    public String select() {
        return "Hibernate";
    }

}

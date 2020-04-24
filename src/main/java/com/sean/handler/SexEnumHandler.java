package com.sean.handler;

import com.sean.enums.SexEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: sean.xu
 * @Date: 2020/4/18
 */
@MappedTypes(value = {SexEnum.class})
@MappedJdbcTypes(JdbcType.INTEGER)
public class SexEnumHandler extends BaseTypeHandler<SexEnum> {

    public void setNonNullParameter(PreparedStatement preparedStatement, int i, SexEnum e, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i,e.getId());
    }

    public SexEnum getNullableResult(ResultSet resultSet, String s) throws SQLException {
        int id = resultSet.getInt(s);
        return SexEnum.getSex(id);
    }

    public SexEnum getNullableResult(ResultSet resultSet, int i) throws SQLException {
        int id = resultSet.getInt(i);
        return SexEnum.getSex(id);
    }

    public SexEnum getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        int id = callableStatement.getInt(i);
        return SexEnum.getSex(id);
    }
}


package com.yc.could.dao;

        import tk.mybatis.mapper.common.BaseMapper;
        import tk.mybatis.mapper.common.ExampleMapper;
        import tk.mybatis.mapper.common.MySqlMapper;

public interface MisBaseMapper<T> extends BaseMapper<T>, ExampleMapper<T>, MySqlMapper {
}


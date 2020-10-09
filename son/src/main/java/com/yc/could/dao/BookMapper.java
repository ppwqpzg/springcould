package com.yc.could.dao;


        import com.yc.could.bean.Book;
        import org.apache.ibatis.annotations.Mapper;
        import org.springframework.stereotype.Component;

@Mapper
public interface BookMapper extends MisBaseMapper<Book>{
}
package com.broadlee.dream.common;

import org.apache.ibatis.session.RowBounds;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;


public interface BaseDao<T> extends BaseMapper<T> {

	List<T> getAllByPage(RowBounds rowBounds);

}

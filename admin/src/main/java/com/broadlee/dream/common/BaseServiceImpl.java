package com.broadlee.dream.common;

import com.broadlee.dream.common.exception.DBException;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.RowBounds;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public abstract class BaseServiceImpl<T> implements BaseService<T> {

	public abstract BaseDao<T> getBaseDao();

	/**
	 * 根据主键查询指定实体
	 *
	 * @param id
	 * @return
	 */

	public T getById(Object id) {
		return this.getBaseDao().selectByPrimaryKey(id);
	}

	/**
	 * 列表查询
	 *
	 * @param entity
	 * @return
	 */

	public List<T> getByEntity(T entity) {
		return this.getBaseDao().select(entity);
	}

	/**
	 * 获取分页数据
	 *
	 * @param rowBounds
	 * @return
	 */

	public PageInfo<T> getByPage(RowBounds rowBounds) {
		List<T> list = this.getBaseDao().getAllByPage(rowBounds);
		return new PageInfo<T>(list);
	}

	/**
	 * 保存对象，保存所有属性
	 *
	 * @param entity
	 * @return
	 */

	@Transactional
	public int save(T entity) {
		return this.getBaseDao().insert(entity);
	}

	/**
	 * 更新对象中所有属性,主键不能为NULL
	 *
	 * @param entity
	 * @return
	 */

	@Transactional
	public int update(T entity) {
		return this.getBaseDao().updateByPrimaryKey(entity);
	}

	/**
	 * 删除指定数据
	 *
	 * @param id
	 * @return
	 */

	@Transactional
	public int delete(Object id) {
		return this.getBaseDao().deleteByPrimaryKey(id);
	}

	/**
	 * 保存对象，只保存对象中不为NULL的属性
	 *
	 * @param entity
	 * @return
	 */

	@Transactional
	public int saveSelective(T entity) throws DBException {
		int result = this.getBaseDao().insertSelective(entity);
		if (result <= 0) {
			throw new DBException("数据保存异常");
		}
		return result;
	}

	/**
	 * 更新对象，只更新对象中不为NULL的属性，主键不能为NULL
	 *
	 * @param entity
	 * @return
	 */

	@Transactional
	public int updateSelective(T entity) {
		return this.getBaseDao().updateByPrimaryKeySelective(entity);
	}

}

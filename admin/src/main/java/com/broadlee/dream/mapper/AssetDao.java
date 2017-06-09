package com.broadlee.dream.mapper;

import com.broadlee.dream.common.BaseDao;
import com.broadlee.dream.domain.Asset;

import java.util.List;



public interface AssetDao extends BaseDao<Asset> {

	Asset readAssetById(Long id);

	List<Asset> readAllAssets();

	int updateAsset(Asset asset);

	int insertAsset(Asset asset);

	Asset readAssetByUrl(String url);

}

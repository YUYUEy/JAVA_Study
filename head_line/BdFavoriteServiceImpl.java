package com.midea.iapps.jrsm.inc.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.midea.iapps.jrsm.base.service.impl.JrsmServiceImpl;
import com.midea.iapps.jrsm.inc.model.BdFavorite;
import com.midea.iapps.jrsm.inc.param.BdFavoriteFilterParam;
import com.midea.iapps.jrsm.inc.param.BdFavoriteParam;
import com.midea.iapps.jrsm.inc.service.IBdFavoriteFilterService;
import com.midea.iapps.jrsm.inc.service.IBdFavoriteService;

@Service
public class BdFavoriteServiceImpl extends JrsmServiceImpl implements IBdFavoriteService {
	
	
	@Resource
	private IBdFavoriteFilterService iBdFavoriteFilterDAO;
	
	@Override
	public BdFavorite selectOne(BdFavoriteParam param) {
		List<BdFavorite> list = selectList(param);
		return list.isEmpty() ? null : list.get(0);
	}

	@Override
	public List<BdFavorite> selectList(BdFavoriteParam param) {
		List<BdFavorite> list = new ArrayList<BdFavorite>();
		if(param.getRowId() != null){
			list = st_jrsm.selectList(this.statement("selectListDetail"),param);
		
		}else{
			list = st_jrsm.selectList(this.statement("selectList"),param);
		}
		return list;
	}
	
	@Override
	public int selectCount(BdFavoriteParam param) {
		int count = st_jrsm.selectOne(this.statement("selectCount"),param);
		
		return count;
	}

	@Override
	public int insert(BdFavoriteParam param) {
		this.setWhoJrsm(param);
		//head
		int count = st_jrsm.insert(this.statement("insert"), param);
		List<String> itemList = param.getItemList();
		List<String> itemNameList = param.getItemNameList();
		//line
		for(int i=0; i< itemList.size();i++){
			
			BdFavoriteFilterParam line = new BdFavoriteFilterParam();
			line.setFavoriteId(param.getRowId());
//			line.setEntityId(param.getEntityId());
			line.setFilterCol("itemList");
			line.setProfile(param.getProfile());
			line.setFilterValueCode(itemList.get(i));
			line.setFilterValueName(itemNameList.get(i));
			iBdFavoriteFilterDAO.insert(line);
		}
		
		return count;
	}

	@Override
	public int update(BdFavoriteParam param) {
//		this.setWhoForUpdateInfo(param);
		int count = st_jrsm.update(this.statement("update"), param);
		
		//line
		iBdFavoriteFilterDAO.deleteFa(param.getRowId());
		//
		List<String> itemList = param.getItemList();
		List<String> itemNameList = param.getItemNameList();
		//line
		for(int i=0; i< itemList.size();i++){
			
			BdFavoriteFilterParam line = new BdFavoriteFilterParam();
			line.setFavoriteId(param.getRowId());
			line.setFilterValueCode(itemList.get(i));
			line.setFilterValueName(itemNameList.get(i));
			iBdFavoriteFilterDAO.insert(line);
		}
		return count;
	}

	@Override
	public int delete(int id) {
		//head
		int count = st_jrsm.delete(this.statement("delete"), id);
	
		//line
		
		iBdFavoriteFilterDAO.deleteFa(id);
		return count;
	}
	

}


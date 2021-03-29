package jp.co.internous.dandelion.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



import jp.co.internous.dandelion.model.domain.MstCategory;
import jp.co.internous.dandelion.model.domain.MstProduct;
import jp.co.internous.dandelion.model.form.SearchForm;
import jp.co.internous.dandelion.model.mapper.MstCategoryMapper;
import jp.co.internous.dandelion.model.mapper.MstProductMapper;
import jp.co.internous.dandelion.model.session.LoginSession;

@Controller
@RequestMapping("/dandelion")
public class IndexController {
	
	@Autowired
	MstCategoryMapper mstCategoryMapper;
	
	@Autowired
	MstProductMapper mstProductMapper;
	
	@Autowired
	private LoginSession loginSession;

	@RequestMapping("/")
	public String index(Model m) {
		
//		未ログイン状態かつ仮ユーザーIDを保持していない場合、仮ユーザIDを作成し、セッションに保持する。
		
		if (loginSession.getTemporaryId() == 0 && !loginSession.getIsLogin()) {
			Random rand = new Random();
			int n = 100000000 + rand.nextInt(900000000);
			loginSession.setTemporaryId(-n);
		}
		
		
//		データベースからカテゴリー情報を取得する
		
		List<MstCategory> mstCategory = mstCategoryMapper.findAll();
		
		
//		データベースから商品情報を取得する
		
		List<MstProduct> mstProduct = mstProductMapper.findAll();
		
		m.addAttribute("loginSession", loginSession);
		m.addAttribute("mstProduct", mstProduct);
		m.addAttribute("mstCategory",mstCategory);

		return "index";
		
	}
	
	@RequestMapping("/searchItem")
	public String serchItem(SearchForm searchForm, Model m) {
		
		
//		DBのmst_categoryからカテゴリー情報をすべて取得する。
		
		List<MstCategory> mstCategory = mstCategoryMapper.findAll();
		
//		DBのmst_productから条件に一致する商品情報を取得する。
		
		int category = searchForm.getCategory();
		String itemNames = searchForm.getItemName().replaceAll("　", " ").replaceAll(" +"," ").trim();
		String[] itemName = itemNames.split(" ");	
		List<MstProduct> mstProduct = null;

		if(category > 0) {
				mstProduct = mstProductMapper.findByCategoryIdAndProductName(category, itemName);
		}else {
				mstProduct = mstProductMapper.findByProductName(itemName);
		}
		
		m.addAttribute("itemNames", itemNames);
		m.addAttribute("selected", category);
		m.addAttribute("loginSession", loginSession);
		m.addAttribute("mstCategory",mstCategory);
		m.addAttribute("mstProduct", mstProduct);
		
		return "index";
		
	}
	
}

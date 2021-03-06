package json.chao.com.wanandroid.presenter;

import javax.inject.Inject;

import json.chao.com.wanandroid.core.DataManager;
import json.chao.com.wanandroid.base.BasePresenter;
import json.chao.com.wanandroid.contract.KnowledgeHierarchyDetailContract;

/**
 * @author quchao
 * @date 2018/2/23
 */

public class KnowledgeHierarchyDetailPresenter extends BasePresenter<KnowledgeHierarchyDetailContract.View>
        implements KnowledgeHierarchyDetailContract.Presenter {

    private DataManager mDataManager;

    @Inject
    KnowledgeHierarchyDetailPresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
    }




}

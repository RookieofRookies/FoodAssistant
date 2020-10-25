package com.foodAssistant.service;

import com.foodAssistant.domain.record.Record;

import java.util.List;

public interface IUserAccountService extends IAccountService{
    /**
     * 查询所有饮食记录
     * @return
     */
    List<Record> getRecord();

    /**
     * 查询一条饮食记录
     * @return
     */
    Record getRecordById(Integer recordId);

    /**
     * 创建饮食记录
     */
    void createRecord();

    /**
     * 删除饮食记录
     */
    void deleteRecord();

    /**
     * 更新饮食记录
     */
    void updateRecord();

}
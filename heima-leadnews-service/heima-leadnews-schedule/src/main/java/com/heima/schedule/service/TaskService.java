package com.heima.schedule.service;

import com.heima.model.schedule.pojos.dtos.Task;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yuntai
 * @Date: 2024/03/24/19:55
 * @Description: com.heima.schedule.service
 */
public interface TaskService {

    /**
     * 添加任务
     * @param task   任务对象
     * @return       任务id
     */
    public long addTask(Task task) ;


    /**
     * 取消任务
     * @param taskId        任务id
     * @return              取消结果
     */
    public boolean cancelTask(long taskId);

    /**
     * 按照类型和优先级来拉取任务
     * @param type
     * @param priority
     * @return
     */
    public Task poll(int type,int priority);


}
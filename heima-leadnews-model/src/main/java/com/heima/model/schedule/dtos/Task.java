package com.heima.model.schedule.dtos;

import lombok.Data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yuntai
 * @Date: 2024/03/24/19:55
 * @Description: com.heima.schedule.dtos
 */
@Data
public class Task implements Serializable {

    /**
     * 任务id
     */
    private Long taskId;
    /**
     * 类型
     */
    private Integer taskType;

    /**
     * 优先级
     */
    private Integer priority;

    /**
     * 执行id
     */
    private long executeTime;

    /**
     * task参数
     */
    private byte[] parameters;

}
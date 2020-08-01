package cn.jboost.springboot.redis.cluster.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private String uid;
    private String username;
    private String name;
    private Integer age;
}

package org.dmj.sch.mapper.pojo;

import lombok.Data;

/**
 * Created by 56821 on 2018/8/19.
 */
@Data
public class Msg {
    private String title;
    private String content;
    private String etraInfo;

    public Msg(String title, String content, String etraInfo) {
        super();
        this.title = title;
        this.content = content;
        this.etraInfo = etraInfo;
    }
}

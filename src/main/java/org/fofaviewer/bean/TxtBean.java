package org.fofaviewer.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class TxtBean extends BaseBean{
    private String url;

    public TxtBean(String url){
        this.url=url;
    }
}

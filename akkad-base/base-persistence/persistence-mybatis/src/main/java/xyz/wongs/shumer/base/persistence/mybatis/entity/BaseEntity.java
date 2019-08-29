package xyz.wongs.shumer.base.persistence.mybatis.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import xyz.wongs.shumer.base.persistence.mybatis.config.Global;
import xyz.wongs.shumer.base.persistence.mybatis.stas.Cons;
import xyz.wongs.shumer.base.persistence.mybatis.config.Global;
import xyz.wongs.shumer.base.persistence.mybatis.stas.Cons;

import java.io.Serializable;

public abstract class BaseEntity<ID extends Serializable> extends IdEntity<ID> {



    @JsonIgnore
    private String dtype;

    public String getDtype() {
        return Global.getConfig(Cons.DB_TYPE);
    }


}

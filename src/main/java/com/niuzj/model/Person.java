package com.niuzj.model;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

//用在类上为所有属性生成get set方法,会默认生成一个无参构造
//@Getter
//@Setter
//提供所有属性getter、setter方法, 为类生成equals、canEqual、hashCode、toString方法
//最常用, staticConstructor提供一个静态方法, 并把构造私有
@Data(staticConstructor = "PersonFactory")
//exclude toString排除字段
//@ToString(exclude = {"name"})
//生成equals和hashcode方法
//@EqualsAndHashCode
//提供全参构造, 不会生成无参构造
@AllArgsConstructor
//提供一个无参构造
@NoArgsConstructor
//详细参考https://blog.csdn.net/motui/article/details/79012846
public class Person {

    //用在单个属性上,只会生成单个属性的指定方法, 不过无参构造还是会生成
//    @Setter
    private String name;

    private Integer age;

    private BigDecimal money;

    //boolean类型生成get方法是is开头
    private boolean marry;

    private Map<String, Object> map;

    private List<Object> list;

}

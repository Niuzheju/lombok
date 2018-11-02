# lombok
lombok, 自动生成get, set方法<br>
@Setter, @Getter<br>
用在类上为所有属性生成get set方法,会默认生成一个无参构造, 用在单个属性上,只会生成单个属性的指定方法, 不过无参构造还是会生成<br>
@Data<br>
提供所有属性getter、setter方法, 为类生成equals、canEqual、hashCode、toString方法<br>
最常用, staticConstructor属性提供一个静态方法, 并把构造私有<br>
@ToString(exclude = {"name"})<br>
生成toString方法, exclude toString排除字段<br>
@AllArgsConstructor<br>
提供全参构造, 不会生成无参构造<br>
@NoArgsConstructor<br>
提供一个无参构造<br>
@EqualsAndHashCode<br>
生成equals和hashcode方法<br>
详细参考:https://blog.csdn.net/motui/article/details/79012846

# RBlog

### 项目简介：
##### 为什么写这一版本
- 1.随着自己技术的提升，无法忍受上一版本lblog的问题
- 2.对当前使用技术vue+element量身定制result api结构
- 3.希望有一个比较优化的项目被创建
- 4.阶段性技术实践得途径

##### 有什么亮点呢？
保留


##### 修改的地方
1. 主界面ui
2. 后台整体使用vue
3. 数据库改进
    1. 因为之前的归档总是归处来问题，
    所以对齐进行改进，删除自增主键，
    以 `place_tag`作为主键。
    2. 改名`article`表为`article_master`
    3. 修改`article`表 主键`id`字段为`aid`
    4. 修改`log`表`id`为`lid`
    5. 修改`website`表`id`为`wid`
    6. 修改`article_info`表`article_id`为`aid`
    7. 修改`article_tag`表`id`为`tid`
    8. 修改`article_comment`表`id`为`cid`
    9. 修改`article_statistics`表`id`为`sid`
    10. 修改`user`表`id`为`uid`
    
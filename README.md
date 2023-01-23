# 網站連結
http://sam19981026.com:8080/

帳號：sam123
密碼：123

# 簡介
使用springboot+thymeleaf+PostgreSQL實現部隊文書管理系統

# 使用技術

* 模板引擎：thymeleaf
* 前端框架：BootStrap
* 後端框架：Springboot、MyBatis
* jQuery
* Ajax
* json
* 資料庫：PostgreSQL


# 快速上手
### 1、運行環境和所需工具
* 編譯器：IntelliJ IDEA
* 項目構建工具：Maven
* 資料庫：PostgreSQL
* JDK版本：jdk11


### 2、初始化項目
* 在你的PostgreSQL中，創建一個名稱為 military 的資料庫，並導入文件
* 修改application.properties配置文件，把資料庫登錄名和密碼，改為自己的
* 把src/main資料夾底下的內容複製到專案底下
* 配置tomcat
* 運行

# 功能介紹

### 1、登入畫面
* 執行後輸入 'http://localhost:8080/' 進入到登入頁面
* 登入時先判斷帳號是否存在
* 若帳號存在再對密碼進行驗證
![登入畫面](https://user-images.githubusercontent.com/82807965/193403731-363cddd9-037a-4a41-956e-b3c8fc7c2105.jpg)
![帳號不存在](https://user-images.githubusercontent.com/82807965/193403734-561d0c43-8311-4c8d-b460-cdfe008b7c88.jpg)
![密碼錯誤](https://user-images.githubusercontent.com/82807965/193403741-dd082c5f-343e-43ad-b45d-b430bab67cd5.jpg)

* 登入後進入到部隊文書管理系統頁面，會顯示登入的帳號
![登入後畫面](https://user-images.githubusercontent.com/82807965/193403775-968a04a5-118a-48dc-9848-5fec242ff3b1.jpg)


### 2、查詢功能
* 可透過姓名或單位進行查詢
* 若沒有輸入則查詢全部
![搜尋框](https://user-images.githubusercontent.com/82807965/193403844-5073d9ea-f267-4818-b2ba-8ff1667c2848.jpg)
![兩個欄位搜尋](https://user-images.githubusercontent.com/82807965/193403845-eaac3820-0c0e-4eb2-824a-824039e1f56e.jpg)


### 3、編輯
* 除了帳號以外其它皆可編輯，點編輯會回顯該會員資料
![編輯員工](https://user-images.githubusercontent.com/82807965/193403878-2acd6f7b-f6fc-4810-a6e0-1d93bc40a85a.jpg)


### 4、新增

* 會判斷帳號是否重複
* 下拉表單可選擇軍種及單位
![新增](https://user-images.githubusercontent.com/82807965/193403964-2fc968c5-15c0-4f25-91ed-a377dc22b65d.jpg)
![校驗帳號](https://user-images.githubusercontent.com/82807965/193404405-8becbd2d-5dc0-4c54-9ea1-0ce200c69030.jpg)
![校驗帳號-失敗](https://user-images.githubusercontent.com/82807965/193404407-2e4290e2-83bc-4e96-8501-6a62ebdf7bfa.jpg)


### 5、刪除
* 單個刪除
* 透過多選框進行多個刪除
![確定刪除嗎](https://user-images.githubusercontent.com/82807965/193404418-4c727fff-9ce4-4008-b2ac-18cfdbfe8ea4.jpg)
![多個刪除](https://user-images.githubusercontent.com/82807965/193404420-c4b4e1c6-9ae7-482f-9ea4-d3188b1b9e85.jpg)











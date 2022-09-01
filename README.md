# SpringCloudLibrary
## 运用 SpringCloud 来管理图书馆系统 
<hr>
application.yml 数据库配置MySQL8.0不同于之前的版本，存在安全检测的问题，所以在设置url的时候需要
jdbc:mysql://localhost:3306/database?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true
之前的版本由于是不收费版本所以没有安全性设置，只需要jdbc:mysql://localhost:3306/database即可

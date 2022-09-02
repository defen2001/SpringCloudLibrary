# SpringCloudLibrary
##  运用 SpringCloud 来管理图书馆系统 
<hr>
application.yml 数据库配置MySQL8.0不同于之前的版本，存在安全检测的问题，所以在设置url的时候需要
jdbc:mysql://localhost:3306/database?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true
之前的版本由于是不收费版本所以没有安全性设置，只需要jdbc:mysql://localhost:3306/database即可

<hr/>
##  服务注册
服务之间的相互调用存在一个问题，就是虽然服务拆分完成，但是没有一个比较合理的管理机制，如果单纯只是这样编写，在部署和维护起来，肯定是很麻烦的。
因此我们需要一个集中管理微服务的平台，Eureka能够自动注册并发现微服务，然后对服务的状态、信息进行集中管理

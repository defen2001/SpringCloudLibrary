# SpringCloudLibrary
##  运用 SpringCloud 来管理图书馆系统 
<hr/>
<span style="color: red">注意：</span>application.yml 数据库配置MySQL8.0不同于之前的版本，存在安全检测的问题，所以在设置url的时候需要
jdbc:mysql://localhost:3306/database?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true
之前的版本由于是不收费版本所以没有安全性设置，只需要jdbc:mysql://localhost:3306/database即可

<hr/>
<h2> 服务注册</h2>
服务之间的相互调用存在一个问题，就是虽然服务拆分完成，但是没有一个比较合理的管理机制，如果单纯只是这样编写，在部署和维护起来，肯定是很麻烦的。
因此我们需要一个集中管理微服务的平台，Eureka能够自动注册并发现微服务，然后对服务的状态、信息进行集中管理
<hr/>
<h2>Hystrix 服务熔断</h2>
为了解决分布式系统的雪崩问题，SpringCloud提供了Hystrix熔断器组件
<h3>服务降级</h3>
服务降级和服务熔断的区别，服务降级并不会直接返回错误，而是可以提供一个补救措施，正常响应给请求者。
这样相当于服务依然可用，但是服务能力肯定是下降了的。
<h2>Gateway 路由网关</h2>
一般情况下，可能并不是所有的微服务都需要直接暴露给外部调用，这时我们就可以使用路由机制，
添加一层防护，让所有的请求全部通过路由来转发到各个微服务，并且转发给多个相同微服务实例也可以实现负载均衡。
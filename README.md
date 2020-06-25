# SpringCloudConfig 分布式配置中心
为分布式系统中的基础设施和微服务提供集中化的外部配置支持，分为服务端和客户端两个部分

服务端：分布式配置中心，独立的微服务应用，用来连接配置仓库并为客户端提供获取接口，
       返回配置信息、加密、解密信息等接口
       
客户端：微服务架构中的各个微服务应用或基础设施，通过制定的配置中心来管理应用资源与业务相关的配置内容，
       并在启动的时候从配置中心获取和加载配置信息

配置中心采用 Git 来存储配置信息

配置信息：URL ：/{application}/{profile} [/{label}]
              {label}对应 Git 上不同的分支，默认是master

对应 配置文件：{application}-{profile}.yml
          或 {label} 分支下的 {application}-{profile}.yml
             {application}-{profile}.properties
          或 {label} 分支下的 {application}-{profile}.properties



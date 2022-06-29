# url2pdf&mailSend WebApplication后端
## 环境配置：  
1. 安装mysql   
2. 设置mysql账号密码为root和123456   
3. 在mysql里面新建数据库：pdf     
4. 在数据库pdf里面新建表user   
5. 表user里面应该包含username,paasword和mail三个字段    
![image](https://user-images.githubusercontent.com/102196935/176362323-59a72ea0-a78e-489a-93f3-36550b4b3565.png)  
注：这些都可以在src/resources/application.properties里面更改，不一定非要用上面的配置

### jdk版本:11
### SpringBoot版本：2.7.1
MVC设计模式——Model是数据，View是页面呈现，Controller则负责对两者进行协调。  

# url2pdf&mailSend WebApplication前端

## VUE2.0+elementUI+bootstrap+axios

1. 安装依赖：`npm ci`
2. 先启动后端Java API，然后运行开发服务器：`npm run serve`，访问 http://localhost:3000 即可
3. 开发服务器仅用于开发。完成开发后，可以运行`npm run build`，将项目打包编译到`dist`目录中，用于前后端分离部署

注意：按照`vue.config.js`中的配置，访问`http://localhost:3000`时，会自动将对`/api`URL下的请求通过反向代理转发到`http://localhost:8080`

## 源码架构

```
src
├─assets/           # 存放静态资源，如图片等
├─components/       # 可被重复使用的组件
├─views/            # “页面”，每个页面可能用到components当中的组件
├─App.vue           # Vue根实例
├─main.js           # 程序入口
└─router.js         # 路由文件，将不同网址对应到不同的“页面”
```

## Todo
1. 主页面
2. url转pdf页面
3. 登录注册页面
4. 凯撒密码加密
5. 根据Cookie免登录
6. 实现浏览器pdf下载功能
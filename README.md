# smart-framework

此代码是根据《架构探险：从零开始写Java Web框架》书中的代码自己敲出来的，主要是为了加深理解IoC，MVC等知识。

## 基本思路
1. 获取指定包名下的所有类（使用Set作为容器储存类类型对象）
2. 通过反射，实例化指定注解的类（使用Map作为容器存储类类型对象与实例对象）
3. 通过反射，设置实例中注入的依赖属性（完成依赖注入）
4. 通过反射，初始化 Action注解的请求方法和路径 与  Controller的method的对应关系。（使用Map作为容器储存）
5. 实现HttpServlet类，完成自己请求处理逻辑。封装参数，根据请求方法和路径，获取到相应的controller bean和方法，通过反射，完成method的调用。根据结果类型不同，返回页面或者JSON数据。

## 知识点
* 注解
* 反射
* Servlet规范
* 类加载器
* Java资源文件加载
* Tomcat


## 小结
通过这次小的实践，可以发现实现一个最简单IoC功能的框架并不复杂，当然其中也需要掌握各种Java知识。对比强大的Spring Framework，我想用到的基本思路和知识应该是差不多的，当然Spring Framework也需要好好研究，更深入的了解Spring Framework。
 下一步跟着完成AOP功能。
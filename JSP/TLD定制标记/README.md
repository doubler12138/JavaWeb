这个示例用来了解TLD定制标记的方法：
* foo.AdvisorTagHandler类为定制标签处理器，扩展于javax.servlet.jsp.tagext.DimpleTagSupport
用来完成标记的工作
* myTag.tld文件用来描述标签的使用方式
* index.jsp文件使用定制标记
* jstl.jar和standard.jar包是JSTL标准标签的包

TLD文件：TLD文件通过几个标记来描述定义标签的使用方法
* \<tlib-version\>标记是必须的，开发人员通过这个标记来声明标记库的版本
* \<short-name\>标记是必须的，主要是由工具使用
* \<uri\>标记也是必须的，是taglib指令中使用的唯一名，注意它是一个名，而不是一个位置。因为它的唯一性，
所以需要一种机制能为库指定唯一的uri的值，一般来说是采用域名的命名方式
* \<description\>标记是可选的，它的作用是来描述标签的作用，类似于注释，严格来说是要使用的
* \<name\>标记是必须的，它是在标签在使用时的名字
* \<tag-class\>标记是必须的，它声明了JSP使用这个标签时容器需要调用哪一个实现类
* \<body\-content\>标记是必须的，它声明了标签体内是否能有内容。
    * empty 标记不能有体
    * scriptless 标记不能有脚本元素
    * tagdependent 标记体看作纯文本，不进行计算
    * JSP 能放在JSP中的东西全能放在标记体中

* \<attribute\>标记用来声明标签的属性，一个属性需要一个对应的\<attribute\>标记来声明
    * \<name\>标记用来声明属性的名称
    * \<required\>标记用来声明这个属性是否是必须的
    * \<rtexprvalue\>标记声明属性的值是在转换时计算还是在运行时计算，当它被设置为false或未定义时，属性
    值只能是String直接量。如果设置为true，则可以在运行时计算，可以使用三种表达式：EL表达式、脚本表达式、
    \<jsp:attribute\>标准动作，**注意：即使标签不允许有体，仍能在体中使用\<jsp:attribute\>来确定属性值

可以把TLD想成是定制标记的API

在JSP2.0之前，需要通过web.xml文件的taglib标记将uri映射到TLD文件
在JSP2.0及之后容器会自动建立TLD和uri名之间的映射，容器会在以下四个地方查找TLD：
* 直接在WEB-INF目录中查找
* 直接在WEB-INF的一个子目录中查找
* 在WEB-INF/lib下一个JAR文件中的META-INF目录中查找
* 在WEB-INF/lib下一个JAR文件中的META-INF目录的子目录中查找
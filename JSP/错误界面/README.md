这是一个如何创建错误界面的示例：

* index.jsp通过EL表达式引发一个ArithmeticException异常，通过DD配置，错误界面为ArtithmeticException.jsp
文件，该文件通过Exception隐式对象，显示错误类型
* notFoundError.jsp文件为http404响应的错误界面
* catch.jsp文件使用\<c:catch\>标记来捕获异常，但是它并不会因为异常跳转到错误界面，而是从错误跳转到标记
体后，所以在体内错误后的内容将不再进行，通过标记的var属性可以将异常置为一个属性，该属性是一个Throwable
对象。

错误界面的配置方法有两种：

* 使用page指令的errorPage属性指定错误显示界面
* 一个是使用DD文件的\<error-page\>标签指定错误界面。

\<error-page\>标签有几个二级标签：
* \<exception-type\>用来声明错误类型
* \<error-page\>用来声明HTTP状态码错误类型
* \<location\>用来声明错误界面。对于exception错误，错误页面可以通过

pageContext.exception来获得一个额外的exception对象。注意这个隐式对象只对通过page指令的isErrorPage指定
的错误界面有效，所以对于使用这个隐式对象的界面只在DD中配置是不够的。


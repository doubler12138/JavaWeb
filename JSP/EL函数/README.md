这个实例主要是用来熟悉EL静态函数的部署的。部署主要是是要使用标记库描述文件（TLD）。TLD文件主要是放在WEB-INF下的某个位置上。
TLD文件里有几个重要的标签。\<short-name\>这个标签在IDEA的编辑里是必须的，它的作用是作为调用的前缀，但是在JSP中使用taglib调用时
会使用prefix属性来个确定调用的前缀，而且尝试后发现最后使用的必须是prefix属性确定的前缀，所以在我看来\<short-name\>标签并没有什么
实际作用。\<uri\>标签用来确定tld在项目中的名字，taglib指令通过其uri属性找寻拥有相同uri的tld文件。\<function\>标签用来定义函数。其中
的\<name\>标签用来确定引用时的函数名，不一定要是真正定义时的函数名。\<function-class\>用来说明定义函数的类。\<function-signature\>
用来确定函数的形式，即其返回类型，参数个数和类型。
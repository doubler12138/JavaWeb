这个项目是我用来熟悉\<jsp:useBean\>和\<jsp:setProperty\>等标准动作的。包含了普通的用法，\<jsp:useBean\>体，还有就是\<jsp:useBean\>的type属性。
得出一个结论是当type属性设定时，就只能修改type中的性质，原因是当type设置时，JSP生成的对应servlet中就是Person person = new Employee(),类型是Person
，所以就只能使用类型中的性质。如果想使用类里面的性质，可以把类型设置为其本身，或者不甚至类型。除此之外还实践了一下如何从请求直接到JSP，而不经过servlet
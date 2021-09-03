<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 2021/8/24
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body{
            width: 100%;
            height: 100%;
            font-family: 'Open Sans',sans-serif;
            margin: 0;
            background-color: RGB(200,200,255);
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="page-header">
                    <h1>
                        <small>书籍列表 —————— 显示所有书籍</small>
                    </h1>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4 column"></div>
                <div class="col-md-4 column">
                    <form action="${pageContext.request.contextPath}/book/queryLikeName" method="get" style="float: left" class="form-inline">
                        <input type="text" name="qbName" value="${qbName}" class="form-control" placeholder="请输入书籍名称">
                        <input type="submit" value="查询" class="btn btn-primary">
                    </form>
                </div>
                <div class="col-md-4 column" style="float: right">
                    <a class="btn btn-primary" style="float: right" href="${pageContext.request.contextPath}/logout">退出系统</a>
                    <div style="float: right;width: 100px">&nbsp;</div>
                    <a class="btn btn-primary" style="float: right" href="${pageContext.request.contextPath}/book/toAddPage">新增书籍</a>
                </div>
                <div class="col-md-4 column">

                </div>
            </div>
        </div>

        <div class="row clearfix">
            <div class="col-md-12 column">
                <table class="table table-hover table-striped">
                    <thead>
                        <th>书籍编号</th>
                        <th>书籍名称</th>
                        <th>书籍数量</th>
                        <th>书籍详情</th>
                        <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;操作</th>
                    </thead>
                    <tbody>
                        <c:forEach var="book" items="${list}">
                            <tr>
                                <td>${book.bookID}</td>
                                <td>${book.bookName}</td>
                                <td>${book.bookCounts}</td>
                                <td>${book.detail}</td>
                                <td>
                                    <%--两种方法都可以：--%>
                                    <%--使用RESTful风格传递参数:"${pageContext.request.contextPath}/book/toUpdatePage/${book.bookID}"--%>
                                    <%--使用默认风格传递参数"${pageContext.request.contextPath}/book/toUpdatePage?id=${book.bookID}"--%>
                                    <a href="${pageContext.request.contextPath}/book/queryBook/${book.bookID}">详情</a>
                                    &nbsp;|&nbsp;
                                    <a href="${pageContext.request.contextPath}/book/toUpdatePage/${book.bookID}">修改</a>
                                    &nbsp;|&nbsp;
                                    <a href="${pageContext.request.contextPath}/book/deleteBook/${book.bookID}">删除</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>

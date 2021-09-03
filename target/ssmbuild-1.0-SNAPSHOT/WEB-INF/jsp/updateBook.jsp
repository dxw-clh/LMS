<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 2021/8/24
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
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
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form class="form-horizontal" method="post" action="${pageContext.request.contextPath}/book/updateBook">
        <%--配置隐藏域，报讯bookID--%>
        <input type="hidden" name="bookID" value="${book.bookID}">
        <div class="form-group">
            <label for="bkName" class="col-sm-2 control-label">书籍名称:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="bkName" name="bookName" required value="${book.bookName}">
            </div>
        </div>
        <div class="form-group">
            <label for="bkCount" class="col-sm-2 control-label">书籍数量:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="bkCount" name="bookCounts" value="${book.bookCounts}" required>
            </div>
        </div>
        <div class="form-group">
            <label for="bkDetail" class="col-sm-2 control-label">书籍描述:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="bkDetail" name="detail" required value="${book.detail}">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="submit" class="form-control" value="保 存">
            </div>
        </div>
    </form>
</div>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 2021/8/24
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>
        炫酷登录页面星空粒子背景
    </title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/normalize.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/demo.css" />
    <!--必要样式-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/component.css" />
    <!--[if IE]><![endif]-->
    <script src="js/html5.js"></script>

</head>
<body>
<div class="container demo-1">
    <div class="content">
        <div id="large-header" class="large-header">
            <canvas id="demo-canvas"></canvas>
            <div class="logo_box">
                <div style="font-size: 40px;text-align: center">用户登录</div>
                <div>&nbsp;</div><div>&nbsp;</div><div>&nbsp;</div><div>&nbsp;</div><div>&nbsp;</div>
                <form action="${pageContext.request.contextPath}/book/allBook" method="post" id="loginForm">
                    <div class="input_outer">
                            <span class="u_user">
                            </span>
                        <input name="logname" class="text" style="color: #FFFFFF !important" type="text"
                               placeholder="请输入账户">
                    </div>
                    <div class="input_outer">
                            <span class="us_uer">
                            </span>
                        <input name="logpass" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"
                               value="" type="password" placeholder="请输入密码">
                    </div>
                    <div class="mb2">
                        <a class="act-but submit" href="" οnclick="document:loginForm.submit()" style="color: #FFFFFF">
                            登录
                        </a>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<script src="js/TweenLite.min.js"></script>
<script src="js/EasePack.min.js"></script>
<script src="js/rAF.js"></script>
<script src="js/demo-1.js"></script>

<div style="text-align:center;"></div>

</body>
</html>

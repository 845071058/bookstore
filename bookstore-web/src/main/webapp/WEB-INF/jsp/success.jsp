<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/8
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title></title>
  <link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body>
<div id="header" class="wrap">
  <div id="logo">合众艾特网上书城</div>
  <div id="navbar">
    <div class="userMenu">
      <ul>
        <li><a href="bypage">User首页</a></li>
        <li><a href="dopage">我的订单</a></li>
        <li class="current"><a href="shopping.html">购物车</a></li>
        <li><a href="dozhuxiao">注销</a></li>
      </ul>
    </div>
    <form method="get" name="search" action="findbyname">
      搜索：<input class="input-text" type="text" name="keywords" /><input class="input-btn" type="submit" name="submit" value="" />
    </form>
  </div>
</div>
<div id="content" class="wrap">
  <div class="success">
    <div class="information">
      <p>恭喜：购买成功！</p>
      <p><a href="dopage?page=0">点此查看订单详情&gt;&gt;</a></p>
    </div>
  </div>
</div>
<div id="footer" class="wrap">
  合众艾特网上书城 &copy; 版权所有

</div>
</body>
</html>

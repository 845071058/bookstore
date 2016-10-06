<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/6
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <li class="current"><a href="index.html">User首页</a></li>
        <li><a href="orderlist.html">我的订单</a></li>
        <li><a href="shopping.html">购物车</a></li>
        <li><a href="#">注销</a></li>
      </ul>
    </div>
    <form method="get" name="search" action="">
      搜索：<input class="input-text" type="text" name="keywords" /><input class="input-btn" type="submit" name="submit" value="" />
    </form>
  </div>
</div>
<div id="content" class="wrap">
  <div class="list bookList">
    <form method="post" name="shoping" action="shopping.html">
      <table>
        <tr class="title">
          <th class="checker"></th>
          <th>书名</th>
          <th class="price">价格</th>
          <th class="store">库存</th>
          <th class="view">图片预览</th>
        </tr>
        <c:forEach var="s" items="${slist.content}">
        <tr>
          <td><input type="checkbox" name="bookId" value="1" /></td>
          <td class="title">${s.bookname}</td>
          <td>${s.bookprice}</td>
          <td>${s.bookcount}</td>
          <td class="thumb"><img src="images/book/book_01.gif" /></td>
        </tr>
        </c:forEach>
      </table>
      <div class="page-spliter">
        <a href="#">&lt;</a>
        <a href="#">首页</a>
        <span class="current">1</span>
        <a href="#">2</a>
        <a href="#">3</a>
        <a href="#">4</a>
        <span>...</span>
        <a href="#">尾页</a>
        <a href="#">&gt;</a>
      </div>
      <div class="button"><input class="input-btn" type="submit" name="submit" value="" /></div>
    </form>
  </div>
</div>
<div id="footer" class="wrap">
  合众艾特网上书城 &copy; 版权所有

</div>
</body>
</html>

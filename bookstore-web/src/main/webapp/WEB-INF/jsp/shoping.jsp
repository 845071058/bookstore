<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/7
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <script type="text/javascript" src="../../js/jquery-3.0.0.js"></script>
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
        <li class="current"><a href="#">购物车</a></li>
        <li><a href="dozhuxiao">注销</a></li>
      </ul>
    </div>
    <form method="get" name="search" action="findbyname">
      搜索：<input class="input-text" type="text" name="bookname" /><input class="input-btn" type="submit" name="submit" value="" />
    </form>
  </div>
</div>
<div id="content" class="wrap">
  <div class="list bookList">
    <form method="post" name="shoping" action="doorder">
      <table>
        <tr class="title">
          <th class="view">图片预览</th>
          <th>书名</th>
          <th class="nums">数量</th>
          <th class="price" colspan="2">小计</th>
        </tr>
        <c:set var="sum" value="0"></c:set>
        <c:forEach items="${cart}" var="g">
        <tr>
          <td class="thumb" width="200">
            <img width="130px" height="200px" src="${g.value.picture}" />

          </td>
          <td class="title" style="padding-left: 200px">${g.value.bookname}</td>
          <td><input class="input-text" type="text" name="nums" value="${g.value.count}" bookvoid="${g.value.bookid}" price="${g.value.bookprice}" /></td>
          <td><span style="padding-left: 40px">￥${g.value.bookprice*g.value.count}</span></td>
          <td><a href="javascript:void(0)" class="delete" bid="${g.value.bookid}">删除</a></td>
        </tr>
          <c:set var="sum" value="${sum+g.value.bookprice*g.value.count}"></c:set>
        </c:forEach>

        <%--<tr class="odd">
          <td class="thumb"><img src="images/book/book_02.gif" /></td>
          <td class="title">痕记</td>
          <td><input class="input-text" type="text" name="nums" value="1" /></td>
          <td>￥<span>22.80</span></td>
        </tr>
        <tr>
          <td class="thumb"><img src="images/book/book_03.gif" /></td>
          <td class="title">天堂之旅</td>
          <td><input class="input-text" type="text" name="nums" value="1" /></td>
          <td>￥<span>25.00</span></td>
        </tr>--%>
      </table>
      <div class="button">
        <h4>总价：￥<span id="total">${sum}</span>元</h4>
        <input class="input-chart" type="submit" name="submit" value="" />
      </div>
    </form>
  </div>
</div>
<div id="footer" class="wrap">
  合众艾特网上书城 &copy; 版权所有

</div>
<script>
  $(function(){
    $(".delete").click(function(){
        $(this).parent().parent().fadeOut(1000);
      $(this).parent().parent().remove;
       $.post("deletebyid",{"bookvoid":$(this).attr("bid")},function(a){
        $("#total").html(a)
      });

    });
    $(".input-text").blur(function(){
      /*$.post("updatecount",{"bookvoid":$(this).attr("bookvoid"),"count":$(this).val()},function(){
        location.reload("toshoping")
      })*/
      var price=$(this).attr("price");
      var count=$(this).val();
      //先修改本地的小计
      $(this).parent().next().html(price*count);
      $.post("updatecount",{"bookvoid":$(this).attr("bookvoid"),"count":$(this).val()},function(a){
          $("#total").html(a)
      })
    })

  });


</script>
</body>
</html>
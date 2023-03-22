<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<header>
    <nav class="navbar navbar-expand-md navbar-dark bg-success">
        <div>
            <a href="#" class="navbar-brand"> Dịch vụ nước </a>
        </div>

        <ul class="navbar-nav">
            <li><a href="<%=request.getContextPath()%>/customer" class="nav-link">Khách hàng</a></li>
            <li><a href="<%=request.getContextPath()%>/send-email" class="nav-link">Gửi Email</a></li>
            <li><a href="<%=request.getContextPath()%>/statistical" class="nav-link">Thống kê</a></li>
            <li><a href="<%=request.getContextPath()%>/configuration" class="nav-link">Cấu hình</a></li>
        </ul>

    </nav>
</header>

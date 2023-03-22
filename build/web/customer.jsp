<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dịch vụ nước</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <c:import url="/head.jsp" />
        <br>
        <div class="container">
            <h3 class="text-center">Danh sách khách hàng</h3>
            <hr>
            <div class="container text-left">

                <a href="<%=request.getContextPath()%>/add-customer.jsp" class="btn btn-success">Thêm khách hàng mới</a>
            </div>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Họ và tên</th>
                        <th>Email</th>
                        <th>Số điện thoại</th>
                        <th>Địa chỉ</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <!--   for (Todo todo: todos) {  -->
                    <c:forEach var="customer" items="${listCustomers}">

                        <tr>
                            <td>
                                <c:out value="${customer.fullName}" />
                            </td>
                            <td>
                                <c:out value="${customer.email}" />
                            </td>
                            <td>
                                <c:out value="${customer.phoneNumber}" />
                            </td>
                            <td>
                                <c:out value="${customer.address}" />
                            </td>
                            <td><a href="<%=request.getContextPath()%>/settlement.jsp">Tất toán</a></td>
                        </tr>
                    </c:forEach>
                    <!-- } -->
                </tbody>

            </table>
        </div>
    </body>
</html>

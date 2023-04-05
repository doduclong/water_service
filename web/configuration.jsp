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
            <h3 class="text-center">Cấu hình giá nước</h3>
            <hr>
            <br>
            <h4 class="text-center">Giá nước sinh hoạt</h4>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Mức</th>
                        <th>Mức nước sử dụng</th>
                        <th>Giá(vnđ/m3)</th>
                        <th>Loại</th>
                    </tr>
                </thead>
                <tbody>
                    <!--   for (Todo todo: todos) {  -->
                    <c:forEach var="progressive" items="${listProgressive}">

                        <tr>
                            <td>
                                <c:out value="${progressive.level}" />
                            </td>
                            <td>
                                <c:out value="${progressive.quantity}" />
                            </td>
                            <td>
                                <c:out value="${progressive.price}"/>
                            </td>
                            <td>
                                <a href="/WaterServiceApplication/update?id=<c:out value="${progressive.id }"/>">Cập nhật</a>
                            </td>
                        </tr>
                    </c:forEach>
                    <!-- } -->
                </tbody>
            </table>
            <h4 class="text-center">Giá nước kinh doanh</h4>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Giá(vnđ/m3)</th>
                    </tr>
                </thead>
                <tbody>
                    <!--   for (Todo todo: todos) {  -->
                        <tr>
                            <td>
                                <c:out value="${progressiveKd.price}" />
                            </td>
                            <td>
                                <a href="/WaterServiceApplication/update?id=<c:out value="${progressiveKd.id }"/>">Cập nhật</a>
                            </td>
                        </tr>
                    <!-- } -->
                </tbody>
            </table>
            <h4 class="text-center">Giá nước sản xuất</h4>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Giá(vnđ/m3)</th>
                    </tr>
                </thead>
                <tbody>
                    <!--   for (Todo todo: todos) {  -->
                        <tr>
                            <td>
                                <c:out value="${progressiveSx.price}" />
                            </td>
                            <td>
                                <a href="/WaterServiceApplication/update?id=<c:out value="${progressiveSx.id }"/>">Cập nhật</a>
                            </td>
                        </tr>
                    <!-- } -->
                </tbody>
            </table>
        </div>
    </body>
</html>

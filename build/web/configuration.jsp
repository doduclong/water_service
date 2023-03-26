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
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Mức</th>
                        <th>Mức nước sử dụng</th>
                        <th>Giá</th>
                        <th>Loại</th>
                    </tr>
                </thead>
                <tbody>
                    <!--   for (Todo todo: todos) {  -->
                    <c:forEach var="progressive" items="${listProgressive}">

                        <tr>
                            <td>
                                <c:out value="${progressive.id}" />
                            </td>
                            <td>
                                <c:out value="${progressive.level}" />
                            </td>
                            <td>
                                <c:out value="${progressive.quantity}" />
                            </td>
                            <td>
                                <c:out value="${progressive.price}" />
                            </td>
                            <td>
                                <c:out value="${progressive.type}" />
                            </td>
                            <td>
                                <a href="/WaterServiceApplication/update?id=<c:out value="${progressive.id }"/>">Update</a>
                            </td>
                        </tr>
                    </c:forEach>
                    <!-- } -->
                </tbody>
            </table>
     
        </div>
    </body>
</html>

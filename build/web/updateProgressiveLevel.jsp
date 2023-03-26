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
            <h3 class="text-center">Cập nhật giá nước</h3>
            <hr>
            <br>
                <form action="update" method="post">
                <table>
                    <tr>
                        <td>ID</td>
                        <td>
                            <input value="<c:out value="${progressiveLevel.id}" />" type="text" name="id" readonly> 
                        </td>
                    </tr>
                    <tr>
                        <td>Mức</td>
                        <td>
                            <input value="<c:out value="${progressiveLevel.level}" />" type="text" name="level" readonly>
                        </td>
                    </tr>
                    <tr>
                        <td>Mức nước sử dụng</td>
                        <td>
                            <input value="<c:out value="${progressiveLevel.quantity}" />" type="text" name="quantity">
                        </td>
                    </tr>
                    <tr>
                        <td>Giá</td>
                        <td><input value="<c:out value="${progressiveLevel.price}" />" type="text" name="price"></td>
                    </tr>
                    
                    <tr>
                        <td>Loại</td>
                        <td><input value="<c:out value="${progressiveLevel.type}" />" type="text" name="type"></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><button type="submit">Update</button></td>
                    </tr>
                </table>
                
            </form>
            <a href="/WaterServiceApplication/configuration"><button>Return</button></a>
     
        </div>
    </body>
</html>







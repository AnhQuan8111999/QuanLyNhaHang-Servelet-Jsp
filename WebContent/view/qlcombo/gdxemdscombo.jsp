<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Danh sách Combo</title>
<link rel="stylesheet" href="/QLNhaHang/view/static2/css/main.css">
</head>
<body>
	<div class="wrapper">
		<div class="container">
			<div class="dashboard">

				<jsp:include page="/view/share/leftmenu.jsp"></jsp:include>

				<div class="right">
					<div class="right__content">
						<div class="right__title"> Combo</div>
						
						<div class="right__table">
							<div class="right__tableWrapper">
								<table>
									<thead>
										<tr>
																				
											<th>Tên Combo</th>
											
											<th>Giá Combo</th>
											<th>Mô tả</th>
											<th>Sửa</th>
                                            <th>Xoá</th>
                                           											
										</tr>
									</thead>
									<c:forEach var="combo" items="${combos}">
									<tbody>
										<tr>											
											
											<td >${combo.ten}</td>
											
											<td >${combo.gia}</td>
											<td >${combo.moTa}</td>																						
											<td data-label="Sửa" class="right__iconTable"><a href="/QLNhaHang/admin/update-combo?id=${combo.id}" ><img src="/QLNhaHang/view/static2/assets/icon-edit.svg" alt=""></a></td>
                                            <td data-label="Xoá" class="right__iconTable"><a href="/QLNhaHang/admin/delete-combo?id=${combo.id}"><img src="/QLNhaHang/view/static2/assets/icon-trash-black.svg" alt=""></a></td>                                           
										</tr>
									</tbody>
									</c:forEach>									
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script src="/QLNhaHang/view/static2/js/main.js"></script>
	<script>
		if( ${check}==1) {
			
			alert(" Sửa combo thành công");
		}
	</script>

</body>
</html>
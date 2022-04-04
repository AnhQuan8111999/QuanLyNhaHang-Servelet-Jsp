<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Danh sách món ăn </title>
<link rel="stylesheet" href="/QLNhaHang/view/static2/css/main.css">
</head>
<body>
	<div class="wrapper">
		<div class="container">
			<div class="dashboard">

				<jsp:include page="/view/share/leftmenu.jsp"></jsp:include>

				<div class="right">
					<div class="right__content">
						<div class="right__title"> Combo : ${combo.ten }</div>
						
						<div class="right__table">
							<div class="right__tableWrapper">
								<table>
									<thead>
										<tr>
											<th>Tên món ăn</th>	
											<th>Loại món ăn</th>										
											<th>Giá</th>
											<th>Mô tả</th>
											<th>kiểu phục vụ</th>											
											<th>Trạng thái</th>   
											<th>Xóa</th>                                                                                   										
										</tr>
									</thead>
									<c:forEach var="comBoMonAn" items="${comBoMonAns}">
									<tbody>
										<tr>											
											
											<td >${comBoMonAn.monAn.ten}</td>
											<td >${comBoMonAn.monAn.loai}</td>
											<td >${comBoMonAn.monAn.gia}</td>
											<td >${comBoMonAn.monAn.moTa}</td>	
											<td >${comBoMonAn.kieuPhucVu}</td>
											<td >${comBoMonAn.trangThai}</td>																															
											<td data-label="Xoá" class="right__iconTable"><a href="/QLNhaHang/admin/xoamonancombo?id=${comBoMonAn.id}&idcombo=${combo.id}"><img src="/QLNhaHang/view/static2/assets/icon-trash-black.svg" alt=""></a></td>                                  
										</tr>
									</tbody>
									</c:forEach>									
								</table>
								<div class="right__formWrapper" style="text-align: center;">									
								<a  href="/QLNhaHang/admin/danhsachmonan?id=${combo.id}" class="left__name" style="text-align: center;color: blue;">Thêm món ăn vào combo</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script src="/QLNhaHang/view/static2/js/main.js"></script>
</body>
</html>
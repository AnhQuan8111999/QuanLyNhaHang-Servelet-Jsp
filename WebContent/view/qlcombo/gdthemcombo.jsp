<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Thêm Combo</title>
<link rel="stylesheet" href="/QLNhaHang/view/static2/css/main.css">
</head>
<body>
	<div class="wrapper">
		<div class="container">
			<div class="dashboard">
				<jsp:include page="/view/share/leftmenu.jsp"></jsp:include>

				<div class="right">
					<div class="right__content">
						<div class="right__title">Thêm Combo</div>
						<div class="right__formWrapper">

							<form action="/QLNhaHang/admin/addcombo" method="post">
							${err }
							${err1}
								<div class="right__inputWrapper">
									<input type="text" placeholder="Nhập tên combo" id="tencombo"
										name="ten" autofocus>
								</div>
								<div class="right__inputWrapper">
									<input type="number" placeholder="Nhập giá tiền" id="giatien"
										name="gia" autofocus>
								</div>

								<div class="right__inputWrapper">
									<select name="moTa">
										<option disabled selected>Chọn loại combo</option>
										<option value="Combo cho 2 nguoi">Loại 1:Combo cho 2
											người</option>
										<option value="Combo cho 4 nguoi">Loại 2:Combo cho 4
											người</option>
										<option value="Combo cho 6 nguoi">Loại 3:Combo cho 6
											người</option>
										<option value="Combo cho 10 nguoi">Loại 4:Combo cho
											10 người</option>
									</select>
								</div>
								
								<button class="btn" type="submit" onclick="abc()">Thêm món ăn</button>
							</form>
						</div>

						<div class="right__table">
							<div class="right__tableWrapper">
								<table>
									<thead>
										<tr>
											<th>Id</th>
											<th>Tên món ăn</th>
											<th>Giá</th>
											<th>Mô tả</th>

										</tr>
									</thead>
									<tbody>
										<tr>
											<td> </td>
											<td> </td>
											<td> </td>
											<td> </td>
										</tr>
									</tbody>

								</table>
							</div>
						</div>
						<div class="right__formWrapper" style="text-align: center;">
							<a href="/QLNhaHang/admin/index" class="left__name"
								style="text-align: center; color: blue;">Hoàn thành</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script src="/QLNhaHang/view/static2/js/main.js"></script>

</body>
</html>
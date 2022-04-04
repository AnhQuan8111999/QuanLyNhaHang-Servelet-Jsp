<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Sửa Combo</title>
<link rel="stylesheet" href="/QLNhaHang/view/static2/css/main.css">
</head>
<body>
	<div class="wrapper">
		<div class="container">
			<div class="dashboard">
				<jsp:include page="/view/share/leftmenu.jsp"></jsp:include>

				<div class="right">
					<div class="right__content">
						<div class="right__title">Sửa Combo</div>
						<div class="right__formWrapper">
						
							<form action="/QLNhaHang/admin/update-combo" method="post">
							${err }						
							<div class="right__inputWrapper">
									<label>Id </label>
									<input value="${combo.id }" type="number"  id="id" name="id" readonly="readonly" >
								</div>
							
								<div class="right__inputWrapper">
									<label>Id Nhà hàng</label>
									<input value="${combo.idnhaHang }" type="number" placeholder="Nhập id nhà hàng" id="idnhahang" name="idNhaHang" autofocus>
								</div>
								
								<div class="right__inputWrapper">
									<label>Id người dùng</label>
									<input value="${combo.idnguoiDung}" type="number" placeholder="Nhập id người dùng" id="idnguoidung" name="idNguoiDung" autofocus>
								</div>
								
								<div class="right__inputWrapper">
									<label>Tên Combo</label> 
									<input value="${combo.ten }" type="text" placeholder="Nhập tên combo" id="tencombo" name="ten" autofocus>
								</div>	
								
								<div class="right__inputWrapper">
									<label>Loại combo</label> 
									<select name="loai" >
									<option value="${combo.loai }" >${combo.loai }</option>						
											<option  value="1">1</option>
											<option  value="2">2</option>
											<option  value="3">3</option>
											<option  value="4">4</option>										
									</select>
								</div>
																								
								<div class="right__inputWrapper">
									<label>Giá tiền Combo</label> 
									<input value="${combo.gia }" type="number" placeholder="Nhập giá tiền" id="giatien" name="gia"  autofocus>
								</div>
								
								<div class="right__inputWrapper">
									<label> Mô tả combo</label> 
									<select name="moTa">
									<option >${combo.moTa }</option>										
											<option value="Combo cho 2 nguoi">Loại 1:Combo cho 2 người</option>
											<option value="Combo cho 4 nguoi">Loại 2:Combo cho 4 người</option>
											<option value="Combo cho 6 nguoi">Loại 3:Combo cho 6 người</option>
											<option value="Combo cho 10 nguoi">Loại 4:Combo cho 10 người</option>											
									</select>
								</div>	
															
								<button class="btn" type="submit">Sửa Combo</button>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script src="/QLNhaHang/view/static2/js/main.js"></script>
	<script>
		if( ${check}==0) {
			
			alert("Tất cả các ô không được để trống ");
		}
	</script>
</body>
</html>
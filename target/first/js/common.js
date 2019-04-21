$("#login").click(function() {

	var json = {
		"logid" : $("#userName").val(),
		"logpass" : $("#logpass").val(),

	};

	$.ajax({
		url : 'login',
		type : "POST",
		data : JSON.stringify(json), //转JSON字符串
		dataType : 'json',
		contentType : 'application/json;charset=utf-8',
		success : function(info) {
			if(data.result){
				alert("成功");
			}else{
				alert("失败")
			}
		},
		error : function(info) {
			//messages
			alert(JSON.stringify(info));
		}
	});
});

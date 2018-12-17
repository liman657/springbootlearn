<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>新增用户用户</title>
    <!-- 加载Query文件-->
    <script src="https://code.jquery.com/jquery-3.2.0.js">
    </script>
    <script type="text/javascript">
        $(document).ready(function() {
            $("#submit").click(function() {
                var username = $("#username").val();
                var note = $("#note").val();
                if ($.trim(username)=='') {
                    alert("用户名不能为空！");
                    return;
                }

                //拼接json数据
                var params = {
                    username : username,
                    note : note
                };
                $.post({
                    url : "./insert",
                    // 此处需要告知传递参数类型为JSON，不能缺少
                    contentType : "application/json",
                    // 将JSON转化为字符串传递
                    data : JSON.stringify(params),
                    // 成功后的方法
                    success : function(result) {
                        if (result == null || result.id == null) {
                            alert("插入失败");
                            return;
                        }
                        alert("插入成功");
                    }
                });
            });
        });
    </script>
</head>
<body>
<div style="margin: 20px 0;"></div>
<form id="insertForm">
    <table>
        <tr>
            <td>用户名称：</td>
            <td><input id="username" name="username"></td>
        </tr>
        <tr>
            <td>备注</td>
            <td><input id="note" name="note"></td>
        </tr>
        <tr>
            <td></td>
            <td align="right"><input id="submit" type="button" value="提交" /></td>
        </tr>
    </table>
</form>
</body>
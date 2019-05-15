<%--
  Created by IntelliJ IDEA.
  User: Fecinly
  Date: 2019/5/4
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>

<%--</body>--%>
<%--</html>--%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>测试Tree功能</title>
    <link rel="stylesheet" type="text/css" href="../easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../easyui/themes/icon.css">
    <script type="text/javascript" src="../easyui/jquery.min.js"></script>
    <script type="text/javascript" src="../easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../easyui/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="../biz/department.js"></script>
</head>
<body>
<!-- 部门树 -->
<ul id="deptTree" class="easyui-tree"></ul>
<!-- 叶子节点右键菜单 -->
<div id="leaf" class="easyui-menu" style="width: 120px;">
    <div onclick="addNode()" iconcls="icon-add">新增节点</div>
    <div onclick="removeNode()" iconcls="icon-remove">删除节点</div>
    <div onclick="updateNode()" iconcls="icon-edit">编辑节点</div>
</div>
<!-- 非叶子节点右键菜单 -->
<div id="parentNode" class="easyui-menu" style="width: 120px;">
    <div onclick="addNode()" iconcls="icon-add">新增节点</div>
    <div onclick="updateNode()" iconcls="icon-edit">编辑节点</div>
</div>
<!-- 节点内容对话框 -->
<div id="info" class="easyui-dialog" style="width:300px; height: 120px;" closed=true>
    <form id="treefrm" method="post">
        <input type="hidden" name="departmentid">
        <table style="margin: auto;" cellspacing="10">
            <tr>
                <td>部门名称</td>
                <td><input class="easyui-textbox" name="departmentname" value="" data-options="required:true"></td>
            </tr>
        </table>
        <div style="text-align: center; bottom: 15px; margin-top: 10px;">
            <a id="btnSave" class="easyui-linkbutton"
               data-options="iconCls:'icon-save'">保存</a>
            <a id="btnCancel" class="easyui-linkbutton"
               data-options="iconCls:'icon-cancel'">取消</a>
        </div>
    </form>
</div>
</body>
</html>

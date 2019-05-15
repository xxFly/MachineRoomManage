// 记录添加还是修改
var flag;
// 临时存储选中节点数据
var tempNode;

// 页面加载
$(function () {
    // 菜单树绑定数据
    $('#deptTree').tree({
        url: '/department/tree',
        animate: true,
        lines: true,
        onBeforeSelect: function (node) {
            // onBeforeSelect事件：节点被选中前触发，返回false则取消选择动作
            if (!$(this).tree('isLeaf', node.target)) {
                // 不是叶子节点，则不能选中
                return false;
            }
        },
        onClick: function (node) {
            // alert(node.target.innerText);
        },
        onContextMenu: function (e, node) {
            // 记录选中的节点，为后续增删改操作提供节点数据
            tempNode = node;

            // 阻止右键默认事件
            e.preventDefault();

            // 判断该结点有没有父结点
            var root = $(this).tree('getParent', node.target);
            // 没有父节点则为根结点，可以新增、编辑，不可以删除
            if (root == null) {
                // 如果是根节点，则可以新增、编辑，不可以删除
                $('#parentNode').menu('show', {
                    left: e.pageX,
                    top: e.pageY
                });
            }

            if ($(this).tree('isLeaf', node.target)) {
                // 如果是叶子节点，则可以新增、编辑和删除
                $('#leaf').menu('show', {
                    left: e.pageX,
                    top: e.pageY
                });
            } else {
                // 如果不是叶子节点，则可以新增、编辑，不可以删除
                $('#parentNode').menu('show', {
                    left: e.pageX,
                    top: e.pageY
                });
            }
        }
    });

    // 保存按钮押下处理
    $('#btnSave').click(function () {
        var tempdata, tempurl, tempmsg;

        if (flag == 'add') {
            tempurl = 'saveNode';
            tempmsg = '添加成功！';
            tempdata = {
                departmentpid: tempNode.id,
                departmentname: $('#treefrm').find('input[name=departmentname]').val()
            };
        } else if (flag == 'edit') {
            tempurl = 'updateNode';
            tempmsg = '编辑成功！';
            tempdata = {
                departmentid: $('#treefrm').find('input[name=departmentid]').val(),
                departmentpid: $('#deptTree').tree('getParent', tempNode.target).id,
                departmentname: $('#treefrm').find('input[name=departmentname]').val()
            };
        }

        $.ajax({
            type: 'post',
            async: true,
            url: tempurl,
            data: tempdata,
            dataType: 'json',
            success: function (result) {
                // 树重新加载
                $('#deptTree').tree('reload');

                $.messager.show({
                    title: '提示信息',
                    msg: tempmsg
                });
            },
            error: function (result) {
                // 请求失败时执行该函数
                $.messager.show({
                    title: '错误信息',
                    msg: result.msg
                });
            }
        });

        $('#treefrm').form('clear');
        $('#info').dialog('close');
    });

    // 取消按钮押下处理
    $('#btnCancel').click(function () {
        $('#treefrm').form('clear');
        $('#info').dialog('close');
    });
});

// 新增节点
var addNode = function () {
    flag = 'add';
    // 清空表单数据
    $('#treefrm').form('clear');
    // 打开dialog
    $('#info').dialog('open').dialog('setTitle', '新增');
};

// 编辑节点
var updateNode = function () {
    flag = 'edit';
    // 清空表单数据
    $('#treefrm').form('clear');
    $('#treefrm').form('load', {
        departmentid: tempNode.id,
        departmentname: tempNode.text
    });
    // 打开dialog
    $('#info').dialog('open').dialog('setTitle', '编辑');
};

// 删除节点
var removeNode = function () {
    // 前台删除
    $('#deptTree').tree('remove', tempNode.target);

    // 后台删除
    $.ajax({
        type: "post",
        async: true,           // 异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
        url: "deleteNode",
        data: {departmentid: tempNode.id},
        dataType: "json",      // 返回数据形式为json
        success: function (result) {
            // 请求成功时执行该函数内容，result即为服务器返回的json对象
            $.messager.show({
                title: '提示信息',
                msg: '删除成功！'
            });
        },
        error: function (result) {
            // 请求失败时执行该函数
            $.messager.show({
                title: '错误信息',
                msg: result.msg
            });
        }
    });
};
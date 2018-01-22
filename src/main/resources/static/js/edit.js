


// 提交表单
function showHint(str) {
        var data = {
            'param': $("input[name=name]").val()
        };
        $.post("/killphp/home", data, function (res) {
            if (res !== null || res !== undefined || res !== '') {
                document.getElementById("txtHint").innerHTML = res;
            }
        }).fail(function () {
                alert("失败：网络通信失败", false);

        });
};

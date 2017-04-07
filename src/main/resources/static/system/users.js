
$(function () {
  loadUsers();
});

function loadUsers() {
  $.ajax({
    url: "/api/v1/users",
    method: "get",
    contentType: "application/json; charset=UTF-8",
    success: function (result) {
      console.log(result);
      if (result) {
        fillTableBody(result);
      }
    },
    error: function (result) {
      console.log(result);
    }
  });
}

function fillTableBody(users) {
  if (null == users || 0 == users.length) {
    return;
  }
  var html = "";
  for (var i = 0; i < users.length; i++) {
    var user = users[i];
    // console.log(user);
    html += ""
      + "<tr>"
      + "  <td>" + (user.id || "-") + "</td>"
      + "  <td>" + (user.name || "-") + "</td>"
      + "  <td>" + (user.email || "-") + "</td>"
      + "  <td>" + (getGenderDictName(user.gender) || "-") + "</td>"
      + "  <td>"
      + "    <a class=\"delete link\" uid=\"" + user.id + "\"><i class=\"delete icon red\"></i></a>"
      + "    <span style=\"padding-left:10px;\">&nbsp;</span>"
      + "    <a class=\"edit link\" uid=\"" + user.id + "\"><i class=\"edit icon\"></i></a>"
      + "  </td>"
      + "</tr>";
  }
  $("#js-tbody-users").empty().append(html);
  $(".delete.link").off("click").on("click", function () {
    remove($(this).attr("uid"));
  });
  $(".edit.link").off("click").on("click", function () {
    edit($(this).attr("uid"));
  });
}

function getGenderDictName(id) {
  return "M" == id ? "男" : "女";
}

function remove(uid) {
  console.log(uid);
}

function edit(uid) {
  console.log(uid);
}

function add() {
  console.log("New wizard");
}
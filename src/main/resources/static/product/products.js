
$(function () {
  loadProducts();
});

function loadProducts() {
  $.ajax({
    url: "/api/v1/products",
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

function fillTableBody(products) {
  if (null == products || 0 == products.length) {
    return;
  }
  var html = "";
  for (var i = 0; i < products.length; i++) {
    var product = products[i];
    console.log(product);
    html += ""
      + "<tr>"
      + "  <td>" + (product.id || "-") + "</td>"
      + "  <td>" + (product.name || "-") + "</td>"
      + "  <td>" + (product.version || "-") + "</td>"
      + "  <td>" + (product.type || "-") + "</td>"
      + "  <td>" + (product.pm || "-") + "</td>"
      + "  <td>" + (product.owner || "-") + "</td>"
      + "  <td>" + (laotse.formatDate(product.releaseDate) || "-") + "</td>"
      + "  <td>" + (laotse.formatDate(product.onlineDate) || "-") + "</td>"
      + "  <td>" + (laotse.formatDate(product.offlineDate) || "-") + "</td>"
      + "  <td>"
      + "    <a class=\"delete link\" uid=\"" + product.id + "\"><i class=\"delete icon red\"></i></a>"
      + "    <span style=\"padding-left:10px;\">&nbsp;</span>"
      + "    <a class=\"edit link\" uid=\"" + product.id + "\"><i class=\"edit icon\"></i></a>"
      + "  </td>"
      + "</tr>";
  }
  $("#js-tbody-products").empty().append(html);
  $(".delete.link").off("click").on("click", function () {
    remove($(this).attr("uid"));
  });
  $(".edit.link").off("click").on("click", function () {
    edit($(this).attr("uid"));
  });
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
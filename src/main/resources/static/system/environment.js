
$(function () {
  loadOsEnv();
  
  loadJvmEnv();
});

function loadOsEnv() {
  $.ajax({
    url: "/api/v1/systems/os",
    method: "get",
    contentType: "application/json; charset=UTF-8",
    success: function (result) {
      console.log(result);
      if (result) {
        fillTableBody(result, "js-tbody-os-env");
      }
    },
    error: function (result) {
      console.log(result);
    }
  });
}

function loadJvmEnv() {
  $.ajax({
    url: "/api/v1/systems/jvm",
    method: "get",
    contentType: "application/json; charset=UTF-8",
    success: function (result) {
      console.log(result);
      if (result) {
        fillTableBody(result, "js-tbody-jvm-env");
      }
    },
    error: function (result) {
      console.log(result);
    }
  });
}

function fillTableBody(vars, tbody) {
  if (null == vars || null == tbody) {
    return;
  }
  var html = "";
  for (var name in vars) {
    html += ""
      + "<tr>"
      + "  <td>" + (name || "") + "</td>"
      + "  <td>" + (vars[name] || "") + "</td>"
      + "</tr>";
  }
  $("#" + tbody).empty().append(html);
}
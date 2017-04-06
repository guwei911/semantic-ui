
var laotse = laotse || {};

laotse.isEmpty = function(str) {
  if (null == str || "string" != typeof(str)) {
    return true;
  }
  return str.trim().length == 0;
}

laotse.isNotEmpty = function(str) {
  if (null == str || "string" != typeof(str)) {
    return false;
  }
  return str.trim().length > 0;
}

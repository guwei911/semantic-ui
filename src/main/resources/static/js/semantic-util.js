
var laotse = laotse || {};

laotse.isEmpty = function (str) {
  if (null == str || "string" != typeof (str)) {
    return true;
  }
  return str.trim().length == 0;
}

laotse.isNotEmpty = function (str) {
  if (null == str || "string" != typeof (str)) {
    return false;
  }
  return str.trim().length > 0;
}

laotse.formatDate = function (date, pattern) {
  if (null == date) {
    return null;
  }
  var time = null;
  if (typeof (date) == "number") {
    time = new Date();
    time.setTime(date);
  } else if (typeof (date) == "string") {
    time = new Date(date);
  } else if (typeof (date) == "object" && (date.constructor + '').match(/Date/) != null) {
    time = date;
  }
  if (null == time) {
    return null;
  }
  if (typeof (Date.prototype.format) == "undefined") {
    Date.prototype.format = function (fmt) {
      var o = {
        "M+": this.getMonth() + 1, //月份 
        "d+": this.getDate(), //日 
        "h+": this.getHours(), //小时 
        "m+": this.getMinutes(), //分 
        "s+": this.getSeconds(), //秒 
        "q+": Math.floor((this.getMonth() + 3) / 3), //季度 
        "S": this.getMilliseconds() //毫秒 
      };
      if (/(y+)/.test(fmt)) {
        fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
      }
      for (var k in o) {
        if (new RegExp("(" + k + ")").test(fmt)) {
          fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k])
            .substr(("" + o[k]).length)));
        }
      }
      return fmt;
    };
  }
  return time.format(laotse.isEmpty(pattern) ? "yyyy-MM-dd hh:mm:ss" : pattern);
}

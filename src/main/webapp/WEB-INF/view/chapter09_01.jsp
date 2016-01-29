<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<script language="javascript" src="/js/jquery-2.1.4.min.js"></script>
<script language="javascript">
  $(function(){
      $.ajax( {
          url: "/chapter09/sample01",
          data:{uuid:111,name:"fuck"},
          dataType: "json",
          success: function(data) {
              alert(data.name);
          }
      });
  });
</script>
</html>


<%@page import="java.util.ArrayList"%> 
<%@page import="springmvc.springmvc4assignment.controller.User" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 15px;
  text-align: left;
}
#t01 {
  width: 100%;    
  background-color: #f1f1c1;
}
</style>
</head>
<body>
<table id="tblCustomers">

<tr>
 <%ArrayList<User> std =  
            (ArrayList<User>)request.getAttribute("msg"); 
        for(User s:std){%> 
        
            <tr> 
                <td><%=s.getUser()%></td> 
                 <td><%=s.getPassword()%></td> 
            </tr> 
            <%}%> 
    
        </table>  

</body>


<input type="button" id="btnExport" value="Export" />
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script src="table2excel.js" type="text/javascript"></script>
<script type="text/javascript">
    $(function () {
        $("#btnExport").click(function () {
            $("#tblCustomers").table2excel({
                filename: "Table.xls"
            });
        });
    });
</script>






<!-- <input type="button" id="btnExport" value="Export" onclick="Export()" />
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.22/pdfmake.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/html2canvas/0.4.1/html2canvas.min.js"></script>
    <script type="text/javascript">
        function Export() {
            html2canvas(document.getElementById('studtable'), {
                onrendered: function (canvas) {
                    var data = canvas.toDataURL();
                    var docDefinition = {
                        content: [{
                            image: data,
                            width: 500
                        }]
                    };
                    pdfMake.createPdf(docDefinition).download("Table.pdf");
                }
            });
        }
    </script> -->
    
</html>
<%@page import="java.util.Iterator"%>
<%@page import="com.project1.com.posts.Post_Use_Bean"%>
<%@page import="java.util.List"%>
<%@page import="com.project1.com.posts.Post_Modal"%>
<%@page import="com.project1.com.profile.Profile_Bean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
        <title>Home | Project 1</title>
        <STYLE>A {text-decoration: none;} </STYLE>
        <link type="text/css" href="index.css" rel="stylesheet" />        
</head>

<body>
<%
Profile_Bean obj_Profile_Bean=(Profile_Bean)session.getAttribute("fb_user_session");
%>

	<header>
            <h1>Facebook Tweet</h1>
            <nav>
                <p><a href = "index.html" >Tweet&nbsp;&nbsp;</a>
                &nbsp;<a style="background-color: grey;" href = "friends.jsp" >Friends&nbsp;&nbsp;</a>
                &nbsp;<a href = "toptweets.jsp" >Top Tweets&nbsp;&nbsp;</a></p>
            </nav>
	</header>

<center>
<table border="1">
<tr>
<td colspan="2" align="center">
<h2>Friends</h2>
</td>
</tr>
<tr>
<td align="center">
<img src="<%=obj_Profile_Bean.getProfile_picture() %>"></img><br>
Name : <%=obj_Profile_Bean.getUser_name() %><br>
id : <%=obj_Profile_Bean.getId() %><br>
</td>
<td>
<%
Post_Modal obj_Post_Modal=new Post_Modal();
List<Post_Use_Bean> list_of_posts= obj_Post_Modal.call_me_to_get_posts(obj_Profile_Bean.getAccess_token());
Iterator<Post_Use_Bean> it_list_of_posts=list_of_posts.iterator();
if(list_of_posts.size()>0){
Post_Use_Bean obj_Post_Use_Bean=new Post_Use_Bean();
while(it_list_of_posts.hasNext()){
obj_Post_Use_Bean=it_list_of_posts.next();
%>
<%=obj_Post_Use_Bean.getId() %><br>
<%=obj_Post_Use_Bean.getMessage() %><br>
<%=obj_Post_Use_Bean.getCreated_time() %><br>
<button type="button" onclick="javascript:assign();">Delete</button>
<hr>
<%
}
}
%>
</td>
</tr>
</table>
</center>

<script>
    function assign() {
    	var postId = obj_Post_Use_Bean.getId();
    	FB.api(postId, 'delete', function(response) {
    	  if (!response || response.error) {
    	    alert('Error occured');
    	  } else {
    	    alert('Post was deleted');
    	  }
    	});
    }
</script>

</body>
</html>
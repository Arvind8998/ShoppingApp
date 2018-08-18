<%@tag import="com.brainmentors.app.dto.RightDTO"%>
<%@tag import="com.brainmentors.app.dto.UserDTO"%>
<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ attribute name="userDTO" type =com.brainmentors.app.dto.UserDTO" required ="true" %>
<ul>
<%
boolean isActive = true;
if(userDTO!=null && userDTO.getRights().size()>0){
	for(RightDTO rightDTO: userDTO.getRights()){ %>
	<li class="<%=isActive?"active":"" %>">
	<a href="<%=rightDTO.getScreenName()%>"><%=rightDTO.getName() %>
	</a></li>
	<%
	isActive = false;
}
}

%>

</ul>
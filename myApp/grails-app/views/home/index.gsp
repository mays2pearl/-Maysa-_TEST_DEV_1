<%@ page import="Company" %>
<html>
<head>
    <meta name="layout" content="public"/>
    <title>Home Page</title>
</head>
<body>

<div id="content" role="main">
    <section class="row colset-2-its">
        <h1>Welcome ${name}!</h1>
        <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
        </g:if>

        <p>There are ${companyTotal} company in the database.</p>

        <ul>
        <g:each in="${Company.list()}" var="company">
            <li>
                <g:link controller="company" action="show" id="${company.id}">
                    ${company.name} - ${company.segment}
                </g:link>
            </li>
        </g:each>
        </ul>

        <g:form action="updateName" style="margin: 0 auto; width:320px">
            <g:textField name="name" value="" />
            <g:submitButton name="Update name" />
        </g:form>

    </section>
</div>

</body>
</html>
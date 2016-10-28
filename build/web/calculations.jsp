<!--
Copyright (c) 2016 Scott Armstrong & Nicholas Richu
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="styles/main.css">
    <link rel="stylesheet" href="styles/calcstyles.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SPANRHomework2</title>
  </head>
  <body>
    <jsp:include page="/includes/header.html" />
    <main>
      <jsp:useBean id="investment" scope="request" class="elon.edu.data.Investment" />
      <div id="jsp-content">
        <p><label>Investment Amount:</label><span><jsp:getProperty name="investment" property="investmentAmount" /></span></p>
        <p><label>Yearly Interest Rate:</label><span><jsp:getProperty name="investment" property="interestRate" /></span></p>
        <p><label>Number of Years:</label><span><jsp:getProperty name="investment" property="years" /></span></p>
        <p><label>Future Value:</label><span><jsp:getProperty name="investment" property="futureValue" /></span></p>
      </div>
    </main>
    <jsp:include page="/includes/footer.html" />
  </body>
</html>

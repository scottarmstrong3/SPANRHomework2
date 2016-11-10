<!--
Copyright (c) 2016 Scott Armstrong & Aidan Draper
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <jsp:include page="/includes/header.html" />
  <body id="calc">
    <header>
      <h1>Future Value Calculator</h1>
    </header>
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

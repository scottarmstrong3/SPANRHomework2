<!--
Copyright (c) 2016 Scott Armstrong & Nicholas Richu
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
      <div id="jsp-content">
        <p><label>Investment Amount:</label><span>${investment.investmentAmount}</span></p>
        <p><label>Yearly Interest Rate:</label><span>${investment.interestRate}</span></p>
        <p><label>Number of Years:</label><span>${investment.years}</span></p>
        <p><label>Future Value:</label><span>${investment.futureValue}</span></p>
      </div>
    </main>
    <jsp:include page="/includes/footer.html" />
  </body>
</html>

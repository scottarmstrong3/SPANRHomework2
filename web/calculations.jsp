<!--
Copyright (c) 2016 Scott Armstrong & Aidan Draper
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="elon" uri="/WEB-INF/tlds/tags.tld"%>
<!DOCTYPE html>
<html>
  <jsp:include page="/includes/header.html" />
  <body id="calc">
    <header>
      <h1>Future Value Calculator</h1>
    </header>
    <main>
      <div id="jsp-content">
        <p><label>Investment Amount&#58;</label><span><elon:currencyFormat numberToFormat="${investment.investmentAmount}"/></span></p>
        <p><label>Yearly Interest Rate&#58;</label><span>${investment.interestRate}</span></p>
        <p><label>Number of Years&#58;</label><span>${investment.years}</span></p>
        <table>
          <tr>
            <th>Year</th>
            <th>Value</th>
          </tr>
          <elon:futureValueDisplay futureValueList="${investment.futureValues}">
            <tr>
              <td>${year}</td>
              <td><elon:currencyFormat numberToFormat="${value}" /></td>
            </tr>
          </elon:futureValueDisplay>
        </table>
        <a href="calculate">Return to Calculator</a>
      </div>
    </main>
    <jsp:include page="/includes/footer.html" />
  </body>
</html>

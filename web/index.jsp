<!DOCTYPE html>
<!--
Copyright (c) 2016 Scott Armstrong & Aidan Draper
-->
<html>
  <jsp:include page="/includes/header.html" />
  <body id="index">
    <header>
      <h1>Future Value Calculator</h1>
    </header>
    <main>
      <form action="calculate" method="post">
        <input type="hidden" name="action" value="calculate">        
        <p><label for="investment-amount">Investment Amount</label><input name="investment-amount" id="investment-amount" type="text" title="Enter investment amount here" pattern="^[0-9]+$" autofocus required></p>
        <p><label for="interest-rate">Yearly Interest Rate</label><input name="interest-rate" id="interest-rate" type="text" title="Enter yearly interest rate" pattern="^[0-9]+$" required></p>
        <p><label for="years">Number of Years</label><input name="years" id="years" type="text" title="Enter number of years" placeholder="Integer number of years" pattern="^[0-9]+$" required></p>
        <input id="submit-button" type="submit" value="Calculate">
      </form>
    </main>
    <jsp:include page="/includes/footer.html" />
  </body>
</html>

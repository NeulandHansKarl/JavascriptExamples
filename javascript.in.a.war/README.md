# Javascript in a war
* Interssant ist der Aufruf querySelector in fun.js anstelle von getElementById.
(viel allgemeiner)

* Der Aufruf von fetch lefert einen promise, mit dem then wird dann der Wert mit dem *then *geholt.

   fetch("/fun/resources/fun").then(response => 
        response.text().then(text => this.outputtext.textContent=text ) ); 


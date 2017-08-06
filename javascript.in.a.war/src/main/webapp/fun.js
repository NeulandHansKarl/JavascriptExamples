/**
 * 
 */
class Fun {
	constructor() {
		console.log("have fun");
		this.initUi();
	}
	initUi(){
	    // this.inputtext = document.getElementById("funInput");
	this.outputtext= document.getElementById("funOutput");

	this.inputtext= document.querySelector("#funInput")
    this.outputtext= document.querySelector("#funOutput");
	this.outputtext.textContent="doedel";
	
	this.inputtext.onchange= e=> // console.log(e);
							this.keyup(e);
}	
	keyup(e){
		console.log(e);

		fetch("/fun/resources/fun").then(response => 
// response.text().then(text => console.log(text) ) );
        response.text().then(text => this.outputtext.textContent=text ) );


	}
}
var fun = new Fun();
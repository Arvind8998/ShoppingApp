function convert(source,target,amount,id){
	source = source.toUpperCase();
	target = target.toUpperCase();
	var url = `https://free.currencyconverterapi.com/api/v6/convert?q=${source}_${target}&compact=y`;
    
	fetch(url)
	.then(response=>{
		response.json()
		.then(data =>{
			console.log("data is" + data);
	
			
	var mykey = source + "_" + target;
	document.getelementbyId(id).innerText = amount/data[mykey].val;
	
		}).catch(err=>{
			console.log("Error is", err);
		})
	},err=>{"::: Error is",err});	
   
}


window.addEventListener("load",getCacheData);
function printIt(data){
	var city = document.querySelector("#city");
	for(let object of data.data){
		var option = document.createElement("option");
		option.innerText = object.descr;
		option.value = object.name;
		city.appendChild(option);
	}
}


function getCacheData(){
	fetch("http://localhost:8080/MyFirstWebApp/cache",
		{method:"post",body:{"key": "city"}})
		.then(response=>{
			response.json()
			.then(data=>{
				console.log("data is ",data);
				printIt(data);
			}).catch(err=>{
				console.log("invalid json");
			}).catch(err=>{
				console.log("can't talk to server",err);
			})
		});
}















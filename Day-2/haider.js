function	validate(){
					
			var name=document.getElementById("Name").value;
			var age=document.getElementById("Age").value;
			if(name==null || age<=18 || age==null)
			{
			alert("Please validate");
				return false;
			}
			return true;
		}
			function changeT(){
			document.getElementById("comments").value=document.getElementById("Name").value;
			
			}
		
			function change1(){
			document.getElementById("container").style.backgroundColor="blue";
				
			}
			
			function change2(){
			document.getElementById("container").style.backgroundColor="yellow";
			}
			
class HourMinute{
	int hour;
	int min;

	def plus(other)
	{

	if(min+other.min>=60){
	new HourMinute(hour : hour+other.hour+1,
	min : (min+other.min) %60 )
	}
	else{
	new HourMinute(hour : hour+other.hour,
	min : min+other.min )
	}

	}


	String toString(){
		return hour+"::"+min;
	}

}

HourMinute hm=new HourMinute(hour:3,min:30);
HourMinute hm1=new HourMinute(hour:4,min:30);
HourMinute hm2=new HourMinute(hour:5,min:10);

println hm+hm1
println hm+hm2
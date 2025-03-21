public class PracticeProblem {

	public static void main(String args[]) {

	}
public static void selectionSortName(String[] names, int[] ages){
	int tempInt;
	String tempStr;
	int min = 0;
	for(int i = 0; i < names.length - 1; i++){
		min = i;
for (int j = i + 1; j < names.length; j++){
	if(((names[j].toLowerCase()).compareTo(names[min].toLowerCase())) < 0){
min = j;
	}
}
tempInt = ages[i];
ages[i] = ages[min];
ages[min] = tempInt;
tempStr = names[i];
names[i] = names[min];
names[min] = tempStr;
	} 
}
	
public static void selectionSortAge(String[] names, int[] ages){
	int tempInt;
	String tempStr;
	int min = 0;
	for(int i = 0; i < names.length -1; i++){
		min = i;
for (int j = i + 1; j < names.length; j++){
	if(ages[j] < ages[min]){
min = j;
	}
}
tempInt = ages[i];
ages[i] = ages[min];
ages[min] = tempInt;
tempStr = names[i];
names[i] = names[min];
names[min] = tempStr;
	} 
}
}

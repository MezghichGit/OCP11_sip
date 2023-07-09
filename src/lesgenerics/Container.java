package lesgenerics;

public class Container<T> {
	
	T content[];  // on déclare un tableau de type T
	int currentIndex=0;
	public void display()
	{
		for(T t : this.content)
		{
			if(t!=null) {
					System.out.println(t.toString());
			}
		}
	}
	
	public void addObject(T t)
	{
		if(this.currentIndex <this.content.length )
		{
		  //this.content[currentIndex++] = t;
			this.content[currentIndex] = t;
			currentIndex++;
		  
		}
		else
		{
			System.out.println("Tableau déjà rempli...");
		}
		
	}
	
	public Container(T tab[])
	{

		this.content = tab;
	}

}

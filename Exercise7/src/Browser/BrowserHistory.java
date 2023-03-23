package Browser;
import java.util.*;


//BrowserHistory class
public class BrowserHistory {

	//list implementation
	ArrayList<String> historyList = new ArrayList<>();
	LinkedList<String> historyLinkedList = new LinkedList<>();
	Stack<String> historyStack = new Stack<>();
	
	//set implementation
	HashSet<String> historyHashSet = new HashSet<>();
	LinkedHashSet<String> historyLinkedHashSet = new LinkedHashSet<>();
	TreeSet<String> historyTreeSet = new TreeSet<>();
	
	//map implementation
	HashMap<String,List<String>> historyHashMap = new HashMap<>();
	LinkedHashMap<String,List<String>> historyLinkedHashMap = new LinkedHashMap<>();
	TreeMap<String,List<String>> historyTreeMap = new TreeMap<>();
	
	Scanner sc = new Scanner(System.in);
	
	
	//add url
	void visit(String url) throws InvalidURLException
	{
		String extension = url.substring(url.lastIndexOf("."));
		
		if(url.endsWith(".com") || url.endsWith(".org") || url.endsWith(".in"))
		{
			
			//add to lists
			historyList.add(url);
			historyLinkedList.add(url);
			historyStack.push(url);
			
			
			//add to sets
			historyHashSet.add(url);
			historyLinkedHashSet.add(url);
			historyTreeSet.add(url);
			
			//add to maps
			if(!historyHashMap.containsKey(extension))
				historyHashMap.put(extension, new ArrayList<String>());
			historyHashMap.get(extension).add(url);
			
			if(!historyLinkedHashMap.containsKey(extension))
				historyLinkedHashMap.put(extension, new ArrayList<String>());
			historyLinkedHashMap.get(extension).add(url);
			
			if(!historyTreeMap.containsKey(extension))
				historyTreeMap.put(extension, new ArrayList<String>());
			historyTreeMap.get(extension).add(url);
			
			System.out.println();
		}
		//throw exception when url extension are not valid
		else
			throw new InvalidURLException("Invalid URL extension");
		
	}
	
	
	//sort all history
	void sort()
	{
		System.out.println("sorted history in arrayList :");
		List<String> historyModifiedList = new ArrayList<>(historyList);
		Collections.sort(historyModifiedList);
		System.out.println(historyModifiedList);
		
		System.out.println("sorted history in linkedList :");
		List<String> historyModifiedLinkedList = new LinkedList<>(historyLinkedList);
		Collections.sort(historyModifiedLinkedList);
		System.out.println(historyModifiedLinkedList);
		
		System.out.println("Visited urls history in stack :");
		List<String> historyModifiedStack = new ArrayList<>(historyStack);
		Collections.sort(historyModifiedStack);
		System.out.println(historyModifiedStack);
		
		
		System.out.println("sorted history in hashSet :");
		List<String> historyModifiedHashSet = new ArrayList<>(historyHashSet);
		Collections.sort(historyModifiedHashSet);
		System.out.println(historyModifiedHashSet);
		
		System.out.println("sorted history in linkedHashSet :");
		List<String> historyModifiedLinkedHashSet = new ArrayList<>(historyLinkedHashSet);
		Collections.sort(historyModifiedLinkedHashSet);
		System.out.println(historyModifiedLinkedHashSet);
		
		System.out.println("sorted history in treeSet :");
		System.out.println(historyTreeSet);
		
		System.out.println();
	}
	
	
	//delete history by index
	void deleteHistory(int index)
	{
		
		//arrayList
		historyList.remove(index);
		System.out.println("element deleted from arrayList :");
		System.out.println(historyList);
		
		//linkedList
		historyLinkedList.remove(index);
		System.out.println("element deleted from linkedList :");
		System.out.println(historyLinkedList);
		
		//stack
		historyStack.remove(index);
		System.out.println("element deleted from stack :");
		System.out.println(historyStack);
		
		System.out.println();
	}
	
	
	//delete history bu url
	void deleteHistory(String deleteUrl)
	{
		
		//arrayList
		historyList.remove(deleteUrl);
		System.out.println("element deleted from arrayList :");
		System.out.println(historyList);
		
		//linkedList
		historyLinkedList.remove(deleteUrl);
		System.out.println("element deleted from linkedList :");
		System.out.println(historyLinkedList);
		
		//stack
		historyStack.remove(deleteUrl);
		System.out.println("element deleted from stack :");
		System.out.println(historyStack);
		
		
		//hashSet
		historyHashSet.remove(deleteUrl);
		System.out.println("element deleted from hashSet :");
		System.out.println(historyHashSet);
		
		//linkedHashSet
		historyLinkedHashSet.remove(deleteUrl);
		System.out.println("element deleted from LinkedHashSet :");
		System.out.println(historyLinkedHashSet);
		
		//linkedHashSet
		historyTreeSet.remove(deleteUrl);
		System.out.println("element deleted from TreeSet :");
		System.out.println(historyTreeSet);
		
		System.out.println();
	}
	
	
	//delete history by extension
	void deleteHistory()
	{
		System.out.println("enter extension of url to be deleted");
        String deleteExtension = sc.next();
        Set<String> keys = historyHashMap.keySet();
        String removeKey = null;
        for(String str:keys)
		{
			if(str.equals(deleteExtension))
			{
				removeKey = str;
			}
				
		}
        //hashMap
        historyHashMap.remove(removeKey);
        System.out.println("element deleted from hashMap :");
		System.out.println(historyHashMap);
		
		//linkedHashMap
		historyLinkedHashMap.remove(removeKey);
		System.out.println("element deleted from LinkedHashMap :");
		System.out.println(historyLinkedHashMap);
		
		//treeMap
		historyTreeMap.remove(removeKey);
		System.out.println("element deleted from treeMap :");
		System.out.println(historyTreeMap);
        
		System.out.println();
	}
	
	
	//fetch all history
	void fetchHistory()
	{
		
		//arrayList
		System.out.println("Visited urls history in arrayList :");
		System.out.println(historyList);
		
		//linkedList
		System.out.println("Visited urls history in linkedList :");
		System.out.println(historyLinkedList);
		
		//stack
		System.out.println("Visited urls history in stack :");
		System.out.println(historyStack);
		
		
		//hashSet
		System.out.println("Visited urls history in hashSet :");
		System.out.println(historyHashSet);
		
		//linkedHashSet
		System.out.println("Visited urls history in linkedHashSet :");
		System.out.println(historyLinkedHashSet);
		
		//linkedHashSet
		System.out.println("Visited urls history in treeSet :");
		System.out.println(historyTreeSet);
		
		//hashMap
		System.out.println("Visited urls history in hashMap :");
		System.out.println(historyHashMap);
		
		//linkedHashMap
		System.out.println("Visited urls history in LinkedHashMap :");
		System.out.println(historyLinkedHashMap);
		
		//treeMap
		System.out.println("Visited urls history in treeMap :");
		System.out.println(historyTreeMap);
		
		System.out.println();
	}
	
	
	//fetch history by extension
	void fetchHistory(String extension)
	{
		
		Set<String> keys = historyHashMap.keySet();
		for(String str:keys)
		{
			if(str.equals(extension))
				System.out.println(historyHashMap.get(extension));
		}
		System.out.println();
	}
	
	
	//search urls by extension
	void search(String extension)
	{
		
		//arrayList
		System.out.println("urls with extension "+extension+" in arrayList: ");
		Iterator<String> itr1 = historyList.iterator();
		while(itr1.hasNext())
		{
			String url = (String) itr1.next();
			if(url.endsWith(extension))
				System.out.println(url);
		}
		
		//linkedList
		System.out.println("urls with extension "+extension+" in LinkedList: ");
		Iterator<String> itr2 = historyLinkedList.iterator();
		while(itr2.hasNext())
		{
			String url = (String) itr2.next();
			if(url.endsWith(extension))
				System.out.println(url);
		}
		
		//stack
		System.out.println("urls with extension "+extension+" in stack: ");
		Iterator<String> itr3 = historyStack.iterator();
		while(itr3.hasNext())
		{
			String url = (String) itr3.next();
			if(url.endsWith(extension))
				System.out.println(url);
		}
		
		//hashSet
		System.out.println("urls with extension "+extension+" in hashSet: ");
		Iterator<String> itr4 = historyHashSet.iterator();
		while(itr4.hasNext())
		{
			String url = (String) itr4.next();
			if(url.endsWith(extension))
				System.out.println(url);
		}
		
		//linkedHashSet
		System.out.println("urls with extension "+extension+" in LinkedHashSet: ");
		Iterator<String> itr5 = historyLinkedHashSet.iterator();
		while(itr5.hasNext())
		{
			String url = (String) itr5.next();
			if(url.endsWith(extension))
				System.out.println(url);
		}
		
		//treeSet
		System.out.println("urls with extension "+extension+" in TreeSet: ");
		Iterator<String> itr6 = historyTreeSet.iterator();
		while(itr6.hasNext())
		{
			String url = (String) itr6.next();
			if(url.endsWith(extension))
				System.out.println(url);
		}
		
		System.out.println();
	}
	
	
	//search by word
	void search()
	{
		
		System.out.println("enter the search word");
        String searchWord = sc.next();
        int flag=0;
        
        for(List<String> list :historyHashMap.values())
        {
        	
        	for(String str:list)
        	{
        		if(str.contains(searchWord))
        		{
        			System.out.println(str);
        			flag++;
        		}
        	}
        	
        }
        if(flag==0)
        	System.out.println("url not found");
        System.out.println();
	}
	
	
	//size of all history
	void size()
	{
		//arrayList
		System.out.println("in arrayList : "+historyList.size());
		//linkedList
		System.out.println("in LinkedList : "+historyLinkedList.size());
		//stack
		System.out.println("in stack : "+historyStack.size());
		
		//hashSet
		System.out.println("in hashSet : "+historyHashSet.size());
		//linkedHashSet
		System.out.println("in linkedHashSet : "+historyLinkedHashSet.size());
		//treeSet
		System.out.println("in treeSet : "+historyTreeSet.size());
		
		System.out.println();
	}
	
	
	//number of urls with particular extension
	void size(String extension)
	{
		Set<String> keys = historyHashMap.keySet();
		for(String str:keys)
		{
			if(str.equals(extension))
			{
				int size = historyHashMap.get(str).size();
				System.out.println("Number of urls with extension "+extension+" : "+size);
			}
		}
		
		System.out.println();
	}
	
	
	//update history
	void updateHistory(int index)
	{
		String oldUrl = historyList.get(index);
		String oldExtension = oldUrl.substring(oldUrl.lastIndexOf("."));
		
		System.out.println("enter updated url :");
		String updateUrl = sc.next();
		String newExtension = updateUrl.substring(updateUrl.lastIndexOf("."));
		
		//arrayList
		historyList.set(index, updateUrl);
		//linkedList
		historyLinkedList.set(index, updateUrl);
		//stack
		historyStack.set(index, updateUrl);
		
		//hashSet
		historyHashSet.remove(oldUrl);
		historyHashSet.add(updateUrl);
		
		//linkedHashSet
		historyLinkedHashSet.remove(oldUrl);
		historyLinkedHashSet.add(updateUrl);
		
		//treeSet
		historyTreeSet.remove(oldUrl);
		historyTreeSet.add(updateUrl);
		
		
		System.out.println();
	}
	
}

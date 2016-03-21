package icc.data;

public class CompActivity extends Component {
	
	//TODO define which attributes are relevant.
	
	public boolean allowEmbedded = false;
	public boolean allowTaskReparenting = false;
	public boolean alwaysRetainTaskState = false;
	public boolean autoRemoveFromRecents = false;
	public String banner = NOT_SET;
	public boolean clearTaskOnLaunch = false;	
	public String configChanges = NOT_SET;
	public String documentLaunchMode = NOT_SET;
//	boolean enabled;
	public boolean excludeFromRecents = false;
//	boolean exported;
	public boolean finishOnTaskLaunch = false;
	public boolean hardwareAccelerated = false;
	public String icon = NOT_SET;
//	String label;
	public String launchMode = NOT_SET;
	public int maxRecents = 16;
	public boolean multiprocess = false;
//	String name;
	public boolean noHistory = false;
	public String parentActivityName = NOT_SET;
//	String permission;
//	String process;
	public boolean relinquishTaskIdentity = false;
	public String screenOrientation = NOT_SET;
	public boolean stateNotNeeded = false;
	public String taskAffinity = NOT_SET;
	public String theme = NOT_SET;
	public String uiOptions = NOT_SET;
	public String windowSoftInputMode = NOT_SET;



	public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append(String.format("Type: %s\n", type));
        builder.append(String.format("Label: %s\n", label));
        builder.append(String.format("Name: %s\n", name));
        builder.append(String.format("Enabled: %s\n", enabled));
        builder.append(String.format("Permission: %s\n", permission));
        builder.append(String.format("Process: %s\n", process));

        //TODO append the others attributes
        
        
        builder.append("Intent Filters: \n");
        
        for (IntentFilter iFilter : intentFilters)
        {
            builder.append(String.format("%s\n", iFilter));
        }
        return builder.toString();

	}

}


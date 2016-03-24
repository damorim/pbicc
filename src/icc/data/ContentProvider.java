package icc.data;

import java.util.ArrayList;
import java.util.List;

public class CompContentProvider extends Component {
	//TODO remove commented attributes, since they belong in Component class
	public List<String> authorities;
	//public android:enabled	["true" | "false"]
	//public android:exported	["true" | "false"]
	public boolean grantUriPermissions = false;
	public String icon = NOT_SET;
	public int initOrder;
	//public android:label	"string resource"
	public boolean multiprocess = false;
	//public android:name	"string"
	//public android:permission	"string"
	//public android:process	"string"
	public String readPermission = NOT_SET;
	public boolean syncable = false;
	public String writePermission = NOT_SET;
	
	public CompContentProvider(){
		authorities = new ArrayList<String>();
	}
	
	@Override
	public String toStringExclusiveAttributes() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(String.format("Authorities: "));
        for(String aut : authorities){
        	builder.append(String.format("%s;", aut));
        }
        builder.append("\n");
        builder.append(String.format("GrantUriPermissions: %s\n", grantUriPermissions));
        builder.append(String.format("Icon: %s\n", icon));
        builder.append(String.format("InitOrder: %s\n", initOrder));
        builder.append(String.format("Multiprocess: %s\n", multiprocess));
        builder.append(String.format("ReadPermission: %s\n", readPermission));
        builder.append(String.format("Syncable: %s\n", syncable));
        builder.append(String.format("WritePermission: %s\n", writePermission));

		return builder.toString();
	}
}
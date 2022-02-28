package com.exam;
/*
 * Click `Run` in the top left corner to run the command line program. Output will appear in the "Program Output" tab in the right pane.
 */

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class SigmaFileSystem {
	private String fileName; 
	private String fileType; 
	private static int fileCount;
	private int fileId;
	
    
    public SigmaFileSystem(String fileName,String fileType) { 
    	++fileCount;
    	this.fileName=fileName;
    	this.fileType=fileType;
    	this.fileId=fileCount;
    }
    
    // Feel free to modify the parameter/return types of these functions
    // as you see fit. Please add comments to indicate your changes with a 
    // brief explanation. We care more about your thought process than your
    // adherence to a rigid structure.
    
    int getTotalDashboards(Map<Integer,Set<SigmaFileSystem>> fileMap) {
      // TODO: implement
    	int cnt=0;
    	for(Map.Entry<Integer,Set<SigmaFileSystem>>  entry:fileMap.entrySet()) {
    		Set<SigmaFileSystem> fileSet=(Set<SigmaFileSystem>) entry.getValue();
			Iterator itr=fileSet.iterator();
			while(itr.hasNext()) {
				SigmaFileSystem file=(SigmaFileSystem) itr.next();
				if(file.fileType.equals("dashboard")) {
					cnt++;
				}
			}
    	}
    	
      return cnt;
    }
  
    int getTotalWorksheets(Map<Integer,Set<SigmaFileSystem>> fileMap) {
    	int cnt=0;
    	for(Map.Entry<Integer,Set<SigmaFileSystem>>  entry:fileMap.entrySet()) {
    		Set<SigmaFileSystem> fileSet=(Set<SigmaFileSystem>) entry.getValue();
			Iterator itr=fileSet.iterator();
			while(itr.hasNext()) {
				SigmaFileSystem file=(SigmaFileSystem) itr.next();
				if(file.fileType.equals("worksheet")) {
					cnt++;
				}
			}
    	}
    	
      return cnt;
    }
    
    
    public int addNewFile(int folderId,SigmaFileSystem fs,Map<Integer,Set<SigmaFileSystem>> fileMap) {
    	Set<SigmaFileSystem> fileSet=new HashSet<SigmaFileSystem>();
    	if(!(fileMap.containsKey(folderId))){
    		SigmaFolder folder=new SigmaFolder(folderId);
    		fileSet.add(fs);
    		fileMap.put(folderId,fileSet);
    	}else {
    		fileSet= fileMap.get(folderId);
    		fileSet.add(fs);
    		fileMap.put(folderId,fileSet);
    	
    	}
    	return this.fileId;
    }
    
    int getFileId(int folderId,String fileName,Map<Integer,Set<SigmaFileSystem>> fileMap) {
      // TODO: implement
    	
    	for(Entry<Integer,Set<SigmaFileSystem>> entry:fileMap.entrySet()) {
    		if(entry.getKey()==folderId) {
    			Set<SigmaFileSystem> fileSet=(Set<SigmaFileSystem>) entry.getValue();
    			Iterator itr=fileSet.iterator();
    			while(itr.hasNext()) {
    				SigmaFileSystem file=(SigmaFileSystem) itr.next();
    				if(file.fileName.equals(fileName)) {
    					 return file.fileId;
    				}
    			}
    		}
    	}
    	return -1;
    	
    }
    
    public Map<Integer, Set<SigmaFileSystem>> moveFile(int fileId, int newFolderId,Map<Integer,Set<SigmaFileSystem>> fileMap) {
    	fileMap=moveFromSource(fileId,newFolderId,fileMap);
    	return fileMap;
    	
    	
    }
    
    public Map<Integer,Set<SigmaFileSystem>> moveFromSource(int fileId,int newFolderId,Map<Integer,Set<SigmaFileSystem>> fileMap){
    	Set<SigmaFileSystem> fileSet=null;
    	SigmaFileSystem moveFile=null;
    	int folderId=0;
    	
    	for(Entry<Integer,Set<SigmaFileSystem>> entry:fileMap.entrySet()) {
    		fileSet=(Set<SigmaFileSystem>) entry.getValue();
    		Iterator itr=fileSet.iterator();
    		while(itr.hasNext()) {
    			SigmaFileSystem file=(SigmaFileSystem) itr.next();
    			if(file.fileId==fileId) {
    				moveFile=file;
    				 folderId=entry.getKey();
    				fileSet=(Set<SigmaFileSystem>) entry.getValue();
    				fileSet.remove(file);
    				SigmaFileSystem.fileCount--;
    				if(fileSet.size()==0) {
    					fileMap.remove(folderId);
    				break;
    				}
    				else {
    					fileMap.put(folderId, fileSet);
    				break;
    				}
    			}
    		}
    	}
    	fileMap=moveToDestinationFolder(moveFile,newFolderId,fileMap);
    	return fileMap;
    	
    }
    public Map<Integer, Set<SigmaFileSystem>> moveToDestinationFolder(SigmaFileSystem moveFile,int newFolderId, Map<Integer,Set<SigmaFileSystem>> fileMap){
    	Set<SigmaFileSystem> fileSetForNewFolder=new HashSet<SigmaFileSystem>(1);
    	if(!(fileMap.containsKey(newFolderId))) {
    		fileSetForNewFolder.add(moveFile);
    		fileMap.put(newFolderId, fileSetForNewFolder);
    	}else {
    		Set<SigmaFileSystem>fileSet=fileMap.get(newFolderId);
    		fileSet.add(moveFile);
    		fileMap.put(newFolderId,fileSet);
    	}
    	SigmaFileSystem.fileCount++;
    	return fileMap;
    	
    }
    
    
    List getFiles(int folderId,Map<Integer,Set<SigmaFileSystem>> fileMap) {
      // TODO: implement
    	List<String> fileName=null;
    	boolean flag=false;
    	
    	Set<SigmaFileSystem> fileSet = null;
    	for(Entry<Integer,Set<SigmaFileSystem>> entry:fileMap.entrySet()) {
    		if(entry.getKey()==folderId) {
    			fileSet=(Set<SigmaFileSystem>) entry.getValue();
    			fileName=new ArrayList<String>(fileSet.size());
    			flag=true;
    		}
    	}
    	
		if(flag==true) {
    	Iterator itr=fileSet.iterator();
    	while(itr.hasNext()) {
    		SigmaFileSystem file=(SigmaFileSystem) itr.next();
    		fileName.add(file.fileName);
    		
    	}
		}
    return fileName;
    }
    
    void printFiles() {
      // TODO: implement
      return;
    }
    
}
class SigmaFolder{
	private int folderId;
	public SigmaFolder(int folderId/*Map<SigmaFolder,Set<SigmaFileSystem>> fileMap*/) {
		this.folderId=folderId;
//		fileMap.put(this, null);
	}
	

}


    
/////////////////////////////////////////////////////////
// YOU DO NOT NEED TO MAKE CHANGES BELOW UNLESS NECESSARY
/////////////////////////////////////////////////////////


/*
 * Note from Coder Pad: To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */
public class Solution {
  
  private static int askForInteger(Scanner scanner, String question) {
    System.out.println(question);
    try {
      return Integer.parseInt(scanner.nextLine());
    } catch (Exception e) {
      System.out.println("Please enter a valid integer.");
      return askForInteger(scanner, question);
    }
  }
  
  /*public static void runExample() {
    SigmaFileSystem fs = new SigmaFileSystem();
    int rootId = fs.getFileId("MyDocuments", 0);
    fs.addNewFile("draft", "folder", rootId);
    fs.addNewFile("complete", "folder", rootId);
    int draftId = fs.getFileId("draft", rootId);
    int completeId = fs.getFileId("complete", rootId);
    fs.addNewFile("foo", "worksheet", draftId);
    fs.addNewFile("bar", "dashboard", completeId);
    int fooId = fs.getFileId("foo", draftId);
    fs.moveFile(fooId, completeId);
    
    System.out.println(String.join(", ", fs.getFiles(rootId)));
    System.out.println(String.join(", ", fs.getFiles(draftId)));
    System.out.println(String.join(", ", fs.getFiles(completeId)));
          
    fs.addNewFile("project", "folder", draftId);
    int projectId = fs.getFileId("project", draftId);
    fs.addNewFile("page1", "worksheet", projectId);
    fs.addNewFile("page2", "worksheet", projectId);
    fs.addNewFile("page3", "worksheet", projectId);
    fs.addNewFile("cover", "dashboard", projectId);
    fs.moveFile(projectId, completeId);
    projectId = fs.getFileId("project", completeId);
    int coverId = fs.getFileId("cover", projectId);
    fs.moveFile(coverId, rootId);
    
    System.out.println(String.join(", ", fs.getFiles(rootId)));
    System.out.println(String.join(", ", fs.getFiles(draftId)));
    System.out.println(String.join(", ", fs.getFiles(completeId)));
    System.out.println(String.join(", ", fs.getFiles(projectId)));

    System.out.println(fs.getTotalDashboards());
    System.out.println(fs.getTotalWorksheets());
    fs.printFiles();
  }*/
  
  // Feel free to modify this main function as you see fit. 
  public static void main(String[] args) {
      boolean running = true;
      Scanner scanner = new Scanner(System.in);
      SigmaFileSystem fs =null ;
      int command;
    
  	 Map<Integer,Set<SigmaFileSystem>> fileMap=new HashMap<Integer,Set<SigmaFileSystem>>();
      while (running) {
   	  command = askForInteger(scanner, "\nEnter an integer to indicate a command: \n[1] get_total_dashboards\n[2] get_total_worksheets\n[3] add_new_folder\n[4] get_file_id\n[5] move_file\n[6] get_files \n[7] print_files\n[8] exit\n");
        switch (command) {
          case 1: {
        	 if(fs==null) {
        	System.out.println("Dashboard is not created"); 
        	}else {
            int totalDashboards = fs.getTotalDashboards(fileMap);
            System.out.println(String.format("Total dashboards %d.", totalDashboards));
        	}
            break;
          }
          case 2: {
        	 if(fs==null) {
          	System.out.println("Worksheets is not created"); 
          	}else {
            int totalWorksheets = fs.getTotalWorksheets(fileMap);
            System.out.println(String.format("Total worksheets %d", totalWorksheets));
          	}
            break;
          }
          case 3: {
            System.out.println("Enter new file name:");
            String fileName = scanner.nextLine();
            System.out.println("Enter file type (worksheet, dashboard, or folder)");
            String fileType = scanner.nextLine();
            int folderId = askForInteger(scanner, "Enter folder id where you'd like to put this file");
            fs= new SigmaFileSystem(fileName,fileType);
            int fileId= fs.addNewFile(folderId,fs,fileMap);
            System.out.println(String.format("%s has been added to folder %d and file id is %d", fileName, folderId,fileId));
            break;
          }
          case 4: {
        	  if(fs==null)
        		  System.out.println("Files are not present");
        	else {
            System.out.println("Enter file name:");
            String fileName = scanner.nextLine();
            int folderId = askForInteger(scanner, "Enter folder id:");
            int fileId = fs.getFileId(folderId,fileName,fileMap);
            if(fileId==-1)
            	System.out.println("File not found");
            else
            	System.out.println(String.format("%s is file %d", fileName, fileId));
        	 }
            break;
          }
          
          case 5: {
        	  if(fs==null)
        		  System.out.println("Files are not present");
        	else {
            int fileId = askForInteger(scanner, "Enter file id:");
            int newFolderId = askForInteger(scanner, "Enter the folder id where you'd like to move this file.");
            fileMap=fs.moveFile(fileId,newFolderId,fileMap);
            System.out.println(String.format("Successfully moved file %d to folder %d", fileId, newFolderId));
        	}
            break;
          }
          case 6:{
        	  if(fs==null) 
        		  System.out.println("Files are not present");
        	  else {
        	  int folderId = askForInteger(scanner, "Enter folder id:");
        	  List<String> fileNames = fs.getFiles(folderId,fileMap);
        	  if(fileNames==null) {
        		 System.out.println("Folder is empty"); 
        	  }
        	  else {
              System.out.println(String.format("The following files are in folder %d:", folderId));
              for (String fileName: fileNames) {
                System.out.println(String.format("\t%s", fileName));
              }
        	  }
        	  }
            
            break;
          }
          case 7: {
            fs.printFiles();
            break;
          }
          case 8: {
            System.out.println("Exiting program.");
            running = false;
            scanner.close();
            break;
          }
          default:
            System.out.println(String.format("Invalid command: %d. Please try again.\n",command));
        }
     }
  }
}

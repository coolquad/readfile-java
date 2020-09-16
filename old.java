/*
    * This method should read a list of numbers from the file inFile into 
    * a new List and return that List. If the file cannot be read from, 
    * the method should return an empty list.
    *
    * E.g., if inFile contains the following:
    * 1
    * 2
    * 3
    *
    * then readFileToList(inFile) should return the List [1,2,3].
    */
  
    //------------------------------------------------------------------------------------------------------------------------
   public static List<Integer> readFileToList(String inFile)throws IOException {
      //TODO: implement this method
      List<Integer> list=new ArrayList<Integer>(); //declaring a list
      InputStream ins = null; // raw byte-stream
      Reader r = null; // cooked reader
      BufferedReader br = null; // buffered for readLine()
      try {
            String s;
            ins = new FileInputStream(inFile);
            r = new InputStreamReader(ins, "UTF-8"); // leave charset out for default
            br = new BufferedReader(r);
            while ((s = br.readLine()) != null) {
              list.add(Integer.parseInt(s));
            }
        }
        catch (Exception e)
        {
          System.err.println(e.getMessage()); // handle exception
        }
    
      return list;
   }
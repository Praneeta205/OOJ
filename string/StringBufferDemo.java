class StringBufferDemo {
    public static void main(String[] args) {
        // Creating a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello World");

        // Set length of the buffer
        stringBuffer.setLength(5);
        System.out.println("Set Length: " + stringBuffer);

        // charAt() 
        char charAtIndex = stringBuffer.charAt(1);
        System.out.println("Char at index 1: " + charAtIndex);

        // setCharAt() 
        stringBuffer.setCharAt(1, 'i');
        System.out.println("After setCharAt: " + stringBuffer);

        // getChars()
        char[] charArray = new char[4];
        stringBuffer.getChars(0, 4, charArray, 0);
        System.out.print("getChars: ");
        System.out.println(charArray);

        // append() 
        stringBuffer.append(" How are you?");
        System.out.println("After append: " + stringBuffer);

        // insert() 
        stringBuffer.insert(5, "Awesome ");
        System.out.println("After insert: " + stringBuffer);

   	// delete() 
        stringBuffer.delete(5, 13);
        System.out.println("After delete: " + stringBuffer);

        // deleteCharAt() 
        stringBuffer.deleteCharAt(0);
        System.out.println("After deleteCharAt: " + stringBuffer);

        // replace() 
        stringBuffer.replace(0, 4, "Hola");
        System.out.println("After replace: " + stringBuffer);

        // substring() 
        String substring = stringBuffer.substring(0, 4);
        System.out.println("Substring: " + substring);

        // reverse() 
        stringBuffer.reverse();
        System.out.println("After reverse: " + stringBuffer);

    }
}

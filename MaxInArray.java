// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
    int arr[] = {12, 13, 1, 10, 34, 10};

    int max = arr[0];

    for(int i=0; i<arr.length; i++)
    {
        if(max < arr[i])
        {
            max = arr[i];
        }
    }
    System.out.println(max);
    }
}

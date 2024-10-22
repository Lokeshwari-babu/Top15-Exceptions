class Test{
    public static void main(String[]args){

        try {
            int a = Integer.parseInt("Twenty");
            System.out.println(a*10);

        }
        catch(NumberFormatException nfe){
            //nfe.printstackTrace();
            //System.out.println(nfe.getMessage());
            //System.out.println(nfe.getclass());
            System.out.println(nfe.getMessage());
        }

    }
}
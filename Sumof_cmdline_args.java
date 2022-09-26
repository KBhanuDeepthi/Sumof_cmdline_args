class Sumof_cmdline_args {

	public static void main(String[] args) {
		int n,cnt=0,sum=0;
		for(int i=0;i<args.length;i++) {
				n=Integer.parseInt(args[i]);
				sum=sum+n;
				cnt++;
		}
		System.out.println("Sum of valid integers ="+sum);
		System.out.println("Invalid integers are:"+cnt);
	}

}

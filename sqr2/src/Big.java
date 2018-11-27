
import java.util.*;public class Big
{
	private int[] n;
	public Big (){
		this.n=new int[2049];
	}
	public void change(int[] change){
		for(int i=0;i<this.n.length;i++){
			this.n[i]=change[i];
		}
	}
	public int[] add(int[] add){
		int[] result =new int[this.n.length];
		for(int i=this.n.length-1;i>=0;i--){
			if(result[i]+this.n[i]+add[i]<10){result[i]+=this.n[i]+add[i];}
			else{
				result[i]+=this.n[i]+add[i]-10;
				result[i-1]++;
			}
		}
		return result;
	}
	public void set(int[] a){
		for(int i=0;i<a.length;i++){
		this.n[i]=a[i];
		}
	}
	public void set0(int i,int j){
		this.n[i]=j;
	}
	public Big back (int j){
		Big back=new Big();
		for(int i=0;i<1024;i++){
			back.set0(i+j,this.n[i]);
		}
		for(int i=0;i<j;i++){
			back.set0(i,0);
		}
		return back;
	}
	public int[] times(int i){
		Big temp=new Big();
		for(int j=0;j<i;j++){
			temp.set(temp.add(this.get()));
		}
		return temp.get();
	}
	public int[] get(){
		return this.n;
	}
	public int get0(int i){
		return this.n[i];
	}
	public static void main(String[] args){
		Big test=new Big();
		int[] a=new int[30];
		a[0]=0;
		a[1]=4;
		a[2]=2;
		int[] look=test.get();
		test.set(a);
	    final int[] temp=test.get();
		/*for(int j=1;j<3;j++){
			test.set(test.add(temp));
		}*/
		test.set(test.times(3));
		System.out.println(Arrays.toString(test.get()));
	}
}

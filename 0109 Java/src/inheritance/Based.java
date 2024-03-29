package inheritance;

	public class Based {
		private int num;
				
		String title; //자신의 클래스 내부에 있는 메소드 안에서만 사용이 가능
		//클래스 내부의 메소드에서 사용이 가능하고
		//동일한 패키지 내에 있으면 public 처럼 상속 받은 클래스 그리고 인스턴스가 사용 가능
		
		protected String content;  //접근 지정자를 설정하지 않는 것을 default 또는 package
		
		public int readcnt;//자신의 클래스 그리고 상속받은 클래스 와 인스턴스가 사용 가능
		
		public void print() {
			System.out.println("상위 클래스의 print");
		}
		
	
		//정수 1개를 가지고 인스터스를 생성하는 생성자
		//생성자를 만들면 public Based()은 소멸된다.
		public Based(int x) {
			num =x;
			
		}
	}


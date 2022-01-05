package exam.ch07;

class Ex7_13 {
	class InstanceInner {}
	static class StaticInner {}

	// �ν��Ͻ���� ������ ���� ���� ������ �����ϴ�.
	InstanceInner iv = new InstanceInner();
	// static ��� ������ ���� ���� ������ �����ϴ�.
	static StaticInner cv = new StaticInner();

	static void staticMethod() {
      // static����� �ν��Ͻ������ ���� ������ �� ����.
//		InstanceInner obj1 = new InstanceInner();	
		StaticInner obj2 = new StaticInner();

      // ���� �����Ϸ��� �Ʒ��� ���� ��ü�� �����ؾ� �Ѵ�.
      // �ν��Ͻ�Ŭ������ �ܺ� Ŭ������ ���� �����ؾ߸� ������ �� �ִ�.
		Ex7_13 outer = new Ex7_13();
		InstanceInner obj1 = outer.new InstanceInner();
	}

	void instanceMethod() {
      // �ν��Ͻ��޼��忡���� �ν��Ͻ������ static��� ��� ���� �����ϴ�.
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		// �޼��� ���� ���������� ����� ���� Ŭ������ �ܺο��� ������ �� ����.
//		LocalInner lv = new LocalInner();
	}

	void myMethod() {
		class LocalInner {}
		LocalInner lv = new LocalInner();
	}
}
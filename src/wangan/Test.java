package wangan;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(1,5.0);
		PointAndDistance t = new Test().new PointAndDistance(p, 0.0);
		System.out.print(t.getPoint().toString());
	}
	/**��㵽���߾�������ĵ�;���
	 *@param p1 ��
	 *@param l1 ���� */
	public PointAndDistance point2Line(Point p1,Line l1){
		return null;		
	}
	
	class PointAndDistance{
		private Point myPoint;
		private double distance;
		public PointAndDistance(Point p,double d){
			myPoint = p;
			distance = d;
		}
		public Point getPoint(){
			return myPoint;
		}
		public double getDistance(){
			return distance;
		}
		
	}
}


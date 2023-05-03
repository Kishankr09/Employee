package p1;

public class Calculate {
	float da,hra,bonus,tax,total;
	public void cal(EmpDetail em) {
		if(em.sal > 30000 && em.sal <=50000) {
			da = em.sal * 0.1f;
			hra = em.sal* 0.3f;
			bonus = 3000;
		}
		else if(em.sal > 50000 && em.sal <=70000) {
			da = em.sal * 0.2f;
			hra = em.sal* 0.4f;
			bonus = 10000;
			tax = em.sal * 0.15f;
		}
		else if(em.sal > 70000 && em.sal <=100000) {
			da = em.sal * 0.3f;
			hra = em.sal* 0.4f;
			bonus = 15000;
			tax = em.sal * 0.2f;
		}
		else if(em.sal > 100000){
			da = em.sal * 0.4f;
			hra = em.sal* 0.5f;
			bonus = 30000;
			tax = em.sal * 0.28f;
		}
		em.totalSal = em.sal + da +hra + bonus - tax;
	}
}

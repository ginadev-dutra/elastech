package elastech.aula0911;

public class Refeicao {
	
	private DeliveryStatus status;
	
	public DeliveryStatus getStatus() {
		return status;
	}

	public void setStatus(DeliveryStatus status) {
		this.status = status;
	}

	public boolean isPronta() {
		if (getStatus() == DeliveryStatus.PRONTA) {
            return true;
        }
        return false;
	}

	
	public static void main(String[] args) {
		for (DeliveryStatus s : DeliveryStatus.values()) {
			
			System.out.println(s);
		}
	}
	
	
	
	

}

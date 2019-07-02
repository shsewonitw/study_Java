package tje.jdbc.model;

// City ���̺��� ������ �����ϱ� ����
// �� Ŭ������ ����
// - ��� �� Ŭ������ Java Bean ���������� �ؼ��մϴ�.
// - Java Bean �������� : ��� ��� �ʵ忡 ����
//   Getter, Setter �޼ҵ带 �����ϴ� ��
public class City {
	// JDBC ���α׷��ֿ��� �����ϴ� �� Ŭ�������� 
	// ���̺��� �÷���� ��ġ�ϴ� ��� �������� �����մϴ�.
	private int id;
	private String name;
	private String countryCode;
	private String district;
	private int population;
	
	public City() {}

	public City(int id, String name, String countryCode, String district, int population) {
		super();
		this.id = id;
		this.name = name;
		this.countryCode = countryCode;
		this.district = district;
		this.population = population;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	
}

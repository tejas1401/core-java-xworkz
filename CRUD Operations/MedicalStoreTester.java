class MedicalStoreTester{
	public static void main(String[] args) {
		MedicalStore.addMedicineNames("Saridon");
		MedicalStore.addMedicineNames("Dolo 650");
		MedicalStore.addMedicineNames("Vicks Action 500");
		MedicalStore.addMedicineNames("Dart");
		MedicalStore.addMedicineNames("Strepsils");
		MedicalStore.addMedicineNames("Amrutanjan");
		MedicalStore.addMedicineNames("Moov Spray");
		MedicalStore.addMedicineNames("Iodex");
		MedicalStore.addMedicineNames("CoughSyrup");
		MedicalStore.getMedicineNames();
		MedicalStore.updateMedicineNames("CoughSyrup","Cold and cough Syrup");
	}
}
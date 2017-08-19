public class Main {

	public static void main(String[] args) {
		Funcionario f = new Funcionario("09285259456","Saulo Maciel",(short)26,3700.0);
		FuncionarioChefe fc = new FuncionarioChefe("12312312345", "Billy Kane", (short)22, 200.0, 2200.0, f);
		FuncionarioHorario fh = new FuncionarioHorario("45645645678", "Yori Yagami", (short)30, 7.58, 220.0);
		
		try {
			fc.setFuncionarioAssessor(fh);
		} catch (NaoFuncionarioException e) {
			// TODO Auto-generated catch block
			e.getStackTrace();
		}
						
		System.out.println(f.toString());
		System.out.println(fc.toString());
		System.out.println(fh.toString());
		
		if (f.equals(fc)) {
			System.out.println(f.getNome()+" e "+fc.getNome()+", são a mesma pessoa!");
		}
		
	}

}

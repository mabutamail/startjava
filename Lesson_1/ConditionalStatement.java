public class ConditionalStatement{
	public static void main(String[] args) {
		int age = 33;
		double height = 1.7;
		String sex = "men";
		char firstCharOfName = 'M';

		if (age > 20){
			System.out.println("возраст больше 20 лет");
		}

		if (sex == "men"){
			System.out.println("мужской пол");
		}

		if (sex != "men"){
			System.out.println("НЕ мужской пол");
		}

		if (height < 1.8){
			System.out.println("рост меньше чем 1.8 метра");
		} else {
			System.out.println("рост больше или равен 1.8 метра");
		}

		if (firstCharOfName == 'М'){
			System.out.println("первая буква имени - русская 'М'");
		} else if (firstCharOfName == 'И') {
			System.out.println("первая буква имени - русская 'И'");
		} else {
			System.out.println("первая буква имени отлична от М и И");
		}
	}
}
package q02_advanced.question03;

public class SystemMain03 {

	public static void main(String[] args) {

		LoginService loginService = new LoginService(new MemberStorage());
		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;
		//TODO ここから実装する

		ConsoleReader consoleReader = new ConsoleReader();
		Member loginMember = null;

		while (!isLogin) {
			int inputId = 0;
			String inputPassword = "";

			try {
				System.out.print("input id>>");
				inputId = consoleReader.inputNumber();

				System.out.print("input password>>");
				inputPassword = consoleReader.inputString();

			} catch (NumberFormatException e) {
				System.out.println("不正な入力です。再度入力してください");
				continue;
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}

			loginMember = loginService.doLogin(inputId, inputPassword);

			if (loginMember == null) {
				System.out.println("IDまたはパスワードが違っています。再度入力してください。");
				continue;
			} else {
				System.out.println("ログインに成功しました");
				isLogin = true;
				break;
			}
		}

		System.out.println("ログインユーザ情報を表示します。");
		loginMember.showMember();

		//まだ途中です。

	}

}

package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する
		ConsoleReader reader = new ConsoleReader();
		List<Member> members = new ArrayList<>();

		members.add(Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2));
		members.add(Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1));

		System.out.println("===会員情報を表示します===");
		MemberManager.showAllMembers(members);

		try {
			System.out.println("===パスワードを変更します=== ");
			System.out.println("input target id>>");
			int targetId = reader.inputNumber();

			System.out.println("input new password>>");
			String newpassword = reader.inputString();

			MemberManager.updatePassword(members, targetId, newpassword);

		} catch (IOException | NumberFormatException e) {
			System.out.println("不正な入力です");
			e.printStackTrace();
			return;
		}

		System.out.println("---SHOW DATA---");
		MemberManager.showAllMembers(members);
	}
}

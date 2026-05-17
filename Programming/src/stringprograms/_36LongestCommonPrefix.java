package stringprograms;

public class _36LongestCommonPrefix {


		public static void main(String[] args) {

			String[] str = {
					"flower",
					"flow",
					"flight"
			};

			String prefix = "";

			for (int i = 0; i < str[0].length(); i++) {

				char ch = str[0].charAt(i);

				boolean match = true;

				for (int j = 1; j < str.length; j++) {

					// length exceeded OR mismatch
					if (i >= str[j].length() ||
						str[j].charAt(i) != ch) {

						match = false;
						break;
					}
				}

				if (match)
					prefix += ch;
				else
					break;
			}

			System.out.println(prefix);
		}
	}

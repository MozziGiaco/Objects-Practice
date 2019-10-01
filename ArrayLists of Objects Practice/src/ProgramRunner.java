import java.util.ArrayList;

public class ProgramRunner
	{
		static ArrayList<Program> TVShows = new ArrayList<Program>();

		public static void main(String[] args)
			{

				printList();
				printListCode();
				printAddYear();
				deleteLongestTitle();
				printNewTitle();

			}

		public static void printList()
			{

				TVShows.add(new Program("Riverdale", "Mystery", 3));
				TVShows.add(new Program("Grey's Anatomy", "Medical Drama", 15));
				TVShows.add(new Program("Breaking Bad", "Drama", 5));
				TVShows.add(new Program("House of Cards", "Political Drama", 6));
				TVShows.add(new Program("Game of Thrones", "Fantasy", 8));

			}

		public static void printListCode()
			{
				for (Program t : TVShows)
					{
						System.out.print(t.getTitle() + " " + t.getGenre() + " " + t.getNumberOfSeasonsAired());

						System.out.println();
					}
			}

		public static void printAddYear()
			{
				System.out.println("");

				for (Program t : TVShows)
					{
						System.out.print(t.getTitle() + " " + t.getGenre() + " ");

						System.out.print(t.getNumberOfSeasonsAired() + 1);
						System.out.println();

					}

			}

		public static void deleteLongestTitle()
			{
				System.out.println("");
				int max = TVShows.get(0).getTitle().length();
				int index = 0;

				for (int i = 0; i < TVShows.size(); i++)
					{
						if (TVShows.get(i).getTitle().length() > max)
							{
								index = i;
							}

					}
				TVShows.remove(index);

				for (Program t : TVShows)
					{
						System.out.print(t.getTitle() + " " + t.getGenre() + " " + t.getNumberOfSeasonsAired());

						System.out.println();
					}

			}

		public static void printNewTitle()
			{
				System.out.println("");
				TVShows.get(0).setTitle("Stranger Things");

				for (Program t : TVShows)
					{
						System.out.print(t.getTitle() + " " + t.getGenre() + " " + t.getNumberOfSeasonsAired());
						System.out.println();

					}

			}

	}

import java.util.ArrayList;

public class ProgramRunner
	{

		public static void main(String[] args)
			{
				ArrayList<Program> TVShows = new ArrayList<Program>();

				TVShows.add(new Program("Riverdale", "Mystery", 3));
				TVShows.add(new Program("Grey's Anatomy", "Medical Drama", 15));
				TVShows.add(new Program("Breaking Bad", "Drama", 5));
				TVShows.add(new Program("House of Cards", "Political Drama", 6));
				TVShows.add(new Program("Game of Thrones", "Fantasy", 8));
				printList();
				printAddYear();
				deleteLongestTitle();
				printNewTitle();

			}

		public static void printList()
			{
				ArrayList<Program> TVShows = new ArrayList<Program>();

				TVShows.add(new Program("Riverdale", "Mystery", 3));
				TVShows.add(new Program("Grey's Anatomy", "Medical Drama", 15));
				TVShows.add(new Program("Breaking Bad", "Drama", 5));
				TVShows.add(new Program("House of Cards", "Political Drama", 6));
				TVShows.add(new Program("Game of Thrones", "Fantasy", 8));

				for (Program t : TVShows)
					{
						System.out.println(t.getTitle());
						System.out.println(t.getGenre());
						System.out.println(t.getNumberOfSeasonsAired());

					}
			}

		public static void printAddYear()
			{
				ArrayList<Program> TVShows = new ArrayList<Program>();

				TVShows.add(new Program("Riverdale", "Mystery", 3));
				TVShows.add(new Program("Grey's Anatomy", "Medical Drama", 15));
				TVShows.add(new Program("Breaking Bad", "Drama", 5));
				TVShows.add(new Program("House of Cards", "Political Drama", 6));
				TVShows.add(new Program("Game of Thrones", "Fantasy", 8));

				for (Program t : TVShows)
					{
						System.out.println(t.getTitle());
						System.out.println(t.getGenre());
						System.out.println(t.getNumberOfSeasonsAired() + 1);

					}

			}

		public static void deleteLongestTitle()
			{
				ArrayList<Program> TVShows = new ArrayList<Program>();

				TVShows.add(new Program("Riverdale", "Mystery", 3));
				TVShows.add(new Program("Grey's Anatomy", "Medical Drama", 15));
				TVShows.add(new Program("Breaking Bad", "Drama", 5));
				TVShows.add(new Program("House of Cards", "Political Drama", 6));
				TVShows.add(new Program("Game of Thrones", "Fantasy", 8));

				TVShows.remove(4);
				for (Program t : TVShows)
					{
						System.out.println(t.getTitle());
						System.out.println(t.getGenre());
						System.out.println(t.getNumberOfSeasonsAired());

					}

			}

		public static void printNewTitle()
			{
				ArrayList<Program> TVShows = new ArrayList<Program>();

				TVShows.add(new Program("Stranger Things", "Mystery", 3));
				TVShows.add(new Program("Grey's Anatomy", "Medical Drama", 15));
				TVShows.add(new Program("Breaking Bad", "Drama", 5));
				TVShows.add(new Program("House of Cards", "Political Drama", 6));
				TVShows.add(new Program("Game of Thrones", "Fantasy", 8));
				for (Program t : TVShows)
					{
						System.out.println(t.getTitle());
						System.out.println(t.getGenre());
						System.out.println(t.getNumberOfSeasonsAired());

					}

			}

	}

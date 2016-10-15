import java.util.Random;
import java.util.Scanner;

/*
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 10/13/2016
 * 
 */
public class Challenge {
	 //This an array of every pokemon
	static final String[] pokemonList = {"Bulbasaur","Ivysaur","Venusaur","Charmander","Charmeleon","Charizard","Squirtle","Wartortle","Blastoise","Caterpie","Metapod","Butterfree","Weedle","Kakuna","Beedrill","Pidgey","Pidgeotto","Pidgeot","Rattata","Raticate","Spearow","Fearow","Ekans","Arbok","Pikachu","Raichu","Sandshrew","Sandslash","Nidoran♀","Nidorina","Nidoqueen","Nidoran♂","Nidorino","Nidoking","Clefairy","Clefable","Vulpix","Ninetales","Jigglypuff","Wigglytuff","Zubat","Golbat","Oddish","Gloom","Vileplume","Paras","Parasect","Venonat","Venomoth","Diglett","Dugtrio","Meowth","Persian","Psyduck","Golduck","Mankey","Primeape","Growlithe","Arcanine","Poliwag","Poliwhirl","Poliwrath","Abra","Kadabra","Alakazam","Machop","Machoke","Machamp","Bellsprout","Weepinbell","Victreebel","Tentacool","Tentacruel","Geodude","Graveler","Golem","Ponyta","Rapidash","Slowpoke","Slowbro","Magnemite","Magneton","Farfetch'd","Doduo","Dodrio","Seel","Dewgong","Grimer","Muk","Shellder","Cloyster","Gastly","Haunter","Gengar","Onix","Drowzee","Hypno","Krabby","Kingler","Voltorb","Electrode","Exeggcute","Exeggutor","Cubone","Marowak","Hitmonlee","Hitmonchan","Lickitung","Koffing","Weezing","Rhyhorn","Rhydon","Chansey","Tangela","Kangaskhan","Horsea","Seadra","Goldeen","Seaking","Staryu","Starmie","Mr. Mime","Scyther","Jynx","Electabuzz","Magmar","Pinsir","Tauros","Magikarp","Gyarados","Lapras","Ditto","Eevee","Vaporeon","Jolteon","Flareon","Porygon","Omanyte","Omastar","Kabuto","Kabutops","Aerodactyl","Snorlax","Articuno","Zapdos","Moltres","Dratini","Dragonair","Dragonite","Mewtwo","Mew","Chikorita","Bayleef","Meganium","Cyndaquil","Quilava","Typhlosion","Totodile","Croconaw","Feraligatr","Sentret","Furret","Hoothoot","Noctowl","Ledyba","Ledian","Spinarak","Ariados","Crobat","Chinchou","Lanturn","Pichu","Cleffa","Igglybuff","Togepi","Togetic","Natu","Xatu","Mareep","Flaaffy","Ampharos","Bellossom","Marill","Azumarill","Sudowoodo","Politoed","Hoppip","Skiploom","Jumpluff","Aipom","Sunkern","Sunflora","Yanma","Wooper","Quagsire","Espeon","Umbreon","Murkrow","Slowking","Misdreavus","Unown","Wobbuffet","Girafarig","Pineco","Forretress","Dunsparce","Gligar","Steelix","Snubbull","Granbull","Qwilfish","Scizor","Shuckle","Heracross","Sneasel","Teddiursa","Ursaring","Slugma","Magcargo","Swinub","Piloswine","Corsola","Remoraid","Octillery","Delibird","Mantine","Skarmory","Houndour","Houndoom","Kingdra","Phanpy","Donphan","Porygon2","Stantler","Smeargle","Tyrogue","Hitmontop","Smoochum","Elekid","Magby","Miltank","Blissey","Raikou","Entei","Suicune","Larvitar","Pupitar","Tyranitar","Lugia","Ho-Oh","Celebi","Treecko","Grovyle","Sceptile","Torchic","Combusken","Blaziken","Mudkip","Marshtomp","Swampert","Poochyena","Mightyena","Zigzagoon","Linoone","Wurmple","Silcoon","Beautifly","Cascoon","Dustox","Lotad","Lombre","Ludicolo","Seedot","Nuzleaf","Shiftry","Taillow","Swellow","Wingull","Pelipper","Ralts","Kirlia","Gardevoir","Surskit","Masquerain","Shroomish","Breloom","Slakoth","Vigoroth","Slaking","Nincada","Ninjask","Shedinja","Whismur","Loudred","Exploud","Makuhita","Hariyama","Azurill","Nosepass","Skitty","Delcatty","Sableye","Mawile","Aron","Lairon","Aggron","Meditite","Medicham","Electrike","Manectric","Plusle","Minun","Volbeat","Illumise","Roselia","Gulpin","Swalot","Carvanha","Sharpedo","Wailmer","Wailord","Numel","Camerupt","Torkoal","Spoink","Grumpig","Spinda","Trapinch","Vibrava","Flygon","Cacnea","Cacturne","Swablu","Altaria","Zangoose","Seviper","Lunatone","Solrock","Barboach","Whiscash","Corphish","Crawdaunt","Baltoy","Claydol","Lileep","Cradily","Anorith","Armaldo","Feebas","Milotic","Castform","Kecleon","Shuppet","Banette","Duskull","Dusclops","Tropius","Chimecho","Absol","Wynaut","Snorunt","Glalie","Spheal","Sealeo","Walrein","Clamperl","Huntail","Gorebyss","Relicanth","Luvdisc","Bagon","Shelgon","Salamence","Beldum","Metang","Metagross","Regirock","Regice","Registeel","Latias","Latios","Kyogre","Groudon","Rayquaza","Jirachi","Deoxys","Turtwig","Grotle","Torterra","Chimchar","Monferno","Infernape","Piplup","Prinplup","Empoleon","Starly","Staravia","Staraptor","Bidoof","Bibarel","Kricketot","Kricketune","Shinx","Luxio","Luxray","Budew","Roserade","Cranidos","Rampardos","Shieldon","Bastiodon","Burmy","Wormadam","Mothim","Combee","Vespiquen","Pachirisu","Buizel","Floatzel","Cherubi","Cherrim","Shellos","Gastrodon","Ambipom","Drifloon","Drifblim","Buneary","Lopunny","Mismagius","Honchkrow","Glameow","Purugly","Chingling","Stunky","Skuntank","Bronzor","Bronzong","Bonsly","Mime Jr.","Happiny","Chatot","Spiritomb","Gible","Gabite","Garchomp","Munchlax","Riolu","Lucario","Hippopotas","Hippowdon","Skorupi","Drapion","Croagunk","Toxicroak","Carnivine","Finneon","Lumineon","Mantyke","Snover","Abomasnow","Weavile","Magnezone","Lickilicky","Rhyperior","Tangrowth","Electivire","Magmortar","Togekiss","Yanmega","Leafeon","Glaceon","Gliscor","Mamoswine","Porygon-Z","Gallade","Probopass","Dusknoir","Froslass","Rotom","Uxie","Mesprit","Azelf","Dialga","Palkia","Heatran","Regigigas","Giratina","Cresselia","Phione","Manaphy","Darkrai","Shaymin","Arceus","Victini","Snivy","Servine","Serperior","Tepig","Pignite","Emboar","Oshawott","Dewott","Samurott","Patrat","Watchog","Lillipup","Herdier","Stoutland","Purrloin","Liepard","Pansage","Simisage","Pansear","Simisear","Panpour","Simipour","Munna","Musharna","Pidove","Tranquill","Unfezant","Blitzle","Zebstrika","Roggenrola","Boldore","Gigalith","Woobat","Swoobat","Drilbur","Excadrill","Audino","Timburr","Gurdurr","Conkeldurr","Tympole","Palpitoad","Seismitoad","Throh","Sawk","Sewaddle","Swadloon","Leavanny","Venipede","Whirlipede","Scolipede","Cottonee","Whimsicott","Petilil","Lilligant","Basculin","Sandile","Krokorok","Krookodile","Darumaka","Darmanitan","Maractus","Dwebble","Crustle","Scraggy","Scrafty","Sigilyph","Yamask","Cofagrigus","Tirtouga","Carracosta","Archen","Archeops","Trubbish","Garbodor","Zorua","Zoroark","Minccino","Cinccino","Gothita","Gothorita","Gothitelle","Solosis","Duosion","Reuniclus","Ducklett","Swanna","Vanillite","Vanillish","Vanilluxe","Deerling","Sawsbuck","Emolga","Karrablast","Escavalier","Foongus","Amoonguss","Frillish","Jellicent","Alomomola","Joltik","Galvantula","Ferroseed","Ferrothorn","Klink","Klang","Klinklang","Tynamo","Eelektrik","Eelektross","Elgyem","Beheeyem","Litwick","Lampent","Chandelure","Axew","Fraxure","Haxorus","Cubchoo","Beartic","Cryogonal","Shelmet","Accelgor","Stunfisk","Mienfoo","Mienshao","Druddigon","Golett","Golurk","Pawniard","Bisharp","Bouffalant","Rufflet","Braviary","Vullaby","Mandibuzz","Heatmor","Durant","Deino","Zweilous","Hydreigon","Larvesta","Volcarona","Cobalion","Terrakion","Virizion","Tornadus","Thundurus","Reshiram","Zekrom","Landorus","Kyurem","Keldeo","Meloetta","Genesect","Chespin","Quilladin","Chesnaught","Fennekin","Braixen","Delphox","Froakie","Frogadier","Greninja","Bunnelby","Diggersby","Fletchling","Fletchinder","Talonflame","Scatterbug","Spewpa","Vivillon","Litleo","Pyroar","Flabébé","Floette","Florges","Skiddo","Gogoat","Pancham","Pangoro","Furfrou","Espurr","Meowstic","Honedge","Doublade","Aegislash","Spritzee","Aromatisse","Swirlix","Slurpuff","Inkay","Malamar","Binacle","Barbaracle","Skrelp","Dragalge","Clauncher","Clawitzer","Helioptile","Heliolisk","Tyrunt","Tyrantrum","Amaura","Aurorus","Sylveon","Hawlucha","Dedenne","Carbink","Goomy","Sliggoo","Goodra","Klefki","Phantump","Trevenant","Pumpkaboo","Gourgeist","Bergmite","Avalugg","Noibat","Noivern","Xerneas","Yveltal","Zygarde","Diancie"};
	
	static int buddyHp, buddyMaxHp, userPotions = 5; //Buddy stats and potions
	static Boolean mainLoopRun = true;
	
	static Random r = new Random();//Global Random
	static Scanner userInput = new Scanner(System.in); //Global scanner
	
	public static void main(String[] args){
		
		/*					Main Variables				*/
		String userName = null, buddyType = null, buddyName = null; //Username and buddy name
		String userYN, userSelect;//For questions
		
		/*					User Name				*/
		System.out.print("Welcome to Pokemon verse, what is your name?\n>");//Getting the username
		userName = userInput.nextLine();
		System.out.println("Welcome, " + userName + "!\n");
				
		/*					Starter Pokemon				*/
		System.out.println("Professor Wes> " + userName + ", I have a few extra pokemon, why don't you take one?\n");//Getting the Starter pokemon
		do{
			int pokeSelect;
			System.out.println("Select (1)(2)(3)");//Pokemon selection
			System.out.println("1) Charmander");
			System.out.println("2) Squirtle");
			System.out.println("3) Bulbasaur");
			System.out.print(userName + ">");
			pokeSelect = userInput.nextInt();
			if (pokeSelect >=1 && pokeSelect <=3){
				switch(pokeSelect){
				case 1:
					buddyType = "Charmander";
					buddyMaxHp = 100;
					buddyHp = 100;
					break;
				case 2: 
					buddyType = "Squirtle";
					buddyMaxHp = 100;
					buddyHp = 100;
					break;
				case 3: 
					buddyType = "Bulbasaur";
					buddyMaxHp = 100;
					buddyHp = 100;
					break;
				default:
					buddyType = "Pikachu";//If they get lucky
					buddyMaxHp = 500;
					buddyHp = 500;
				}
			}
		}while(buddyType == null);
		System.out.println("\nProfessor Wes> Congrats! You now have a " + buddyType + "!\n");
		
		/*					Name Starter				*/
		do{
			System.out.println("Would you like to name your " + buddyType + "?");
			System.out.println("Select (Y)(N)");
			System.out.print(userName + ">");
			userYN  = userInput.next();
			if(userYN.toLowerCase().equals("y")){
				System.out.println("\nPlease enter a name");
				System.out.print(userName + ">");
				buddyName = userInput.next();
				System.out.println("Your " + buddyType + " is now named " + buddyName + "!");
			} else {
				System.out.println("Okay!");
				buddyName = userName + "'s " + buddyType;
			}
		}while(!(userYN.toLowerCase().equals("y") || userYN.toLowerCase().equals("n")));
		System.out.println("\n\n\n\n\n");
		
		
		/*					Main Menu				*/
		do{
			System.out.println(buddyName + " (" + buddyHp + "/" + buddyMaxHp + ")\n");
			System.out.println("Main Menu");
			System.out.println("Select (S)(P)(Q)");
			System.out.println("S) Search for Pokemon");
			System.out.println("P) Use Potion");
			System.out.println("Q) Quit");
			System.out.print(userName + ">");
			userSelect = userInput.next();
			if(userSelect.toLowerCase().equals("s")){//Searching
				pokemonSearch(userName,buddyName);
			} else if (userSelect.toLowerCase().equals("p")){//Use a potion
				usePotion(userName, buddyName);
			} else if (userSelect.toLowerCase().equals("q")){//Quit
				System.out.println("\nGoodbye " + userName + "!");
				mainLoopRun = false;
			} else {
				System.out.println("\n\n\n\n\n");
				System.out.println("Error! Thats not a command!\n");
			}
		}while(mainLoopRun);
		
		userInput.close();//Closing the scanner
	}
	
	public static void pokemonSearch(String userName, String buddyName){
		Boolean userBattle = true;
		String userSelect;
		int wildPokemonHpTotal = randomPokemonHp();
		int wildPokemonHp = wildPokemonHpTotal;
		
		System.out.println("\n\n\n\n\n");//Clearing the screen
		
		if(r.nextInt(9) < 5){//looking for pokemon
			//Pokemon found!
			String wildPokemon = randomPokemon();
			System.out.println("A wild " + wildPokemon.toUpperCase() + " appeared!");
			System.out.println("Go " + buddyName + "!\n");
			
			do{//Fight Menu
			System.out.println(buddyName + " (" + buddyHp + "/" + buddyMaxHp + ")" + " vs " + wildPokemon + " (" + wildPokemonHp + "/" + wildPokemonHpTotal + ")\n");
			System.out.println("Fight Menu");
			System.out.println("Select (B)(C)(P)(F)");
			System.out.println("B) Battle");
			System.out.println("C) Capture with Pokeball");
			System.out.println("P) Use potion");
			System.out.println("F) Flee");
			System.out.print(userName + ">");
			userSelect = userInput.next();
			
			if(userSelect.toLowerCase().equals("b")){//Battle moves!
				int userAttack = userAttackPower(), wildAttack = wildAttackPower();
				
				System.out.println("\n\n\n\n\n");//Clearing the screen
				
				wildPokemonHp -= userAttack;//Do the attack
				System.out.println(buddyName + " used SCRATCH");
				if(userAttack > 25){System.out.println("It was super effective! - " + userAttack + "Hp");}//Message the hit
				else {System.out.println(buddyName + " Hit! - " + userAttack + "Hp");}
				
				buddyHp -= wildAttack;//Do the attack
				System.out.println(wildPokemon + " used Tackle");
				if(wildAttack > 25){System.out.println("It was super effective! - " + wildAttack + "Hp");}//Message the hit
				else {System.out.println(wildPokemon + " Hit! - " + wildAttack + "Hp");}
				
			} else if (userSelect.toLowerCase().equals("c")){//Catching moves!
				if ((r.nextInt(10) + 1) < (wildPokemonHpTotal / wildPokemonHp)){
					System.out.println("\n\n\n\n\n");//Clearing the screen
					System.out.println(wildPokemon + " has been cought!\n");
					userBattle = false;
				} else {
					System.out.println("\n\n\n\n\n");//Clearing the screen
					System.out.println(wildPokemon + " has broken free!");
				}
			} else if (userSelect.toLowerCase().equals("p")){//Potion use!
				usePotion(userName, buddyName);
			} else if (userSelect.toLowerCase().equals("f")){//Running away!
				System.out.println(userName + " Flees");
				userBattle = false;
			} else {
				System.out.println("Invalid Input");//Error
			}
			
			if(buddyHp <=0){//User loses
				System.out.println(buddyName + " has fainted!\n");
				System.out.println("Goodbye " + userName);
				userBattle = false;
				mainLoopRun = false;
			}
			
			if(wildPokemonHp <= 0){//Wild loses
				System.out.println(wildPokemon + " has fainted!\n");
				
				userBattle = false;
			}
			
			} while (userBattle);
			
		} else {//Nothing is found
			System.out.println("*rustle rustle* \nNothing here\n");
		}
	}
	public static void usePotion(String userName, String buddyName){
		System.out.println("\n\n\n\n\n");//Clearing the screen
		if (userPotions > 0 && (buddyHp + 20) <= buddyMaxHp){
			System.out.println(userName + " has been used a potion");
			System.out.println(buddyName + " + 20Hp");
			System.out.println("You now have " + userPotions + " potions\n");
			userPotions--;
			buddyHp += 20;
		} else {
			if(userPotions <=0){
				System.out.println(userName + " is out of potions!\n");
			} else {
				System.out.println(buddyName + " cannot be healed more!\n");
			}
		}
	}
	public static String randomPokemon(){
		return pokemonList[r.nextInt(pokemonList.length)];
	}
	public static int randomPokemonHp(){
		return (r.nextInt(50)+25);
	}
	public static int userAttackPower(){
		return (r.nextInt(25)+10);
	}
	public static int wildAttackPower(){
		return (r.nextInt(20)+6);
	}
	
}

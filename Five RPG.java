//Name: Raj Zala
//Purpose: Entertain people standing in lines at Comic-Con

import javax.swing.*;
import java.util.*;
import java.text.*;
public class FiveExtra
{
    public static void main (String args[])
    {
	new FiveExtra ();
    }


    //Starting of the game, calls magic 8 ball intro
    public FiveExtra ()
    {
      
	magicintro ();
    }


    //Method for magic 8 ball dream to start off the game
    public void magicintro ()
    {
	//calls ASCII Art for magician
	magician ();
	//code for magic 8 ball program which decides what pathway the player follows in the game
	System.out.println ("");
	IO.printSlow ("\nOne, two, three, four, there's only way to open the door. Five, the number you must remember to stay alive. \n6, 7, 8, and 9, bring peace to the world and we shall dine.\nNow we are at 10, farewell my dear friend.", 50);
	double chance = IO.inputInt ("Choose the chance you will take to decide the path you shall follow. \nPick the number that will decide your path (If you don't enter a number, it's equal to 0. Don't be that person.): ");

	int num = (int) (Math.random () * chance) + 1;

	if (num > (chance / 2))
	    task1pathway1 ();

	else
	    task1pathway1 ();

    }


    //ASCII Art for wizard for the intro
    public void magician ()
    {
	System.out.println ("                              '             .           .");
	System.out.println ("                           o       '   o  .     '   . O");
	System.out.println ("                        '   .   ' .   _____  '    .      .");
	System.out.println ("                         .     .   .mMMMMMMMm.  '  o  '   .");
	System.out.println ("                       '   .     .MMXXXXXXXXXMM.    .   ' ");
	System.out.println ("                      .       . /XX77:::::::77XX\\ .   .   .");
	System.out.println ("                         o  .  ;X7:::''''''':::7X;   .  '");
	System.out.println ("                        '    . |::'.:'        '::| .   .  .");
	System.out.println ("                           .   ;:.:.            :;. o   .");
	System.out.println ("                        '     . \\'.:            /.    '   .");
	System.out.println ("                           .     `.':.        .'.  '    .");
	System.out.println ("                         '   . '  .`-._____.-'   .  . '  .");
	System.out.println ("                          ' o   '  .   O   .   '  o    '");
	System.out.println ("                           . ' .  ' . '  ' O   . '  '   '");
	System.out.println ("                            . .   '    '  .  '   . '  '");
	System.out.println ("                             . .'..' . ' ' . . '.  . '");
	System.out.println ("                              `.':.'        ':'.'.'");
	System.out.println ("                                `\\\\_  |     _//'");
	System.out.println ("                                  \\(  |\\    )/");
	System.out.println ("                                  //\\ |_\\  /\\\\");
	System.out.println ("                                 (/ /\\(\" )/\\ \\)");
	System.out.println ("                                  \\/\\ (  ) /\\/");
	System.out.println ("                                     |(  )|");
	System.out.println ("                                     | \\( \\");
	System.out.println ("                                     |  )  \\");
	System.out.println ("                                     |      \\");
	System.out.println ("                                     |       \\");
	System.out.println ("                                     |        `.__,");
	System.out.println ("                                     \\_________.-'");
    }


    //Method for intro for pathway 1 of game
    public void task1pathway1 ()
    {
	alarmclock ();
	//dialogue sequence for intro
	IO.printSlow ("Grandma: WAKE UP FIVE! IT'S 11 AND YOU'RE LATE FOR SCHOOL! YOU GOOD FOR NOTHING BRAT, GET UP!", 50);
	IO.printSlow ("\nYou sluggishly get out of bed, trying to figure out what happened in your dream. What was it even about? Who was the wizard guy? Chance? What was he even talking about?", 50);
	IO.printSlow ("\nGrandma: DON'T MAKE ME COME UP THERE YOUNG MAN.", 50);
	IO.printSlow ("\nYou're about to go out the door when you look at the table beside your bed. You notice the picture of your family, your parents and you, 14 years ago. \nOnly if everything was like it was 14 years ago.", 50);
	JOptionPane.showMessageDialog (null, createImageIcon ("fivefamlegit.jpg"), "Family", JOptionPane.INFORMATION_MESSAGE);
	IO.printSlow ("\nGrandma: I SWEAR TO GOD YOUNG MAN!", 30);
	IO.printSlow ("\nYou get out of your room, grab a juice box, and prepare yourself for the new day ahead of you (and the detention you're going to get for being 3 hours late).", 50);
	startpage ();
    }


    //ASCII Art for alarm clock in intro for pathway 1, and date
    public void alarmclock ()
    {

	System.out.println ("\n\n.'`~~~~~~~~~~~`'.");
	System.out.println ("(  .'11 12 1'.  )");
	System.out.println ("|  :10 \\|   2:  |");
	System.out.println ("|  :9   @   3:  |");
	System.out.println ("|  :8       4;  |");
	System.out.println ("'. '..7 6 5..' .'");
	System.out.println (" ~-------------~  ");

	Date now = new Date ();
	DateFormat df = DateFormat.getDateInstance ();
	String s = df.format (now);
	System.out.println ("Today is " + s);
    }



    //Starting menu, includes ASCII Art for title of game
    public void startpage ()
    {
	System.out.println (" _______  _______  _        _______  _        _______  _______   ");
	System.out.println ("/ ___   )(  ___  )( \\      (  ___  )( \\      (  ___  )/ ___   )  ");
	System.out.println ("\\/   )  || (   ) || (      | (   ) || (      | (   ) |\\/   )  |  ");
	System.out.println ("    /   )| (___) || |      | (___) || |      | (___) |    /   )  ");
	System.out.println ("   /   / |  ___  || |      |  ___  || |      |  ___  |   /   /   ");
	System.out.println ("  /   /  | (   ) || |      | (   ) || |      | (   ) |  /   /    ");
	System.out.println (" /   (_/\\| )   ( || (____/\\| )   ( || (____/\\| )   ( | /   (_/\\  ");
	System.out.println ("(_______/|/     \\|(_______/|/     \\|(_______/|/     \\|(_______/  ");
	System.out.println ("                                                                 ");
	System.out.println ("                                                                 ");
	System.out.println (" _______  _______  _______  ______            _______ __________________ _______  _       ");
	System.out.println ("(  ____ )(  ____ )(  ___  )(  __  \\ |\\     /|(  ____ \\\\__   __/\\__   __/(  ___  )( (    /|");
	System.out.println ("| (    )|| (    )|| (   ) || (  \\  )| )   ( || (    \\/   ) (      ) (   | (   ) ||  \\  ( |");
	System.out.println ("| (____)|| (____)|| |   | || |   ) || |   | || |         | |      | |   | |   | ||   \\ | |");
	System.out.println ("|  _____)|     __)| |   | || |   | || |   | || |         | |      | |   | |   | || (\\ \\) |");
	System.out.println ("| (      | (\\ (   | |   | || |   ) || |   | || |         | |      | |   | |   | || | \\   |");
	System.out.println ("| )      | ) \\ \\__| (___) || (__/  )| (___) || (____/\\   | |   ___) (___| (___) || )  \\  |");
	System.out.println ("|/       |/   \\__/(_______)(______/ (_______)(_______/   )_(   \\_______/(_______)|/    )_)");
	System.out.println ("                                                                                          ");
	System.out.println ("");
	System.out.println (" _______  _______  _______  _______  _______  _                ");
	System.out.println ("(  ____ \\(  ___  )(       )(  ____ )(  ___  )( (    /||\\     /|");
	System.out.println ("| (    \\/| (   ) || () () || (    )|| (   ) ||  \\  ( |( \\   / )");
	System.out.println ("| |      | |   | || || || || (____)|| (___) ||   \\ | | \\ (_) / ");
	System.out.println ("| |      | |   | || |(_)| ||  _____)|  ___  || (\\ \\) |  \\   /  ");
	System.out.println ("| |      | |   | || |   | || (      | (   ) || | \\   |   ) (   ");
	System.out.println ("| (____/\\| (___) || )   ( || )      | )   ( || )  \\  |   | |   ");
	System.out.println ("(_______/(_______)|/     \\||/       |/     \\||/    )_)   \\_/   ");
	System.out.println ("                                                              ");
	System.out.println ("");
	System.out.println (" _______  _______  _______  _______  _______  _       _________ _______ ");
	System.out.println ("(  ____ )(  ____ )(  ____ \\(  ____ \\(  ____ \\( (    /|\\__   __/(  ____ \\");
	System.out.println ("| (    )|| (    )|| (    \\/| (    \\/| (    \\/|  \\  ( |   ) (   | (    \\/");
	System.out.println ("| (____)|| (____)|| (__    | (_____ | (__    |   \\ | |   | |   | (_____ ");
	System.out.println ("|  _____)|     __)|  __)   (_____  )|  __)   | (\\ \\) |   | |   (_____  )");
	System.out.println ("| (      | (\\ (   | (            ) || (      | | \\   |   | |         ) |");
	System.out.println ("| )      | ) \\ \\__| (____/\\/\\____) || (____/\\| )  \\  |   | |   /\\____) |");
	System.out.println ("|/       |/   \\__/(_______/\\_______)(_______/|/    )_)   )_(   \\_______)");
	System.out.println ("                                                                        ");
	System.out.println ("                                                                               ");
	System.out.println ("                                       `                                       ");
	System.out.println ("                                       ,                                       ");
	System.out.println ("                               :` :,'@. '@, , .                                ");
	System.out.println ("                             `@;.#  '+, ',.'#:: #`                             ");
	System.out.println ("                         : #,;.,:: #:#+++++,.; ' .`#`;                         ");
	System.out.println ("                        :`'#,@`##@#':`` ,;,'####'@:+.;@                        ");
	System.out.println ("                    `  .':,:##+., ':.``.`'  ';, :###;` :#                      ");
	System.out.println ("                   ; @;,:##+ :  ; ':``  `:  ;:` `+,:##:@`'`:                   ");
	System.out.println ("                   .,#`##, :;  ,` ; `,:,`:`     `;::;:#+,,',.                  ");
	System.out.println ("                 '@`'+#: ' :` .'  ;      .:.        `.' ##:.+`                 ");
	System.out.println ("                  ';@',.`,  +.;: .:`````,,+:;,`':;',, ; :.+#  :                ");
	System.out.println ("               @`#+@.. :. :  +.`.':: ,. ;;`, +'`;.``,  ` : ## .`;`             ");
	System.out.println ("             ;.,,##   '  . ; ,..+,`':,````::;:,.+'. `:   :`,+#..:              ");
	System.out.println ("              :`#' , '  '+ +:+`'`              :;,,'.;`. ''. '#;'#.            ");
	System.out.println ("            ,' #,;' ' ,; :  ;, `                ` :;,+`.#,  + `#+``.           ");
	System.out.println ("          `, `#,,' + `` ':,.                        ::;+  `;`:+ #@:@           ");
	System.out.println ("          ';`#;,' `;,., ;;                            ;'::. ' ,' +;;;.         ");
	System.out.println ("         ,''++;'` ' `@,                                .;,:+'  .'`#':+         ");
	System.out.println ("         , :#+`  ; ,+;:                '`         `.     ',:`'  `.,#.``        ");
	System.out.println ("        ++.+  ; ` ;;;;`         .     +:          #:      +.: ;  ,`@#,:        ");
	System.out.println ("        ``#. . ,.,':;          ;     '         :##'        +:. .+``:#,`+       ");
	System.out.println ("       @,@@'  +  +;:`      #@. @    ,#;   .;@#;;#'+         ;'.;: '`;@';;      ");
	System.out.println ("      `@:#, ```..+,       ' ##`#+#;.@'.` .;'+;` `+;          ;;', `; @:,'      ");
	System.out.println ("     ;`;'+ '  + :.        +..: +   .;            ,,.         .;@`' :+ #`@      ");
	System.out.println ("      ;.#,'  ; #:,           ' +   #'           +;,           ;`'`.   #,,.     ");
	System.out.println ("     @+;#   ' .+.         `  # ;   @+   ``:'#@;  ,;            `'+, :'`+@'     ");
	System.out.println ("     : #::  ::;``          ,;#+#++:#@,::;''';;,.``#            ;.. ,`  # .     ");
	System.out.println ("    ;'@@.,  `  +             ; +@#;#'` .:+'+''';``+             ;:'. :::+`,.   ");
	System.out.println ("   `@`:;   ',+ `             @',``,''           .;:             ;   ``: #,.    ");
	System.out.println ("   ;; #;'   ;:;             ,..`  .;`                             ;'; '.#,@`   ");
	System.out.println ("   ``:# ::  ,.;              `.`  ,:.                            ';',.;.;; ;   ");
	System.out.println ("   ;'.+    :+:               .`   :,,                            : ' `;: +::   ");
	System.out.println ("   :':,  ;; :'`              .    ;:,                             ++  :;.#;+   ");
	System.out.println ("   ';#,',    #               .`   ;`,  :+###+,                     '  .;'#::`` ");
	System.out.println ("   :'#`   .+;:               .    ::.##'@:`.,+#@.                 ;':, ::#`:,  ");
	System.out.println ("   ::#   .;#:`               .`   .@+`#+@##+.  ,''`               +    ;'';.   ");
	System.out.println ("  :  #+';':+;                ,.  :+ #;      #@   #:+ `            ,    :;;:..  ");
	System.out.println ("   ;:@:, ;.;`                :` # :#.        #+   ;:#             ,+`  :;`#`,  ");
	System.out.println ("   @'#,. '.':                '`# #` ,         +@   ':;            , .  :;`@'.  ");
	System.out.println ("  `:,#,. ;.+,                ## #             +':   #;@           .`.` :'`+@;  ");
	System.out.println ("  `;;@,, ','`                ..#               .#   ;;;#          ,+'+;';;'.,  ");
	System.out.println ("  `+.#:; :.#`                 @:  `.           +#`   @,'.         :.+;;:,;:``  ");
	System.out.println ("   :;#+#';:+:                 #    ,           ''#   #;,#         ; :;';'+'+`  ");
	System.out.println ("  :.,#   ,'+`,                +    .            `+   ',:#         :+;':,,++;   ");
	System.out.println ("   ':#`   `; :                                   `   .'.#         ::+,`  #,;   ");
	System.out.println ("   ,;#:;    ;;                                   :   `;:@         :#`,   #`+   ");
	System.out.println ("   +`@: .;: '                                   .;    ;.@        . ,  :: #:,   ");
	System.out.println ("   ' ;#   ,++`.           #'                    ;:.  .'.'        ,,,` ,:`+.'   ");
	System.out.println ("    :,@+' ; `+'          ,                      #:`  ;,;         :';;   ''     ");
	System.out.println ("   ::,#..   ;;           #`                    .',   #;@        ,.'  :. #,@    ");
	System.out.println ("    ,;#'   ; +,;        `#  `                  +;.   #:        `',,`'.: #:`    ");
	System.out.println ("     `.#'' ` :,.        @+  :                  @.,  ;;;        . # `; `#;;`    ");
	System.out.println ("     ;`+`  `' @ ;       @` :.                  #:#  #@         :;  '  '#,@     ");
	System.out.println ("     '+;#,:`:  ,:       # ;#'                 ;;,'`##         ;:+ '  ::';:     ");
	System.out.println ("      , #``. ,`;+'      # ' #                 @;, :#          ..;+  : #'`:     ");
	System.out.println ("     ,':.@  ; , '++`    ++ .'@               +,.@'.          ..,   + ,@,+      ");
	System.out.println ("       @'#'  '`+`:',     #`, ''`            '#.': `         :,+`'    +#,`      ");
	System.out.println ("       , @#`  .;:, `.     # @`' .+.       :@@;+`  `        ;;#'.  ';+;..       ");
	System.out.println ("         :'+: +  +; `.    `# @  #.  .:;:'@:#'@            ;`+'   :  @;#        ");
	System.out.println ("         #.#`+`   +':;:`    #.#' `#@#@@+` @''            '``' : ` ,#;;'        ");
	System.out.println ("         :..#'   . '# ''     `++++      '@:             + +  ' , '#;@,.        ");
	System.out.println ("        `,;':@;.  `, +,';`      `:;++':             `  : # ;  ; ;'# '          ");
	System.out.println ("           . @@:.   ; `+;:'                          #: + ' :  ':#,,           ");
	System.out.println ("            ::;#;  . ;'`';`;,                      ;;+;` `'' : ,#.#,           ");
	System.out.println ("            ,# :#.  + ``: # :,;`                `;`:+; ' , +; '#..             ");
	System.out.println ("              ``;@`: .' ; :.+, .,;:`        `;:,: ,;:'.:  , :+#,..:            ");
	System.out.println ("             `,,,:+ ':,` `; ;`,;' `; ;; ;: :,.`'@: ;` , ; . @+;`.              ");
	System.out.println ("                ,` @' , :   ,'   ;:'+;'`,''++,`;: ,` :;` '.+:,:                ");
	System.out.println ("                 `;,'#. ' ., `;::`  `.,  ;'+:  `;`,`;` ; ##;.@                 ");
	System.out.println ("                  ::::##  ;'. ,''   .:'  ':;',   ' `` ,##`;::                  ");
	System.out.println ("                   ;.; ,@#` '  `':`   .  '`.  .; :`: ##,,,@`.                  ");
	System.out.println ("                     `+`@:+#':  ::`   . `'    ,'  ,@#,:;.,                     ");
	System.out.println ("                       ` ;,`,@##,     ``,;    ,###@;..:,                       ");
	System.out.println ("                       ` ;;@`;+,'###@###+#@###+,; :,@.;                        ");
	System.out.println ("                             #:,, `;:,:@::,,`.#,:@:`                           ");
	System.out.println ("                               :,';@,,#;@::#``; '                              ");
	System.out.println ("                               `  `  `    :                                    ");
	System.out.println ("                                                                               ");
	System.out.println ("                                                                               ");
	control ();
	introtask1 ();
    }


    //A method to ask the user whether or not they are ready to continue playing the game
    public void control ()
    {
	IO.printSlow ("Are you ready to continue?");
	String go = IO.inputString ("");
    }


    //introduction to task 1
    public void introtask1 ()
    {
	IO.printSlow ("You walk into school, but surprisingly no one calls you out for being late. It's like no one notices you. \nLike always, school is a blur.", 50);
	IO.printSlow ("\nYou never really cared too much for school. It was just something that you went to so your grandma wouldn't get angry.", 50);
	window ();
	IO.printSlow ("\nYou look out the window and notice the kindergarteners playing. They must all have parents, a caring family, and a nice home, you think to yourself.", 50);
	IO.printSlow ("\n'Must be nice huh', you mumble to yourself. \n\"Oh I'm sorry Five, are we interrupting you?\" ", 50);
	IO.printSlow ("\n'Oh no it was nothing Mr. Johns - ' \n\"Since you don't think you need to pay attention in class because you know it all, why don't you solve the next problem for us?\" ", 50);
	int mathans = IO.inputInt ("What is 200 x 365? ");
	//math question asked by teacher
	if (mathans == 73000)
	    System.out.println ("You think you're a know-it-all, huh? Detention, after class. Prepare yourself to write an apology letter to your future self for not paying attention in math.");
	else
	    System.out.println ("I thought so. See, you would have gotten the right answer if you were PAYING ATTENTION. Detention, after class. *sighs* You're hopeless.");

	IO.printSlow ("School was terrible, you wish you could have just stayed home. \nWhen you leave to go home, you're the only one outside. You must have been in there for a long time.", 50);
	IO.printSlow ("While you're walking, you notice a tree with something unusual written on it. You decide to go check it out.", 50);
	titletree ();
	task1real ();
    }


    //method to print window used in intro for task 1
    public void window ()
    {
	System.out.println ("                                                                                                  ");
	System.out.println ("                                                                                                    ");
	System.out.println ("");
	System.out.println ("   .;:::::::::::::::::,:,,,::::,,,,,::,,,,:,::,:,,,,,,,,::::,,,,,,,,,,,,,.,,,,,,,,,,,,,,,,,.,....   ");
	System.out.println ("   .,,,,,,,,,,:,,,,:::::::,,,,,::::,,,,:,,.,,,,,,,,,,,,,:::,,,,,,,:::,,,,,,,,,,,,,,,,,,,,,,,,,,,:   ");
	System.out.println ("   .;:;;:;''''''''''''''''''''''''''''''''''''''+:,;+''''''''''''''''''''''''''''''''''++++;::;;'   ");
	System.out.println ("   .;:::::',:,:,,,,,,,,,,...........`````````   `,,,```````````````......`..``````````````+::::;:   ");
	System.out.println ("   .:::::::                                     `::,                                      ;::::;:   ");
	System.out.println ("   .::;::::                                     `::,                                      ;::::::   ");
	System.out.println ("   .:;:::::                                     `::,                                      ;,:,:::    ");
	System.out.println ("   ,::;::;,                                     `;::                                      ;,::,::   ");
	System.out.println ("   ,::;;:;:                                     `;::                                      ;,::,::   ");
	System.out.println ("   ,::;;:::                                     `;::                                      ;,::,::   ");
	System.out.println ("   ,::;;:;:                                     `:::                                      ;,::,::   ");
	System.out.println ("   ,::;;;;:                                     `:::                                      ;,,:,::   ");
	System.out.println ("   ,;:;;;;:::,,,,,,,,,,,,,,,,,,,,,,,,.....,,,,,,::::,,,,,.....................`..........,',::,:,   ");
	System.out.println ("   ,;;;;;;;;;;;;:;:::::;;;;;;;:::::::::::;;;::::;;;:;;:;;;::::;;:::;::;;;;:::::::::::;:::::,,:,:,   ");
	System.out.println ("   ,;;;;;;;;:::::::;;;;:::::;;:::;;:::::::::::::::::,:;,::::::,:::,,,,:::::::,,,::::::::::,,,::;:      ");
	System.out.println ("   ,:;;:;;;                                     `;;;,                                     '::;,::   ");
	System.out.println ("   ,:;;:;;:                                     `;:;,                                     ':::,,:   ");
	System.out.println ("   ,:;;:;;:                                     `;:;.                                     '::::::   ");
	System.out.println ("   ,:;;:;;:                                     `':;.                                     '::::::   ");
	System.out.println ("   ,::;;;;:                                     `;:;.                                     ',,::::   ");
	System.out.println ("   ,::;:;;:                                     `';'.                                     ;:,;:::   ");
	System.out.println ("   ,::;:;;:                                     `;;;`                                     ;:,:;::   ");
	System.out.println ("   ,:;;;;;:                                     `;;'`                                     ;,:;:::   ");
	System.out.println ("   ,:;;:;;:                                     `';;`                                     ;::;:::   ");
	System.out.println ("   ,'''+++::::,:::::::::,::::,,,,,,,:::::::::,,,:'+;,,,,:,::,,,,,,,,,.,::,..,,,,,,,:,,,,,,,':::::   ");
	System.out.println ("   ,'';;';;''''';;'''';;;;;;;;;;';;;'';;;;;;;;;;;;;;:;;::;::;:::::::;;:;:::::::::::,,,,,,,,,,,,,,   ");
	System.out.println ("  ");
    }


    //method for ASCII Art title for tree in task 1
    public void titletree ()
    {
	System.out.println (" ,ggggggggggggggg                           ,ggg, ,ggg,_,ggg,                                                  ,ggggggggggggggg                             ");
	System.out.println ("dP\"\"\"\"\"\"88\"\"\"\"\"\"\" ,dPYb,                   dP\"\"Y8dP\"\"Y88P\"\"Y8b                                       8I       dP\"\"\"\"\"\"88\"\"\"\"\"\"\"                             ");
	System.out.println ("Yb,_    88        IP'`Yb                   Yb, `88'  `88'  `88                                       8I       Yb,_    88                                    ");
	System.out.println (" `\"\"    88        I8  8I                    `\"  88    88    88   gg                                  8I        `\"\"    88                                    ");
	System.out.println ("        88        I8  8'                        88    88    88   \"\"                                  8I               88                                    ");
	System.out.println ("        88        I8 dPgg,    ,ggg,             88    88    88   gg      ,gg,   ,gg  ,ggg,     ,gggg,8I               88         ,gggggg,   ,ggg,    ,ggg,  ");
	System.out.println ("        88        I8dP\" \"8I  i8\" \"8i            88    88    88   88     d8\"\"8b,dP\"  i8\" \"8i   dP\"  \"Y8I               88         dP\"\"\"\"8I  i8\" \"8i  i8\" \"8i ");
	System.out.println ("  gg,   88        I8P    I8  I8, ,8I            88    88    88   88    dP   ,88\"    I8, ,8I  i8'    ,8I         gg,   88        ,8'    8I  I8, ,8I  I8, ,8I ");
	System.out.println ("   \"Yb,,8P       ,d8     I8, `YbadP'            88    88    Y8,_,88,_,dP  ,dP\"Y8,   `YbadP' ,d8,   ,d8b,         \"Yb,,8P       ,dP     Y8, `YbadP'  `YbadP' ");
	System.out.println ("     \"Y8P'       88P     `Y8888P\"Y888           88    88    `Y88P\"\"Y88\"  dP\"   \"Y8 888P\"Y888P\"Y8888P\"`Y8           \"Y8P'       8P      `Y8888P\"Y888888P\"Y888");
	System.out.println ("                                                                                                                                                            ");
    }


    //method for actual task 1, unscramble the words
    public void task1real ()
    {
	//  IO.printSlow ("You walk closer to the tree, and notice a set of letters written on it. \nIt seems as if it is trying to spell something out, but the letters aren't in order.", 50);
	System.out.println ("Hmmm, what word do the letters spell out (it seems as if new words appear everytime you get one right)?");
	int correct = tree (1);
	while (correct != 1)
	{
	    correct += tree (1);
	}
	correct = tree (2);
	while (correct != 1)
	{
	    correct = tree (2);
	}
	correct = tree (3);
	while (correct != 1)
	{
	    correct = tree (3);
	}
	task2 ();
    }


    //method for first word to unscramble
    public void tree1 ()
    {
	System.out.println ("          ");
	System.out.println ("        /|\\                  ");
	System.out.println ("       /*|O\\");
	System.out.println ("      /*/|\\*\\");
	System.out.println ("     /X/O|*\\X\\");
	System.out.println ("    /*/X/|\\X\\*\\");
	System.out.println ("   /O/*/X|*\\O\\X\\             ");
	System.out.println ("  /*/O/X/|\\X\\O\\*\\");
	System.out.println (" /X/O/*/X|O\\X\\*\\O\\");
	System.out.println ("/O/X/*/O/|\\X\\*\\O\\X\\");
	System.out.println ("      |OKOL|      ");
	System.out.println ("      |    |                                                                                                                                                   ");
    }


    public void tree2 ()
    {
	System.out.println ("                                                                                                                                                            ");
	System.out.println ("          ");
	System.out.println ("        /|\\                  ");
	System.out.println ("       /*|O\\");
	System.out.println ("      /*/|\\*\\");
	System.out.println ("     /X/O|*\\X\\");
	System.out.println ("    /*/X/|\\X\\*\\");
	System.out.println ("   /O/*/X|*\\O\\X\\             ");
	System.out.println ("  /*/O/X/|\\X\\O\\*\\");
	System.out.println (" /X/O/*/X|O\\X\\*\\O\\");
	System.out.println ("/O/X/*/O/|\\X\\*\\O\\X\\");
	System.out.println ("      |WOND |      ");
	System.out.println ("      |     |                                                                                                                                                   ");
    }


    public void tree3 ()
    {
	System.out.println ("          ");
	System.out.println ("        /|\\                  ");
	System.out.println ("       /*|O\\");
	System.out.println ("      /*/|\\*\\");
	System.out.println ("     /X/O|*\\X\\");
	System.out.println ("    /*/X/|\\X\\*\\");
	System.out.println ("   /O/*/X|*\\O\\X\\             ");
	System.out.println ("  /*/O/X/|\\X\\O\\*\\");
	System.out.println (" /X/O/*/X|O\\X\\*\\O\\");
	System.out.println ("/O/X/*/O/|\\X\\*\\O\\X\\");
	System.out.println ("      |RNTEE|      ");
	System.out.println ("      |     |      ");
    }


    //method for the actual code for the unscramble the words game
    public int tree (int wordnum)
    {
	int done = 0;
	long start = System.currentTimeMillis ();
	long stop = 0;
	long correct = 0;
	while (done == 0)
	{
	    String message = "RNTEE";
	    if (wordnum == 1)
	    {
		tree1 ();
		message = "OKOL";
	    }
	    else if (wordnum == 2)
	    {
		tree2 ();
		message = "WOND";
	    }
	    else
		tree3 ();

	    String answer = JOptionPane.showInputDialog (message + ":");
	    //Timer
	    //Checks for right scramble answer
	    if ((wordnum == 1 && answer.equalsIgnoreCase ("look")) || (wordnum == 2 && answer.equalsIgnoreCase ("down")) || (wordnum == 3 && answer.equalsIgnoreCase ("enter")))
	    {
		stop = System.currentTimeMillis ();
		correct = stop - start;
		if (correct <= 30000)
		{
		    done = 1;
		    IO.printSlow ("Impressive, you were able to find the answer within " + (correct / 1000) + " seconds. Keep up the good work.");
		}
		else
		{
		    done = 2;
		    IO.printSlow ("You answer, however, you find that the word has disappeared from the tree. It took you too long to answer.");
		}
	    }
	    else
		System.out.println ("That is incorrect.");
	}
	return done;
    }


    //main method for task 2, castle


    //method for if you lose
    public void gameover ()
    {
	System.out.println ("GAME OVER. You are dead.");

	char restart = IO.inputChar ("Would you like to restart the game? (y/n)\n");
	if (restart == 'y')
	    new FiveExtra ();
	else if (restart == 'n')
	{
	    IO.printSlow ("Thanks for playing, we hope you enjoyed Five's journey.");
	    for (int i = 1 ; i < 2 ; i++)
		System.out.println ("This game waas brought to you by the talents of ZalalaZ Productions.");

	}
    }


    //main method for task 2, maze (Castle)
    public void task2 ()
    {
	{
	    Street ();
	    Forest ();
	    Home ();
	    Follow ();
	    Foresttwo ();
	    Hometwo ();
	    //the dragon will be your friend at this point, so you will be able to follow him
	}
    }


    public void Street ()
    {
	System.out.println ("\nYour journey continues. You are on the street. Where do you choose to go next?");
	char where = IO.inputChar ("Walk towards the forest? (y/n) ");
	if (where == 'y')
	    Forest ();
	else
	    Home ();
    }


    public void Forest ()
    {
	System.out.println ("\nYou continue your journey in the forest. Do you choose to:");
	char where = IO.inputChar ("Head back home (a) or Go deeper into the forest (b)");
	if (where == 'a')
	    Street ();
	else if (where == 'b')
	    Foresttwo ();
	else
	    Street ();
    }


    public void Foresttwo ()
    {
	System.out.println ("\nYou venture deeper into the forest. You look back, the Dragon is gone. He was your only source of guidance within the forest.");
	System.out.println ("You are stuck in the forest forever.");
	gameover ();
    }


    public void Home ()
    {
	System.out.println ("\nYou decide to travel towards home. However, being it dark and nighttime, you cannot make out where you are. What do you do?");
	char where = IO.inputChar ("Continue finding your way home (a) or Follow the path the Dragon suggests to take (b)");
	if (where == 'a')
	    Hometwo ();
	else
	    Follow ();

    }


    public void Hometwo ()
    {
	System.out.println ("\nYou choose to ignore the Dragon's advice and follow your own way, you don't trust the Dragon's loyalty.");
	System.out.println ("Lesson 1 of survival: You must trust your allies, and learn to humbly heed their advice. Your lack of vision at night leads you to fall into a pit and die.");
	//add another option into the pit later
	gameover ();
    }


    public void Follow ()
    {
	System.out.println ("\nYou are still afraid of the Dragon, but you choose to follow him. He claims to know where everything is around here, however he still won't tell you his name.");
	//ASCII Art for old man here, leads to riddle (btw dragon's name is 5)
	System.out.println ("\nThe Dragon leads you to someplace you have never seen before. Although you doubt his intentions, you don't hesitate to go wherever he takes you. It's like you have a connection with him, that you don't know about.");
	System.out.println ("\nYou both find this old man. The Dragon says if you want to save your friend and bring him back to life, and be the hero everyone has been waiting for, go to the old man.");
	task3 ();

    }



    //main method for task 3, guessing game
    public void task3 ()
    {

	System.out.println ("The old man turns around, and acknowledges that he has been awaiting your arrival (how does he know your name?)");
	System.out.println ("If you want to save your friend, and save your entire generation from deep despair. \nChoose your number. Choose your fate. What is the number, child?");

	int win = 0;
	int totalAttempts = 0;

	while (totalAttempts < 4 || win == 1)

	    {
		int guess = IO.inputInt ("\nGuess #" + (totalAttempts + 1) + ": ");

		if (guess > 5)
		{
		    totalAttempts++;
		    System.out.println ("Fool. Think harder. Think lower.");
		}
		else if (guess < 5)
		{
		    totalAttempts++;
		    System.out.println ("Fool. Think harder. Think greater.");
		}
		else
		{
		    System.out.println ("Well done, five. I wouldn't have expected any less from my grandson.");
		    win = 1;
		}

		conclusion ();
	    }


	if (totalAttempts > 3)
	{
	    System.out.println ("You are a disgrace to your entire generation. I expected much more from my grandson. NOW YOU DIE.");
	    gameover ();
	}
    }


    //main method for when the user wins the game
    public void conclusion ()
    {
	//add more plot regarding your friend
	System.out.println ("\nYou have saved mankind, and your friend. The dragon bows to you, and finally takes you home.");
	System.out.println ("Thanks for playing! We hope you enjoyed the journey.");
    }


    //method to actually put pictures into the dialogue box
    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = FiveExtra.class.getResource (path);
	if (imgURL != null)
	{
	    return new ImageIcon (imgURL);
	}


	else
	{
	    System.err.println ("Couldn't find file: " + path);
	    return null;
	}
    }
}



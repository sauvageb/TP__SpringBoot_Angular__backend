package fr.traning.book;

import fr.traning.book.repository.entity.Book;
import fr.traning.book.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringbootBackendBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendBookApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(BookRepository bookRepository) {
        return args -> {

            List<Book> bookList = new ArrayList<Book>() {{

                add(
                        Book.builder()
                                .title("Tintin au pays des Soviets")
                                .pictureUrl("https://cdn001.tintin.com/public/tintin/img/static/tintin-au-pays-des-soviets/tintin-au-pays-des-soviets-fr_v2.jpg")
                                .description("Nous sommes le 10 janvier 1929, à Bruxelles. Accompagné de son chien Milou, un tout jeune reporter monte dans le train à destination de Moscou. Pour Tintin, c'est le début d'une grande aventure. Pour Hergé, c'est le vrai début de sa carrière. Les Aventures de Tintin, reporter du Petit Vingtième au pays des Soviets paraîtront sous forme d'album en 1930. Cette année marque la naissance d'un mythe qui n'est pas près de s'éteindre, et les premiers signes d'une troublante confrontation entre la fiction et la réalité")
                                .ISBN("978-2203001008")
                                .nbPages(138)
                                .published(true)
                                .publishingDate(LocalDate.of(1929, 1, 10))
                                .build()

                );

                add(
                        Book.builder()
                                .title("Tintin au Congo")
                                .pictureUrl("https://cdn001.tintin.com/public/tintin/img/static/tintin-au-congo/couverture-tintin-au-congo_v3.jpg")
                                .description("Nous sommes le 5 juin 1930. Les lecteurs du Petit Vingtième sont prévenus : à peine de retour d'Union soviétique, Tintin et Milou embarquent pour le Congo belge. Des textes à la saveur héroïque ont annoncé la chose ; on a même vu Tintin choisir son équipement au département « Congo » des grands magasins « Au Bon Marché ». Toutefois, l'intention d'Hergé était d'envoyer son jeune reporter aux États-Unis. Après la critique du système bolchévique, il s'agissait de montrer les travers du capitalisme à l'américaine.")
                                .ISBN("978-2203001015")
                                .nbPages(62)
                                .published(true)
                                .publishingDate(LocalDate.of(1930, 06, 1))
                                .build()

                );

                add(
                        Book.builder()
                                .title("Tintin en Amérique")
                                .pictureUrl("https://cdn001.tintin.com/public/tintin/img/static/tintin-en-amerique/couverture-tintin-en-amerique.jpg")
                                .description("Dans Tintin en Amérique (1932), le héros confirme sa vocation de redresseur de torts, en s'opposant au mafioso Al Capone, aux gangsters de Chicago et aux fripouilles de tout acabit. Déjà, Hergé témoigne d'une vision généreuse du monde, stigmatisant par exemple des Blancs pour leurs comportements envers les Indiens Peaux-Rouges. La renommée de Tintin s'étend au-delà de l'Atlantique. Si bien que lorsqu'il arrive à Chicago, en pleine prohibition, tous les bandits et malfaiteurs associés lui préparent une réception des moins confortables. Tintin devra user de tout son courage et de toute son intelligence pour survivre !")
                                .ISBN("978-2203001022")
                                .nbPages(123)
                                .published(true)
                                .publishingDate(LocalDate.of(1931, 9, 3))
                                .build()

                );

                add(
                        Book.builder()
                                .title("Les Cigares du Pharaon")
                                .pictureUrl("https://cdn001.tintin.com/public/tintin/img/static/les-cigares-du-pharaon/les-cigares-du-pharaon.png")
                                .description("Quatrième épisode de la série, premier album paru exclusivement chez Casterman (les précédents étaient estampillés Éditions du Petit Vingtième) sous le titre Les aventures de Tintin reporter en Orient, Les Cigares du Pharaon, est sorti à l'automne 1934. Tintin part sur les traces de trafiquants d'opium à travers l'Égypte et l'Inde. Port-Saïd, Le Caire, les pyramides, les tombeaux des pharaons, la mer Rouge, la jungle et ses éléphants... Tintin va vivre des aventures peu banales : il tente d'échapper au poison qui rend fou, rencontre un archéologue extravagant, un Maharadja en danger de mort...")
                                .ISBN("978-2203001039")
                                .nbPages(127)
                                .published(true)
                                .publishingDate(LocalDate.of(1934, 1, 1))
                                .build()

                );

                add(
                        Book.builder()
                                .title("Le Lotus bleu")
                                .pictureUrl("https://cdn001.tintin.com/public/tintin/img/static/le-lotus-bleu/le-lotus-bleu-fr.jpg")
                                .description("Dans Le Lotus bleu (1936) Tintin s'engage à démanteler le trafic d'opium international qui sévit dans un pays mythique certes, mais dont il ignore tout, la Chine. À l'aube de ce récit, la généreuse ambition de Tintin semble démesurée. Aidé par la seule société secrète, Les Fils du Dragon, et par son ami Tchang, rencontré tardivement, il parvient à surmonter tous les obstacles et ruiner les perfides machinations de ses nombreux ennemis.")
                                .ISBN("978-2203001046")
                                .nbPages(115)
                                .published(true)
                                .publishingDate(LocalDate.of(1935, 10, 17))
                                .build()

                );

                add(
                        Book.builder()
                                .title("L'Oreille cassée")
                                .pictureUrl("https://cdn001.tintin.com/public/tintin/img/static/l-oreille-cassee/l-oreile-cassee-fr.jpg")
                                .description("L'Oreille Cassée (1937) est une course poursuite palpitante. Tintin s'embarque pour l'Amérique du Sud afin de récupérer un fétiche volé. Là-bas s'opposent toutes sortes d'intérêts : militaires, économiques, la guerre du Gran Chaco venant d'opposer, trois ans durant, la Bolivie et le Paraguay. Une statuette Arumbaya est volée... puis restituée à son musée. Mais un détail révèle à Tintin que ce n'est pas l'original qui a été rendu, mais une simple réplique. Quel mystère cache donc cette statuette pour que l'on veuille en maquiller le vol ? Tintin s'embarque pour l'Amérique du Sud où, croit-il, se trouve la clef de cette énigme.")
                                .ISBN("978-2203001053")
                                .nbPages(128)
                                .published(true)
                                .publishingDate(LocalDate.of(1935, 12, 5))
                                .build()

                );

                add(
                        Book.builder()
                                .title("L'Île Noire")
                                .pictureUrl("https://cdn001.tintin.com/public/tintin/img/static/l-ile-noire/l-ile-noire-fr.jpg")
                                .description("De retour d'Amérique du Sud, Tintin s'embarque dans une aventure britannique palpitante, rythmée par d'incessants rebondissements. Pour la première fois et non la dernière, Tintin s'oppose au fourbe Docteur Müller. Ce dernier a organisé, à l'échelle européenne, un vaste trafic de fausse monnaie. Après bien des péripéties, Tintin réussira-t-il à le démanteler ?")
                                .ISBN("978-2203001060")
                                .nbPages(124)
                                .published(true)
                                .publishingDate(LocalDate.of(1937, 04, 15))
                                .build()

                );

                add(
                        Book.builder()
                                .title("Le Sceptre d'Ottokar")
                                .pictureUrl("https://cdn001.tintin.com/public/tintin/img/static/le-sceptre-d-ottokar/le-sceptre-d-ottokar-fr.jpg")
                                .description("Le Sceptre d'Ottokar (1939) est un coup de force d'Hergé qui vise l'Allemagne dans cette aventure. La découverte d'une serviette oubliée sur un banc conduit Tintin à Prague, puis en Syldavie. Tintin va sauver la Syldavie et son Royaume d'un coup d'État fasciste.")
                                .ISBN("978-2203001077")
                                .nbPages(108)
                                .published(true)
                                .publishingDate(LocalDate.of(1938, 8, 4))
                                .build()

                );

                add(
                        Book.builder()
                                .title("Le Crabe aux pinces d'or")
                                .pictureUrl("https://cdn001.tintin.com/public/tintin/img/static/le-crabe-aux-pinces-d-or/le-crabe-aux-pinces-d-or-fr.jpg")
                                .description("Le Crabe aux pinces d'or (1941) renoue avec l'aventure exotique. Celle-ci mène Tintin en Afrique du Nord. Il y déjoue les plans d'une bande de malfaiteurs qui dissimulaient de l'opium dans des boîtes de crabe. Avec l'apparition du Capitaine Haddock, nous découvrons un nouvel art de s'exprimer qui ne manque pas de piment et de sonorité. Parmi eux, l'un des plus inattendus est à coup sûr \"végétarien\"")
                                .ISBN("978-2203001855")
                                .nbPages(105)
                                .published(true)
                                .publishingDate(LocalDate.of(1940, 10, 17))
                                .build()

                );

                add(
                        Book.builder()
                                .title("L'Étoile mystérieuse")
                                .pictureUrl("https://cdn001.tintin.com/public/tintin/img/static/l-etoile-mysterieuse/l-etoile-mysterieuse-fr.jpg")
                                .description("À bord d'un navire polaire dont le capitaine Haddock assure le commandement, Tintin et quelques savants européens partent pour l'océan Arctique, où s'est écrasé un aérolithe contenant un métal inconnu. Mais dès qu'ils apprennent qu'un autre navire fait également route vers l'étrange météorite, leur expédition se transforme en une véritable course contre la montre.")
                                .ISBN("978-2203001091")
                                .nbPages(62)
                                .published(true)
                                .publishingDate(LocalDate.of(1941, 10, 20))
                                .build()

                );


                add(
                        Book.builder()
                                .title("Le Secret de La Licorne")
                                .pictureUrl("https://cdn001.tintin.com/public/tintin/img/static/le-secret-de-la-licorne/le-secret-de-la-licorne-fr.jpg")
                                .description("En fouillant le grenier, le capitaine Haddock retrouve la trace de son ancêtre, le chevalier de Hadoque. Ce légendaire loup des mers s'est rendu célèbre par ses déboires avec le cruel pirate Rackham le Rouge. Un roman maritime de plus ? Certainement pas ! Car le chevalier devient le dépositaire d'un fabuleux trésor. Pour Tintin, Haddock et une série de malfrats, il s'agit de le retrouver. Mais les pistes et les énigmes se multiplient.")
                                .published(true)
                                .build()

                );

                add(
                        Book.builder()
                                .title("Le Trésor de Rackham le Rouge")
                                .pictureUrl("https://cdn001.tintin.com/public/tintin/img/static/le-tresor-de-rackham-le-rouge/le-tresor-de-rackham-le-rouge-fr.jpg")
                                .description("Dans Le Secret de La Licorne (1943) et Le Trésor de Rackham le Rouge (1944) qui en est la suite, Tintin accompagne le capitaine Haddock sur les traces de son glorieux ancêtre, le chevalier François de Hadoque. Inventeur d'un sous-marin de poche en forme de requin, un certain Tryphon Tournesol contribue à la découverte du trésor, avant d'offrir au Capitaine le château de ses aïeux : Moulinsart.")
                                .published(true)
                                .build()

                );

                add(
                        Book.builder()
                                .title("Les 7 Boules de cristal")
                                .pictureUrl("https://cdn001.tintin.com/public/tintin/img/static/les-7-boules-de-cristal/les-7-boules-de-cristal-fr.jpg")
                                .description("Dans Les 7 Boules de cristal (1948), sept savants sont mystérieusement frappés de léthargie à leur retour d'une expédition dans les Andes. Le professeur Tournesol ayant disparu, Tintin et le Capitaine partent à sa recherche. Créé en 1929 par un certain Georges Remi, qui signait d'ores et déjà ses dessins du nom d'Hergé, Tintin connaîtra vingt-trois aventures dont, jusqu'à présent, le succès auprès des jeunes de 7 à 77 ans ne s'est jamais démenti.")
                                .published(true)
                                .build()

                );

                add(
                        Book.builder()
                                .title("Le Temple du Soleil")
                                .pictureUrl("https://cdn001.tintin.com/public/tintin/img/static/le-temple-du-soleil/le-temple-du-soleil-fr.jpg")
                                .description("Dans Le Temple du Soleil (1949), Tintin, Milou et le Capitaine Haddock s'envolent pour le Pérou à la recherche du professeur Tournesol, enlevé pour avoir involontairement commis un sacrilège qui le destine au châtiment suprême.")
                                .published(true)
                                .build()

                );

                add(
                        Book.builder()
                                .title("Tintin au pays de l'or noir")
                                .pictureUrl("https://cdn001.tintin.com/public/tintin/img/static/tintin-au-pays-de-l-or-noir/tintin-au-pays-de-l-or-noir-fr.jpg")
                                .description("La guerre a brutalement interrompu la prépublication de cette aventure, le 9 mai 1940. À cette époque, ni le capitaine Haddock, ni le professeur Tournesol, ni le château de Moulinsart n'avaient rejoint la saga tintinesque. Huit ans plus tard, le Journal Tintin publie à nouveau cet épisode. Avec un humour génial, Hergé va réintégrer les absents de jadis dans la refonte de l'aventure qu'il entreprend d'achever. En 1950, l'album est publié. Mais le monde change, aussi en conformité avec l'actualité, une nouvelle version, quelque peu modifiée, sera proposée au public en 1971.")
                                .published(true)
                                .build()

                );

                add(
                        Book.builder()
                                .title("Objectif Lune")
                                .description("Dans Objectif Lune (1953), le Professeur Tournesol invite Tintin et le Capitaine Haddock à le rejoindre en Syldavie où il travaille sur le plus grand projet du siècle : l'envoi d'une fusée sur la Lune. Le défi s'annonce palpitant, d'autant plus qu'au grand effarement du Capitaine, le Professeur leur suggère d'être du voyage !")
                                .pictureUrl("https://cdn001.tintin.com/public/tintin/img/static/objectif-lune/objectif-lune-fr.jpg")
                                .published(true)
                                .build()

                );

                add(
                        Book.builder()
                                .title("On a marché sur la Lune")
                                .description("Cet album, d'une exactitude prophétique, poursuit l'aventure lunaire initiée dans Objectif Lune. Hergé repousse sans cesse les limites scénaristiques et envoie cette fois ses héros dans l'espace. Si aujourd'hui aller dans l'espace est presque une routine, au début des années cinquante, imaginer un tel récit relevait de la science-fiction. En effet, il est important de se rappeler que l'album fut publié en 1954 alors qu'Armstrong ne fît le premier pas sur la Lune qu'en 1969.")
                                .pictureUrl("https://cdn001.tintin.com/public/tintin/img/static/on-a-marche-sur-la-lune/on-a-marche-sur-la-lune.jpg")
                                .published(true)
                                .build()

                );

                add(
                        Book.builder()
                                .title("L'Affaire Tournesol")
                                .description("Une sensationnelle invention du professeur Tournesol commence par provoquer des catastrophes au château de Moulinsart : toutes les vitres volent en éclat, ainsi que la plupart des objets en verre! Malheureusement, cette trouvaille ne rejoindra pas le rayon des farces et attrapes. Des espions tentent de s'emparer de Tournesol pour lui soutirer ses plans. Il apparaît que les kidnappeurs sont des Bordures, éternels ennemis des Syldaves et bien décidés à transformer l'invention de Tournesol en arme de destruction massive.")
                                .pictureUrl("https://cdn001.tintin.com/public/tintin/img/static/l-affaire-tournesol/l-affaire-tournesol-fr.jpg")
                                .published(true)
                                .build()

                );

                add(
                        Book.builder()
                                .title("Coke en stock")
                                .description("Coke en stock met en lumière les pratiques scandaleuses des esclavagistes des temps modernes. L'incrédulité du capitaine Haddock n'y changera rien. Le trafic d'êtres humains, cela existait encore au vingtième siècle. Au vingt-et-unième aussi, hélas. Comme pour bien d'autres questions graves, Hergé fut sensible à cette dramatique actualité et la transposa dans une fiction pleine de rebondissements.")
                                .pictureUrl("https://cdn001.tintin.com/public/tintin/img/static/coke-en-stock/coke-en-stock-fr.jpg")
                                .published(true)
                                .build()

                );

                add(
                        Book.builder()
                                .title("Tintin au Tibet")
                                .description("Tintin au Tibet (1960), pure histoire d'amitié, sans le moindre méchant, décrit la recherche désespérée de Tintin pour retrouver son ami, le jeune Chinois Tchang, qui se rendait en Europe à bord d'un avion de ligne qui s'est écrasé dans l'Himalaya. Ce récit pathétique, qui rompt avec le ton extraverti des épisodes précédents, démontre que la fidélité et l'espoir sont capables de vaincre tous les obstacles, et que les préjugés - en l'occurrence, à l'égard de l'\"abominable homme des neiges\" - sont bien souvent le fruit de l'ignorance.")
                                .pictureUrl("https://cdn001.tintin.com/public/tintin/img/static/tintin-au-tibet/tintin-au-tibet-cover-fr.jpg")
                                .published(true)
                                .build()

                );

                add(
                        Book.builder()
                                .title("Les Bijoux de la Castafiore")
                                .description("Dans Les Bijoux de la Castafiore (1963), les principaux protagonistes de la série se retrouvent à Moulinsart pour y vivre une véritable comédie classique à huis clos. Tournant résolument le dos à l'aventure pour s'attacher à la difficulté de la communication entre les êtres, un \" anti - récit\" truffé de malentendus et de quiproquos plus cocasses les uns que les autres.")
                                .pictureUrl("https://cdn001.tintin.com/public/tintin/img/static/les-bijoux-de-la-castafiore/les-bijoux-de-la-castafiore-fr.jpg")
                                .published(true)
                                .build()

                );

                add(
                        Book.builder()
                                .title("Vol 714 pour Sydney")
                                .description("Vol 714 pour Sydney (1968), c'est le voyage interrompu, le détournement qui bouleverse tout, l'incursion de Tintin et de ses compagnons dans l'inconnu, dans un monde irréel animé par des phénomènes télépathiques, c'est le contact incroyable avec des extra-terrestres et la sortie d'un rêve... Mais en est-ce bien un ? Djakarta, dernière escale avant Sydney pour le Boeing du vol 714.")
                                .pictureUrl("https://cdn001.tintin.com/public/tintin/img/static/vol-714-pour-sydney/vol-714-pour-sydney-fr.jpg")
                                .published(true)
                                .build()

                );

                add(
                        Book.builder()
                                .title("Tintin et les Picaros")
                                .description("Dernier album achevé du maître dont l’écriture et la mise en forme auront pris plus de dix ans. L'attente du lecteur se fait de plus en plus longue entre chaque nouvelle aventure. Sombre histoire de vengeance avec prise d’otages sur fond de guérilla, Tintin et les Picaros (1976) marque le retour de Tintin au San Theodoros, le pays de L’Oreille Cassée. Hergé y risque un constat doux amer, tendant à faire croire que tout en ce monde n’est que mascarade.")
                                .pictureUrl("https://cdn001.tintin.com/public/tintin/img/static/tintin-et-les-picaros/tintin-et-les-picaros-fr.jpg")
                                .published(true)
                                .build()

                );

                add(
                        Book.builder()
                                .title("Tintin et l’Alph-Art")
                                .description("Resté inachevé à la mort d’Hergé, en 1983, Tintin et l'Alph-Art (1986) devait décrire les milieux des sectes, et amener Tintin à s'immiscer dans un monde qu’affectionnait Georges Remi, dit Hergé : celui de l’art contemporain, celui de l’avant-garde... Si cet album posthume ne peut qu’évoquer la trame de ce récit suspendu, il est en revanche le témoignage de l’état pur de l’extraordinaire talent narratif et graphique du père de Tintin. Comme cette aventure, comme Tintin, nous aussi, lecteurs, nous restons magiquement suspendus à la plume d’Hergé.")
                                .pictureUrl("https://cdn001.tintin.com/public/tintin/img/static/tintin-et-l-alph-art/tintin-et-l-alph-art-fr.jpg")
                                .published(true)
                                .build()

                );


                // Oeuvre inachevée/non publiée
                add(
                        Book.builder()
                                .title("Tintin et le Thermozéro")
                                .pictureUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Logo_Tintin_et_le_Thermoz%C3%A9ro.svg/700px-Logo_Tintin_et_le_Thermoz%C3%A9ro.svg.png")
                                .description("Tintin et le Thermozéro est une œuvre inachevée de Hergé, une aventure de Tintin et Milou. Elle est issue d'une réflexion sur un scénario inabouti Tintin et la Piste indienne repris par Greg pour donner un récit intitulé Les Pillules[réf. nécessaire] avant de devenir le Thermozéro et finalement être abandonnée.")
                                .published(false)
                                .publishingDate(LocalDate.of(1960, 1, 1))
                                .build()

                );


            }};

            bookList.forEach(book -> bookRepository.save(book));
        };
    }
}

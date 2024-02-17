package com.github.alexthe666.iceandfire;

import net.minecraftforge.common.config.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IceAndFireConfig {
    public boolean customMainMenu = true;
    public boolean useVanillaFont = false;
    public boolean logCascadingWorldGen = false;
    public boolean generateSilverOre = true;
    public boolean generateSapphireOre = true;
    public boolean generateCopperOre = true;
    public boolean generateAmythestOre = true;
    public boolean generateDragonSkeletons = true;
    public int generateDragonSkeletonChance = 300;
    public int worldGenDistance = 300;
    public boolean generateDragonDens = true;
    public int generateDragonDenChance = 180;
    public boolean generateDragonRoosts = true;
    public int generateDragonRoostChance = 360;
    public int dragonDenGoldAmount = 4;
    public boolean generateSnowVillages = true;
    public int generateSnowVillageChance = 100;
    public int dangerousWorldGenDistanceLimit = 200;
    public int[] dragonBlacklistedDimensions = new int[]{1, -1};
    public int[] dragonWhitelistedDimensions = new int[]{0};
    public boolean useDimensionBlackList = false;
    public int[] structureBlacklistedDimensions = new int[]{1, -1};
    public int[] structureWhitelistedDimensions = new int[]{0};
    public String[] blacklistedBreakBlocks = new String[0];
    public String[] noDropBreakBlocks = new String[]{"minecraft:stone", "minecraft:dirt", "minecraft:grass"};
    public boolean blacklistBreakBlocksIsWhiteList = false;
    public boolean spawnGlaciers = true;
    public int glacierSpawnChance = 4;
    public int oreToStoneRatioForDragonCaves = 45;
    public int dragonEggTime = 7200;
    public int dragonGriefing = 0;
    public boolean tamedDragonGriefing = true;
    public int dragonFlapNoiseDistance = 4;
    public int dragonFluteDistance = 8;
    public int dragonHealth = 500;
    public float lightningDragonHealAmount = 15;
    public int dragonAttackDamage = 17;
    public double dragonAttackDamageFire = 2;
    public double dragonAttackDamageIce = 2.5;
    public double dragonAttackDamageLightning = 3.5;
    public int maxDragonFlight = 128;
    public int dragonGoldSearchLength = 30;
    public boolean canDragonsDespawn = true;
    public boolean doDragonsSleep = true;
    public boolean dragonDigWhenStuck = true;
    public int dragonBreakBlockCooldown = 5;
    public boolean dragonDropSkull = true;
    public boolean dragonDropHeart = true;
    public boolean dragonDropBlood = true;
    public int dragonTargetSearchLength = 128;
    public int dragonWanderFromHomeDistance = 40;
    public int dragonHungerTickRate = 3000;
    public float dragonFlightChance = 0.000666F;

    public String[] dragonIceImmuneEntities = new String[0];
    public String[] dragonFireImmuneEntities = new String[0];
    public String[] dragonLightningImmuneEntities = new String[0];
    public String[] stoneImmuneEntities = new String[0];
    public String[] chainImmuneEntities = new String[0];
    public boolean spawnHippogryphs = true;
    public int hippogryphSpawnRate = 2;
    public float hippogryphFlightSpeed = 1;
    public String hippogryphTameItem = "minecraft:rabbit_foot";
    public boolean spawnGorgons = true;
    public int spawnGorgonsChance = 75;
    public double gorgonMaxHealth = 100D;
    public boolean spawnPixies = true;
    public int spawnPixiesChance = 60;
    public int pixieVillageSize = 5;
    public String[] pixieVillageBiomeBlacklist = {};
    public boolean pixieVillageBiomeBlacklistIsWhitelist = false;
    public boolean pixiesStealItems = true;
    public boolean generateCyclopsCaves = true;
    public boolean generateWanderingCyclops = true;
    public int spawnWanderingCyclopsChance = 900;
    public int spawnCyclopsCaveChance = 170;
    public int cyclopesSheepSearchLength = 17;
    public double cyclopsMaxHealth = 150;
    public double cyclopsAttackStrength = 15;
    public double cyclopsBiteStrength = 40;
    public boolean cyclopsGriefing = true;
    public double sirenMaxHealth = 50D;
    public boolean generateSirenIslands = true;
    public boolean sirenShader = true;
    public int sirenMaxSingTime = 12000;
    public int sirenTimeBetweenSongs = 2000;
    public int generateSirenChance = 300;
    public List<String> sirenFluteMobBlacklist = new ArrayList<>();
    public boolean spawnHippocampus = true;
    public int hippocampusSpawnChance = 70;
    public String hippocampusTameItem = "minecraft:prismarine_crystals";
    public int deathWormTargetSearchLength = 64;
    public double deathWormMaxHealth = 10D;
    public double deathWormAttackStrength = 3D;
    public boolean spawnDeathWorm = true;
    public boolean deathWormAttackMonsters = true;
    public int deathWormSpawnRate = 2;
    public int deathWormSpawnCheckChance = 3;
    public int cockatriceChickenSearchLength = 32;
    public int cockatriceEggChance = 30;
    public double cockatriceMaxHealth = 40.0D;
    public boolean chickensLayRottenEggs = true;
    public boolean spawnCockatrices = true;
    public int cockatriceSpawnRate = 4;
    public int cockatriceSpawnCheckChance = 0;
    public int stymphalianBirdTargetSearchLength = 64;
    public int stymphalianBirdFeatherDropChance = 25;
    public float stymphalianBirdFeatherAttackStength = 1F;
    public int stymphalianBirdFlockLength = 40;
    public int stymphalianBirdFlightHeight = 80;
    public boolean spawnStymphalianBirds = true;
    public boolean stymphalianBirdsOreDictDrops = true;
    public boolean stympahlianBirdAttackAnimals = false;
    public int stymphalianBirdSpawnChance = 100;
    public boolean spawnTrolls = true;
    public int trollSpawnRate = 60;
    public int trollSpawnCheckChance = 1;
    public boolean trollsDropWeapon = true;
    public double trollMaxHealth = 50;
    public double trollAttackStrength = 10;
    public boolean villagersFearDragons = true;
    public boolean animalsFearDragons = true;
    public boolean generateMyrmexColonies = true;
    public int myrmexPregnantTicks = 2500;
    public int myrmexEggTicks = 3000;
    public int myrmexLarvaTicks = 35000;
    public int myrmexColonyGenChance = 150;
    public int myrmexColonySize = 80;
    public double myrmexBaseAttackStrength = 3.0D;
    public String[] myrmexJungleRepItems = new String[] { "iceandfire:myrmex_jungle_resin 5" };
    public String[] myrmexDesertRepItems = new String[] { "iceandfire:myrmex_desert_resin 5" };
    public boolean experimentalPathFinder;
    public boolean spawnAmphitheres = true;
    public int amphithereSpawnRate = 5;
    public float amphithereVillagerSearchLength = 64;
    public int amphithereTameTime = 400;
    public float amphithereFlightSpeed = 1.75F;
    public double amphithereMaxHealth = 50D;
    public double amphithereAttackStrength = 7D;
    public boolean spawnSeaSerpents = true;
    public int seaSerpentSpawnChance = 200;
    public boolean seaSerpentGriefing = true;
    public double seaSerpentBaseHealth = 20D;
    public double seaSerpentAttackStrength = 4D;
    public double dragonsteelBaseDamage = 25F;
    public int dragonsteelBaseArmor = 12;
    public int dragonsteelBaseDurability = 8000;
    public boolean dragonsteelKnockback = true;
    public boolean spawnStructuresOnSuperflat = true;
    public boolean dragonMovedWronglyFix = false;
    public int dreadlandsDimensionId = -12;
    public boolean weezerTinkers = true;
    public double dragonBlockBreakingDropChance = 0.1D;
    public boolean completeDragonPathfinding = false;
    public boolean dragonAuto3rdPerson = true;
    public double dreadQueenMaxHealth = 750;
    public String[] dreadGang = new String[0];
    public boolean generateMausoleums = true;
    public int generateMausoleumChance = 1800;
    public boolean spawnLiches = true;
    public int lichSpawnRate = 2;
    public double hydraMaxHealth = 250D;
    public boolean generateHydraCaves = true;
    public int generateHydraChance = 200;
    public boolean explosiveDragonBreath = false;
    public float weezerTinkersDisarmChance = 0.2F;
    public boolean chunkLoadSummonCrystal = true;
    public int ballistaBaseDamage = 10;
    public double ghostMaxHealth = 30;
    public double ghostAttackStrength = 3F;
    public boolean generateGraveyards = true;
    public int generateGraveyardChance = 256;
    public boolean ghostSpawnFromPlayerDeaths = true;
    public int ghostSpawnChanceFromGraveyardSoil = 9;
    public String villagerTradingItem = "iceandfire:sapphire_gem"; // TODO make trading item configurable

    public void init(Configuration config) {
        this.customMainMenu = config.getBoolean("Custom main menu", "all", true, "Whether to display the dragon on the main menu or not");
        this.useVanillaFont = config.getBoolean("Use Vanilla Font", "all", false, "Whether to use the vanilla font in the bestiary or not");
        this.generateSilverOre = config.getBoolean("Generate Silver Ore", "all", true, "Whether to generate silver ore or not");
        this.generateCopperOre = config.getBoolean("Generate Copper Ore", "all", true, "Whether to generate copper ore or not");
        this.logCascadingWorldGen = config.getBoolean("Log Cascading World Gen", "all", false, "Whether to log cascading world gen lag. We hope to fix all cascading lag in the future, but the server console spam is over the top.");
        this.worldGenDistance = config.getInt("World Gen Distance", "all", 150, 0, Integer.MAX_VALUE, "How far apart dragon dens, cyclops caves, gorgon temples etc should spawn apart from eachother (this is kept seperate for each type: a dragon roost can still spawn next to a myrmex hive)");
        this.generateSapphireOre = config.getBoolean("Generate Sapphire Ore", "all", true, "Whether to generate sapphire ore or not");
        this.generateAmythestOre = config.getBoolean("Generate Amythest Ore", "all", true, "Whether to generate amythest ore or not");
        this.generateDragonSkeletons = config.getBoolean("Generate Dragon Skeletons", "all", true, "Whether to generate dragon skeletons or not");
        this.generateDragonSkeletonChance = config.getInt("Generate Dragon Skeleton Chance", "all", 300, 1, 10000, "1 out of this number chance per chunk for generation");
        this.generateDragonDens = config.getBoolean("Generate Dragon Caves", "all", true, "Whether to generate dragon caves or not");
        this.generateDragonDenChance = config.getInt("Generate Dragon Cave Chance", "all", 180, 1, 10000, "1 out of this number chance per chunk for generation");
        this.generateDragonRoosts = config.getBoolean("Generate Dragon Roosts", "all", true, "Whether to generate dragon roosts or not");
        this.generateDragonRoostChance = config.getInt("Generate Dragon Roost Chance", "all", 360, 1, 10000, "1 out of this number chance per chunk for generation");
        this.dragonDenGoldAmount = config.getInt("Dragon Den Gold Amount", "all", 4, 1, 10000, "1 out of this number chance per block that gold will generate in dragon lairs.");
        this.generateSnowVillages = config.getBoolean("Generate Snow Villages", "all", true, "Whether to generate snow villages or not");
        this.generateSnowVillageChance = config.getInt("Generate Snow Village Chance", "all", 100, 1, 10000, "1 out of this number chance per chunk for generation");
        this.generateSnowVillages = config.getBoolean("Generate Snow Villages", "all", true, "Whether to generate snow villages or not");
        this.dragonBlacklistedDimensions = config.get("all", "Blacklisted Dragon Dimensions", new int[]{-1, 1}, "Dragons cannot spawn in these dimensions' IDs").getIntList();
        this.dragonWhitelistedDimensions = config.get("all", "Whitelisted Dragon Dimensions", new int[]{0}, "Dragons can only spawn in these dimensions' IDs").getIntList();
        this.useDimensionBlackList = config.getBoolean("use Dimension Blacklist", "all", false, "true to use dimensional blacklist, false to use the whitelist.");
        this.structureBlacklistedDimensions = config.get("all", "Blacklisted Misc. Structure Dimensions", new int[]{-1, 1}, "Misc Structures(Cyclops caves, Gorgon temples, etc) cannot spawn in these dimensions' IDs").getIntList();
        this.structureWhitelistedDimensions = config.get("all", "Whitelisted Misc. Structure Dimensions", new int[]{0}, "Misc Structures(Cyclops caves, Gorgon temples, etc) can only spawn in these dimensions' IDs").getIntList();
        this.spawnGlaciers = config.getBoolean("Generate Glaciers", "all", true, "Whether to generate glacier biomes or not");
        this.glacierSpawnChance = config.getInt("Glacier Spawn Weight", "all", 4, 1, 10000, "Glacier Spawn Weight. Higher number = more common");
        this.oreToStoneRatioForDragonCaves = config.getInt("Dragon Cave Ore Ratio", "all", 45, 1, 10000, "Ratio of Stone(this number) to Ores in Dragon Caves");
        this.dangerousWorldGenDistanceLimit = config.getInt("Dangerous World Gen Distance From Spawn", "all", 200, 0, Integer.MAX_VALUE, "How many blocks away does dangerous(dragons, cyclops, etc.) world gen have to generate from spawn");
        this.spawnStructuresOnSuperflat = config.getBoolean("Generate All Structures on Superflat", "all", true, "Whether to generate structures or mobs on superflat worlds");
        this.dragonBlockBreakingDropChance = config.getFloat("Dragon Block Breaking Drop Chance", "all", 0.1F, 0.0F, 1.0F, "The percentage chance for a block to drop as an item when a dragon breaks it.");
        this.dragonEggTime = config.getInt("Dragon Egg Hatch Time", "all", 7200, 1, Integer.MAX_VALUE, "How long it takes(in ticks) for a dragon egg to hatch");
        this.dragonGriefing = config.getInt("Dragon Griefing", "all", 0, 0, 2, "Dragon griefing - 2 is no griefing, 1 is breaking weak blocks, 0 is default");
        this.tamedDragonGriefing = config.getBoolean("Tamed Dragon Griefing", "all", true, "True if tamed dragons can follow the griefing rules.");
        this.dragonFlapNoiseDistance = config.getInt("Dragon Flap Noise Distance", "all", 4, 0, 10000, "Dragon Flap Noise Distance - Larger number, further away you can hear it");
        this.dragonFluteDistance = config.getInt("Dragon Flute Distance", "all", 4, 0, 10000, "Dragon Flute Distance - how many chunks away is the dragon flute effective?");
        this.dragonHealth = config.getInt("Dragon Health", "all", 500, 1, 100000, "Max dragon health. Health is scaled to this");
        this.lightningDragonHealAmount = config.getInt("Lightning Dragon Healing Amount", "all", 15, 0, 100000, "The amount of health lightning dragons heal when they get hit by a lightning bolt.");  
        this.dragonAttackDamage = config.getInt("Dragon Attack Damage", "all", 17, 1, 10000, "Max dragon attack damage. Attack Damage is scaled to this");
        this.dragonAttackDamageFire = config.getFloat("Dragon Attack Damage(Fire breath)", "all", 2.0F, 0, 10000, "Damage dealt from a successful fire breath attack. Attack Damage is scaled to by age, so a stage 5 dragon will deal 5x as much as this number");
        this.dragonAttackDamageIce = config.getFloat("Dragon Attack Damage(Ice breath)", "all", 2.5F, 0, 10000, "Damage dealt from a successful ice breath attack. Attack Damage is scaled to by age, so a stage 5 dragon will deal 5x as much as this number");
        this.dragonAttackDamageLightning = config.getFloat("Dragon Attack Damage(Lightning breath)", "all", 3.5F, 0, 10000, "Damage dealt from a successful lightning breath attack. Attack Damage is scaled to by age, so a stage 5 dragon will deal 5x as much as this number");
        this.maxDragonFlight = config.getInt("Max Dragon Flight Height", "all", 128, 100, Integer.MAX_VALUE, "How high dragons can fly, in Y height.");
        this.dragonGoldSearchLength = config.getInt("Dragon Gold Search Length", "all", 30, 0, 10000, "How far away dragons will detect gold blocks being destroyed or chests being opened");
        this.canDragonsDespawn = config.getBoolean("Dragons Despawn", "all", true, "True if dragons can despawn. Note that if this is false there may be SERIOUS lag issues.");
        this.doDragonsSleep = config.getBoolean("Tamed Dragons Sleep", "all", true, "True if tamed dragons go to sleep at night.");
        this.dragonDigWhenStuck = config.getBoolean("Dragons Dig When Stuck", "all", true, "True if dragons can break blocks if they get stuck. Turn this off if your dragons randomly explode.");
        this.dragonDropSkull = config.getBoolean("Dragons Drop Skull", "all", true, "True if dragons can drop their skull on death.");
        this.dragonDropHeart = config.getBoolean("Dragons Drop Heart", "all", true, "True if dragons can drop their heart on death.");
        this.dragonDropBlood = config.getBoolean("Dragons Drop Blood", "all", true, "True if dragons can drop their blood on death.");
        this.explosiveDragonBreath = config.getBoolean("Explosive Dragon Breath", "all", false, "True if dragons fire/ice/lightning charges create secondary explosions that launch blocks everywhere. Turn this to true if you like unfair explosions. Or lag.");
        this.dragonTargetSearchLength = config.getInt("Dragon Target Search Length", "all", 128, 1, 10000, "How many blocks away can dragons spot potential prey. Note that increasing this could cause lag.");
        this.dragonWanderFromHomeDistance = config.getInt("Dragon Wander From Home Distance", "all", 40, 1, 10000, "How many blocks away can dragons wander from their defined \"home\" position.");
        this.dragonHungerTickRate = config.getInt("Dragon Hunger Tick Rate", "all", 3000, 1, 10000, "Every interval of this number in ticks, dragon hunger decreases.");
        this.dragonFlightChance = config.getFloat("Dragon Flight Chance Per Tick", "all", 0.000666F, 0F, 1F, "Every tick a RNG decides whether this dragon should start flying or not, based on this chance");
	    this.dragonIceImmuneEntities = config.getStringList("Entities immune to dragon ice", "all", new String[0], "Entities listed here will not be affected by dragon ice freezing");
	    this.dragonFireImmuneEntities = config.getStringList("Entities immune to dragon fire", "all", new String[0], "Entities listed here will not be affected by dragon fire burning");
	    this.dragonLightningImmuneEntities = config.getStringList("Entities immune to dragon lightning", "all", new String[0], "Entities listed here will not be affected by dragon lightning electrocuting");
	    this.stoneImmuneEntities = config.getStringList("Entities immune to being turned to stone", "all", new String[0], "Entities listed here will never be turned to stone");
	    this.chainImmuneEntities = config.getStringList("Entities immune to being tied to a chain", "all", new String[0], "Entities listed here can't be tied to chains");
	    this.dragonBreakBlockCooldown = config.getInt("Dragon Block Break Cooldown", "all", 5, 0, 10000, "Every interval of this number in ticks, dragon allowed to break blocks.");
        this.villagersFearDragons = config.getBoolean("Villagers Fear Dragons", "all", true, "True if villagers should run away and hide from dragons and other hostile Ice and Fire mobs.");
        this.animalsFearDragons = config.getBoolean("Animals Fear Dragons", "all", true, "True if animals should run away and hide from dragons and other hostile Ice and Fire mobs.");
        this.blacklistedBreakBlocks = config.getStringList("Blacklisted Blocks from Dragon", "all", new String[0], "Blacklist for blocks that dragons are not to break or burn. Ex. \"minecraft:sponge\" or \"rats:rat_crafting_table\"");
        this.noDropBreakBlocks = config.getStringList("No-Drop Blocks from Dragon Block Breaking", "all", new String[]{"minecraft:stone", "minecraft:dirt", "minecraft:grass"}, "Blocks that will not drop as items when broken by a dragon. Ex. \"minecraft:chest\" or \"rats:rat_crafting_table\"");
        this.blacklistBreakBlocksIsWhiteList = config.getBoolean("Blacklisted Blocks from Dragon is a Whitelist", "all", false, "If true, then the blacklist will act as a whitelist.");
        this.completeDragonPathfinding = config.getBoolean("Intelligent Dragon Pathfinding", "all", false, "A more intelligent dragon pathfinding system, but is also laggier. Turn this on if you think dragons are too stupid.");
        this.dragonAuto3rdPerson = config.getBoolean("Auto 3rd person when riding dragon", "all", true, "True if riding dragons should make the player take a 3rd person view automatically.");

        this.spawnHippogryphs = config.getBoolean("Spawn Hippogryphs", "all", true, "True if hippogryphs are allowed to spawn");
        this.hippogryphSpawnRate = config.getInt("Hippogryph Spawn Weight", "all", 2, 1, 10000, "Hippogryph spawn weight. Lower = lower chance to spawn.");
        this.hippogryphFlightSpeed = config.getFloat("Hippogryph Flight Speed", "all", 1, 0, 10, "Hippogryph flight speed modifier; all hippogryph speeds are multiplied with this number");
        this.hippogryphTameItem = config.getString("Hippogryph Tame Item", "all", "minecraft:rabbit_foot", "Hippogryph tame item; supports OreDict");

        this.spawnGorgons = config.getBoolean("Spawn Gorgons", "all", true, "True if gorgon temples are allowed to spawn");
        this.spawnGorgonsChance = config.getInt("Spawn Gorgon Chance", "all", 75, 1, 10000, "1 out of this number chance per chunk for generation");
        this.gorgonMaxHealth = config.getFloat("Gorgon Max Health", "all", 100, 1, 10000, "Maximum gorgon health");

        this.spawnPixies = config.getBoolean("Spawn Pixies", "all", true, "True if pixie villages are allowed to spawn");
        this.spawnPixiesChance = config.getInt("Spawn Pixies Chance", "all", 60, 1, 10000, "1 out of this number chance per chunk for generation");
        this.pixieVillageSize = config.getInt("Pixie Village Size", "all", 5, 1, 10000, "size of pixie villages");
        this.pixieVillageBiomeBlacklist = config.getStringList("Blacklisted Biomes from Pixie Village Generation", "all", new String[] {"minecraft:roofed_forest", "biomesoplenty:ominous_woods", "biomesoplenty:mystic_grove"}, "Biomes that pixie villages will not be generated in (e.g. minecraft:plains or roofed_forest)");
        this.pixieVillageBiomeBlacklistIsWhitelist = config.getBoolean("Blacklisted Biomes from Pixie Village Generation is a Whitelist", "all", true, "If true, then the blacklist will act as a whitelist.");
        this.pixiesStealItems = config.getBoolean("Pixies Steal Items", "all", true, "True if pixies are allowed to steal from players");

        this.generateCyclopsCaves = config.getBoolean("Spawn Cyclopes Caves", "all", true, "True if cyclops caves are allowed to spawn");
        this.spawnCyclopsCaveChance = config.getInt("Spawn Cyclops Cave Chance", "all", 170, 1, 10000, "1 out of this number chance per chunk for generation");

        this.generateWanderingCyclops = config.getBoolean("Spawn Wandering Cyclopes", "all", true, "True if wandering cyclopes are allowed to spawn");
        this.spawnWanderingCyclopsChance = config.getInt("Spawn Wandering Cyclops Chance", "all", 900, 1, 10000, "1 out of this number chance per chunk for generation");

        this.cyclopsMaxHealth = config.getFloat("Cyclops Max Health", "all", 150, 1, 10000, "Maximum cyclops health");
        this.cyclopesSheepSearchLength = config.getInt("Cyclopes Sheep Search Length", "all", 17, 1, 10000, "How many blocks away can cyclopes detect sheep. Note that increasing this could cause lag.");
        this.cyclopsAttackStrength = config.getFloat("Cyclops Attack Strength", "all", 15, 1, 10000, "Cyclops attack strength");
        this.cyclopsBiteStrength = config.getFloat("Cyclops Bite Strength", "all", 40, 1, 10000, "Amount of damage done with cyclops bite attack.");
        this.cyclopsGriefing = config.getBoolean("Cyclops Griefing", "all", true, "Whether or not cyclops can break logs or leaves in their way");

        this.sirenMaxHealth = config.getFloat("Siren Max Health", "all", 50, 1, 10000, "Maximum siren health");
        this.generateSirenIslands = config.getBoolean("Spawn Sirens", "all", true, "True if siren islands are allowed to spawn");
        this.sirenShader = config.getBoolean("Use Siren Shader", "all", true, "True to make the screen pink when sirens attract players");
        this.generateSirenChance = config.getInt("Spawn Sirens Chance", "all", 300, 1, 10000, "1 out of this number chance per chunk for generation");
        this.sirenMaxSingTime = config.getInt("Siren Max Sing Time", "all", 12000, 100, 24000, "how long(in ticks) can a siren use its sing effect on a player, without a cooldown.");
        this.sirenTimeBetweenSongs = config.getInt("Siren Time Between Songs", "all", 2000, 100, 24000, "how long(in ticks) a siren has to wait after failing to lure in a player");
        this.sirenFluteMobBlacklist = Arrays.asList(config.getStringList("Siren Flute Mob Blacklist", "all", new String[]{}, "IDs of mobs that the siren flute will not work on"));

        this.spawnHippocampus = config.getBoolean("Spawn Hippocampus", "all", true, "True if hippocampi are allowed to spawn");
        this.hippocampusSpawnChance = config.getInt("Spawn Hippocampus Chance", "all", 70, 1, 10000, "1 out of this number chance per chunk for generation");
        this.hippocampusTameItem = config.getString("Hippocampus Tame Item", "all", "minecraft:prismarine_crystals", "Hippocampus tame item; supports OreDict");

        this.deathWormTargetSearchLength = config.getInt("Death Worm Target Search Length", "all", 64, 1, 10000, "How many blocks away can death worms spot potential prey. Note that increasing this could cause lag");
        this.deathWormMaxHealth = config.getFloat("Death Worm Base Health", "all", 10, 1, 10000, "Default deathworm health, this is scaled to the worm's particular size");
        this.deathWormAttackStrength = config.getFloat("Death Worm Base Attack Strength", "all", 3, 1, 10000, "Default deathworm attack strength, this is scaled to the worm's particular size");
        this.spawnDeathWorm = config.getBoolean("Spawn Death Worms", "all", true, "True if deathworms are allowed to spawn");
        this.deathWormAttackMonsters = config.getBoolean("Death Worms Target Monsters", "all", true, "True if wild deathworms are allowed to target and attack monsters");
        this.deathWormSpawnRate = config.getInt("Death Worm Spawn Weight", "all", 2, 1, 10000, "Deathworm spawn weight. Lower = lower chance to spawn");
        this.deathWormSpawnCheckChance = config.getInt("Death Worm Spawn Check Chance", "all", 3, 0, 10000, "A double check to see if the game can spawn death worms. Higher number = lower chance to spawn.");

        this.cockatriceMaxHealth = config.getFloat("Cockatrice Health", "all", 40, 1, 10000, "Maximum cockatrice health");
        this.cockatriceChickenSearchLength = config.getInt("Cockatrice chicken Search Length", "all", 32, 1, 10000, "How many blocks away can cockatrices detect chickens. Note that increasing this could cause lag.");
        this.cockatriceEggChance = config.getInt("Cockatrice chicken Search Length", "all", 30, 1, Integer.MAX_VALUE, "1 out of this number chance per 6000 ticks for a chicken to lay a cockatrice egg.");
        this.chickensLayRottenEggs = config.getBoolean("Chickens Lay Rotten Eggs", "all", true, "True if chickens lay rotten eggs.");
        this.spawnCockatrices = config.getBoolean("Spawn Cockatrices", "all", true, "True if cockatrices are allowed to spawn");
        this.cockatriceSpawnRate = config.getInt("Cockatrice Spawn Weight", "all", 4, 1, 10000, "Cockatrice spawn weight. Lower = lower chance to spawn");
        this.cockatriceSpawnCheckChance = config.getInt("Cockatrice Spawn Check Chance", "all", 0, 0, 10000, "A double check to see if the game can spawn cockatrices. Higher number = lower chance to spawn.");

        this.stymphalianBirdTargetSearchLength = config.getInt("Stymphalian Bird Target Search Length", "all", 64, 1, 10000, "How many blocks away can stymphalian birds spot potential prey. Note that increasing this could cause lag.");
        this.stymphalianBirdFeatherDropChance = config.getInt("Stymphalian Bird Feather Drop Chance", "all", 25, 0, 10000, "1/this number chance for a stymphalian feather to turn into an item before despawning. Zero means never.");
        this.stymphalianBirdFeatherAttackStength = config.getFloat("Stymphalian Bird Feather Attack Strength", "all", 1, 0, 10000, "Stymphalian bird feather attack strength.");
        this.stymphalianBirdFlockLength = config.getInt("Stymphalian Bird Flock Length", "all", 40, 1, 10000, "How far away stymphalian birds will consider other birds to be in the same flock.");
        this.stymphalianBirdFlightHeight = config.getInt("Max Stymphalian Bird Flight Height", "all", 80, 10, Integer.MAX_VALUE, "How high stymphalian birds can fly, in Y height.");
        this.spawnStymphalianBirds = config.getBoolean("Spawn Stymphalian Birds", "all", true, "True if stymphalian birds are allowed to spawn");
        this.stymphalianBirdsOreDictDrops = config.getBoolean("Stymphalian Birds drop ore dict items", "all", true, "True if stymphalian birds can drop items registered in the ore dictionary to ingotCopper, ingotBronze, nuggetCopper, nuggetBronze.");
        this.stympahlianBirdAttackAnimals = config.getBoolean("Stymphalian Birds Target Animals", "all", false, "True if stymphalian birds are allowed to target and attack animals");
        this.stymphalianBirdSpawnChance = config.getInt("Spawn Stymhphalian Bird Chance", "all", 100, 1, 10000, "1 out of this number chance per chunk for generation");

        this.spawnTrolls = config.getBoolean("Spawn Trolls", "all", true, "True if trolls are allowed to spawn");
        this.trollsDropWeapon = config.getBoolean("Trolls Drop Weapon", "all", true, "True if trolls are allowed to drop their weapon on death.");
        this.trollSpawnRate = config.getInt("Troll Spawn Weight", "all", 60, 1, 10000, "Troll spawn weight. Lower = lower chance to spawn");
        this.trollSpawnCheckChance = config.getInt("Troll Spawn Check Chance", "all", 1, 1, 10000, "A double check to see if the game can spawn trolls. Higher number = lower chance to spawn.");
        this.trollMaxHealth = config.getFloat("Troll Max Health", "all", 50, 1, 10000, "Maximum troll health");
        this.trollAttackStrength = config.getFloat("Troll Attack Strength", "all", 10, 1, 10000, "Troll attack strength");

        this.generateMyrmexColonies = config.getBoolean("Spawn Myrmex", "all", true, "True if myrmex colonies are allowed to spawn");
        this.myrmexPregnantTicks = config.getInt("Myrmex Gestation Length", "all", 2500, 1, 10000, "How many ticks it takes for a Myrmex Queen to produce an egg.");
        this.myrmexEggTicks = config.getInt("Myrmex Hatch Length", "all", 3000, 1, 10000, "How many ticks it takes for a Myrmex Egg to hatch.");
        this.myrmexLarvaTicks = config.getInt("Myrmex Hatch Length", "all", 35000, 1, 100000, "How many ticks it takes for a Myrmex to move from a larva to a pupa, and from a pupa to an adult.");
        this.myrmexColonyGenChance = config.getInt("Myrmex Colony Gen Chance", "all", 150, 1, 10000, "One out of this number chance per chunk to generate a myrmex hive.");
        this.myrmexColonySize = config.getInt("Myrmex Colony Max Size", "all", 80, 10, 10000, "How many maximum individuals a myrmex colony can have.");
        this.myrmexBaseAttackStrength = config.getFloat("Myrmex Base Attack Strength", "all", 3, 1, 10000, "Base Myrmex(worker) attack strength");
        this.myrmexJungleRepItems = config.getStringList("Myrmex Jungle Reputation Items", "all", new String[] { "iceandfire:myrmex_jungle_resin 5" } /*TODO*/, "How much reputation the player will receive for donating a specific item to a jungle myrmex worker");
        this.myrmexDesertRepItems = config.getStringList("Myrmex Desert Reputation Items", "all", new String[] { "iceandfire:myrmex_desert_resin 5" } /*TODO*/, "How much reputation the player will receive for donating a specific item to a desert myrmex worker");

        this.experimentalPathFinder = config.getBoolean("Experimental Dragon path Finder", "all", false, "Turning this to true simplifies the dragon's pathfinding process, making them dumber when finding a path, but better for servers with many loaded dragons.");

        this.spawnAmphitheres = config.getBoolean("Spawn Amphitheres", "all", true, "True if amphitheres are allowed to spawn");
        this.amphithereSpawnRate = config.getInt("Amphithere Spawn Weight", "all", 5, 1, 10000, "Amphithere spawn weight. Lower = lower chance to spawn");
        this.amphithereVillagerSearchLength = config.getInt("Amphithere Villager Search Length", "all", 64, 1, 10000, "How many blocks away can ampitheres detect villagers being hurt. Note that increasing this could cause lag.");
        this.amphithereTameTime = config.getInt("Amphithere Tame Time", "all", 400, 1, 10000, "How many ticks it takes while riding an untamed amphithere to tame it.");
        this.amphithereFlightSpeed = config.getFloat("Amphithere Flight Speed", "all", 1.75F, 0.0F, 3.0F, "How fast amphitheres fly.");
        this.amphithereMaxHealth = config.getFloat("Amphithere Max Health", "all", 50, 1, 10000, "Maximum amphithere health");
        this.amphithereAttackStrength = config.getFloat("Amphithere Attack Strength", "all", 7, 1, 10000, "Amphithere attack strength");

        this.spawnSeaSerpents = config.getBoolean("Spawn Sea Serpents", "all", true, "True if sea serpents are allowed to spawn");
        this.seaSerpentSpawnChance = config.getInt("Spawn Sea Serpent Chance", "all", 200, 1, 10000, "1 out of this number chance per chunk for generation");
        this.seaSerpentGriefing = config.getBoolean("Sea Serpent Griefing", "all", true, "Whether or not sea serpents can break weak blocks in their way");
        this.seaSerpentBaseHealth = config.getFloat("Sea Serpent Base Health", "all", 20, 1, 10000, "Default sea serpent health, this is scaled to the sea serpent's particular size");
        this.seaSerpentAttackStrength = config.getFloat("Sea Serpent Base Attack Strength", "all", 4, 1, 10000, "Default sea serpent attack strength, this is scaled to the sea serpent's particular size");

        this.dragonsteelBaseDamage = config.getFloat("Dragonsteel Sword Base Attack Strength", "all", 25, 5, Integer.MAX_VALUE, "Default attack strength of a dragonsteel sword.");
        this.dragonsteelBaseArmor = config.getInt("Dragonsteel Base Armor", "all", 12, 7, Integer.MAX_VALUE, "Default armor value of dragonsteel chestplate.");
        this.dragonsteelBaseDurability = config.getInt("Dragonsteel Base Durability", "all", 8000, 1, Integer.MAX_VALUE, "Default durability value of dragonsteel sword.");
        this.dragonsteelKnockback = config.getBoolean("Dragonsteel Knockback", "all", true, "Whether or not should dragonsteel tools knockback the target on hit");
        this.dragonMovedWronglyFix = config.getBoolean("Dragon Moved Wrongly Error Fix", "all", false, "Enable this if your server is being bombarded with moved wrongly or moved too fast console messages. REQUIRES RESTART!");
        this.weezerTinkers = config.getBoolean("Weezer", "all", true, "Disable this to remove easter egg with tinkers installed.");
        this.weezerTinkersDisarmChance = config.getFloat("Easter Egg Tinkers Tool Disarm chance", "all", 0.2F, 0F, 1F, "Percentage of critical strike that will disarm with easter egg tinkers material.");

        this.generateMausoleums = config.getBoolean("Generate Mausoleums", "all", true, "True if mausoleums are allowed to generate");
        this.generateMausoleumChance = config.getInt("Mausoleum Gen Chance", "all", 1800, 1, 10000, "One out of this number chance per chunk to generate a mausoleum.");
        this.spawnLiches = config.getBoolean("Spawn Liches", "all", true, "True if dread liches are allowed to spawn");
        this.lichSpawnRate = config.getInt("Lich Spawn Weight", "all", 2, 1, 10000, "Dread Lich spawn weight. Lower = lower chance to spawn");
        this.dreadGang = config.getStringList("Dread Gang", "all", new String[0], "These entities are on the same team as dread mobs");
        
        this.hydraMaxHealth = config.getFloat("Hydra Max Health", "all", 250, 1, 10000, "Maximum hydra health");
        this.generateHydraCaves = config.getBoolean("Generate Hydra Caves", "all", true, "True if hydra caves are allowed to generate");
        this.generateHydraChance = config.getInt("Hydra Caves Gen Chance", "all", 200, 1, 10000, "One out of this number chance per chunk to generate a hydra cave.");

        this.chunkLoadSummonCrystal = config.getBoolean("Chunk Load Summon Crystal", "all", true, "True if the summon crystal can load chunks to find dragons.");

        //Ghost
        this.ghostMaxHealth = config.getFloat("Ghost Max Health", "all", 30F, 1.0F, 10000.0F, "Maximum ghost health.");
        this.ghostAttackStrength = config.getFloat("Ghost Attack Strength", "all", 3F, 0.0F, 10000.0F, "Maximum ghost attack strength.");
        this.ghostSpawnFromPlayerDeaths = config.getBoolean("Player Death Spawns Ghost", "all", true, "True if allow spawn ghost when player death");
        this.ghostSpawnChanceFromGraveyardSoil = config.getInt("Ghost Spawn Rate At Graveyard Soid", "all", 9, 1, 100, "Chance graveyard soil spawn a ghost, Higher number = more rare");

        //Graveyard
        this.generateGraveyards = config.getBoolean("Generate Graveyards", "all", true, "True if graveyards are allowed to generate");
        this.generateGraveyardChance = config.getInt("Graveyards Generate Chance", "all", 256, 1, 10000, "One out of this number chance per chunk to generate a Graveyard.");

        //Ballista
        this.ballistaBaseDamage = config.getInt("Ballista Arrow Damage", "all", 10, 1, 100, "Maximum castle ballista arrow strength.");

    }
}

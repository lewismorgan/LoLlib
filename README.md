LoLlib
========================
This is a Java library that is intended to make calls to obtain data from the Riot API and put the data into Objects appropriately using GSON. The goal of LoLlib is for it to be simple to use to get the data that you need with only a few lines of code.

In order to use LoLlib, you will need to create a instance of LoLApi which contains the meat of LoLlib. LoLApi is what you will be using the most when you are using this library. You must specify a region and API key (provided by Riot) in order to retrieve data.

    LoLApi api = new LoLApi(Region.NA, "Key Here");

LoLlib also contains helper classes which helps make sense of various constants throughout the Riot API (such as Ids for maps and qeue types). Most of these are simply enumerations.

    Summoner summoner = api.getSummoner("lolireatsjoo");
    Game game = (Game) api.getRecentGames(summoner.getId()).getGames().toArray()[0];
    
    if (game.getMapId() == MapType.SUMMONERS_RIFT_SUMMER.get()) {
         System.out.println("Played on summer map!");
    }
    
Documentation of LoLlib can be found here: http://waverunner.github.io/LoLlib/doc

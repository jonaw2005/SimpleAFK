# SimpleAFK
A simple AFK plugin that detects if a player is afk and gives him blindness till he's back

Make sure to put "AFKconfig.yml" in your server directory

AFKconfig.yml has following content:

  >afktitle: main title while being afk  
  >afksubtitle: subtitle while being afk  
  >resumetitle: main title when the player is no longer afk  
  >resumesubtitle: subtitle when the player is no longer afk  
  >afktime: time [ms] it takes to mark a player as afk if he does not move in this timeframe  


Commands:
  > /afk -> sets the command executor as afk and gives him the effects  
  > /unafk -> marks the player as not afk, even if he didnt move (will not completely block the user from getting the effect, just resets the time)
  
  

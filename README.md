# SimpleAFK
A simple AFK plugin that detects if a player is afk and gives him blindness till he's back

Make sure to put "AFKconfig.yml" in your server directory (example in the resource directory)

AFKconfig.yml has following content:

  >afktitle: main title while being afk  
  >afksubtitle: subtitle while being afk  
  >resumetitle: main title when the player is no longer afk  
  >resumesubtitle: subtitle when the player is no longer afk  
  >afktime: time [ms] it takes to mark a player as afk if he does not move in this timeframe  

You can use color codes like for example §1 for dark blue

List of possible color codes:  
![image](https://user-images.githubusercontent.com/68852290/207129506-01418ccd-9bda-4642-9248-9aba0a7c4c76.png)



Commands:
  > /afk -> sets the command executor as afk and gives him the effects  
  > /unafk -> marks the player as not afk, even if he didnt move (will not completely block the user from getting the effect, just resets the time)
  
  

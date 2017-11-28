# Notes

1. Event culd be an enumerate
2. Body removed from model, it was just a proxy
3. Actions after listeners are not allowed in listeners themselves

# constraints

* Root mush have only one robot
* Main requires actions
* RoboProse may have event listeners
* RoboProse must requires Main
* An action can be Move, Turn, Stop
* An event can be Obstacle or Tapped
* Action attributes are required
* An event is followed by an action

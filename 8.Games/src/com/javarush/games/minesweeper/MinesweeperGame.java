package com.javarush.games.minesweeper;
import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {

    private static final int SIDE = 9;
    private static final String MINE = "\uD83D\uDCA3";
    private static final String FLAG =  "\uD83D\uDEA9";

    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField = 0;
    private int countFlags;
    private boolean isGameStopped;
    private int countClosedTiles = SIDE * SIDE;
    private int score;

    private void restart() {
        isGameStopped = false;
        countClosedTiles = SIDE * SIDE;
        score = 0;
        countMinesOnField = 0;
        setScore(score);
        createGame();

    }

    private void win () {

        isGameStopped = true;
        showMessageDialog(Color.CHARTREUSE, "А ты хорош!", Color.ALICEBLUE, 66);
    }
    private void gameOver () {
        isGameStopped = true;
        showMessageDialog(Color.BLUEVIOLET, "Всё взорвалось...", Color.YELLOW, 50);
    }

    private void markTile (int x, int y) {

        if (!isGameStopped) {
            if (!gameField[y][x].isOpen && countFlags != 0 && !gameField[y][x].isFlag) {
                gameField[y][x].isFlag = true;
                countFlags--;
                setCellValue(x, y, FLAG);
                setCellColor(x, y, Color.YELLOW);
            }
            else if (gameField[y][x].isFlag) {
                gameField[y][x].isFlag = false;
                countFlags++;
                setCellValue(x, y, "");
                setCellColor(x, y, Color.ORANGE);
            }
        }

    }

    @Override
    public void onMouseRightClick(int x, int y) {
        markTile(x, y);
    }

    @Override
    public void initialize() {

        setScreenSize(SIDE, SIDE);
        createGame();
    }
    @Override
    public void onMouseLeftClick(int x, int y) {

        if(isGameStopped) {
            restart();
        }
        else  openTile(x, y);
    }

    private void openTile(int x, int y) {
        List<GameObject> listNeighbors = new ArrayList<>();
        if (!gameField[y][x].isOpen && !gameField[y][x].isFlag && !isGameStopped ) {

            if (gameField[y][x].isMine) {
                //setCellValue(x, y, MINE);
                setCellValueEx(x, y, Color.RED, MINE);
                gameOver();
            }

            gameField[y][x].isOpen = true;
            countClosedTiles--;
            setCellColor(x, y, Color.GREEN);
            if (!gameField[y][x].isMine) score += 5;
            setScore(score);
            //---------------
            if(!gameField[y][x].isMine && gameField[y][x].countMineNeighbors == 0) {

                setCellValue(x, y, "");
                listNeighbors = getNeighbors(gameField[y][x]);
                for (GameObject neighbor: listNeighbors
                ) {
                    if (!neighbor.isOpen) {
                        openTile(neighbor.x, neighbor.y);

                    }
                }
            }
            else if(!gameField[y][x].isMine && gameField[y][x].countMineNeighbors != 0) {
                setCellNumber(x, y, gameField[y][x].countMineNeighbors);
            }
            if (countClosedTiles == countMinesOnField && !gameField[y][x].isMine) {
                win();
            }

        }

    }

    private void createGame() {

        boolean isMineHere;
        //isGameStopped = false;


        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {

                if (getRandomNumber(10) == 2) { //probability 10 %

                    isMineHere = true; //Achtung Minen!
                    countMinesOnField++;
                } else isMineHere = false;
                gameField[j][i] = new GameObject(i, j, isMineHere);
                setCellColor(j, i, Color.ORANGE);
                setCellValue(j, i, "");
            }
        }
        countMineNeighbors();
        countFlags = countMinesOnField;
    }
    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> list = new ArrayList<>();
        for(int i = gameObject.x - 1; i <= gameObject.x + 1; i++) {

            for(int j = gameObject.y - 1; j <= gameObject.y + 1; j++) {

                if((i != gameObject.x || j != gameObject.y) && (i >= 0 && j >= 0 && i < SIDE && j < SIDE)) {

                    list.add(gameField[j][i]);

                }
            }
        }
        return list;
    }

    private void countMineNeighbors() {

        List<GameObject> listMine = new ArrayList<>();
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {

                if (!gameField[j][i].isMine) {

                    listMine = getNeighbors(gameField[j][i]);//all neighbors
                    for(int k = 0; k < listMine.size(); k++) {
                        if(listMine.get(k).isMine) gameField[j][i].countMineNeighbors++;
                    }
                }

            }
        }
    }
}


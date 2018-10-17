package com.bcv.hw.Lection9;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class XOGame {
    public static void main(String[] args) {
        JFrame XOGame = new XOGameFrame();
        XOGame.setTitle("XO Game");
        XOGame.setSize(400, 440);
        XOGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        XOGame.setLocationRelativeTo(null);
        XOGame.setVisible(true);
    }
}

class XOGameFrame extends JFrame {
    // Indicate whose turn it is
    private char whoseTurn = 'X';
    private boolean gameOver = false;

    // Create cell grid
    private Cell[][] cells = new Cell[4][4];

    // Create a status label
    JLabel jlStatusBar = new JLabel("X's turn to play");

    /**
     * No-argument Constructor
     */
    public XOGameFrame() {
        // Panel to hold cells
        JPanel panel = new JPanel(new GridLayout(4, 4, 0, 0));
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                panel.add(cells[i][j] = new Cell());

        panel.setBorder(new LineBorder(Color.red, 2));

        //border around text who play
        jlStatusBar.setBorder(new LineBorder(Color.yellow, 2));

        add(panel, BorderLayout.CENTER);
        add(jlStatusBar, BorderLayout.SOUTH);
    }

    /**
     * Determine if game board is full.
     *
     * @return True, if game board is full. Otherwise, false.
     */
    public boolean isFull() {
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                if (cells[i][j].getToken() == ' ')
                    return false;
        return true;
    }

    /**
     * Determines if a given token has won.
     *
     * @param token Token to test for winning
     * @return True, if the token has won. Otherwise, false.
     */
    public boolean isWon(char token) {
        // check rows
        for (int i = 0; i < 4; i++)
            if ((cells[i][0].getToken() == token)
                    && (cells[i][1].getToken() == token)
                    && (cells[i][2].getToken() == token)
                    && (cells[i][3].getToken() == token)) {
                return true;
            }

        // check columns
        for (int j = 0; j < 3; j++)
            if ((cells[0][j].getToken() == token)
                    && (cells[1][j].getToken() == token)
                    && (cells[2][j].getToken() == token)
                    && (cells[3][j].getToken() == token)) {
                return true;
            }
        // check diagonal
        if ((cells[0][0].getToken() == token)
                && (cells[1][1].getToken() == token)
                && (cells[2][2].getToken() == token)
                && (cells[3][3].getToken() == token)) {
            return true;
        }

        if ((cells[0][3].getToken() == token)
                && (cells[1][1].getToken() == token)
                && (cells[2][1].getToken() == token)
                && (cells[3][0].getToken() == token)) {
            return true;
        }

        return false;
    }

    /**
     * Defines a cell in a TicTacToe game board.
     */
    public class Cell extends JPanel {
        // token of this cell
        private char token = ' ';

        /**
         * Constructor
         */
        public Cell() {
            setBorder(new LineBorder(Color.black, 1));
            addMouseListener(new MyMouseListener());
        }

        /**
         * Gets the token of the cell.
         *
         * @return The token value of the cell.
         */
        public char getToken() {
            return token;
        }

        /**
         * Sets the token of the cell.
         *
         * @param c Character to use as token value.
         */
        public void setToken(char c) {
            token = c;
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            if (token == 'X') {
                //  g.drawLine(20, 20, getWidth() - 20, getHeight() - 20);
                //  g.drawLine(getWidth() - 20, 20, 20, getHeight() - 20);
                Image aXImage = new ImageIcon("C:\\Users\\home\\IdeaProjects\\bcv\\src\\com\\bcv\\hw\\Lection9\\x.gif").getImage();
                g.drawImage(aXImage, 0, 0, getHeight(), getHeight(), null);

            } else if (token == 'O') {
                // g.drawOval(10, 10, getWidth() - 20, getHeight() - 20);
                Image aOImage = new ImageIcon("C:\\Users\\home\\IdeaProjects\\bcv\\src\\com\\bcv\\hw\\Lection9\\o.gif").getImage();
                g.drawImage(aOImage, 0, 0, getHeight(), getHeight(), null);
            }
        }

        private class MyMouseListener extends MouseAdapter {

            @Override

            public void mouseClicked(MouseEvent e) {
                if (gameOver)
                    return;

                // if the cell is empty and the game is not over
                if (token == ' ' && whoseTurn != ' ')
                    setToken(whoseTurn);

                // Check game status
                if (isWon(whoseTurn)) {
                    jlStatusBar.setText(whoseTurn + " won! Game over!");
                    whoseTurn = ' ';
                    gameOver = true;
                } else if (isFull()) {
                    jlStatusBar.setText("Tie game! Game over!");
                    whoseTurn = ' ';
                    gameOver = true;
                } else {
                    whoseTurn = (whoseTurn == 'X') ? 'O' : 'X';
                    jlStatusBar.setText(whoseTurn + "'s turn.");
                }
            }
        } // end class MyMouseListener
    } // end class Cell
} // end class XOGameFrame
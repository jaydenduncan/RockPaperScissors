package com.example.rockpaperscissors;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.rockpaperscissors.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    Button rockBtn, paperBtn, scissorsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        RockPaperScissors game = new RockPaperScissors();
        Player player = new Player();
        Player computer = new Player();

        rockBtn = binding.rockButton;
        paperBtn = binding.paperButton;
        scissorsBtn = binding.scissorsButton;

        rockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.setWeapon(Weapon.ROCK);
                computer.setWeapon(chooseWeapon());

                // Print score to the scoreText TextView
                StringBuilder scoreMessage = new StringBuilder();
                scoreMessage.append("Player: ").append(player.getScore()).append(", ");
                scoreMessage.append("Computer: ").append(computer.getScore());
                binding.scoreText.setText(scoreMessage);

                // Print player's weapon to playerText TextView
                StringBuilder playerMessage = new StringBuilder();
                playerMessage.append("Player's Weapon: ").append(player.getWeapon());
                binding.playerText.setText(playerMessage);

                // Print computer's weapon to computerText TextView
                StringBuilder computerMessage = new StringBuilder();
                computerMessage.append("Computer's Weapon: ").append(computer.getWeapon());
                binding.computerText.setText(computerMessage);

                // Print congrats message to congratsText TextView
                if(game.isPlayerWinner(player.getWeapon(), computer.getWeapon())){

                    player.setScore(player.getScore() + 1);

                    StringBuilder newScoreMessage = new StringBuilder();
                    newScoreMessage.append("Player: ").append(player.getScore()).append(", ");
                    newScoreMessage.append("Computer: ").append(computer.getScore());
                    binding.scoreText.setText(newScoreMessage);

                    StringBuilder congratsMessage = new StringBuilder();
                    congratsMessage.append("Player wins ... ");
                    congratsMessage.append(player.getWeapon()).append(" beats ").append(computer.getWeapon());
                    binding.congratsText.setText(congratsMessage);

                }
                else if(game.isComputerWinner(player.getWeapon(), computer.getWeapon())){

                    computer.setScore(computer.getScore() + 1);

                    StringBuilder newScoreMessage = new StringBuilder();
                    newScoreMessage.append("Player: ").append(player.getScore()).append(", ");
                    newScoreMessage.append("Computer: ").append(computer.getScore());
                    binding.scoreText.setText(newScoreMessage);

                    StringBuilder congratsMessage = new StringBuilder();
                    congratsMessage.append("Computer wins ... ");
                    congratsMessage.append(computer.getWeapon()).append(" beats ").append(player.getWeapon());
                    congratsMessage.append("!");
                    binding.congratsText.setText(congratsMessage);

                }
                else if(game.isDraw(player.getWeapon(), computer.getWeapon())){

                    binding.congratsText.setText("It was a draw!");

                }

            }
        });

        paperBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.setWeapon(Weapon.PAPER);

                computer.setWeapon(chooseWeapon());

                // Print score to the scoreText TextView
                StringBuilder scoreMessage = new StringBuilder();
                scoreMessage.append("Player: ").append(player.getScore()).append(", ");
                scoreMessage.append("Computer: ").append(computer.getScore());
                binding.scoreText.setText(scoreMessage);

                // Print player's weapon to playerText TextView
                StringBuilder playerMessage = new StringBuilder();
                playerMessage.append("Player's Weapon: ").append(player.getWeapon());
                binding.playerText.setText(playerMessage);

                // Print computer's weapon to computerText TextView
                StringBuilder computerMessage = new StringBuilder();
                computerMessage.append("Computer's Weapon: ").append(computer.getWeapon());
                binding.computerText.setText(computerMessage);

                // Print congrats message to congratsText TextView
                if(game.isPlayerWinner(player.getWeapon(), computer.getWeapon())){

                    player.setScore(player.getScore() + 1);

                    StringBuilder newScoreMessage = new StringBuilder();
                    newScoreMessage.append("Player: ").append(player.getScore()).append(", ");
                    newScoreMessage.append("Computer: ").append(computer.getScore());
                    binding.scoreText.setText(newScoreMessage);

                    StringBuilder congratsMessage = new StringBuilder();
                    congratsMessage.append("Player wins ... ");
                    congratsMessage.append(player.getWeapon()).append(" beats ").append(computer.getWeapon());
                    binding.congratsText.setText(congratsMessage);

                }
                else if(game.isComputerWinner(player.getWeapon(), computer.getWeapon())){

                    computer.setScore(computer.getScore() + 1);

                    StringBuilder newScoreMessage = new StringBuilder();
                    newScoreMessage.append("Player: ").append(player.getScore()).append(", ");
                    newScoreMessage.append("Computer: ").append(computer.getScore());
                    binding.scoreText.setText(newScoreMessage);

                    StringBuilder congratsMessage = new StringBuilder();
                    congratsMessage.append("Computer wins ... ");
                    congratsMessage.append(computer.getWeapon()).append(" beats ").append(player.getWeapon());
                    congratsMessage.append("!");
                    binding.congratsText.setText(congratsMessage);

                }
                else if(game.isDraw(player.getWeapon(), computer.getWeapon())){

                    binding.congratsText.setText("It was a draw!");

                }

            }
        });

        scissorsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.setWeapon(Weapon.SCISSORS);

                computer.setWeapon(chooseWeapon());

                // Print score to the scoreText TextView
                StringBuilder scoreMessage = new StringBuilder();
                scoreMessage.append("Player: ").append(player.getScore()).append(", ");
                scoreMessage.append("Computer: ").append(computer.getScore());
                binding.scoreText.setText(scoreMessage);

                // Print player's weapon to playerText TextView
                StringBuilder playerMessage = new StringBuilder();
                playerMessage.append("Player's Weapon: ").append(player.getWeapon());
                binding.playerText.setText(playerMessage);

                // Print computer's weapon to computerText TextView
                StringBuilder computerMessage = new StringBuilder();
                computerMessage.append("Computer's Weapon: ").append(computer.getWeapon());
                binding.computerText.setText(computerMessage);

                // Print congrats message to congratsText TextView
                if(game.isPlayerWinner(player.getWeapon(), computer.getWeapon())){

                    player.setScore(player.getScore() + 1);

                    StringBuilder newScoreMessage = new StringBuilder();
                    newScoreMessage.append("Player: ").append(player.getScore()).append(", ");
                    newScoreMessage.append("Computer: ").append(computer.getScore());
                    binding.scoreText.setText(newScoreMessage);

                    StringBuilder congratsMessage = new StringBuilder();
                    congratsMessage.append("Player wins ... ");
                    congratsMessage.append(player.getWeapon()).append(" beats ").append(computer.getWeapon());
                    binding.congratsText.setText(congratsMessage);

                }
                else if(game.isComputerWinner(player.getWeapon(), computer.getWeapon())){

                    computer.setScore(computer.getScore() + 1);

                    StringBuilder newScoreMessage = new StringBuilder();
                    newScoreMessage.append("Player: ").append(player.getScore()).append(", ");
                    newScoreMessage.append("Computer: ").append(computer.getScore());
                    binding.scoreText.setText(newScoreMessage);

                    StringBuilder congratsMessage = new StringBuilder();
                    congratsMessage.append("Computer wins ... ");
                    congratsMessage.append(computer.getWeapon()).append(" beats ").append(player.getWeapon());
                    congratsMessage.append("!");
                    binding.congratsText.setText(congratsMessage);

                }
                else if(game.isDraw(player.getWeapon(), computer.getWeapon())){

                    binding.congratsText.setText("It was a draw!");

                }

            }
        });

    }

    protected static Weapon chooseWeapon(){
        int randNum = (int)(Math.random() * 3);

        return Weapon.values()[randNum];
    }
}

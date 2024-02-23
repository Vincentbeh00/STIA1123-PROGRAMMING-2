/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.PibgVoteApp;

import java.time.LocalDateTime;

class Timeline {

    public static LocalDateTime registrationStart = LocalDateTime.of(2023, 1, 16, 16, 0);
    public static LocalDateTime registrationEnd = LocalDateTime.of(2023, 1, 22, 14, 0);
    public static LocalDateTime votingStart = LocalDateTime.of(2023, 1, 16, 22, 43);
    public static LocalDateTime votingEnd = LocalDateTime.of(2024, 1, 16, 18, 59);

    public static boolean isRegistrationPeriodActive() {
        LocalDateTime now = LocalDateTime.now();
        return now.isAfter(registrationStart) && now.isBefore(registrationEnd);
    }

    public static boolean isVotingPeriodActive() {
        LocalDateTime now = LocalDateTime.now();
        return now.isAfter(votingStart) && now.isBefore(votingEnd);
    }
}

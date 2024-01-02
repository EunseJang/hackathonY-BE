package umc.teamY.nottomeet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class NotToMeetCreateRequest {
    private Long userId;
    private Long projectId;
    private String date;
}

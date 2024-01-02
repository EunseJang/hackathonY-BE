package umc.teamY.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    INVALID_TOKEN(HttpStatus.UNAUTHORIZED, "Invalid token"),
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "User not founded"),
    POST_NOT_FOUND(HttpStatus.NOT_FOUND, "Post not founded"),
    INVALID_PASSWORD(HttpStatus.UNAUTHORIZED, "Invalid password"),
    DUPLICATED_USER_NAME(HttpStatus.CONFLICT, "Duplicated user name"),
    ALREADY_LIKED_POST(HttpStatus.CONFLICT, "user already like the post"),
    INVALID_PERMISSION(HttpStatus.UNAUTHORIZED, "User has invalid permission"),
    DATABASE_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Database error occurs"),
    NOTIFICATION_CONNECT_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Connect to notification occurs error"),
    
    PROJECT_NOT_EXIST(HttpStatus.NOT_FOUND, "존재하지 않는 프로젝트입니다."),
    MEETING_NOT_EXIST(HttpStatus.NOT_FOUND, "존재하지 않는 회의입니다."),
    TAG_NOT_EXIST(HttpStatus.NOT_FOUND, "존재하지 않는 태그입니다."),

    USER_PROJECT_NOT_FOUND(HttpStatus.NOT_FOUND, "Project not founded"),
    NOT_TO_MEET_NOT_FOUND(HttpStatus.NOT_FOUND, "Not To Meet not founded")
    ;

    private final HttpStatus status;
    private final String message;
}

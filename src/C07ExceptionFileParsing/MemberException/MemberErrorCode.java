package C07ExceptionFileParsing.MemberException;

public enum MemberErrorCode {
    EMAIL_ALREADY_EXISTS,
    INVALID_PASSWORD,
    MEMBER_NOT_FOUND
}
class MemberException extends RuntimeException {
    private final MemberErrorCode errorCode;

    public MemberException(MemberErrorCode errorCode) {
        super(errorCode.name());
        this.errorCode = errorCode;
    }

    public MemberErrorCode getErrorCode() {
        return errorCode;
    }
}
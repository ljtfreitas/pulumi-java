// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInvitationResult {
    /**
     * The expiration date for the invitation and share subscription.
     * 
     */
    private final @Nullable String expirationDate;
    /**
     * The resource id of the azure resource
     * 
     */
    private final String id;
    /**
     * unique invitation id
     * 
     */
    private final String invitationId;
    /**
     * The status of the invitation.
     * 
     */
    private final String invitationStatus;
    /**
     * Name of the azure resource
     * 
     */
    private final String name;
    /**
     * The time the recipient responded to the invitation.
     * 
     */
    private final String respondedAt;
    /**
     * Gets the time at which the invitation was sent.
     * 
     */
    private final String sentAt;
    /**
     * System Data of the Azure resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The target Azure AD Id. Can't be combined with email.
     * 
     */
    private final @Nullable String targetActiveDirectoryId;
    /**
     * The email the invitation is directed to.
     * 
     */
    private final @Nullable String targetEmail;
    /**
     * The target user or application Id that invitation is being sent to.
     * Must be specified along TargetActiveDirectoryId. This enables sending
     * invitations to specific users or applications in an AD tenant.
     * 
     */
    private final @Nullable String targetObjectId;
    /**
     * Type of the azure resource
     * 
     */
    private final String type;
    /**
     * Email of the user who created the resource
     * 
     */
    private final String userEmail;
    /**
     * Name of the user who created the resource
     * 
     */
    private final String userName;

    @CustomType.Constructor
    private GetInvitationResult(
        @CustomType.Parameter("expirationDate") @Nullable String expirationDate,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("invitationId") String invitationId,
        @CustomType.Parameter("invitationStatus") String invitationStatus,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("respondedAt") String respondedAt,
        @CustomType.Parameter("sentAt") String sentAt,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("targetActiveDirectoryId") @Nullable String targetActiveDirectoryId,
        @CustomType.Parameter("targetEmail") @Nullable String targetEmail,
        @CustomType.Parameter("targetObjectId") @Nullable String targetObjectId,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userEmail") String userEmail,
        @CustomType.Parameter("userName") String userName) {
        this.expirationDate = expirationDate;
        this.id = id;
        this.invitationId = invitationId;
        this.invitationStatus = invitationStatus;
        this.name = name;
        this.respondedAt = respondedAt;
        this.sentAt = sentAt;
        this.systemData = systemData;
        this.targetActiveDirectoryId = targetActiveDirectoryId;
        this.targetEmail = targetEmail;
        this.targetObjectId = targetObjectId;
        this.type = type;
        this.userEmail = userEmail;
        this.userName = userName;
    }

    /**
     * The expiration date for the invitation and share subscription.
     * 
    */
    public Optional<String> getExpirationDate() {
        return Optional.ofNullable(this.expirationDate);
    }
    /**
     * The resource id of the azure resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * unique invitation id
     * 
    */
    public String getInvitationId() {
        return this.invitationId;
    }
    /**
     * The status of the invitation.
     * 
    */
    public String getInvitationStatus() {
        return this.invitationStatus;
    }
    /**
     * Name of the azure resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The time the recipient responded to the invitation.
     * 
    */
    public String getRespondedAt() {
        return this.respondedAt;
    }
    /**
     * Gets the time at which the invitation was sent.
     * 
    */
    public String getSentAt() {
        return this.sentAt;
    }
    /**
     * System Data of the Azure resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The target Azure AD Id. Can't be combined with email.
     * 
    */
    public Optional<String> getTargetActiveDirectoryId() {
        return Optional.ofNullable(this.targetActiveDirectoryId);
    }
    /**
     * The email the invitation is directed to.
     * 
    */
    public Optional<String> getTargetEmail() {
        return Optional.ofNullable(this.targetEmail);
    }
    /**
     * The target user or application Id that invitation is being sent to.
     * Must be specified along TargetActiveDirectoryId. This enables sending
     * invitations to specific users or applications in an AD tenant.
     * 
    */
    public Optional<String> getTargetObjectId() {
        return Optional.ofNullable(this.targetObjectId);
    }
    /**
     * Type of the azure resource
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Email of the user who created the resource
     * 
    */
    public String getUserEmail() {
        return this.userEmail;
    }
    /**
     * Name of the user who created the resource
     * 
    */
    public String getUserName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInvitationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expirationDate;
        private String id;
        private String invitationId;
        private String invitationStatus;
        private String name;
        private String respondedAt;
        private String sentAt;
        private SystemDataResponse systemData;
        private @Nullable String targetActiveDirectoryId;
        private @Nullable String targetEmail;
        private @Nullable String targetObjectId;
        private String type;
        private String userEmail;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInvitationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationDate = defaults.expirationDate;
    	      this.id = defaults.id;
    	      this.invitationId = defaults.invitationId;
    	      this.invitationStatus = defaults.invitationStatus;
    	      this.name = defaults.name;
    	      this.respondedAt = defaults.respondedAt;
    	      this.sentAt = defaults.sentAt;
    	      this.systemData = defaults.systemData;
    	      this.targetActiveDirectoryId = defaults.targetActiveDirectoryId;
    	      this.targetEmail = defaults.targetEmail;
    	      this.targetObjectId = defaults.targetObjectId;
    	      this.type = defaults.type;
    	      this.userEmail = defaults.userEmail;
    	      this.userName = defaults.userName;
        }

        public Builder expirationDate(@Nullable String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder invitationId(String invitationId) {
            this.invitationId = Objects.requireNonNull(invitationId);
            return this;
        }

        public Builder invitationStatus(String invitationStatus) {
            this.invitationStatus = Objects.requireNonNull(invitationStatus);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder respondedAt(String respondedAt) {
            this.respondedAt = Objects.requireNonNull(respondedAt);
            return this;
        }

        public Builder sentAt(String sentAt) {
            this.sentAt = Objects.requireNonNull(sentAt);
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder targetActiveDirectoryId(@Nullable String targetActiveDirectoryId) {
            this.targetActiveDirectoryId = targetActiveDirectoryId;
            return this;
        }

        public Builder targetEmail(@Nullable String targetEmail) {
            this.targetEmail = targetEmail;
            return this;
        }

        public Builder targetObjectId(@Nullable String targetObjectId) {
            this.targetObjectId = targetObjectId;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder userEmail(String userEmail) {
            this.userEmail = Objects.requireNonNull(userEmail);
            return this;
        }

        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public GetInvitationResult build() {
            return new GetInvitationResult(expirationDate, id, invitationId, invitationStatus, name, respondedAt, sentAt, systemData, targetActiveDirectoryId, targetEmail, targetObjectId, type, userEmail, userName);
        }
    }
}

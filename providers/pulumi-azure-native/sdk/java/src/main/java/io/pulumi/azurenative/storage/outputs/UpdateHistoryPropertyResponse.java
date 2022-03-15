// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UpdateHistoryPropertyResponse {
    /**
     * The immutability period for the blobs in the container since the policy creation, in days.
     * 
     */
    private final Integer immutabilityPeriodSinceCreationInDays;
    /**
     * Returns the Object ID of the user who updated the ImmutabilityPolicy.
     * 
     */
    private final String objectIdentifier;
    /**
     * Returns the Tenant ID that issued the token for the user who updated the ImmutabilityPolicy.
     * 
     */
    private final String tenantId;
    /**
     * Returns the date and time the ImmutabilityPolicy was updated.
     * 
     */
    private final String timestamp;
    /**
     * The ImmutabilityPolicy update type of a blob container, possible values include: put, lock and extend.
     * 
     */
    private final String update;
    /**
     * Returns the User Principal Name of the user who updated the ImmutabilityPolicy.
     * 
     */
    private final String upn;

    @CustomType.Constructor
    private UpdateHistoryPropertyResponse(
        @CustomType.Parameter("immutabilityPeriodSinceCreationInDays") Integer immutabilityPeriodSinceCreationInDays,
        @CustomType.Parameter("objectIdentifier") String objectIdentifier,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("timestamp") String timestamp,
        @CustomType.Parameter("update") String update,
        @CustomType.Parameter("upn") String upn) {
        this.immutabilityPeriodSinceCreationInDays = immutabilityPeriodSinceCreationInDays;
        this.objectIdentifier = objectIdentifier;
        this.tenantId = tenantId;
        this.timestamp = timestamp;
        this.update = update;
        this.upn = upn;
    }

    /**
     * The immutability period for the blobs in the container since the policy creation, in days.
     * 
    */
    public Integer getImmutabilityPeriodSinceCreationInDays() {
        return this.immutabilityPeriodSinceCreationInDays;
    }
    /**
     * Returns the Object ID of the user who updated the ImmutabilityPolicy.
     * 
    */
    public String getObjectIdentifier() {
        return this.objectIdentifier;
    }
    /**
     * Returns the Tenant ID that issued the token for the user who updated the ImmutabilityPolicy.
     * 
    */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Returns the date and time the ImmutabilityPolicy was updated.
     * 
    */
    public String getTimestamp() {
        return this.timestamp;
    }
    /**
     * The ImmutabilityPolicy update type of a blob container, possible values include: put, lock and extend.
     * 
    */
    public String getUpdate() {
        return this.update;
    }
    /**
     * Returns the User Principal Name of the user who updated the ImmutabilityPolicy.
     * 
    */
    public String getUpn() {
        return this.upn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpdateHistoryPropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer immutabilityPeriodSinceCreationInDays;
        private String objectIdentifier;
        private String tenantId;
        private String timestamp;
        private String update;
        private String upn;

        public Builder() {
    	      // Empty
        }

        public Builder(UpdateHistoryPropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.immutabilityPeriodSinceCreationInDays = defaults.immutabilityPeriodSinceCreationInDays;
    	      this.objectIdentifier = defaults.objectIdentifier;
    	      this.tenantId = defaults.tenantId;
    	      this.timestamp = defaults.timestamp;
    	      this.update = defaults.update;
    	      this.upn = defaults.upn;
        }

        public Builder immutabilityPeriodSinceCreationInDays(Integer immutabilityPeriodSinceCreationInDays) {
            this.immutabilityPeriodSinceCreationInDays = Objects.requireNonNull(immutabilityPeriodSinceCreationInDays);
            return this;
        }

        public Builder objectIdentifier(String objectIdentifier) {
            this.objectIdentifier = Objects.requireNonNull(objectIdentifier);
            return this;
        }

        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder timestamp(String timestamp) {
            this.timestamp = Objects.requireNonNull(timestamp);
            return this;
        }

        public Builder update(String update) {
            this.update = Objects.requireNonNull(update);
            return this;
        }

        public Builder upn(String upn) {
            this.upn = Objects.requireNonNull(upn);
            return this;
        }
        public UpdateHistoryPropertyResponse build() {
            return new UpdateHistoryPropertyResponse(immutabilityPeriodSinceCreationInDays, objectIdentifier, tenantId, timestamp, update, upn);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AccessReviewHistoryInstanceResponse {
    /**
     * The display name for the parent history definition.
     * 
     */
    private final @Nullable String displayName;
    /**
     * Uri which can be used to retrieve review history data. To generate this Uri, generateDownloadUri() must be called for a specific accessReviewHistoryDefinitionInstance. The link expires after a 24 hour period. Callers can see the expiration date time by looking at the 'se' parameter in the generated uri.
     * 
     */
    private final String downloadUri;
    /**
     * Date time when history data report expires and the associated data is deleted.
     * 
     */
    private final @Nullable String expiration;
    /**
     * Date time when the history data report is scheduled to be generated.
     * 
     */
    private final @Nullable String fulfilledDateTime;
    /**
     * The access review history definition instance id.
     * 
     */
    private final String id;
    /**
     * The access review history definition instance unique id.
     * 
     */
    private final String name;
    /**
     * Date time used when selecting review data, all reviews included in data end on or before this date. For use only with one-time/non-recurring reports.
     * 
     */
    private final @Nullable String reviewHistoryPeriodEndDateTime;
    /**
     * Date time used when selecting review data, all reviews included in data start on or after this date. For use only with one-time/non-recurring reports.
     * 
     */
    private final @Nullable String reviewHistoryPeriodStartDateTime;
    /**
     * Date time when the history data report is scheduled to be generated.
     * 
     */
    private final @Nullable String runDateTime;
    /**
     * Status of the requested review history instance data. This is either requested, in-progress, done or error. The state transitions are as follows - Requested -> InProgress -> Done -> Expired
     * 
     */
    private final String status;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"displayName","downloadUri","expiration","fulfilledDateTime","id","name","reviewHistoryPeriodEndDateTime","reviewHistoryPeriodStartDateTime","runDateTime","status","type"})
    private AccessReviewHistoryInstanceResponse(
        @Nullable String displayName,
        String downloadUri,
        @Nullable String expiration,
        @Nullable String fulfilledDateTime,
        String id,
        String name,
        @Nullable String reviewHistoryPeriodEndDateTime,
        @Nullable String reviewHistoryPeriodStartDateTime,
        @Nullable String runDateTime,
        String status,
        String type) {
        this.displayName = displayName;
        this.downloadUri = Objects.requireNonNull(downloadUri);
        this.expiration = expiration;
        this.fulfilledDateTime = fulfilledDateTime;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.reviewHistoryPeriodEndDateTime = reviewHistoryPeriodEndDateTime;
        this.reviewHistoryPeriodStartDateTime = reviewHistoryPeriodStartDateTime;
        this.runDateTime = runDateTime;
        this.status = Objects.requireNonNull(status);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The display name for the parent history definition.
     * 
     */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * Uri which can be used to retrieve review history data. To generate this Uri, generateDownloadUri() must be called for a specific accessReviewHistoryDefinitionInstance. The link expires after a 24 hour period. Callers can see the expiration date time by looking at the 'se' parameter in the generated uri.
     * 
     */
    public String getDownloadUri() {
        return this.downloadUri;
    }
    /**
     * Date time when history data report expires and the associated data is deleted.
     * 
     */
    public Optional<String> getExpiration() {
        return Optional.ofNullable(this.expiration);
    }
    /**
     * Date time when the history data report is scheduled to be generated.
     * 
     */
    public Optional<String> getFulfilledDateTime() {
        return Optional.ofNullable(this.fulfilledDateTime);
    }
    /**
     * The access review history definition instance id.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The access review history definition instance unique id.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Date time used when selecting review data, all reviews included in data end on or before this date. For use only with one-time/non-recurring reports.
     * 
     */
    public Optional<String> getReviewHistoryPeriodEndDateTime() {
        return Optional.ofNullable(this.reviewHistoryPeriodEndDateTime);
    }
    /**
     * Date time used when selecting review data, all reviews included in data start on or after this date. For use only with one-time/non-recurring reports.
     * 
     */
    public Optional<String> getReviewHistoryPeriodStartDateTime() {
        return Optional.ofNullable(this.reviewHistoryPeriodStartDateTime);
    }
    /**
     * Date time when the history data report is scheduled to be generated.
     * 
     */
    public Optional<String> getRunDateTime() {
        return Optional.ofNullable(this.runDateTime);
    }
    /**
     * Status of the requested review history instance data. This is either requested, in-progress, done or error. The state transitions are as follows - Requested -> InProgress -> Done -> Expired
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * The resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessReviewHistoryInstanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private String downloadUri;
        private @Nullable String expiration;
        private @Nullable String fulfilledDateTime;
        private String id;
        private String name;
        private @Nullable String reviewHistoryPeriodEndDateTime;
        private @Nullable String reviewHistoryPeriodStartDateTime;
        private @Nullable String runDateTime;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessReviewHistoryInstanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.downloadUri = defaults.downloadUri;
    	      this.expiration = defaults.expiration;
    	      this.fulfilledDateTime = defaults.fulfilledDateTime;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.reviewHistoryPeriodEndDateTime = defaults.reviewHistoryPeriodEndDateTime;
    	      this.reviewHistoryPeriodStartDateTime = defaults.reviewHistoryPeriodStartDateTime;
    	      this.runDateTime = defaults.runDateTime;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDownloadUri(String downloadUri) {
            this.downloadUri = Objects.requireNonNull(downloadUri);
            return this;
        }

        public Builder setExpiration(@Nullable String expiration) {
            this.expiration = expiration;
            return this;
        }

        public Builder setFulfilledDateTime(@Nullable String fulfilledDateTime) {
            this.fulfilledDateTime = fulfilledDateTime;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setReviewHistoryPeriodEndDateTime(@Nullable String reviewHistoryPeriodEndDateTime) {
            this.reviewHistoryPeriodEndDateTime = reviewHistoryPeriodEndDateTime;
            return this;
        }

        public Builder setReviewHistoryPeriodStartDateTime(@Nullable String reviewHistoryPeriodStartDateTime) {
            this.reviewHistoryPeriodStartDateTime = reviewHistoryPeriodStartDateTime;
            return this;
        }

        public Builder setRunDateTime(@Nullable String runDateTime) {
            this.runDateTime = runDateTime;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public AccessReviewHistoryInstanceResponse build() {
            return new AccessReviewHistoryInstanceResponse(displayName, downloadUri, expiration, fulfilledDateTime, id, name, reviewHistoryPeriodEndDateTime, reviewHistoryPeriodStartDateTime, runDateTime, status, type);
        }
    }
}

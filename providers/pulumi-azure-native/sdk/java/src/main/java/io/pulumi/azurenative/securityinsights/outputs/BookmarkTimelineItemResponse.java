// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.UserInfoResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BookmarkTimelineItemResponse {
    /**
     * The bookmark azure resource id.
     * 
     */
    private final String azureResourceId;
    /**
     * Describes a user that created the bookmark
     * 
     */
    private final @Nullable UserInfoResponse createdBy;
    /**
     * The bookmark display name.
     * 
     */
    private final @Nullable String displayName;
    /**
     * The bookmark end time.
     * 
     */
    private final @Nullable String endTimeUtc;
    /**
     * The bookmark event time.
     * 
     */
    private final @Nullable String eventTime;
    /**
     * The entity query kind
     * Expected value is 'Bookmark'.
     * 
     */
    private final String kind;
    /**
     * List of labels relevant to this bookmark
     * 
     */
    private final @Nullable List<String> labels;
    /**
     * The notes of the bookmark
     * 
     */
    private final @Nullable String notes;
    /**
     * The bookmark start time.
     * 
     */
    private final @Nullable String startTimeUtc;

    @CustomType.Constructor
    private BookmarkTimelineItemResponse(
        @CustomType.Parameter("azureResourceId") String azureResourceId,
        @CustomType.Parameter("createdBy") @Nullable UserInfoResponse createdBy,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("endTimeUtc") @Nullable String endTimeUtc,
        @CustomType.Parameter("eventTime") @Nullable String eventTime,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("labels") @Nullable List<String> labels,
        @CustomType.Parameter("notes") @Nullable String notes,
        @CustomType.Parameter("startTimeUtc") @Nullable String startTimeUtc) {
        this.azureResourceId = azureResourceId;
        this.createdBy = createdBy;
        this.displayName = displayName;
        this.endTimeUtc = endTimeUtc;
        this.eventTime = eventTime;
        this.kind = kind;
        this.labels = labels;
        this.notes = notes;
        this.startTimeUtc = startTimeUtc;
    }

    /**
     * The bookmark azure resource id.
     * 
    */
    public String getAzureResourceId() {
        return this.azureResourceId;
    }
    /**
     * Describes a user that created the bookmark
     * 
    */
    public Optional<UserInfoResponse> getCreatedBy() {
        return Optional.ofNullable(this.createdBy);
    }
    /**
     * The bookmark display name.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * The bookmark end time.
     * 
    */
    public Optional<String> getEndTimeUtc() {
        return Optional.ofNullable(this.endTimeUtc);
    }
    /**
     * The bookmark event time.
     * 
    */
    public Optional<String> getEventTime() {
        return Optional.ofNullable(this.eventTime);
    }
    /**
     * The entity query kind
     * Expected value is 'Bookmark'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * List of labels relevant to this bookmark
     * 
    */
    public List<String> getLabels() {
        return this.labels == null ? List.of() : this.labels;
    }
    /**
     * The notes of the bookmark
     * 
    */
    public Optional<String> getNotes() {
        return Optional.ofNullable(this.notes);
    }
    /**
     * The bookmark start time.
     * 
    */
    public Optional<String> getStartTimeUtc() {
        return Optional.ofNullable(this.startTimeUtc);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BookmarkTimelineItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String azureResourceId;
        private @Nullable UserInfoResponse createdBy;
        private @Nullable String displayName;
        private @Nullable String endTimeUtc;
        private @Nullable String eventTime;
        private String kind;
        private @Nullable List<String> labels;
        private @Nullable String notes;
        private @Nullable String startTimeUtc;

        public Builder() {
    	      // Empty
        }

        public Builder(BookmarkTimelineItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureResourceId = defaults.azureResourceId;
    	      this.createdBy = defaults.createdBy;
    	      this.displayName = defaults.displayName;
    	      this.endTimeUtc = defaults.endTimeUtc;
    	      this.eventTime = defaults.eventTime;
    	      this.kind = defaults.kind;
    	      this.labels = defaults.labels;
    	      this.notes = defaults.notes;
    	      this.startTimeUtc = defaults.startTimeUtc;
        }

        public Builder azureResourceId(String azureResourceId) {
            this.azureResourceId = Objects.requireNonNull(azureResourceId);
            return this;
        }

        public Builder createdBy(@Nullable UserInfoResponse createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder endTimeUtc(@Nullable String endTimeUtc) {
            this.endTimeUtc = endTimeUtc;
            return this;
        }

        public Builder eventTime(@Nullable String eventTime) {
            this.eventTime = eventTime;
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder labels(@Nullable List<String> labels) {
            this.labels = labels;
            return this;
        }

        public Builder notes(@Nullable String notes) {
            this.notes = notes;
            return this;
        }

        public Builder startTimeUtc(@Nullable String startTimeUtc) {
            this.startTimeUtc = startTimeUtc;
            return this;
        }
        public BookmarkTimelineItemResponse build() {
            return new BookmarkTimelineItemResponse(azureResourceId, createdBy, displayName, endTimeUtc, eventTime, kind, labels, notes, startTimeUtc);
        }
    }
}

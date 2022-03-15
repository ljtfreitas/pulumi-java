// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.inputs.UserInfoResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents bookmark timeline item.
 * 
 */
public final class BookmarkTimelineItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final BookmarkTimelineItemResponse Empty = new BookmarkTimelineItemResponse();

    /**
     * The bookmark azure resource id.
     * 
     */
    @Import(name="azureResourceId", required=true)
      private final String azureResourceId;

    public String getAzureResourceId() {
        return this.azureResourceId;
    }

    /**
     * Describes a user that created the bookmark
     * 
     */
    @Import(name="createdBy")
      private final @Nullable UserInfoResponse createdBy;

    public Optional<UserInfoResponse> getCreatedBy() {
        return this.createdBy == null ? Optional.empty() : Optional.ofNullable(this.createdBy);
    }

    /**
     * The bookmark display name.
     * 
     */
    @Import(name="displayName")
      private final @Nullable String displayName;

    public Optional<String> getDisplayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * The bookmark end time.
     * 
     */
    @Import(name="endTimeUtc")
      private final @Nullable String endTimeUtc;

    public Optional<String> getEndTimeUtc() {
        return this.endTimeUtc == null ? Optional.empty() : Optional.ofNullable(this.endTimeUtc);
    }

    /**
     * The bookmark event time.
     * 
     */
    @Import(name="eventTime")
      private final @Nullable String eventTime;

    public Optional<String> getEventTime() {
        return this.eventTime == null ? Optional.empty() : Optional.ofNullable(this.eventTime);
    }

    /**
     * The entity query kind
     * Expected value is 'Bookmark'.
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * List of labels relevant to this bookmark
     * 
     */
    @Import(name="labels")
      private final @Nullable List<String> labels;

    public List<String> getLabels() {
        return this.labels == null ? List.of() : this.labels;
    }

    /**
     * The notes of the bookmark
     * 
     */
    @Import(name="notes")
      private final @Nullable String notes;

    public Optional<String> getNotes() {
        return this.notes == null ? Optional.empty() : Optional.ofNullable(this.notes);
    }

    /**
     * The bookmark start time.
     * 
     */
    @Import(name="startTimeUtc")
      private final @Nullable String startTimeUtc;

    public Optional<String> getStartTimeUtc() {
        return this.startTimeUtc == null ? Optional.empty() : Optional.ofNullable(this.startTimeUtc);
    }

    public BookmarkTimelineItemResponse(
        String azureResourceId,
        @Nullable UserInfoResponse createdBy,
        @Nullable String displayName,
        @Nullable String endTimeUtc,
        @Nullable String eventTime,
        String kind,
        @Nullable List<String> labels,
        @Nullable String notes,
        @Nullable String startTimeUtc) {
        this.azureResourceId = Objects.requireNonNull(azureResourceId, "expected parameter 'azureResourceId' to be non-null");
        this.createdBy = createdBy;
        this.displayName = displayName;
        this.endTimeUtc = endTimeUtc;
        this.eventTime = eventTime;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.labels = labels;
        this.notes = notes;
        this.startTimeUtc = startTimeUtc;
    }

    private BookmarkTimelineItemResponse() {
        this.azureResourceId = null;
        this.createdBy = null;
        this.displayName = null;
        this.endTimeUtc = null;
        this.eventTime = null;
        this.kind = null;
        this.labels = List.of();
        this.notes = null;
        this.startTimeUtc = null;
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

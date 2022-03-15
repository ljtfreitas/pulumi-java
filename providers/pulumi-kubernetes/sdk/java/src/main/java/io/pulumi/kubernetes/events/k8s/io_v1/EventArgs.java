// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.events.k8s.io_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.core_v1.inputs.EventSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.ObjectReferenceArgs;
import io.pulumi.kubernetes.events.k8s.io_v1.inputs.EventSeriesArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventArgs Empty = new EventArgs();

    /**
     * action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field cannot be empty for new Events and it can have at most 128 characters.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<String> action;

    public Output<String> getAction() {
        return this.action == null ? Output.empty() : this.action;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
      private final @Nullable Output<String> apiVersion;

    public Output<String> getApiVersion() {
        return this.apiVersion == null ? Output.empty() : this.apiVersion;
    }

    /**
     * deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    @Import(name="deprecatedCount")
      private final @Nullable Output<Integer> deprecatedCount;

    public Output<Integer> getDeprecatedCount() {
        return this.deprecatedCount == null ? Output.empty() : this.deprecatedCount;
    }

    /**
     * deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    @Import(name="deprecatedFirstTimestamp")
      private final @Nullable Output<String> deprecatedFirstTimestamp;

    public Output<String> getDeprecatedFirstTimestamp() {
        return this.deprecatedFirstTimestamp == null ? Output.empty() : this.deprecatedFirstTimestamp;
    }

    /**
     * deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    @Import(name="deprecatedLastTimestamp")
      private final @Nullable Output<String> deprecatedLastTimestamp;

    public Output<String> getDeprecatedLastTimestamp() {
        return this.deprecatedLastTimestamp == null ? Output.empty() : this.deprecatedLastTimestamp;
    }

    /**
     * deprecatedSource is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    @Import(name="deprecatedSource")
      private final @Nullable Output<EventSourceArgs> deprecatedSource;

    public Output<EventSourceArgs> getDeprecatedSource() {
        return this.deprecatedSource == null ? Output.empty() : this.deprecatedSource;
    }

    /**
     * eventTime is the time when this Event was first observed. It is required.
     * 
     */
    @Import(name="eventTime", required=true)
      private final Output<String> eventTime;

    public Output<String> getEventTime() {
        return this.eventTime;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
     * 
     */
    @Import(name="note")
      private final @Nullable Output<String> note;

    public Output<String> getNote() {
        return this.note == null ? Output.empty() : this.note;
    }

    /**
     * reason is why the action was taken. It is human-readable. This field cannot be empty for new Events and it can have at most 128 characters.
     * 
     */
    @Import(name="reason")
      private final @Nullable Output<String> reason;

    public Output<String> getReason() {
        return this.reason == null ? Output.empty() : this.reason;
    }

    /**
     * regarding contains the object this Event is about. In most cases it's an Object reporting controller implements, e.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
     * 
     */
    @Import(name="regarding")
      private final @Nullable Output<ObjectReferenceArgs> regarding;

    public Output<ObjectReferenceArgs> getRegarding() {
        return this.regarding == null ? Output.empty() : this.regarding;
    }

    /**
     * related is the optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
     * 
     */
    @Import(name="related")
      private final @Nullable Output<ObjectReferenceArgs> related;

    public Output<ObjectReferenceArgs> getRelated() {
        return this.related == null ? Output.empty() : this.related;
    }

    /**
     * reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field cannot be empty for new Events.
     * 
     */
    @Import(name="reportingController")
      private final @Nullable Output<String> reportingController;

    public Output<String> getReportingController() {
        return this.reportingController == null ? Output.empty() : this.reportingController;
    }

    /**
     * reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events and it can have at most 128 characters.
     * 
     */
    @Import(name="reportingInstance")
      private final @Nullable Output<String> reportingInstance;

    public Output<String> getReportingInstance() {
        return this.reportingInstance == null ? Output.empty() : this.reportingInstance;
    }

    /**
     * series is data about the Event series this event represents or nil if it's a singleton Event.
     * 
     */
    @Import(name="series")
      private final @Nullable Output<EventSeriesArgs> series;

    public Output<EventSeriesArgs> getSeries() {
        return this.series == null ? Output.empty() : this.series;
    }

    /**
     * type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable. This field cannot be empty for new Events.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public EventArgs(
        @Nullable Output<String> action,
        @Nullable Output<String> apiVersion,
        @Nullable Output<Integer> deprecatedCount,
        @Nullable Output<String> deprecatedFirstTimestamp,
        @Nullable Output<String> deprecatedLastTimestamp,
        @Nullable Output<EventSourceArgs> deprecatedSource,
        Output<String> eventTime,
        @Nullable Output<String> kind,
        @Nullable Output<ObjectMetaArgs> metadata,
        @Nullable Output<String> note,
        @Nullable Output<String> reason,
        @Nullable Output<ObjectReferenceArgs> regarding,
        @Nullable Output<ObjectReferenceArgs> related,
        @Nullable Output<String> reportingController,
        @Nullable Output<String> reportingInstance,
        @Nullable Output<EventSeriesArgs> series,
        @Nullable Output<String> type) {
        this.action = action;
        this.apiVersion = apiVersion;
        this.deprecatedCount = deprecatedCount;
        this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
        this.deprecatedLastTimestamp = deprecatedLastTimestamp;
        this.deprecatedSource = deprecatedSource;
        this.eventTime = Objects.requireNonNull(eventTime, "expected parameter 'eventTime' to be non-null");
        this.kind = kind;
        this.metadata = metadata;
        this.note = note;
        this.reason = reason;
        this.regarding = regarding;
        this.related = related;
        this.reportingController = reportingController;
        this.reportingInstance = reportingInstance;
        this.series = series;
        this.type = type;
    }

    private EventArgs() {
        this.action = Output.empty();
        this.apiVersion = Output.empty();
        this.deprecatedCount = Output.empty();
        this.deprecatedFirstTimestamp = Output.empty();
        this.deprecatedLastTimestamp = Output.empty();
        this.deprecatedSource = Output.empty();
        this.eventTime = Output.empty();
        this.kind = Output.empty();
        this.metadata = Output.empty();
        this.note = Output.empty();
        this.reason = Output.empty();
        this.regarding = Output.empty();
        this.related = Output.empty();
        this.reportingController = Output.empty();
        this.reportingInstance = Output.empty();
        this.series = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> action;
        private @Nullable Output<String> apiVersion;
        private @Nullable Output<Integer> deprecatedCount;
        private @Nullable Output<String> deprecatedFirstTimestamp;
        private @Nullable Output<String> deprecatedLastTimestamp;
        private @Nullable Output<EventSourceArgs> deprecatedSource;
        private Output<String> eventTime;
        private @Nullable Output<String> kind;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private @Nullable Output<String> note;
        private @Nullable Output<String> reason;
        private @Nullable Output<ObjectReferenceArgs> regarding;
        private @Nullable Output<ObjectReferenceArgs> related;
        private @Nullable Output<String> reportingController;
        private @Nullable Output<String> reportingInstance;
        private @Nullable Output<EventSeriesArgs> series;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(EventArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.apiVersion = defaults.apiVersion;
    	      this.deprecatedCount = defaults.deprecatedCount;
    	      this.deprecatedFirstTimestamp = defaults.deprecatedFirstTimestamp;
    	      this.deprecatedLastTimestamp = defaults.deprecatedLastTimestamp;
    	      this.deprecatedSource = defaults.deprecatedSource;
    	      this.eventTime = defaults.eventTime;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.note = defaults.note;
    	      this.reason = defaults.reason;
    	      this.regarding = defaults.regarding;
    	      this.related = defaults.related;
    	      this.reportingController = defaults.reportingController;
    	      this.reportingInstance = defaults.reportingInstance;
    	      this.series = defaults.series;
    	      this.type = defaults.type;
        }

        public Builder action(@Nullable Output<String> action) {
            this.action = action;
            return this;
        }

        public Builder action(@Nullable String action) {
            this.action = Output.ofNullable(action);
            return this;
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Output.ofNullable(apiVersion);
            return this;
        }

        public Builder deprecatedCount(@Nullable Output<Integer> deprecatedCount) {
            this.deprecatedCount = deprecatedCount;
            return this;
        }

        public Builder deprecatedCount(@Nullable Integer deprecatedCount) {
            this.deprecatedCount = Output.ofNullable(deprecatedCount);
            return this;
        }

        public Builder deprecatedFirstTimestamp(@Nullable Output<String> deprecatedFirstTimestamp) {
            this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
            return this;
        }

        public Builder deprecatedFirstTimestamp(@Nullable String deprecatedFirstTimestamp) {
            this.deprecatedFirstTimestamp = Output.ofNullable(deprecatedFirstTimestamp);
            return this;
        }

        public Builder deprecatedLastTimestamp(@Nullable Output<String> deprecatedLastTimestamp) {
            this.deprecatedLastTimestamp = deprecatedLastTimestamp;
            return this;
        }

        public Builder deprecatedLastTimestamp(@Nullable String deprecatedLastTimestamp) {
            this.deprecatedLastTimestamp = Output.ofNullable(deprecatedLastTimestamp);
            return this;
        }

        public Builder deprecatedSource(@Nullable Output<EventSourceArgs> deprecatedSource) {
            this.deprecatedSource = deprecatedSource;
            return this;
        }

        public Builder deprecatedSource(@Nullable EventSourceArgs deprecatedSource) {
            this.deprecatedSource = Output.ofNullable(deprecatedSource);
            return this;
        }

        public Builder eventTime(Output<String> eventTime) {
            this.eventTime = Objects.requireNonNull(eventTime);
            return this;
        }

        public Builder eventTime(String eventTime) {
            this.eventTime = Output.of(Objects.requireNonNull(eventTime));
            return this;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }

        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }

        public Builder note(@Nullable Output<String> note) {
            this.note = note;
            return this;
        }

        public Builder note(@Nullable String note) {
            this.note = Output.ofNullable(note);
            return this;
        }

        public Builder reason(@Nullable Output<String> reason) {
            this.reason = reason;
            return this;
        }

        public Builder reason(@Nullable String reason) {
            this.reason = Output.ofNullable(reason);
            return this;
        }

        public Builder regarding(@Nullable Output<ObjectReferenceArgs> regarding) {
            this.regarding = regarding;
            return this;
        }

        public Builder regarding(@Nullable ObjectReferenceArgs regarding) {
            this.regarding = Output.ofNullable(regarding);
            return this;
        }

        public Builder related(@Nullable Output<ObjectReferenceArgs> related) {
            this.related = related;
            return this;
        }

        public Builder related(@Nullable ObjectReferenceArgs related) {
            this.related = Output.ofNullable(related);
            return this;
        }

        public Builder reportingController(@Nullable Output<String> reportingController) {
            this.reportingController = reportingController;
            return this;
        }

        public Builder reportingController(@Nullable String reportingController) {
            this.reportingController = Output.ofNullable(reportingController);
            return this;
        }

        public Builder reportingInstance(@Nullable Output<String> reportingInstance) {
            this.reportingInstance = reportingInstance;
            return this;
        }

        public Builder reportingInstance(@Nullable String reportingInstance) {
            this.reportingInstance = Output.ofNullable(reportingInstance);
            return this;
        }

        public Builder series(@Nullable Output<EventSeriesArgs> series) {
            this.series = series;
            return this;
        }

        public Builder series(@Nullable EventSeriesArgs series) {
            this.series = Output.ofNullable(series);
            return this;
        }

        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public EventArgs build() {
            return new EventArgs(action, apiVersion, deprecatedCount, deprecatedFirstTimestamp, deprecatedLastTimestamp, deprecatedSource, eventTime, kind, metadata, note, reason, regarding, related, reportingController, reportingInstance, series, type);
        }
    }
}

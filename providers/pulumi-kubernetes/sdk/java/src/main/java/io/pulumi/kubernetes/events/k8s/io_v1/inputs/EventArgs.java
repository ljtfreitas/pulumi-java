// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.events.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.EventSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.ObjectReferenceArgs;
import io.pulumi.kubernetes.events.k8s.io_v1.inputs.EventSeriesArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Event is a report of an event somewhere in the cluster. It generally denotes some state change in the system. Events have a limited retention time and triggers and messages may evolve with time.  Event consumers should not rely on the timing of an event with a given Reason reflecting a consistent underlying trigger, or the continued existence of events with that Reason.  Events should be treated as informative, best-effort, supplemental data.
 * 
 */
public final class EventArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventArgs Empty = new EventArgs();

    /**
     * action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field cannot be empty for new Events and it can have at most 128 characters.
     * 
     */
    @InputImport(name="action")
        private final @Nullable Input<String> action;

    public Input<String> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @InputImport(name="apiVersion")
        private final @Nullable Input<String> apiVersion;

    public Input<String> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
    }

    /**
     * deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    @InputImport(name="deprecatedCount")
        private final @Nullable Input<Integer> deprecatedCount;

    public Input<Integer> getDeprecatedCount() {
        return this.deprecatedCount == null ? Input.empty() : this.deprecatedCount;
    }

    /**
     * deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    @InputImport(name="deprecatedFirstTimestamp")
        private final @Nullable Input<String> deprecatedFirstTimestamp;

    public Input<String> getDeprecatedFirstTimestamp() {
        return this.deprecatedFirstTimestamp == null ? Input.empty() : this.deprecatedFirstTimestamp;
    }

    /**
     * deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    @InputImport(name="deprecatedLastTimestamp")
        private final @Nullable Input<String> deprecatedLastTimestamp;

    public Input<String> getDeprecatedLastTimestamp() {
        return this.deprecatedLastTimestamp == null ? Input.empty() : this.deprecatedLastTimestamp;
    }

    /**
     * deprecatedSource is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    @InputImport(name="deprecatedSource")
        private final @Nullable Input<EventSourceArgs> deprecatedSource;

    public Input<EventSourceArgs> getDeprecatedSource() {
        return this.deprecatedSource == null ? Input.empty() : this.deprecatedSource;
    }

    /**
     * eventTime is the time when this Event was first observed. It is required.
     * 
     */
    @InputImport(name="eventTime", required=true)
        private final Input<String> eventTime;

    public Input<String> getEventTime() {
        return this.eventTime;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @InputImport(name="kind")
        private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @InputImport(name="metadata")
        private final @Nullable Input<ObjectMetaArgs> metadata;

    public Input<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
     * 
     */
    @InputImport(name="note")
        private final @Nullable Input<String> note;

    public Input<String> getNote() {
        return this.note == null ? Input.empty() : this.note;
    }

    /**
     * reason is why the action was taken. It is human-readable. This field cannot be empty for new Events and it can have at most 128 characters.
     * 
     */
    @InputImport(name="reason")
        private final @Nullable Input<String> reason;

    public Input<String> getReason() {
        return this.reason == null ? Input.empty() : this.reason;
    }

    /**
     * regarding contains the object this Event is about. In most cases it's an Object reporting controller implements, e.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
     * 
     */
    @InputImport(name="regarding")
        private final @Nullable Input<ObjectReferenceArgs> regarding;

    public Input<ObjectReferenceArgs> getRegarding() {
        return this.regarding == null ? Input.empty() : this.regarding;
    }

    /**
     * related is the optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
     * 
     */
    @InputImport(name="related")
        private final @Nullable Input<ObjectReferenceArgs> related;

    public Input<ObjectReferenceArgs> getRelated() {
        return this.related == null ? Input.empty() : this.related;
    }

    /**
     * reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field cannot be empty for new Events.
     * 
     */
    @InputImport(name="reportingController")
        private final @Nullable Input<String> reportingController;

    public Input<String> getReportingController() {
        return this.reportingController == null ? Input.empty() : this.reportingController;
    }

    /**
     * reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events and it can have at most 128 characters.
     * 
     */
    @InputImport(name="reportingInstance")
        private final @Nullable Input<String> reportingInstance;

    public Input<String> getReportingInstance() {
        return this.reportingInstance == null ? Input.empty() : this.reportingInstance;
    }

    /**
     * series is data about the Event series this event represents or nil if it's a singleton Event.
     * 
     */
    @InputImport(name="series")
        private final @Nullable Input<EventSeriesArgs> series;

    public Input<EventSeriesArgs> getSeries() {
        return this.series == null ? Input.empty() : this.series;
    }

    /**
     * type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable. This field cannot be empty for new Events.
     * 
     */
    @InputImport(name="type")
        private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public EventArgs(
        @Nullable Input<String> action,
        @Nullable Input<String> apiVersion,
        @Nullable Input<Integer> deprecatedCount,
        @Nullable Input<String> deprecatedFirstTimestamp,
        @Nullable Input<String> deprecatedLastTimestamp,
        @Nullable Input<EventSourceArgs> deprecatedSource,
        Input<String> eventTime,
        @Nullable Input<String> kind,
        @Nullable Input<ObjectMetaArgs> metadata,
        @Nullable Input<String> note,
        @Nullable Input<String> reason,
        @Nullable Input<ObjectReferenceArgs> regarding,
        @Nullable Input<ObjectReferenceArgs> related,
        @Nullable Input<String> reportingController,
        @Nullable Input<String> reportingInstance,
        @Nullable Input<EventSeriesArgs> series,
        @Nullable Input<String> type) {
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
        this.action = Input.empty();
        this.apiVersion = Input.empty();
        this.deprecatedCount = Input.empty();
        this.deprecatedFirstTimestamp = Input.empty();
        this.deprecatedLastTimestamp = Input.empty();
        this.deprecatedSource = Input.empty();
        this.eventTime = Input.empty();
        this.kind = Input.empty();
        this.metadata = Input.empty();
        this.note = Input.empty();
        this.reason = Input.empty();
        this.regarding = Input.empty();
        this.related = Input.empty();
        this.reportingController = Input.empty();
        this.reportingInstance = Input.empty();
        this.series = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> action;
        private @Nullable Input<String> apiVersion;
        private @Nullable Input<Integer> deprecatedCount;
        private @Nullable Input<String> deprecatedFirstTimestamp;
        private @Nullable Input<String> deprecatedLastTimestamp;
        private @Nullable Input<EventSourceArgs> deprecatedSource;
        private Input<String> eventTime;
        private @Nullable Input<String> kind;
        private @Nullable Input<ObjectMetaArgs> metadata;
        private @Nullable Input<String> note;
        private @Nullable Input<String> reason;
        private @Nullable Input<ObjectReferenceArgs> regarding;
        private @Nullable Input<ObjectReferenceArgs> related;
        private @Nullable Input<String> reportingController;
        private @Nullable Input<String> reportingInstance;
        private @Nullable Input<EventSeriesArgs> series;
        private @Nullable Input<String> type;

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

        public Builder setAction(@Nullable Input<String> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable String action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setApiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder setDeprecatedCount(@Nullable Input<Integer> deprecatedCount) {
            this.deprecatedCount = deprecatedCount;
            return this;
        }

        public Builder setDeprecatedCount(@Nullable Integer deprecatedCount) {
            this.deprecatedCount = Input.ofNullable(deprecatedCount);
            return this;
        }

        public Builder setDeprecatedFirstTimestamp(@Nullable Input<String> deprecatedFirstTimestamp) {
            this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
            return this;
        }

        public Builder setDeprecatedFirstTimestamp(@Nullable String deprecatedFirstTimestamp) {
            this.deprecatedFirstTimestamp = Input.ofNullable(deprecatedFirstTimestamp);
            return this;
        }

        public Builder setDeprecatedLastTimestamp(@Nullable Input<String> deprecatedLastTimestamp) {
            this.deprecatedLastTimestamp = deprecatedLastTimestamp;
            return this;
        }

        public Builder setDeprecatedLastTimestamp(@Nullable String deprecatedLastTimestamp) {
            this.deprecatedLastTimestamp = Input.ofNullable(deprecatedLastTimestamp);
            return this;
        }

        public Builder setDeprecatedSource(@Nullable Input<EventSourceArgs> deprecatedSource) {
            this.deprecatedSource = deprecatedSource;
            return this;
        }

        public Builder setDeprecatedSource(@Nullable EventSourceArgs deprecatedSource) {
            this.deprecatedSource = Input.ofNullable(deprecatedSource);
            return this;
        }

        public Builder setEventTime(Input<String> eventTime) {
            this.eventTime = Objects.requireNonNull(eventTime);
            return this;
        }

        public Builder setEventTime(String eventTime) {
            this.eventTime = Input.of(Objects.requireNonNull(eventTime));
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setMetadata(@Nullable Input<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setNote(@Nullable Input<String> note) {
            this.note = note;
            return this;
        }

        public Builder setNote(@Nullable String note) {
            this.note = Input.ofNullable(note);
            return this;
        }

        public Builder setReason(@Nullable Input<String> reason) {
            this.reason = reason;
            return this;
        }

        public Builder setReason(@Nullable String reason) {
            this.reason = Input.ofNullable(reason);
            return this;
        }

        public Builder setRegarding(@Nullable Input<ObjectReferenceArgs> regarding) {
            this.regarding = regarding;
            return this;
        }

        public Builder setRegarding(@Nullable ObjectReferenceArgs regarding) {
            this.regarding = Input.ofNullable(regarding);
            return this;
        }

        public Builder setRelated(@Nullable Input<ObjectReferenceArgs> related) {
            this.related = related;
            return this;
        }

        public Builder setRelated(@Nullable ObjectReferenceArgs related) {
            this.related = Input.ofNullable(related);
            return this;
        }

        public Builder setReportingController(@Nullable Input<String> reportingController) {
            this.reportingController = reportingController;
            return this;
        }

        public Builder setReportingController(@Nullable String reportingController) {
            this.reportingController = Input.ofNullable(reportingController);
            return this;
        }

        public Builder setReportingInstance(@Nullable Input<String> reportingInstance) {
            this.reportingInstance = reportingInstance;
            return this;
        }

        public Builder setReportingInstance(@Nullable String reportingInstance) {
            this.reportingInstance = Input.ofNullable(reportingInstance);
            return this;
        }

        public Builder setSeries(@Nullable Input<EventSeriesArgs> series) {
            this.series = series;
            return this;
        }

        public Builder setSeries(@Nullable EventSeriesArgs series) {
            this.series = Input.ofNullable(series);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public EventArgs build() {
            return new EventArgs(action, apiVersion, deprecatedCount, deprecatedFirstTimestamp, deprecatedLastTimestamp, deprecatedSource, eventTime, kind, metadata, note, reason, regarding, related, reportingController, reportingInstance, series, type);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.events.k8s.io_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.EventSource;
import io.pulumi.kubernetes.core_v1.outputs.ObjectReference;
import io.pulumi.kubernetes.events.k8s.io_v1.outputs.EventSeries;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class Event {
    /**
     * action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field cannot be empty for new Events and it can have at most 128 characters.
     * 
     */
    private final @Nullable String action;
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    private final @Nullable String apiVersion;
    /**
     * deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    private final @Nullable Integer deprecatedCount;
    /**
     * deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    private final @Nullable String deprecatedFirstTimestamp;
    /**
     * deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    private final @Nullable String deprecatedLastTimestamp;
    /**
     * deprecatedSource is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    private final @Nullable EventSource deprecatedSource;
    /**
     * eventTime is the time when this Event was first observed. It is required.
     * 
     */
    private final String eventTime;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private final @Nullable String kind;
    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    private final @Nullable ObjectMeta metadata;
    /**
     * note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
     * 
     */
    private final @Nullable String note;
    /**
     * reason is why the action was taken. It is human-readable. This field cannot be empty for new Events and it can have at most 128 characters.
     * 
     */
    private final @Nullable String reason;
    /**
     * regarding contains the object this Event is about. In most cases it's an Object reporting controller implements, e.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
     * 
     */
    private final @Nullable ObjectReference regarding;
    /**
     * related is the optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
     * 
     */
    private final @Nullable ObjectReference related;
    /**
     * reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field cannot be empty for new Events.
     * 
     */
    private final @Nullable String reportingController;
    /**
     * reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events and it can have at most 128 characters.
     * 
     */
    private final @Nullable String reportingInstance;
    /**
     * series is data about the Event series this event represents or nil if it's a singleton Event.
     * 
     */
    private final @Nullable EventSeries series;
    /**
     * type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable. This field cannot be empty for new Events.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"action","apiVersion","deprecatedCount","deprecatedFirstTimestamp","deprecatedLastTimestamp","deprecatedSource","eventTime","kind","metadata","note","reason","regarding","related","reportingController","reportingInstance","series","type"})
    private Event(
        @Nullable String action,
        @Nullable String apiVersion,
        @Nullable Integer deprecatedCount,
        @Nullable String deprecatedFirstTimestamp,
        @Nullable String deprecatedLastTimestamp,
        @Nullable EventSource deprecatedSource,
        String eventTime,
        @Nullable String kind,
        @Nullable ObjectMeta metadata,
        @Nullable String note,
        @Nullable String reason,
        @Nullable ObjectReference regarding,
        @Nullable ObjectReference related,
        @Nullable String reportingController,
        @Nullable String reportingInstance,
        @Nullable EventSeries series,
        @Nullable String type) {
        this.action = action;
        this.apiVersion = apiVersion;
        this.deprecatedCount = deprecatedCount;
        this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
        this.deprecatedLastTimestamp = deprecatedLastTimestamp;
        this.deprecatedSource = deprecatedSource;
        this.eventTime = Objects.requireNonNull(eventTime);
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

    /**
     * action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field cannot be empty for new Events and it can have at most 128 characters.
     * 
     */
    public Optional<String> getAction() {
        return Optional.ofNullable(this.action);
    }
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Optional<String> getApiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    public Optional<Integer> getDeprecatedCount() {
        return Optional.ofNullable(this.deprecatedCount);
    }
    /**
     * deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    public Optional<String> getDeprecatedFirstTimestamp() {
        return Optional.ofNullable(this.deprecatedFirstTimestamp);
    }
    /**
     * deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    public Optional<String> getDeprecatedLastTimestamp() {
        return Optional.ofNullable(this.deprecatedLastTimestamp);
    }
    /**
     * deprecatedSource is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    public Optional<EventSource> getDeprecatedSource() {
        return Optional.ofNullable(this.deprecatedSource);
    }
    /**
     * eventTime is the time when this Event was first observed. It is required.
     * 
     */
    public String getEventTime() {
        return this.eventTime;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Optional<ObjectMeta> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
     * 
     */
    public Optional<String> getNote() {
        return Optional.ofNullable(this.note);
    }
    /**
     * reason is why the action was taken. It is human-readable. This field cannot be empty for new Events and it can have at most 128 characters.
     * 
     */
    public Optional<String> getReason() {
        return Optional.ofNullable(this.reason);
    }
    /**
     * regarding contains the object this Event is about. In most cases it's an Object reporting controller implements, e.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
     * 
     */
    public Optional<ObjectReference> getRegarding() {
        return Optional.ofNullable(this.regarding);
    }
    /**
     * related is the optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
     * 
     */
    public Optional<ObjectReference> getRelated() {
        return Optional.ofNullable(this.related);
    }
    /**
     * reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field cannot be empty for new Events.
     * 
     */
    public Optional<String> getReportingController() {
        return Optional.ofNullable(this.reportingController);
    }
    /**
     * reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events and it can have at most 128 characters.
     * 
     */
    public Optional<String> getReportingInstance() {
        return Optional.ofNullable(this.reportingInstance);
    }
    /**
     * series is data about the Event series this event represents or nil if it's a singleton Event.
     * 
     */
    public Optional<EventSeries> getSeries() {
        return Optional.ofNullable(this.series);
    }
    /**
     * type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable. This field cannot be empty for new Events.
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Event defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private @Nullable String apiVersion;
        private @Nullable Integer deprecatedCount;
        private @Nullable String deprecatedFirstTimestamp;
        private @Nullable String deprecatedLastTimestamp;
        private @Nullable EventSource deprecatedSource;
        private String eventTime;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable String note;
        private @Nullable String reason;
        private @Nullable ObjectReference regarding;
        private @Nullable ObjectReference related;
        private @Nullable String reportingController;
        private @Nullable String reportingInstance;
        private @Nullable EventSeries series;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(Event defaults) {
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

        public Builder setAction(@Nullable String action) {
            this.action = action;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setDeprecatedCount(@Nullable Integer deprecatedCount) {
            this.deprecatedCount = deprecatedCount;
            return this;
        }

        public Builder setDeprecatedFirstTimestamp(@Nullable String deprecatedFirstTimestamp) {
            this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
            return this;
        }

        public Builder setDeprecatedLastTimestamp(@Nullable String deprecatedLastTimestamp) {
            this.deprecatedLastTimestamp = deprecatedLastTimestamp;
            return this;
        }

        public Builder setDeprecatedSource(@Nullable EventSource deprecatedSource) {
            this.deprecatedSource = deprecatedSource;
            return this;
        }

        public Builder setEventTime(String eventTime) {
            this.eventTime = Objects.requireNonNull(eventTime);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setMetadata(@Nullable ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setNote(@Nullable String note) {
            this.note = note;
            return this;
        }

        public Builder setReason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }

        public Builder setRegarding(@Nullable ObjectReference regarding) {
            this.regarding = regarding;
            return this;
        }

        public Builder setRelated(@Nullable ObjectReference related) {
            this.related = related;
            return this;
        }

        public Builder setReportingController(@Nullable String reportingController) {
            this.reportingController = reportingController;
            return this;
        }

        public Builder setReportingInstance(@Nullable String reportingInstance) {
            this.reportingInstance = reportingInstance;
            return this;
        }

        public Builder setSeries(@Nullable EventSeries series) {
            this.series = series;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Event build() {
            return new Event(action, apiVersion, deprecatedCount, deprecatedFirstTimestamp, deprecatedLastTimestamp, deprecatedSource, eventTime, kind, metadata, note, reason, regarding, related, reportingController, reportingInstance, series, type);
        }
    }
}

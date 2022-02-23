// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.meta_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class Condition {
    /**
     * lastTransitionTime is the last time the condition transitioned from one status to another. This should be when the underlying condition changed.  If that is not known, then using the time when the API field changed is acceptable.
     * 
     */
    private final String lastTransitionTime;
    /**
     * message is a human readable message indicating details about the transition. This may be an empty string.
     * 
     */
    private final String message;
    /**
     * observedGeneration represents the .metadata.generation that the condition was set based upon. For instance, if .metadata.generation is currently 12, but the .status.conditions[x].observedGeneration is 9, the condition is out of date with respect to the current state of the instance.
     * 
     */
    private final @Nullable Integer observedGeneration;
    /**
     * reason contains a programmatic identifier indicating the reason for the condition's last transition. Producers of specific condition types may define expected values and meanings for this field, and whether the values are considered a guaranteed API. The value should be a CamelCase string. This field may not be empty.
     * 
     */
    private final String reason;
    /**
     * status of the condition, one of True, False, Unknown.
     * 
     */
    private final String status;
    /**
     * type of condition in CamelCase or in foo.example.com/CamelCase.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"lastTransitionTime","message","observedGeneration","reason","status","type"})
    private Condition(
        String lastTransitionTime,
        String message,
        @Nullable Integer observedGeneration,
        String reason,
        String status,
        String type) {
        this.lastTransitionTime = Objects.requireNonNull(lastTransitionTime);
        this.message = Objects.requireNonNull(message);
        this.observedGeneration = observedGeneration;
        this.reason = Objects.requireNonNull(reason);
        this.status = Objects.requireNonNull(status);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * lastTransitionTime is the last time the condition transitioned from one status to another. This should be when the underlying condition changed.  If that is not known, then using the time when the API field changed is acceptable.
     * 
     */
    public String getLastTransitionTime() {
        return this.lastTransitionTime;
    }
    /**
     * message is a human readable message indicating details about the transition. This may be an empty string.
     * 
     */
    public String getMessage() {
        return this.message;
    }
    /**
     * observedGeneration represents the .metadata.generation that the condition was set based upon. For instance, if .metadata.generation is currently 12, but the .status.conditions[x].observedGeneration is 9, the condition is out of date with respect to the current state of the instance.
     * 
     */
    public Optional<Integer> getObservedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }
    /**
     * reason contains a programmatic identifier indicating the reason for the condition's last transition. Producers of specific condition types may define expected values and meanings for this field, and whether the values are considered a guaranteed API. The value should be a CamelCase string. This field may not be empty.
     * 
     */
    public String getReason() {
        return this.reason;
    }
    /**
     * status of the condition, one of True, False, Unknown.
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * type of condition in CamelCase or in foo.example.com/CamelCase.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Condition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastTransitionTime;
        private String message;
        private @Nullable Integer observedGeneration;
        private String reason;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(Condition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setLastTransitionTime(String lastTransitionTime) {
            this.lastTransitionTime = Objects.requireNonNull(lastTransitionTime);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setObservedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = Objects.requireNonNull(reason);
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
        public Condition build() {
            return new Condition(lastTransitionTime, message, observedGeneration, reason, status, type);
        }
    }
}

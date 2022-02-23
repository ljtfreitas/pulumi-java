// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CustomResourceDefinitionCondition {
    /**
     * lastTransitionTime last time the condition transitioned from one status to another.
     * 
     */
    private final @Nullable String lastTransitionTime;
    /**
     * message is a human-readable message indicating details about last transition.
     * 
     */
    private final @Nullable String message;
    /**
     * reason is a unique, one-word, CamelCase reason for the condition's last transition.
     * 
     */
    private final @Nullable String reason;
    /**
     * status is the status of the condition. Can be True, False, Unknown.
     * 
     */
    private final String status;
    /**
     * type is the type of the condition. Types include Established, NamesAccepted and Terminating.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"lastTransitionTime","message","reason","status","type"})
    private CustomResourceDefinitionCondition(
        @Nullable String lastTransitionTime,
        @Nullable String message,
        @Nullable String reason,
        String status,
        String type) {
        this.lastTransitionTime = lastTransitionTime;
        this.message = message;
        this.reason = reason;
        this.status = Objects.requireNonNull(status);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * lastTransitionTime last time the condition transitioned from one status to another.
     * 
     */
    public Optional<String> getLastTransitionTime() {
        return Optional.ofNullable(this.lastTransitionTime);
    }
    /**
     * message is a human-readable message indicating details about last transition.
     * 
     */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    /**
     * reason is a unique, one-word, CamelCase reason for the condition's last transition.
     * 
     */
    public Optional<String> getReason() {
        return Optional.ofNullable(this.reason);
    }
    /**
     * status is the status of the condition. Can be True, False, Unknown.
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * type is the type of the condition. Types include Established, NamesAccepted and Terminating.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceDefinitionCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lastTransitionTime;
        private @Nullable String message;
        private @Nullable String reason;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceDefinitionCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setLastTransitionTime(@Nullable String lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setReason(@Nullable String reason) {
            this.reason = reason;
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
        public CustomResourceDefinitionCondition build() {
            return new CustomResourceDefinitionCondition(lastTransitionTime, message, reason, status, type);
        }
    }
}

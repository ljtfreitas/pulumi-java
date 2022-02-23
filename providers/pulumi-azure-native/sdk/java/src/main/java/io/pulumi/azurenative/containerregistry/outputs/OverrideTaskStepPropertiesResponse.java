// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.ArgumentResponse;
import io.pulumi.azurenative.containerregistry.outputs.SetValueResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OverrideTaskStepPropertiesResponse {
    /**
     * Gets or sets the collection of override arguments to be used when
     * executing a build step.
     * 
     */
    private final @Nullable List<ArgumentResponse> arguments;
    /**
     * The source context against which run has to be queued.
     * 
     */
    private final @Nullable String contextPath;
    /**
     * The file against which run has to be queued.
     * 
     */
    private final @Nullable String file;
    /**
     * The name of the target build stage for the docker build.
     * 
     */
    private final @Nullable String target;
    /**
     * Base64 encoded update trigger token that will be attached with the base image trigger webhook.
     * 
     */
    private final @Nullable String updateTriggerToken;
    /**
     * The collection of overridable values that can be passed when running a Task.
     * 
     */
    private final @Nullable List<SetValueResponse> values;

    @OutputCustomType.Constructor({"arguments","contextPath","file","target","updateTriggerToken","values"})
    private OverrideTaskStepPropertiesResponse(
        @Nullable List<ArgumentResponse> arguments,
        @Nullable String contextPath,
        @Nullable String file,
        @Nullable String target,
        @Nullable String updateTriggerToken,
        @Nullable List<SetValueResponse> values) {
        this.arguments = arguments;
        this.contextPath = contextPath;
        this.file = file;
        this.target = target;
        this.updateTriggerToken = updateTriggerToken;
        this.values = values;
    }

    /**
     * Gets or sets the collection of override arguments to be used when
     * executing a build step.
     * 
     */
    public List<ArgumentResponse> getArguments() {
        return this.arguments == null ? List.of() : this.arguments;
    }
    /**
     * The source context against which run has to be queued.
     * 
     */
    public Optional<String> getContextPath() {
        return Optional.ofNullable(this.contextPath);
    }
    /**
     * The file against which run has to be queued.
     * 
     */
    public Optional<String> getFile() {
        return Optional.ofNullable(this.file);
    }
    /**
     * The name of the target build stage for the docker build.
     * 
     */
    public Optional<String> getTarget() {
        return Optional.ofNullable(this.target);
    }
    /**
     * Base64 encoded update trigger token that will be attached with the base image trigger webhook.
     * 
     */
    public Optional<String> getUpdateTriggerToken() {
        return Optional.ofNullable(this.updateTriggerToken);
    }
    /**
     * The collection of overridable values that can be passed when running a Task.
     * 
     */
    public List<SetValueResponse> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OverrideTaskStepPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ArgumentResponse> arguments;
        private @Nullable String contextPath;
        private @Nullable String file;
        private @Nullable String target;
        private @Nullable String updateTriggerToken;
        private @Nullable List<SetValueResponse> values;

        public Builder() {
    	      // Empty
        }

        public Builder(OverrideTaskStepPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.contextPath = defaults.contextPath;
    	      this.file = defaults.file;
    	      this.target = defaults.target;
    	      this.updateTriggerToken = defaults.updateTriggerToken;
    	      this.values = defaults.values;
        }

        public Builder setArguments(@Nullable List<ArgumentResponse> arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder setContextPath(@Nullable String contextPath) {
            this.contextPath = contextPath;
            return this;
        }

        public Builder setFile(@Nullable String file) {
            this.file = file;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = target;
            return this;
        }

        public Builder setUpdateTriggerToken(@Nullable String updateTriggerToken) {
            this.updateTriggerToken = updateTriggerToken;
            return this;
        }

        public Builder setValues(@Nullable List<SetValueResponse> values) {
            this.values = values;
            return this;
        }
        public OverrideTaskStepPropertiesResponse build() {
            return new OverrideTaskStepPropertiesResponse(arguments, contextPath, file, target, updateTriggerToken, values);
        }
    }
}

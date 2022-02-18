// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.BaseImageDependencyResponse;
import io.pulumi.azurenative.containerregistry.outputs.SetValueResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EncodedTaskStepResponse {
    /**
     * List of base image dependencies for a step.
     * 
     */
    private final List<BaseImageDependencyResponse> baseImageDependencies;
    /**
     * The token (git PAT or SAS token of storage account blob) associated with the context for a step.
     * 
     */
    private final @Nullable String contextAccessToken;
    /**
     * The URL(absolute or relative) of the source context for the task step.
     * 
     */
    private final @Nullable String contextPath;
    /**
     * Base64 encoded value of the template/definition file content.
     * 
     */
    private final String encodedTaskContent;
    /**
     * Base64 encoded value of the parameters/values file content.
     * 
     */
    private final @Nullable String encodedValuesContent;
    /**
     * The type of the step.
     * Expected value is 'EncodedTask'.
     * 
     */
    private final String type;
    /**
     * The collection of overridable values that can be passed when running a task.
     * 
     */
    private final @Nullable List<SetValueResponse> values;

    @OutputCustomType.Constructor({"baseImageDependencies","contextAccessToken","contextPath","encodedTaskContent","encodedValuesContent","type","values"})
    private EncodedTaskStepResponse(
        List<BaseImageDependencyResponse> baseImageDependencies,
        @Nullable String contextAccessToken,
        @Nullable String contextPath,
        String encodedTaskContent,
        @Nullable String encodedValuesContent,
        String type,
        @Nullable List<SetValueResponse> values) {
        this.baseImageDependencies = Objects.requireNonNull(baseImageDependencies);
        this.contextAccessToken = contextAccessToken;
        this.contextPath = contextPath;
        this.encodedTaskContent = Objects.requireNonNull(encodedTaskContent);
        this.encodedValuesContent = encodedValuesContent;
        this.type = Objects.requireNonNull(type);
        this.values = values;
    }

    /**
     * List of base image dependencies for a step.
     * 
     */
    public List<BaseImageDependencyResponse> getBaseImageDependencies() {
        return this.baseImageDependencies;
    }
    /**
     * The token (git PAT or SAS token of storage account blob) associated with the context for a step.
     * 
     */
    public Optional<String> getContextAccessToken() {
        return Optional.ofNullable(this.contextAccessToken);
    }
    /**
     * The URL(absolute or relative) of the source context for the task step.
     * 
     */
    public Optional<String> getContextPath() {
        return Optional.ofNullable(this.contextPath);
    }
    /**
     * Base64 encoded value of the template/definition file content.
     * 
     */
    public String getEncodedTaskContent() {
        return this.encodedTaskContent;
    }
    /**
     * Base64 encoded value of the parameters/values file content.
     * 
     */
    public Optional<String> getEncodedValuesContent() {
        return Optional.ofNullable(this.encodedValuesContent);
    }
    /**
     * The type of the step.
     * Expected value is 'EncodedTask'.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The collection of overridable values that can be passed when running a task.
     * 
     */
    public List<SetValueResponse> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncodedTaskStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BaseImageDependencyResponse> baseImageDependencies;
        private @Nullable String contextAccessToken;
        private @Nullable String contextPath;
        private String encodedTaskContent;
        private @Nullable String encodedValuesContent;
        private String type;
        private @Nullable List<SetValueResponse> values;

        public Builder() {
    	      // Empty
        }

        public Builder(EncodedTaskStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseImageDependencies = defaults.baseImageDependencies;
    	      this.contextAccessToken = defaults.contextAccessToken;
    	      this.contextPath = defaults.contextPath;
    	      this.encodedTaskContent = defaults.encodedTaskContent;
    	      this.encodedValuesContent = defaults.encodedValuesContent;
    	      this.type = defaults.type;
    	      this.values = defaults.values;
        }

        public Builder setBaseImageDependencies(List<BaseImageDependencyResponse> baseImageDependencies) {
            this.baseImageDependencies = Objects.requireNonNull(baseImageDependencies);
            return this;
        }

        public Builder setContextAccessToken(@Nullable String contextAccessToken) {
            this.contextAccessToken = contextAccessToken;
            return this;
        }

        public Builder setContextPath(@Nullable String contextPath) {
            this.contextPath = contextPath;
            return this;
        }

        public Builder setEncodedTaskContent(String encodedTaskContent) {
            this.encodedTaskContent = Objects.requireNonNull(encodedTaskContent);
            return this;
        }

        public Builder setEncodedValuesContent(@Nullable String encodedValuesContent) {
            this.encodedValuesContent = encodedValuesContent;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValues(@Nullable List<SetValueResponse> values) {
            this.values = values;
            return this;
        }

        public EncodedTaskStepResponse build() {
            return new EncodedTaskStepResponse(baseImageDependencies, contextAccessToken, contextPath, encodedTaskContent, encodedValuesContent, type, values);
        }
    }
}

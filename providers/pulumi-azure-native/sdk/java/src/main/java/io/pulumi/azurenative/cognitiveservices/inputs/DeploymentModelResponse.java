// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of Cognitive Services account deployment model.
 * 
 */
public final class DeploymentModelResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeploymentModelResponse Empty = new DeploymentModelResponse();

    /**
     * Deployment model format.
     * 
     */
    @InputImport(name="format")
        private final @Nullable String format;

    public Optional<String> getFormat() {
        return this.format == null ? Optional.empty() : Optional.ofNullable(this.format);
    }

    /**
     * Deployment model name.
     * 
     */
    @InputImport(name="name")
        private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Deployment model version.
     * 
     */
    @InputImport(name="version")
        private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public DeploymentModelResponse(
        @Nullable String format,
        @Nullable String name,
        @Nullable String version) {
        this.format = format;
        this.name = name;
        this.version = version;
    }

    private DeploymentModelResponse() {
        this.format = null;
        this.name = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentModelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String format;
        private @Nullable String name;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentModelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.format = defaults.format;
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder setFormat(@Nullable String format) {
            this.format = format;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public DeploymentModelResponse build() {
            return new DeploymentModelResponse(format, name, version);
        }
    }
}

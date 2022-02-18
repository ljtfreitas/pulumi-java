// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the artifacts of a service unit.
 * 
 */
public final class ServiceUnitArtifactsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceUnitArtifactsResponse Empty = new ServiceUnitArtifactsResponse();

    /**
     * The path to the ARM parameters file relative to the artifact source.
     * 
     */
    @InputImport(name="parametersArtifactSourceRelativePath")
    private final @Nullable String parametersArtifactSourceRelativePath;

    public Optional<String> getParametersArtifactSourceRelativePath() {
        return this.parametersArtifactSourceRelativePath == null ? Optional.empty() : Optional.ofNullable(this.parametersArtifactSourceRelativePath);
    }

    /**
     * The full URI of the ARM parameters file with the SAS token.
     * 
     */
    @InputImport(name="parametersUri")
    private final @Nullable String parametersUri;

    public Optional<String> getParametersUri() {
        return this.parametersUri == null ? Optional.empty() : Optional.ofNullable(this.parametersUri);
    }

    /**
     * The path to the ARM template file relative to the artifact source.
     * 
     */
    @InputImport(name="templateArtifactSourceRelativePath")
    private final @Nullable String templateArtifactSourceRelativePath;

    public Optional<String> getTemplateArtifactSourceRelativePath() {
        return this.templateArtifactSourceRelativePath == null ? Optional.empty() : Optional.ofNullable(this.templateArtifactSourceRelativePath);
    }

    /**
     * The full URI of the ARM template file with the SAS token.
     * 
     */
    @InputImport(name="templateUri")
    private final @Nullable String templateUri;

    public Optional<String> getTemplateUri() {
        return this.templateUri == null ? Optional.empty() : Optional.ofNullable(this.templateUri);
    }

    public ServiceUnitArtifactsResponse(
        @Nullable String parametersArtifactSourceRelativePath,
        @Nullable String parametersUri,
        @Nullable String templateArtifactSourceRelativePath,
        @Nullable String templateUri) {
        this.parametersArtifactSourceRelativePath = parametersArtifactSourceRelativePath;
        this.parametersUri = parametersUri;
        this.templateArtifactSourceRelativePath = templateArtifactSourceRelativePath;
        this.templateUri = templateUri;
    }

    private ServiceUnitArtifactsResponse() {
        this.parametersArtifactSourceRelativePath = null;
        this.parametersUri = null;
        this.templateArtifactSourceRelativePath = null;
        this.templateUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceUnitArtifactsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String parametersArtifactSourceRelativePath;
        private @Nullable String parametersUri;
        private @Nullable String templateArtifactSourceRelativePath;
        private @Nullable String templateUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceUnitArtifactsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parametersArtifactSourceRelativePath = defaults.parametersArtifactSourceRelativePath;
    	      this.parametersUri = defaults.parametersUri;
    	      this.templateArtifactSourceRelativePath = defaults.templateArtifactSourceRelativePath;
    	      this.templateUri = defaults.templateUri;
        }

        public Builder setParametersArtifactSourceRelativePath(@Nullable String parametersArtifactSourceRelativePath) {
            this.parametersArtifactSourceRelativePath = parametersArtifactSourceRelativePath;
            return this;
        }

        public Builder setParametersUri(@Nullable String parametersUri) {
            this.parametersUri = parametersUri;
            return this;
        }

        public Builder setTemplateArtifactSourceRelativePath(@Nullable String templateArtifactSourceRelativePath) {
            this.templateArtifactSourceRelativePath = templateArtifactSourceRelativePath;
            return this;
        }

        public Builder setTemplateUri(@Nullable String templateUri) {
            this.templateUri = templateUri;
            return this;
        }

        public ServiceUnitArtifactsResponse build() {
            return new ServiceUnitArtifactsResponse(parametersArtifactSourceRelativePath, parametersUri, templateArtifactSourceRelativePath, templateUri);
        }
    }
}

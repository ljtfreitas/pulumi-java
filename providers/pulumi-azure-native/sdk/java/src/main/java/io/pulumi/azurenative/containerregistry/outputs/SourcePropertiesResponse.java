// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.AuthInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SourcePropertiesResponse {
    /**
     * The branch name of the source code.
     * 
     */
    private final @Nullable String branch;
    /**
     * The full URL to the source code repository
     * 
     */
    private final String repositoryUrl;
    /**
     * The authorization properties for accessing the source code repository and to set up
     * webhooks for notifications.
     * 
     */
    private final @Nullable AuthInfoResponse sourceControlAuthProperties;
    /**
     * The type of source control service.
     * 
     */
    private final String sourceControlType;

    @OutputCustomType.Constructor({"branch","repositoryUrl","sourceControlAuthProperties","sourceControlType"})
    private SourcePropertiesResponse(
        @Nullable String branch,
        String repositoryUrl,
        @Nullable AuthInfoResponse sourceControlAuthProperties,
        String sourceControlType) {
        this.branch = branch;
        this.repositoryUrl = Objects.requireNonNull(repositoryUrl);
        this.sourceControlAuthProperties = sourceControlAuthProperties;
        this.sourceControlType = Objects.requireNonNull(sourceControlType);
    }

    /**
     * The branch name of the source code.
     * 
     */
    public Optional<String> getBranch() {
        return Optional.ofNullable(this.branch);
    }
    /**
     * The full URL to the source code repository
     * 
     */
    public String getRepositoryUrl() {
        return this.repositoryUrl;
    }
    /**
     * The authorization properties for accessing the source code repository and to set up
     * webhooks for notifications.
     * 
     */
    public Optional<AuthInfoResponse> getSourceControlAuthProperties() {
        return Optional.ofNullable(this.sourceControlAuthProperties);
    }
    /**
     * The type of source control service.
     * 
     */
    public String getSourceControlType() {
        return this.sourceControlType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourcePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String branch;
        private String repositoryUrl;
        private @Nullable AuthInfoResponse sourceControlAuthProperties;
        private String sourceControlType;

        public Builder() {
    	      // Empty
        }

        public Builder(SourcePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.repositoryUrl = defaults.repositoryUrl;
    	      this.sourceControlAuthProperties = defaults.sourceControlAuthProperties;
    	      this.sourceControlType = defaults.sourceControlType;
        }

        public Builder setBranch(@Nullable String branch) {
            this.branch = branch;
            return this;
        }

        public Builder setRepositoryUrl(String repositoryUrl) {
            this.repositoryUrl = Objects.requireNonNull(repositoryUrl);
            return this;
        }

        public Builder setSourceControlAuthProperties(@Nullable AuthInfoResponse sourceControlAuthProperties) {
            this.sourceControlAuthProperties = sourceControlAuthProperties;
            return this;
        }

        public Builder setSourceControlType(String sourceControlType) {
            this.sourceControlType = Objects.requireNonNull(sourceControlType);
            return this;
        }

        public SourcePropertiesResponse build() {
            return new SourcePropertiesResponse(branch, repositoryUrl, sourceControlAuthProperties, sourceControlType);
        }
    }
}

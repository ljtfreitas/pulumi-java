// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager;

import io.pulumi.azurenative.deploymentmanager.inputs.SasAuthenticationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ArtifactSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ArtifactSourceArgs Empty = new ArtifactSourceArgs();

    /**
     * The path from the location that the 'authentication' property [say, a SAS URI to the blob container] refers to, to the location of the artifacts. This can be used to differentiate different versions of the artifacts. Or, different types of artifacts like binaries or templates. The location referenced by the authentication property concatenated with this optional artifactRoot path forms the artifact source location where the artifacts are expected to be found.
     * 
     */
    @InputImport(name="artifactRoot")
    private final @Nullable Input<String> artifactRoot;

    public Input<String> getArtifactRoot() {
        return this.artifactRoot == null ? Input.empty() : this.artifactRoot;
    }

    /**
     * The name of the artifact source.
     * 
     */
    @InputImport(name="artifactSourceName")
    private final @Nullable Input<String> artifactSourceName;

    public Input<String> getArtifactSourceName() {
        return this.artifactSourceName == null ? Input.empty() : this.artifactSourceName;
    }

    /**
     * The authentication method to use to access the artifact source.
     * 
     */
    @InputImport(name="authentication", required=true)
    private final Input<SasAuthenticationArgs> authentication;

    public Input<SasAuthenticationArgs> getAuthentication() {
        return this.authentication;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The type of artifact source used.
     * 
     */
    @InputImport(name="sourceType", required=true)
    private final Input<String> sourceType;

    public Input<String> getSourceType() {
        return this.sourceType;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ArtifactSourceArgs(
        @Nullable Input<String> artifactRoot,
        @Nullable Input<String> artifactSourceName,
        Input<SasAuthenticationArgs> authentication,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        Input<String> sourceType,
        @Nullable Input<Map<String,String>> tags) {
        this.artifactRoot = artifactRoot;
        this.artifactSourceName = artifactSourceName;
        this.authentication = Objects.requireNonNull(authentication, "expected parameter 'authentication' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sourceType = Objects.requireNonNull(sourceType, "expected parameter 'sourceType' to be non-null");
        this.tags = tags;
    }

    private ArtifactSourceArgs() {
        this.artifactRoot = Input.empty();
        this.artifactSourceName = Input.empty();
        this.authentication = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sourceType = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArtifactSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> artifactRoot;
        private @Nullable Input<String> artifactSourceName;
        private Input<SasAuthenticationArgs> authentication;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private Input<String> sourceType;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ArtifactSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactRoot = defaults.artifactRoot;
    	      this.artifactSourceName = defaults.artifactSourceName;
    	      this.authentication = defaults.authentication;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sourceType = defaults.sourceType;
    	      this.tags = defaults.tags;
        }

        public Builder setArtifactRoot(@Nullable Input<String> artifactRoot) {
            this.artifactRoot = artifactRoot;
            return this;
        }

        public Builder setArtifactRoot(@Nullable String artifactRoot) {
            this.artifactRoot = Input.ofNullable(artifactRoot);
            return this;
        }

        public Builder setArtifactSourceName(@Nullable Input<String> artifactSourceName) {
            this.artifactSourceName = artifactSourceName;
            return this;
        }

        public Builder setArtifactSourceName(@Nullable String artifactSourceName) {
            this.artifactSourceName = Input.ofNullable(artifactSourceName);
            return this;
        }

        public Builder setAuthentication(Input<SasAuthenticationArgs> authentication) {
            this.authentication = Objects.requireNonNull(authentication);
            return this;
        }

        public Builder setAuthentication(SasAuthenticationArgs authentication) {
            this.authentication = Input.of(Objects.requireNonNull(authentication));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSourceType(Input<String> sourceType) {
            this.sourceType = Objects.requireNonNull(sourceType);
            return this;
        }

        public Builder setSourceType(String sourceType) {
            this.sourceType = Input.of(Objects.requireNonNull(sourceType));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public ArtifactSourceArgs build() {
            return new ArtifactSourceArgs(artifactRoot, artifactSourceName, authentication, location, resourceGroupName, sourceType, tags);
        }
    }
}

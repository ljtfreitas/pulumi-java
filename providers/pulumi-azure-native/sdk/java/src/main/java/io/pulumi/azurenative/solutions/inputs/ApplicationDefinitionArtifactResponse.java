// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Application definition artifact.
 * 
 */
public final class ApplicationDefinitionArtifactResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationDefinitionArtifactResponse Empty = new ApplicationDefinitionArtifactResponse();

    /**
     * The managed application definition artifact name.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The managed application definition artifact type.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * The managed application definition artifact blob uri.
     * 
     */
    @InputImport(name="uri", required=true)
    private final String uri;

    public String getUri() {
        return this.uri;
    }

    public ApplicationDefinitionArtifactResponse(
        String name,
        String type,
        String uri) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private ApplicationDefinitionArtifactResponse() {
        this.name = null;
        this.type = null;
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationDefinitionArtifactResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String type;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationDefinitionArtifactResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.uri = defaults.uri;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public ApplicationDefinitionArtifactResponse build() {
            return new ApplicationDefinitionArtifactResponse(name, type, uri);
        }
    }
}

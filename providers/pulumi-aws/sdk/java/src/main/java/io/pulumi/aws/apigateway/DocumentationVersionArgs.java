// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DocumentationVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DocumentationVersionArgs Empty = new DocumentationVersionArgs();

    /**
     * The description of the API documentation version.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The ID of the associated Rest API
     * 
     */
    @InputImport(name="restApiId", required=true)
    private final Input<String> restApiId;

    public Input<String> getRestApiId() {
        return this.restApiId;
    }

    /**
     * The version identifier of the API documentation snapshot.
     * 
     */
    @InputImport(name="version", required=true)
    private final Input<String> version;

    public Input<String> getVersion() {
        return this.version;
    }

    public DocumentationVersionArgs(
        @Nullable Input<String> description,
        Input<String> restApiId,
        Input<String> version) {
        this.description = description;
        this.restApiId = Objects.requireNonNull(restApiId, "expected parameter 'restApiId' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private DocumentationVersionArgs() {
        this.description = Input.empty();
        this.restApiId = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentationVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> restApiId;
        private Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentationVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.restApiId = defaults.restApiId;
    	      this.version = defaults.version;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setRestApiId(Input<String> restApiId) {
            this.restApiId = Objects.requireNonNull(restApiId);
            return this;
        }

        public Builder setRestApiId(String restApiId) {
            this.restApiId = Input.of(Objects.requireNonNull(restApiId));
            return this;
        }

        public Builder setVersion(Input<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Input.of(Objects.requireNonNull(version));
            return this;
        }
        public DocumentationVersionArgs build() {
            return new DocumentationVersionArgs(description, restApiId, version);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationPackageReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationPackageReferenceResponse Empty = new ApplicationPackageReferenceResponse();

    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * If this is omitted, and no default version is specified for this application, the request fails with the error code InvalidApplicationPackageReferences. If you are calling the REST API directly, the HTTP status code is 409.
     * 
     */
    @Import(name="version")
      private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public ApplicationPackageReferenceResponse(
        String id,
        @Nullable String version) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.version = version;
    }

    private ApplicationPackageReferenceResponse() {
        this.id = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationPackageReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationPackageReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.version = defaults.version;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public ApplicationPackageReferenceResponse build() {
            return new ApplicationPackageReferenceResponse(id, version);
        }
    }
}

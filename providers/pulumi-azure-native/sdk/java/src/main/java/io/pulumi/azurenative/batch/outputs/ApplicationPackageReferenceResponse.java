// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationPackageReferenceResponse {
    private final String id;
    /**
     * If this is omitted, and no default version is specified for this application, the request fails with the error code InvalidApplicationPackageReferences. If you are calling the REST API directly, the HTTP status code is 409.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor({"id","version"})
    private ApplicationPackageReferenceResponse(
        String id,
        @Nullable String version) {
        this.id = Objects.requireNonNull(id);
        this.version = version;
    }

    public String getId() {
        return this.id;
    }
    /**
     * If this is omitted, and no default version is specified for this application, the request fails with the error code InvalidApplicationPackageReferences. If you are calling the REST API directly, the HTTP status code is 409.
     * 
     */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
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

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public ApplicationPackageReferenceResponse build() {
            return new ApplicationPackageReferenceResponse(id, version);
        }
    }
}

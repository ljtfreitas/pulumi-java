// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDocumentationVersionResult {
    /**
     * The description of the API documentation snapshot.
     * 
     */
    private final @Nullable String description;

    @OutputCustomType.Constructor
    private GetDocumentationVersionResult(@OutputCustomType.Parameter("description") @Nullable String description) {
        this.description = description;
    }

    /**
     * The description of the API documentation snapshot.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDocumentationVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDocumentationVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }
        public GetDocumentationVersionResult build() {
            return new GetDocumentationVersionResult(description);
        }
    }
}

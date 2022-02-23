// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.codegurureviewer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRepositoryAssociationResult {
    /**
     * The Amazon Resource Name (ARN) of the repository association.
     * 
     */
    private final @Nullable String associationArn;

    @OutputCustomType.Constructor({"associationArn"})
    private GetRepositoryAssociationResult(@Nullable String associationArn) {
        this.associationArn = associationArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the repository association.
     * 
     */
    public Optional<String> getAssociationArn() {
        return Optional.ofNullable(this.associationArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryAssociationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String associationArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRepositoryAssociationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associationArn = defaults.associationArn;
        }

        public Builder setAssociationArn(@Nullable String associationArn) {
            this.associationArn = associationArn;
            return this;
        }
        public GetRepositoryAssociationResult build() {
            return new GetRepositoryAssociationResult(associationArn);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPublicTypeVersionResult {
    /**
     * The Amazon Resource Number (ARN) assigned to the public extension upon publication
     * 
     */
    private final @Nullable String publicTypeArn;
    /**
     * The publisher id assigned by CloudFormation for publishing in this region.
     * 
     */
    private final @Nullable String publisherId;
    /**
     * The Amazon Resource Number (ARN) of the extension with the versionId.
     * 
     */
    private final @Nullable String typeVersionArn;

    @CustomType.Constructor
    private GetPublicTypeVersionResult(
        @CustomType.Parameter("publicTypeArn") @Nullable String publicTypeArn,
        @CustomType.Parameter("publisherId") @Nullable String publisherId,
        @CustomType.Parameter("typeVersionArn") @Nullable String typeVersionArn) {
        this.publicTypeArn = publicTypeArn;
        this.publisherId = publisherId;
        this.typeVersionArn = typeVersionArn;
    }

    /**
     * The Amazon Resource Number (ARN) assigned to the public extension upon publication
     * 
    */
    public Optional<String> getPublicTypeArn() {
        return Optional.ofNullable(this.publicTypeArn);
    }
    /**
     * The publisher id assigned by CloudFormation for publishing in this region.
     * 
    */
    public Optional<String> getPublisherId() {
        return Optional.ofNullable(this.publisherId);
    }
    /**
     * The Amazon Resource Number (ARN) of the extension with the versionId.
     * 
    */
    public Optional<String> getTypeVersionArn() {
        return Optional.ofNullable(this.typeVersionArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublicTypeVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String publicTypeArn;
        private @Nullable String publisherId;
        private @Nullable String typeVersionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPublicTypeVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicTypeArn = defaults.publicTypeArn;
    	      this.publisherId = defaults.publisherId;
    	      this.typeVersionArn = defaults.typeVersionArn;
        }

        public Builder publicTypeArn(@Nullable String publicTypeArn) {
            this.publicTypeArn = publicTypeArn;
            return this;
        }

        public Builder publisherId(@Nullable String publisherId) {
            this.publisherId = publisherId;
            return this;
        }

        public Builder typeVersionArn(@Nullable String typeVersionArn) {
            this.typeVersionArn = typeVersionArn;
            return this;
        }
        public GetPublicTypeVersionResult build() {
            return new GetPublicTypeVersionResult(publicTypeArn, publisherId, typeVersionArn);
        }
    }
}

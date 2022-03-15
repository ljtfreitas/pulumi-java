// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a token claim.
 * 
 */
public final class ContentKeyPolicyTokenClaimArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyTokenClaimArgs Empty = new ContentKeyPolicyTokenClaimArgs();

    /**
     * Token claim type.
     * 
     */
    @Import(name="claimType")
      private final @Nullable Output<String> claimType;

    public Output<String> getClaimType() {
        return this.claimType == null ? Output.empty() : this.claimType;
    }

    /**
     * Token claim value.
     * 
     */
    @Import(name="claimValue")
      private final @Nullable Output<String> claimValue;

    public Output<String> getClaimValue() {
        return this.claimValue == null ? Output.empty() : this.claimValue;
    }

    public ContentKeyPolicyTokenClaimArgs(
        @Nullable Output<String> claimType,
        @Nullable Output<String> claimValue) {
        this.claimType = claimType;
        this.claimValue = claimValue;
    }

    private ContentKeyPolicyTokenClaimArgs() {
        this.claimType = Output.empty();
        this.claimValue = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyTokenClaimArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> claimType;
        private @Nullable Output<String> claimValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyTokenClaimArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.claimType = defaults.claimType;
    	      this.claimValue = defaults.claimValue;
        }

        public Builder claimType(@Nullable Output<String> claimType) {
            this.claimType = claimType;
            return this;
        }

        public Builder claimType(@Nullable String claimType) {
            this.claimType = Output.ofNullable(claimType);
            return this;
        }

        public Builder claimValue(@Nullable Output<String> claimValue) {
            this.claimValue = claimValue;
            return this;
        }

        public Builder claimValue(@Nullable String claimValue) {
            this.claimValue = Output.ofNullable(claimValue);
            return this;
        }
        public ContentKeyPolicyTokenClaimArgs build() {
            return new ContentKeyPolicyTokenClaimArgs(claimType, claimValue);
        }
    }
}

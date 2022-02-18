// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="claimType")
    private final @Nullable Input<String> claimType;

    public Input<String> getClaimType() {
        return this.claimType == null ? Input.empty() : this.claimType;
    }

    /**
     * Token claim value.
     * 
     */
    @InputImport(name="claimValue")
    private final @Nullable Input<String> claimValue;

    public Input<String> getClaimValue() {
        return this.claimValue == null ? Input.empty() : this.claimValue;
    }

    public ContentKeyPolicyTokenClaimArgs(
        @Nullable Input<String> claimType,
        @Nullable Input<String> claimValue) {
        this.claimType = claimType;
        this.claimValue = claimValue;
    }

    private ContentKeyPolicyTokenClaimArgs() {
        this.claimType = Input.empty();
        this.claimValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyTokenClaimArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> claimType;
        private @Nullable Input<String> claimValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyTokenClaimArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.claimType = defaults.claimType;
    	      this.claimValue = defaults.claimValue;
        }

        public Builder setClaimType(@Nullable Input<String> claimType) {
            this.claimType = claimType;
            return this;
        }

        public Builder setClaimType(@Nullable String claimType) {
            this.claimType = Input.ofNullable(claimType);
            return this;
        }

        public Builder setClaimValue(@Nullable Input<String> claimValue) {
            this.claimValue = claimValue;
            return this;
        }

        public Builder setClaimValue(@Nullable String claimValue) {
            this.claimValue = Input.ofNullable(claimValue);
            return this;
        }

        public ContentKeyPolicyTokenClaimArgs build() {
            return new ContentKeyPolicyTokenClaimArgs(claimType, claimValue);
        }
    }
}

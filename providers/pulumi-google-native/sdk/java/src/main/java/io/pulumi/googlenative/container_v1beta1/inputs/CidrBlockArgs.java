// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CidrBlock contains an optional name and one CIDR block.
 * 
 */
public final class CidrBlockArgs extends io.pulumi.resources.ResourceArgs {

    public static final CidrBlockArgs Empty = new CidrBlockArgs();

    /**
     * cidr_block must be specified in CIDR notation.
     * 
     */
    @InputImport(name="cidrBlock")
      private final @Nullable Input<String> cidrBlock;

    public Input<String> getCidrBlock() {
        return this.cidrBlock == null ? Input.empty() : this.cidrBlock;
    }

    /**
     * display_name is an optional field for users to identify CIDR blocks.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    public CidrBlockArgs(
        @Nullable Input<String> cidrBlock,
        @Nullable Input<String> displayName) {
        this.cidrBlock = cidrBlock;
        this.displayName = displayName;
    }

    private CidrBlockArgs() {
        this.cidrBlock = Input.empty();
        this.displayName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CidrBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cidrBlock;
        private @Nullable Input<String> displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(CidrBlockArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.displayName = defaults.displayName;
        }

        public Builder setCidrBlock(@Nullable Input<String> cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        public Builder setCidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = Input.ofNullable(cidrBlock);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }
        public CidrBlockArgs build() {
            return new CidrBlockArgs(cidrBlock, displayName);
        }
    }
}

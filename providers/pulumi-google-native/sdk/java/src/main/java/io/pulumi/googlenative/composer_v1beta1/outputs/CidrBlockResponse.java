// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CidrBlockResponse {
    /**
     * cidr_block must be specified in CIDR notation.
     * 
     */
    private final String cidrBlock;
    /**
     * display_name is a field for users to identify CIDR blocks.
     * 
     */
    private final String displayName;

    @OutputCustomType.Constructor({"cidrBlock","displayName"})
    private CidrBlockResponse(
        String cidrBlock,
        String displayName) {
        this.cidrBlock = Objects.requireNonNull(cidrBlock);
        this.displayName = Objects.requireNonNull(displayName);
    }

    /**
     * cidr_block must be specified in CIDR notation.
     * 
     */
    public String getCidrBlock() {
        return this.cidrBlock;
    }
    /**
     * display_name is a field for users to identify CIDR blocks.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CidrBlockResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cidrBlock;
        private String displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(CidrBlockResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.displayName = defaults.displayName;
        }

        public Builder setCidrBlock(String cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public CidrBlockResponse build() {
            return new CidrBlockResponse(cidrBlock, displayName);
        }
    }
}

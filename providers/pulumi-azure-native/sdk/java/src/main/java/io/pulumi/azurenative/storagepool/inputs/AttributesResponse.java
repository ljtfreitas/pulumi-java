// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagepool.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Attributes of a iSCSI target portal group.
 * 
 */
public final class AttributesResponse extends io.pulumi.resources.InvokeArgs {

    public static final AttributesResponse Empty = new AttributesResponse();

    /**
     * Indicates whether or not authentication is enabled on the ACL.
     * 
     */
    @InputImport(name="authentication", required=true)
        private final Boolean authentication;

    public Boolean getAuthentication() {
        return this.authentication;
    }

    /**
     * Indicates whether or not write protect is enabled on the LUNs.
     * 
     */
    @InputImport(name="prodModeWriteProtect", required=true)
        private final Boolean prodModeWriteProtect;

    public Boolean getProdModeWriteProtect() {
        return this.prodModeWriteProtect;
    }

    public AttributesResponse(
        Boolean authentication,
        Boolean prodModeWriteProtect) {
        this.authentication = Objects.requireNonNull(authentication, "expected parameter 'authentication' to be non-null");
        this.prodModeWriteProtect = Objects.requireNonNull(prodModeWriteProtect, "expected parameter 'prodModeWriteProtect' to be non-null");
    }

    private AttributesResponse() {
        this.authentication = null;
        this.prodModeWriteProtect = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttributesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean authentication;
        private Boolean prodModeWriteProtect;

        public Builder() {
    	      // Empty
        }

        public Builder(AttributesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.prodModeWriteProtect = defaults.prodModeWriteProtect;
        }

        public Builder setAuthentication(Boolean authentication) {
            this.authentication = Objects.requireNonNull(authentication);
            return this;
        }

        public Builder setProdModeWriteProtect(Boolean prodModeWriteProtect) {
            this.prodModeWriteProtect = Objects.requireNonNull(prodModeWriteProtect);
            return this;
        }
        public AttributesResponse build() {
            return new AttributesResponse(authentication, prodModeWriteProtect);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class InterconnectAttachmentPrivateInfoResponse {
    /**
     * @return 802.1q encapsulation tag to be used for traffic between Google and the customer, going to and from this network and region.
     * 
     */
    private final Integer tag8021q;

    @CustomType.Constructor
    private InterconnectAttachmentPrivateInfoResponse(@CustomType.Parameter("tag8021q") Integer tag8021q) {
        this.tag8021q = tag8021q;
    }

    /**
     * @return 802.1q encapsulation tag to be used for traffic between Google and the customer, going to and from this network and region.
     * 
     */
    public Integer tag8021q() {
        return this.tag8021q;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InterconnectAttachmentPrivateInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer tag8021q;

        public Builder() {
    	      // Empty
        }

        public Builder(InterconnectAttachmentPrivateInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tag8021q = defaults.tag8021q;
        }

        public Builder tag8021q(Integer tag8021q) {
            this.tag8021q = Objects.requireNonNull(tag8021q);
            return this;
        }        public InterconnectAttachmentPrivateInfoResponse build() {
            return new InterconnectAttachmentPrivateInfoResponse(tag8021q);
        }
    }
}

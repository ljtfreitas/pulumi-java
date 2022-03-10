// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class HostedZoneVPC {
    /**
     * The ID of an Amazon VPC.
     * 
     */
    private final String vPCId;
    /**
     * The region that an Amazon VPC was created in. See https://docs.aws.amazon.com/general/latest/gr/rande.html for a list of up to date regions.
     * 
     */
    private final String vPCRegion;

    @OutputCustomType.Constructor
    private HostedZoneVPC(
        @OutputCustomType.Parameter("vPCId") String vPCId,
        @OutputCustomType.Parameter("vPCRegion") String vPCRegion) {
        this.vPCId = vPCId;
        this.vPCRegion = vPCRegion;
    }

    /**
     * The ID of an Amazon VPC.
     * 
    */
    public String getVPCId() {
        return this.vPCId;
    }
    /**
     * The region that an Amazon VPC was created in. See https://docs.aws.amazon.com/general/latest/gr/rande.html for a list of up to date regions.
     * 
    */
    public String getVPCRegion() {
        return this.vPCRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostedZoneVPC defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String vPCId;
        private String vPCRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(HostedZoneVPC defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vPCId = defaults.vPCId;
    	      this.vPCRegion = defaults.vPCRegion;
        }

        public Builder setVPCId(String vPCId) {
            this.vPCId = Objects.requireNonNull(vPCId);
            return this;
        }

        public Builder setVPCRegion(String vPCRegion) {
            this.vPCRegion = Objects.requireNonNull(vPCRegion);
            return this;
        }
        public HostedZoneVPC build() {
            return new HostedZoneVPC(vPCId, vPCRegion);
        }
    }
}

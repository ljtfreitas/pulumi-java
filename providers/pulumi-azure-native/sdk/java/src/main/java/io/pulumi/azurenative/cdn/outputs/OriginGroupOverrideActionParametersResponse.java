// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.ResourceReferenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class OriginGroupOverrideActionParametersResponse {
    private final String odataType;
    /**
     * defines the OriginGroup that would override the DefaultOriginGroup.
     * 
     */
    private final ResourceReferenceResponse originGroup;

    @OutputCustomType.Constructor({"odataType","originGroup"})
    private OriginGroupOverrideActionParametersResponse(
        String odataType,
        ResourceReferenceResponse originGroup) {
        this.odataType = Objects.requireNonNull(odataType);
        this.originGroup = Objects.requireNonNull(originGroup);
    }

    public String getOdataType() {
        return this.odataType;
    }
    /**
     * defines the OriginGroup that would override the DefaultOriginGroup.
     * 
     */
    public ResourceReferenceResponse getOriginGroup() {
        return this.originGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginGroupOverrideActionParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;
        private ResourceReferenceResponse originGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginGroupOverrideActionParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.originGroup = defaults.originGroup;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOriginGroup(ResourceReferenceResponse originGroup) {
            this.originGroup = Objects.requireNonNull(originGroup);
            return this;
        }
        public OriginGroupOverrideActionParametersResponse build() {
            return new OriginGroupOverrideActionParametersResponse(odataType, originGroup);
        }
    }
}

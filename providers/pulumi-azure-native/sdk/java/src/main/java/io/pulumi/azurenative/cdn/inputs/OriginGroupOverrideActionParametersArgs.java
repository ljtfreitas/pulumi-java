// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.ResourceReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the parameters for the origin group override action.
 * 
 */
public final class OriginGroupOverrideActionParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginGroupOverrideActionParametersArgs Empty = new OriginGroupOverrideActionParametersArgs();

    @InputImport(name="odataType", required=true)
    private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    /**
     * defines the OriginGroup that would override the DefaultOriginGroup.
     * 
     */
    @InputImport(name="originGroup", required=true)
    private final Input<ResourceReferenceArgs> originGroup;

    public Input<ResourceReferenceArgs> getOriginGroup() {
        return this.originGroup;
    }

    public OriginGroupOverrideActionParametersArgs(
        Input<String> odataType,
        Input<ResourceReferenceArgs> originGroup) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.originGroup = Objects.requireNonNull(originGroup, "expected parameter 'originGroup' to be non-null");
    }

    private OriginGroupOverrideActionParametersArgs() {
        this.odataType = Input.empty();
        this.originGroup = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginGroupOverrideActionParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> odataType;
        private Input<ResourceReferenceArgs> originGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginGroupOverrideActionParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.originGroup = defaults.originGroup;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder setOriginGroup(Input<ResourceReferenceArgs> originGroup) {
            this.originGroup = Objects.requireNonNull(originGroup);
            return this;
        }

        public Builder setOriginGroup(ResourceReferenceArgs originGroup) {
            this.originGroup = Input.of(Objects.requireNonNull(originGroup));
            return this;
        }

        public OriginGroupOverrideActionParametersArgs build() {
            return new OriginGroupOverrideActionParametersArgs(odataType, originGroup);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appstream.outputs;

import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GetApplicationEntitlementAssociationResult {
    @CustomType.Constructor
    private GetApplicationEntitlementAssociationResult() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationEntitlementAssociationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationEntitlementAssociationResult defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public GetApplicationEntitlementAssociationResult build() {
            return new GetApplicationEntitlementAssociationResult();
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appstream.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class GetApplicationFleetAssociationResult {
    @OutputCustomType.Constructor({})
    private GetApplicationFleetAssociationResult() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationFleetAssociationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationFleetAssociationResult defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public GetApplicationFleetAssociationResult build() {
            return new GetApplicationFleetAssociationResult();
        }
    }
}

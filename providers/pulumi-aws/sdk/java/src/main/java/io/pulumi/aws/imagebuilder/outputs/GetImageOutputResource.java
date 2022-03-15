// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.aws.imagebuilder.outputs.GetImageOutputResourceAmi;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetImageOutputResource {
    /**
     * Set of objects with each Amazon Machine Image (AMI) created.
     * 
     */
    private final List<GetImageOutputResourceAmi> amis;

    @CustomType.Constructor
    private GetImageOutputResource(@CustomType.Parameter("amis") List<GetImageOutputResourceAmi> amis) {
        this.amis = amis;
    }

    /**
     * Set of objects with each Amazon Machine Image (AMI) created.
     * 
    */
    public List<GetImageOutputResourceAmi> getAmis() {
        return this.amis;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageOutputResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetImageOutputResourceAmi> amis;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageOutputResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amis = defaults.amis;
        }

        public Builder amis(List<GetImageOutputResourceAmi> amis) {
            this.amis = Objects.requireNonNull(amis);
            return this;
        }
        public GetImageOutputResource build() {
            return new GetImageOutputResource(amis);
        }
    }
}

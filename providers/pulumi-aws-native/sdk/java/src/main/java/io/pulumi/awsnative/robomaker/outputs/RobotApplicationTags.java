// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker.outputs;

import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class RobotApplicationTags {
    @CustomType.Constructor
    private RobotApplicationTags() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RobotApplicationTags defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(RobotApplicationTags defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public RobotApplicationTags build() {
            return new RobotApplicationTags();
        }
    }
}

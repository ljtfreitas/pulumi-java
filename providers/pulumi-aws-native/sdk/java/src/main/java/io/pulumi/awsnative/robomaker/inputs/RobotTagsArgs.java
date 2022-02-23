// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker.inputs;

import java.util.Objects;


/**
 * A key-value pair to associate with a resource.
 * 
 */
public final class RobotTagsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RobotTagsArgs Empty = new RobotTagsArgs();

    public RobotTagsArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RobotTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(RobotTagsArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public RobotTagsArgs build() {
            return new RobotTagsArgs();
        }
    }
}

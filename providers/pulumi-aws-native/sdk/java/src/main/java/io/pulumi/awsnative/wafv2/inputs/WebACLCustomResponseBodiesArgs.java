// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import java.util.Objects;


/**
 * Custom response key and body map.
 * 
 */
public final class WebACLCustomResponseBodiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLCustomResponseBodiesArgs Empty = new WebACLCustomResponseBodiesArgs();

    public WebACLCustomResponseBodiesArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLCustomResponseBodiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLCustomResponseBodiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebACLCustomResponseBodiesArgs build() {
            return new WebACLCustomResponseBodiesArgs();
        }
    }
}

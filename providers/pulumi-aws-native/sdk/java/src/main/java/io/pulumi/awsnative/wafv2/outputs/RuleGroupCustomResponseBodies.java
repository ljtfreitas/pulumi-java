// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupCustomResponseBodies {
    @OutputCustomType.Constructor({})
    private RuleGroupCustomResponseBodies() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupCustomResponseBodies defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupCustomResponseBodies defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public RuleGroupCustomResponseBodies build() {
            return new RuleGroupCustomResponseBodies();
        }
    }
}

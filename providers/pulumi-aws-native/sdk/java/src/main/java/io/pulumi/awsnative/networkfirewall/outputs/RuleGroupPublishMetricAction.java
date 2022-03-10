// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.outputs;

import io.pulumi.awsnative.networkfirewall.outputs.RuleGroupDimension;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupPublishMetricAction {
    private final List<RuleGroupDimension> dimensions;

    @OutputCustomType.Constructor
    private RuleGroupPublishMetricAction(@OutputCustomType.Parameter("dimensions") List<RuleGroupDimension> dimensions) {
        this.dimensions = dimensions;
    }

    public List<RuleGroupDimension> getDimensions() {
        return this.dimensions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupPublishMetricAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RuleGroupDimension> dimensions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupPublishMetricAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
        }

        public Builder setDimensions(List<RuleGroupDimension> dimensions) {
            this.dimensions = Objects.requireNonNull(dimensions);
            return this;
        }
        public RuleGroupPublishMetricAction build() {
            return new RuleGroupPublishMetricAction(dimensions);
        }
    }
}

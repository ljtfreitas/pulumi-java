// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetNodeGroupResourceAutoscalingGroup {
    /**
     * Name of the AutoScaling Group.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"name"})
    private GetNodeGroupResourceAutoscalingGroup(String name) {
        this.name = Objects.requireNonNull(name);
    }

    /**
     * Name of the AutoScaling Group.
     * 
     */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeGroupResourceAutoscalingGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodeGroupResourceAutoscalingGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetNodeGroupResourceAutoscalingGroup build() {
            return new GetNodeGroupResourceAutoscalingGroup(name);
        }
    }
}
